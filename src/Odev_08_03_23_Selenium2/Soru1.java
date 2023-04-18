package Odev_08_03_23_Selenium2;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru1 extends BaseDriver {

    /*
    1-

Bu web sitesine gidin   [https://testpages.herokuapp.com/styled/index.html](https://testpages.herokuapp.com/styled/index.html)

Alerts e tıklayınız

URL'i yazdırınız.

     */

    @Test public void test1 () {

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement alerts= driver.findElement(By.id("alerttestjs"));
        alerts.click();
        System.out.println(driver.getCurrentUrl());

        BekleKapat();
    }


}
