package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindingByClassName {
    public static void main(String[] args) {
        // her zaman id veya name olmayabilir
        // bu durumda bunu kullanırız.

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.jotform.com/signup/");

        WebElement isim=driver.findElement(By.className("xcl-inp"));
        isim.sendKeys("Kübra");
        // birden fazla aynı isme sahip element varsa ilkini bulur.
        // class ismi çok uzunsa aralarında boşluk varsa bu birden fazla klass
        // olduğu anlamına gelir.

        // sadece class larda aratmak için, incele yaptığımız sayfada başına . koyup arıyoruz.
        // classname değeri yazılırken boşluğa dikkat edilir. Eğer sonuna boşluk vs gelirse
        // onu bulamıyor.ikinci bir class varmış gibi düşünüyor.exacly correct yazmalıyız.


        List<WebElement> labels=driver.findElements(By.className("xcl-inp")); // birden fazla
        // element olduğunda elementS seçiyoruz.
        System.out.println(labels.size());

        for (WebElement e: labels) {
            System.out.println("e.getText() = " + e.getText());
        }

        // aranılan eleman bulunamazsa find elemen no such element hatası verir
        // find elementS size is size'ı 0 olan list verir. yani hata vermez.
        // biri, no such element hatası veriyor. diğeri size 0 diyor. hata vermiyor.
        
        MyFunc.Bekle(5);
        driver.quit();
    }
}
