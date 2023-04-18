package TestingProject3;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Senaryo4 extends BaseDriver {
    /*
    Test Case: 4
➢ https://shopdemo.e-junkie.com/ sitesine gidiniz
➢ E-book add to cart butonuna tıklatınız.
➢ Pay using debit card a tıklatınız.
➢ Email, confirm Email, name, telefon, company, Card number(“4242 4242 4242 4242” ) giriniz,
expdate, cvc kodu bilgilerini doldurunuz
➢ Pay butonuna tıklayınız
➢ “Your order is confirmed. Thank you!” mesajının görüldüğünü doğrulayınız
     */

    @Test
    public void Proje() {
        driver.get("https://shopdemo.e-junkie.com/");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement ebook = driver.findElement(By.linkText("Ebook"));
        ebook.click();

        WebElement addtochart = driver.findElement(By.xpath("//button[@class='view_product']"));
        addtochart.click();
        MyFunc.Bekle(2);

        driver.switchTo().frame(5);
        MyFunc.Bekle(2);
        WebElement debitcard=driver.findElement(By.xpath("//button[@class='Payment-Button CC']"));
        debitcard.click();

        WebElement email= driver.findElement(By.xpath("//input[@placeholder='Email']"));
        email.sendKeys("kjlkjlk@hotmail.com");

        WebElement confirmemail= driver.findElement(By.xpath("//input[@placeholder='Confirm Email']"));
        confirmemail.sendKeys("kjlkjlk@hotmail.com");

        WebElement nameoncard= driver.findElement(By.xpath("//input[@placeholder='Name On Card']"));
        nameoncard.sendKeys("jdhfkjs");

        WebElement telephone= driver.findElement(By.xpath("//input[@autocomplete='phone']"));
        telephone.sendKeys("123456");

        WebElement company= driver.findElement(By.xpath(" //input[@autocomplete='company']"));
        company.sendKeys("Google");

        driver.switchTo().frame(2);
        WebElement cardno=driver.findElement(By.xpath("//input[@name='cardnumber']"));
        cardno.sendKeys("4242 4242 4242 4242");

        WebElement expdate= driver.findElement(By.name("exp-date"));
        expdate.sendKeys("1225");
        MyFunc.Bekle(1);

        WebElement cvc= driver.findElement(By.name("cvc"));
        expdate.sendKeys(" 218");
        MyFunc.Bekle(1);

        driver.switchTo().parentFrame();
        WebElement pay= driver.findElement(By.cssSelector("[class='Pay-Button']"));
        pay.click();

        MyFunc.Bekle(7);

        WebElement confirm= driver.findElement(By.xpath("//span[@class='green_text_margin']"));
        // wait.until(ExpectedConditions.visibilityOf(confirm));
        Assert.assertTrue(confirm.isDisplayed());

        BekleKapat();





    }
}