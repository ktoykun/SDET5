package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionHoverOverSoru extends BaseDriver {

    @Test
    public void Test1 () {

// https://www.etsy.com/ sayfasına gidiniz.
//    Jewellery -> Neckless -> Bib Neckless click
//    tıklatma işleminden sonra URL de
//    bib-necklaces kelimesinin geçtiğini doğrulayın.

        driver.get("https://www.etsy.com");
        Actions aksiyonlar=new Actions(driver);

        // java çok hızlı çalıştığı için elemetn not interactable hatası alıyoruz
        // bunun önüne geçmek için bekletme koyduk aralara
        WebElement jewellery= driver.findElement(By.id("catnav-primary-link-10855"));
        aksiyonlar.moveToElement(jewellery).build().perform();
        MyFunc.Bekle(2);

        WebElement neckless= driver.findElement(By.id("side-nav-category-link-10873"));
        aksiyonlar.moveToElement(neckless).build().perform();
        MyFunc.Bekle(2);

        WebElement biblace= driver.findElement(By.id("catnav-l3-10881"));
        aksiyonlar.moveToElement(biblace).click().build().perform();
        MyFunc.Bekle(2);

        System.out.println(driver.getCurrentUrl());

        Assert.assertTrue("URL'de bib-necklace var mı?", driver.getCurrentUrl().contains("bib-necklace"));
        // assert hata varsa söyler. hata yoksa rahatsız etmez.yukarıdkai mesajı verir hata varsa.
        BekleKapat();





    }
}
