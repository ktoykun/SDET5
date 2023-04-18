package Odev_08_03_23_Selenium2;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Soru20 extends BaseDriver {
    /*
    Bu web sitesine gidiniz. https://en.wikipedia.org/wiki/FIFA_World_Cup

Contents'in içindeki Attendance tablosunun içindeki

Bütün Host'ları yazdırınız.

Find elements kullanınız.
     */

    @Test
    public void Test1() {
        driver.get("https://en.wikipedia.org/wiki/FIFA_World_Cup");
        WebElement attendance= driver.findElement(By.linkText("Attendance"));
        attendance.click();

        List <WebElement> host=driver.findElements(By.cssSelector("[class='wikitable sortable jquery-tablesorter'][style='text-align:right;'] tbody tr span+a"));
        for (WebElement e:host) {
            System.out.println("e = " + e.getText());

        }

        BekleKapat();

    }
}