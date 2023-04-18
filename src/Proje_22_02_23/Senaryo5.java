package Proje_22_02_23;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Senaryo5 extends BaseDriver {

    @Test
    public void Test () {
        /*
        5-
        Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
        Fake Alerts' tıklayınız.
        Show Alert Box'a tıklayınız.
        Ok'a tıklayınız.
        Alert kapanmalıdır.
         */

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakealert= driver.findElement(By.cssSelector("[id='fakealerttest']"));
        fakealert.click();
        MyFunc.Bekle(2);

        WebElement alert= driver.findElement(By.cssSelector("[id='fakealert']"));
        alert.click();

        MyFunc.Bekle(2);

        WebElement ok= driver.findElement(By.cssSelector("[id='dialog-ok']"));
        ok.click();


        BekleKapat();
    }
}
