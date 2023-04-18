package Gun08;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectClassGiris extends BaseDriver {

    @Test
    public void Test1 () {

        driver.get("https://www.amazon.com.tr/");
        // eğer sayfada yıl, ay, gün vs gibi seçim gerektiren şeyler varsa
        // burada child vs ile uğraşmamak için bir kolaylık var o da select menüsü

        WebElement webMenu= driver.findElement(By.id("searchDropdownBox"));
        Select seçenek=new Select(webMenu);
       // seçenek.selectByIndex(0); ister index ile seç
       // seçenek.selectByValue("search-alias=computers"); ister html de çıkan value si ile
        seçenek.selectByVisibleText("Evcil Hayvan Malzemeleri"); //ister görünen texti ile

        System.out.println("seçenek.getOptions().size() = " + seçenek.getOptions().size());
        // boyutunu da alabiliyoruz bu şekilde. kaç tane eleman var kaç tane seçenek çıkıyor o

        BekleKapat();




    }
}
