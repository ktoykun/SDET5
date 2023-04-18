package Odev_08_03_23_Selenium2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru6 extends BaseDriver {

    /*
    6-

Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html](https://testpages.herokuapp.com/styled/index.html)

Fake Alerts' tıklayınız.

Show Alert Box'a tıklayınız.

Ok'a tıklayınız.

Alert kapanmalıdır.
     */

    @Test
    public void Test1() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement fakelalert = driver.findElement(By.id("fakealerttest"));
        fakelalert.click();

        WebElement showalertbox = driver.findElement(By.id("fakealert"));
        showalertbox.click();
        MyFunc.Bekle(2);

        WebElement alertbox= driver.findElement(By.id("dialog-ok"));
        alertbox.click();

        BekleKapat();
    }
}