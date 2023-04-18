package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.hamcrest.BaseDescription;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _04_WindowsGiris extends BaseDriver {
    // burada açılan yeni pencereler arasında geçiş yapmayı görüyoruz.
    // html'de derslerinde görmüştük insoect yaptığımızda tagi _blank olan
    // kodlar yeni pencere açar önce bunları hepsini bir list ile alalım

    @Test
    public void Test1 () {
        driver.get("https://www.selenium.dev/");
        // bu aşamada ansayfadayız. bu sayfanın ID'sini almak için:
        String currentID= driver.getWindowHandle(); // bu handle. bunda "S" yok.
        System.out.println("currentID = " + currentID);

        List <WebElement> linkler= driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement link :linkler ) {
            if (!link.getAttribute("href").contains("mail")) // mailto olan tagi açmasın diyoruz.
            link.click();

            // şu anda bütün sayfalar açıldı. her açılan sayfa için pc
            // bir id atıyor. tipi Set <string>
            Set<String> windowsidler=driver.getWindowHandles();
            for ( String id: windowsidler ) {
                System.out.println("id = " + id);

                // sayfalar arasında gezinmek anasayfaya dönmek için kullanıyoruz
                // şu anda en son açılan sayfadayım ana sayfaya geçmek için
                driver.switchTo().window(currentID);

            }

        }



        MyFunc.Bekle(10);
        BekleKapat();


    }
}
