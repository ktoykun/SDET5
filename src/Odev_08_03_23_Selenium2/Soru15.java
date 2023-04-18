package Odev_08_03_23_Selenium2;

import Utility.BaseDriver;
import com.google.j2objc.annotations.Weak;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru15 extends BaseDriver {

    /*
    Bu web sitesine gidiniz. [http://demo.seleniumeasy.com/basic-first-form-demo.html](http://demo.seleniumeasy.com/basic-first-form-demo.html)

"Enter a" ya bir değer giriniz.

"Enter b" ye bir değer giriniz.

Get Total'a basınız.

Web sitesindeki sonucu yazdırınız.
     */

    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
        WebElement entera= driver.findElement(By.xpath("//input[@id='sum1']"));
        entera.sendKeys("12");

        WebElement enterb= driver.findElement(By.xpath("//input[@id='sum2']"));
        enterb.sendKeys("21");

        WebElement gettotal= driver.findElement(By.xpath("//button[text()='Get Total']"));
        gettotal.click();

        WebElement sonuc= driver.findElement(By.xpath("//span[@id='displayvalue']"));
        System.out.println(sonuc.getText());

      BekleKapat();

    }
}