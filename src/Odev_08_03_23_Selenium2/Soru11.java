package Odev_08_03_23_Selenium2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Soru11 extends BaseDriver {
    /*
    Bu web sitesine gidiniz.   http://demo.seleniumeasy.com/basic-select-dropdown-demo.html

Select a day dropdown'ından rastgele bir seçenek seçiniz.

5 kere wednesday seçtikten sonra döngüyü durdurun.

Kaç kere Wednesday seçtiğinizi yazdırınız.

Sonuç 5 olmalıdır.
     */

    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

        for (int i = 0; i <5 ; i++) {
            List < WebElement> list= driver.findElements(By.xpath("//select[@id='select-demo']"));
            WebElement select = driver.findElement(By.xpath("//select[@id='select-demo']"));
            int size=list.size();

            select.click();
            MyFunc.Bekle(1);

            Select menu=new Select(select);
            menu.selectByValue("Wednesday");
            MyFunc.Bekle(1);
            menu.getAllSelectedOptions().addAll(list);

            System.out.println(size); // sonucu 5 tane bir yazdırıyor bir bak

        }

        BekleKapat();
    }
}