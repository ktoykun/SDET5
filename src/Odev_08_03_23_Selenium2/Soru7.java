package Odev_08_03_23_Selenium2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru7 extends BaseDriver {

    /*
    7-

Bu siteye gidiniz.  https://testpages.herokuapp.com/styled/index.html

Fake Alerts'e tıklayınız.

Show modal dialog buttonuna tıklayınız.

Ok'a tıklayınız.

Alert kapanmalıdır.
     */

    @Test
    public void Test1() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement fakelalert = driver.findElement(By.id("fakealerttest"));
        fakelalert.click();
        MyFunc.Bekle(1);

        WebElement showmodal= driver.findElement(By.id("modaldialog"));
        showmodal.click();
        MyFunc.Bekle(1);

        WebElement ok= driver.findElement(By.id("dialog-ok"));
        ok.click();
        MyFunc.Bekle(1);

        BekleKapat();


    }
}