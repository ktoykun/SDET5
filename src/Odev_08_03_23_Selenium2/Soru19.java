package Odev_08_03_23_Selenium2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Soru19 extends BaseDriver {
    /*
    Bu websitesine gidiniz. [http://demo.seleniumeasy.com/table-search-filter-demo.html](http://demo.seleniumeasy.com/table-search-filter-demo.html)

Listed users tablosunun içinde;

First Name filtre kutusuna "an" giriniz.

web sitesindeki first name'leri bulunuz. (içinde "an" olanlar.)

Bu first name'leri yazdırınız.

First Name filtre kutusundaki yazıyı siliniz.

Usernames filtre kutusuna "ar" giriniz.

Web sitesindeki username'leri bulunuz (içinde "ar" olanlar.)

Bu username'leri yazdırınız.

Not: find elements kullanınız.ve for loop kullanınız.

     */

    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/table-search-filter-demo.html");
        WebElement filter= driver.findElement(By.xpath("//button[@class='btn btn-default btn-xs btn-filter']"));
        filter.click();
        MyFunc.Bekle(1);

        WebElement firstname= driver.findElement(By.cssSelector("[placeholder='First Name']"));
        firstname. sendKeys("an");
        MyFunc.Bekle(1);

        List <WebElement> an=driver.findElements(By.cssSelector("[class='table'] tbody tr :nth-child(3)"));

        for (WebElement e :an ) {
            System.out.println(e.getText());
        }


        firstname.clear();
        MyFunc.Bekle(1);

        WebElement username= driver.findElement(By.cssSelector("[placeholder='Username']"));
        username.sendKeys("ar");
        MyFunc.Bekle(1);

        List <WebElement> anuser=driver.findElements(By.cssSelector("[class='table'] tbody tr :nth-child(2)"));
        for (WebElement b:anuser ) {
            System.out.println(b.getText());

        }

        MyFunc.Bekle(1);

        BekleKapat();

    }


}
