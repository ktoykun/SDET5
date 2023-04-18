package TestingProject3;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Senaryo3 extends BaseDriver {
    /*
    Test Case:3
➢ https://shopdemo.e-junkie.com/ sitesine gidiniz
➢ E-book add to cart butonuna tıklatınız.
➢ Pay using debit card a tıklatınız.
➢ Card numarasına “1111 1111 1111 1111” giriniz
➢ “Your card number is invalid” mesajının görüldüğünü doğrulayınız.
     */
    @Test
    public void Proje() {
        driver.get("https://shopdemo.e-junkie.com/");
        WebElement ebook = driver.findElement(By.linkText("Ebook"));
        ebook.click();

        WebElement addtochart = driver.findElement(By.xpath("//button[@class='view_product']"));
        addtochart.click();
        MyFunc.Bekle(2);

        driver.switchTo().frame(5);
        MyFunc.Bekle(2);
        WebElement debitcard=driver.findElement(By.xpath("//button[@class='Payment-Button CC']"));
        debitcard.click();
        MyFunc.Bekle(3);

        driver.switchTo().frame(2);
        WebElement cardno=driver.findElement(By.xpath("//input[@name='cardnumber']"));
        cardno.sendKeys("1111 1111 1111 1111");

        WebElement gecersiz=driver.findElement(By.xpath("//div[@class='SnackBar           ']"));
        Assert.assertTrue(gecersiz.isDisplayed());
        // assertion a sonra bak
        BekleKapat();
    }
}