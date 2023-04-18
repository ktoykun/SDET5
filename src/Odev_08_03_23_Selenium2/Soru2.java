package Odev_08_03_23_Selenium2;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru2 extends BaseDriver {

    /*
    2-

Bu web sitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html](https://testpages.herokuapp.com/styled/index.html)

Alerts'e tıklayınız.        URL'i yazdırınız.

Geri gidin. URL'i yazıdırnız.

Basic Ajax'a tıklayınız.          URL'i yazdırınız.

     */

    @Test
    public void  Test1 (){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement element= driver.findElement(By.id("alerttest"));
        element.click();
        System.out.println(driver.getCurrentUrl());

        WebElement back=driver.findElement(By.linkText("Index"));
        back.click();
        System.out.println(driver.getCurrentUrl());

        WebElement ajax= driver.findElement(By.id("basicajax"));
        ajax.click();
        System.out.println(driver.getCurrentUrl());

        BekleKapat();

    }
}
