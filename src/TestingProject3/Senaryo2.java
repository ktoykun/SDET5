package TestingProject3;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Senaryo2 extends BaseDriver {
    /*
    Test Case:2
➢ https://shopdemo.e-junkie.com/ sitesine gidiniz
➢ E-book add to cart butonuna tıklatınız.
➢ Pay using debit card a tıklatınız.
➢ Pay butonuna tıklatınız.
➢ Invalid Email, Invalid Email, invalid billing name mesajlarının görüldüğünü doğrulayınız.
     */

    @Test
    public void Proje () {
        driver.get("https://shopdemo.e-junkie.com/");
        WebElement ebook= driver.findElement(By.linkText("Ebook"));
        ebook.click();

        WebElement addtochart=driver.findElement(By.xpath("//button[@class='view_product']"));
        addtochart.click();
        MyFunc.Bekle(2);

        driver.switchTo().frame(5);
        MyFunc.Bekle(2);
        WebElement debitcard=driver.findElement(By.xpath("//button[@class='Payment-Button CC']"));
        debitcard.click();

        WebElement pay= driver.findElement(By.xpath("//button[@class='Pay-Button']"));
        pay.click();

        WebElement invalid=driver.findElement(By.xpath("//span[text()='Invalid Email']"));
        Assert.assertTrue(invalid.isDisplayed());

        BekleKapat();



}
}
