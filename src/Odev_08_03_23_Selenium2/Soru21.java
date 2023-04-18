package Odev_08_03_23_Selenium2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru21 extends BaseDriver {
/*
Bu websitesine gidiniz.    https://en.wikipedia.org/wiki/FIFA_World_Cup

Contents'in içindeki   "World Football – All time table"    'a tıklayınız.

Argentina'nın participation(katılım) sayısını yazdırınız.

Not: Bu tablo zamanla değişebilir. Mutlak konumu yazdırmayın.

Argentina'nın participation'ını yazdırınız.
 */

    @Test
    public void Test1() {
        driver.get(" https://en.wikipedia.org/wiki/FIFA_World_Cup");
        WebElement link=driver.findElement(By.linkText("\"World Football – All time table\""));
        link.click();
        MyFunc.Bekle(5);

        WebElement argentina=driver.findElement(By.cssSelector("[class='standard_tabelle'] tbody>:nth-child(4) :nth-child(4)"));
        System.out.println("argentina.getText() = " + argentina.getText());

        BekleKapat();
            
        }


    }
