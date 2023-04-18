package Proje_22_02_23;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Senaryo2 extends BaseDriver {
    {/*
2-
1) Bu siteye gidin. -> https://demo.applitools.com/
2) Username kısmına "ttechno@gmail.com" girin.
3) Password kısmına "techno123." girin.
4) "Sign in" buttonunan tıklayınız.
5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.

 */

    }
    @Test
    public void Test () {

        driver.get("https://demo.applitools.com/");

        WebElement user= driver.findElement(By.cssSelector("[id='username']"));
        user.sendKeys("ttechno@gmail.com");

        WebElement password= driver.findElement(By.cssSelector("[id='password']"));
        password.sendKeys("techno123.");

        WebElement login= driver.findElement(By.cssSelector("div[class='buttons-w'] > [id='log-in']"));
        login.click();

        WebElement branch=driver.findElement(By.cssSelector("[class='element-actions'] + [id='time']"));
        Assert.assertTrue(branch.getText().equals("Your nearest branch closes in: 30m 5s"));



        BekleKapat();



    }


}
