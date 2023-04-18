package Odev_08_03_23_Selenium2;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru12 extends BaseDriver {

    /*
    Bu siteye gidiniz.  http://demo.seleniumeasy.com/basic-first-form-demo.html

Input forms'a tıklayınız.

Ajax from Submit'e tıklayınız.

Name giriniz.

Comment giriniz.

Submit'e tıklayınız.

 Form submited Successfully! yazısı görüntülenmelidir.

Yazıyı yazdırınız.

     */


    @Test
    public void Test1() {
        driver.get(" http://demo.seleniumeasy.com/basic-first-form-demo.html");
        WebElement inputforms= driver.findElement(By.linkText("Input Forms"));
        inputforms.click();

        WebElement ajaxform= driver.findElement(By.linkText("Ajax Form Submit"));
        ajaxform.click();

        WebElement name= driver.findElement(By.xpath("//input[@id='title']"));
        name.sendKeys("Kübra");

        WebElement comment= driver.findElement(By.xpath("//textarea[@id='description']"));
        comment.sendKeys("Happy To Work");

        WebElement submit= driver.findElement(By.xpath("//input[@id='btn-submit']"));
        submit.click();

        WebElement control=driver.findElement(By.xpath("//div[@id='submit-control']"));
        Assert.assertTrue(control.isDisplayed());

        BekleKapat();

    }
}