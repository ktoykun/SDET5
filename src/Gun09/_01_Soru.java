package Gun09;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _01_Soru extends BaseDriver {
    //        Test Senaryosu
//        1- https://www.facebook.com/  sayfasına gidiniz
//        2- CreateNewAccount a tıklatınız.
//        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//        4- Doğum tarihinizi Select sınıfı ile seçiniz
//        5- Email i tekrar girmenizi isteyen bir input daha açıldığını
//          öncesinde de görünmediğini, sonrasında da göründüğünü
//          assert ile doğrulayınız.

    @Test
    public void Test1 () {
        driver.get("https://www.facebook.com/");

        // her şeyden önce şunu bilelim: accept cookies olayı var. sayfalarda karşına çıkabilir
        // bazen de hiç çıkmaz. Bu durumda WebElemenS'i kullanıyoruz. Bu kod çoklu element
        // bulmada kullanılır. Elementi bulamadığında hata vermez.
        // sadece listi  sıfır gönderir. Bu özelliğinden faydalanıyoruz.Örnek:

      /*
        List <WebElement> cookiesAccept= driver.findElements(By.xpath("//button[text()='Allow essential and optional cookies']"));
        if (cookiesAccept.size() >0)
            cookiesAccept.get(0).click();
       */

        WebElement createAccount= driver.findElement(By.cssSelector("[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        createAccount.click(); // a tag i ile yapmak daha güzel olur

        WebElement isim= driver.findElement(By.cssSelector("[class='inputtext _58mg _5dba _2ph-']"));
        isim.sendKeys("kübra");

        WebElement soyisim= driver.findElement(By.name("lastname"));
        soyisim.sendKeys("toykun");

        // elementin gözüküp gözükmediğini display ile kontrol ederiz. o element hep var.sadece görünür değil
        WebElement confemail= driver.findElement(By.name("reg_email_confirmation__"));
        confemail.isDisplayed();
        Assert.assertFalse(confemail.isDisplayed()); // false bekliyoruz.

        WebElement email= driver.findElement(By.name("reg_email__"));
        email.sendKeys("k.toykun@hotmail.com");

        Assert.assertTrue(confemail.isDisplayed()); // true bekliyoruz.

        WebElement gunmenü= driver.findElement(By.name("birthday_day"));
        Select gun=new Select(gunmenü);
        gun.selectByIndex(20);

        WebElement aymenu= driver.findElement(By.name("birthday_month"));
        Select ay=new Select(aymenu);
        ay.selectByIndex(11);

        WebElement yıl= driver.findElement(By.name("birthday_year"));
        Select yil=new Select(yıl);
        yil.selectByValue("1994");





        BekleKapat();


    }



}
