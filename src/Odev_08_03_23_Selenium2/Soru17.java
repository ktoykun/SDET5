package Odev_08_03_23_Selenium2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru17 extends BaseDriver {
    /*
    Bu web sitesine gidiniz. [http://demo.seleniumeasy.com/basic-first-form-demo.html](http://demo.seleniumeasy.com/basic-first-form-demo.html)

Input forms'a tıklayınız.

Radio buttons Demo'ya tıklayınız.

Group Radio Buttons Demo tablosunda;

male'a tıklayınız.

0 to 5'e tıklayınız.

Sonucu yazdırınız.

Sonuç **Sex : Male   Age group: 0 - 5** olmalıdır**.**

5 to 15' tıklayınız.

Sonucu yazdırınız.

Sonuç **Sex : Male   Age group: 5 - 15** olmalıdır.

15 to 50'ye tıklayınız.

Sonucu yazdırınız.

Sonuç **Sex : Male   Age group: 15 - 50** olmalıdır.

female'a tıklayınız.

0 to 5'e tıklayınız.

Sonucu yazdırınız.

Sonuç **Sex : female Age group: 0 - 5** olmalıdır.

5 to 15'e tıklayınız.

Sonucu yazdırınız.

Sonuç  **Sex : female Age group: 5 - 15** olmalıdır.

15 to 50'ye tıklayınız.

Sonucu yazdırınız.

Sonuç  **Sex : female Age group: 15 - 50** olmalıdır.


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

        WebElement male=driver.findElement(By.cssSelector("[type='radio'][name='gender'][value='Male']"));
        male.click();

        WebElement age=driver.findElement(By.cssSelector("[name='ageGroup'][value='0 - 5']"));
        age.click();

        WebElement getvalue=driver.findElement(By.xpath(" //button[text()='Get values']"));
        getvalue.click();

        WebElement result=driver.findElement(By.xpath("//p[@class='groupradiobutton']"));
        System.out.println("result.getText() = " + result.getText());

        WebElement beşonbeş=driver.findElement(By.cssSelector("[value='5 - 15']"));
        beşonbeş.click();
        getvalue.click();
        System.out.println("result.getText() = " + result.getText());

        WebElement female=driver.findElement(By.cssSelector("[value='Female'][name='gender']"));
        female.click();
        age.click();
        getvalue.click();
        System.out.println("result.getText() = " + result.getText());

        beşonbeş.click();
        getvalue.click();
        System.out.println("result.getText() = " + result.getText());

        WebElement onbeşelli=driver.findElement(By.cssSelector("[value='15 - 50'][name='ageGroup']"));
        onbeşelli.click();
        getvalue.click();
        System.out.println("result.getText() = " + result.getText());



        BekleKapat();



    }
}
