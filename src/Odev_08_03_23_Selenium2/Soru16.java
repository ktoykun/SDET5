package Odev_08_03_23_Selenium2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru16 extends BaseDriver {
    /*
    Bu web sitesine gidiniz. [http://demo.seleniumeasy.com/basic-first-form-demo.html](http://demo.seleniumeasy.com/basic-first-form-demo.html)

Input Forms'a tıklayınız.

Radio buttons Demo'a tıklayınız.

Get checked value buttonuna tıklayınız.

" **Radio button is Not checked** " görüntülenmelidir.

Male Radio buttonuna tıklayınız.

Get checked value buttonuna tıklayınız.

" **Radio button 'Male' is checked** " görüntülenmelidir.

Female Radio button'a tıklayınız.

Get Checked Value buttonuna tıklayınız.

" **Radio button 'Female' is checked** " görüntülenmelidir.
     */

    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
        WebElement forms= driver.findElement(By.linkText("Input Forms"));
        forms.click();
        MyFunc.Bekle(1);

        WebElement radio= driver.findElement(By.linkText("Radio Buttons Demo"));
        radio.click();
        MyFunc.Bekle(1);

        WebElement butoncheck= driver.findElement(By.xpath("//button[@id='buttoncheck']"));
        butoncheck.click();
        MyFunc.Bekle(1);

        WebElement isnotcheck=driver.findElement(By.xpath("//p[text()='Radio button is Not checked']"));
        Assert.assertTrue(isnotcheck.isDisplayed());

        WebElement male=driver.findElement(By.xpath("//input[@value='Male']"));
        male.click();
        butoncheck.click();
        MyFunc.Bekle(1);

        WebElement malechecked=driver.findElement(By.xpath("//p[@class='radiobutton']"));
        Assert.assertTrue(malechecked.isDisplayed());

        WebElement female=driver.findElement(By.xpath("//input[@value='Female']"));
        female.click();
        butoncheck.click();
        MyFunc.Bekle(1);

        WebElement femalechecked=driver.findElement(By.xpath("//p[@class='radiobutton']"));
        Assert.assertTrue(femalechecked.isDisplayed());


        BekleKapat();


    }
}