package Odev_08_03_23_Selenium2;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru4 extends BaseDriver {
    /*
    4-

Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html](https://testpages.herokuapp.com/styled/index.html)

Search'e tıklayınız.

       Başlığı yazdırınız.

Search button'una tıklayınız.

       URL'i yazdırınız.
     */

    @Test
    public void Test1 () {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement element= driver.findElement(By.id("searchtest"));
        element.click();

        WebElement heading= driver.findElement(By.xpath("//h1[text()='The \"Selenium Simplified\" Search Engine']"));
        System.out.println(heading.getAttribute("title"));

        WebElement search=driver.findElement(By.name("btnG"));
        search.click();
        System.out.println(driver.getCurrentUrl());


        BekleKapat();

    }
}
