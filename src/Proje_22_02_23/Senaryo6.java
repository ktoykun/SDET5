package Proje_22_02_23;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Senaryo6 extends BaseDriver {
    /*
    6-
    Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html
    Fake Alerts'e tıklayınız.
    Show modal dialog buttonuna tıklayınız.
    Ok'a tıklayınız.
    Alert kapanmalıdır.
     */

    @Test
    public void Test (){

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fake= driver.findElement(By.cssSelector("[id='fakealerttest']"));
        fake.click();

        WebElement modal= driver.findElement(By.cssSelector("[value='Show modal dialog']"));
        modal.click();
        MyFunc.Bekle(2);

        WebElement ok= driver.findElement(By.cssSelector("[class='dialog-button']"));
        ok.click();


        BekleKapat();



    }
}
