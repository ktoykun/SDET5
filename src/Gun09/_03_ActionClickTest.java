package Gun09;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionClickTest extends BaseDriver {

    // click ile yapamadığımız hareketler var:double click, sekme üzerinde gezme vs
    // aksyion bu işe yarıyor.
    @Test
    public void Test1() {
         driver.get("https://demoqa.com/buttons");
         WebElement element= driver.findElement(By.xpath("//button[text()='Click Me']"));
        // element.click();

        Actions aksiyonlar=new Actions(driver);
         // web sayfası aksiyonlara açıldı

        Action aksiyon= (Action) aksiyonlar.moveToElement(element).click().build();
        // elementin üzerine click için git ve orada bekle. yani aksiyonu hazırla.henüz click olmadı
        System.out.println("aksiyon hazırlandı");

        aksiyon.perform(); // aksiyonu icra et
        System.out.println("aksiyon gerçekleşti");

        // daha pratik yolu da şu:
        aksiyonlar.moveToElement(element).click().build().perform();

        BekleKapat();
    }




}
