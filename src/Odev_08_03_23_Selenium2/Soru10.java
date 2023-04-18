package Odev_08_03_23_Selenium2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru10 extends BaseDriver {

    /*
    Bu web sitesine gidiniz. http://demo.seleniumeasy.com/basic-checkbox-demo.html

check all button'a tıklayınız.

Uncheck All button'da " Uncheck All" yazısını yazdırınız.
     */
    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");
        WebElement checkall = driver.findElement(By.id("check1"));
        checkall.click();

        MyFunc.Bekle(1);

        System.out.println(checkall.getAttribute("value"));

        BekleKapat();



    }

}
