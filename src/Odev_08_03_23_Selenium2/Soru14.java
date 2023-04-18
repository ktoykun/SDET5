package Odev_08_03_23_Selenium2;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru14 extends BaseDriver {

    /*
    14-

Bu web sitesine gidiniz.  [http://demo.seleniumeasy.com/basic-first-form-demo.html](http://demo.seleniumeasy.com/basic-first-form-demo.html)

Mesajınızı giriniz.

Show message'a tıklayınız.

Show message button'unun altında mesajınızı yazdırınız.
     */

    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
        WebElement msg= driver.findElement(By.xpath("//input[@id='user-message']"));
        msg.sendKeys("kübra is a happy learner");

        WebElement show= driver.findElement(By.xpath("//button[text()='Show Message']"));
        show.click();

        WebElement mesage= driver.findElement(By.xpath("//span[@id='display']"));
        Assert.assertTrue(mesage.isDisplayed());

        BekleKapat();


    }
}
