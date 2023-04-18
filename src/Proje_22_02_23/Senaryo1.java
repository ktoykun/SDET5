package Proje_22_02_23;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Senaryo1 extends BaseDriver {

    @Test
   public void Test () {

         /*
  1) Bu siteye gidin. -> http://demoqa.com/text-box
  2) Full Name kısmına "Automation" girin.
  3) Email kısmına "Testing@gmail.com" girin.
  4) Current Address kısmına "Testing Current Address" girin.
  5) Permanent Address kısmına "Testing Permanent Address" girin.
  6) Submit butonuna tıklayınız.
  7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
  8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.
         */


        driver.get("http://demoqa.com/text-box");

        WebElement username= driver.findElement(By.cssSelector("[id='userName']"));
        username.sendKeys("Automation");

        WebElement mail= driver.findElement(By.cssSelector("[id='userEmail']"));
        mail.sendKeys("Testing@gmail.com");

        WebElement address= driver.findElement(By.cssSelector("[id='currentAddress']"));
        address.sendKeys("Testing Current Address");

        WebElement PermAddress= driver.findElement(By.cssSelector("[id='permanentAddress']"));
        PermAddress.sendKeys("Testing Permanent Address");

        WebElement submit= driver.findElement(By.cssSelector("[id=submit]"));
        submit.click();

        Assert.assertTrue(username.getText().contains("Automation"));

        Assert.assertTrue(mail.getText().contains("Testing"));
        BekleKapat();
    }
}
