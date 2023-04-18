package Gun10;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionTusKontrolSendKeys extends BaseDriver {

    @Test
    public void Test1 (){
        driver.get("https://demoqa.com/auto-complete");
        WebElement element= driver.findElement(By.id("autoCompleteSingleInput"));
        // id si bulunurken input aradık html içinde.
        // çünkü bu bir input. alt alta geçmiş olabilir
        // kutucuk ise input ararız. kutucuk mutlaka inputtur.
        Actions aksiyonlar=new Actions(driver);

        Action aksyion= aksiyonlar
                .moveToElement(element)
                .click()
                .keyDown(Keys.SHIFT) // shifte bas
                .sendKeys("k")
                .keyUp(Keys.SHIFT) // shifti bırak
                .sendKeys("übra").build();

        aksyion.perform();

        BekleKapat();





    }


}
