package TestingProject3;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Senaryo1 extends BaseDriver {
    //Test Case 1:
    //➢ https://shopdemo.e-junkie.com/ sitesine gidiniz
    //➢ E-book add to cart butonuna tıklatınız.
    //➢ Add promo code butonuna tıklatıp veri giriniz.
    //➢ Apply butonuna tıklayınız.
    //➢ Invalid promo code yazısının görüldüğünü doğrulayınız

    @Test
    public void Proje1 () {
        driver.get("https://shopdemo.e-junkie.com/");

        WebElement ebook= driver.findElement(By.linkText("Ebook"));
        ebook.click();

        WebElement addtochart=driver.findElement(By.xpath("//button[@class='view_product']"));
        addtochart.click();
        MyFunc.Bekle(2);

        driver.switchTo().frame(5);
        MyFunc.Bekle(2);
        WebElement addtopromode= driver.findElement(By.xpath("//button[text()='Add Promo Code']"));
        addtopromode.click();

        WebElement apply=driver.findElement(By.xpath("//input[@placeholder='Promo Code']"));
        apply.sendKeys("123456");

        WebElement applyclick=driver.findElement(By.xpath("//button[text()='Apply']"));
        applyclick.click();

        WebElement invalid=driver.findElement(By.cssSelector("[id='SnackBar']>span"));
        Assert.assertTrue(invalid.isDisplayed()); // assertiona sonra bak

        BekleKapat();


    }

}
