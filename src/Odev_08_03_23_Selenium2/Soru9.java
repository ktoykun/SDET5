package Odev_08_03_23_Selenium2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru9 extends BaseDriver {
/*
9-

Bu web sitesine gidiniz. http://demo.seleniumeasy.com/bootstrap-alert-messages-demo.html

Normal success message'a tıklayınız.

Açılan penceredeki x buttonuna tıklayınız.

Mesaj görünmemelidir.
 */
    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/bootstrap-alert-messages-demo.html");
        WebElement normalsucces = driver.findElement(By.id("normal-btn-success"));
        MyFunc.Bekle(1);
        normalsucces.click();


        WebElement close= driver.findElement(By.cssSelector("[class='alert alert-success alert-normal-success'] > [type='button'] "));
        MyFunc.Bekle(1);
        close.click();

        BekleKapat();

    }
}
