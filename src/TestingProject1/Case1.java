package TestingProject1;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Case1 extends BaseDriver {

    @Test
    public void Test () {

        driver.get("https://itera-qa.azurewebsites.net/");

        WebElement signup= driver.findElement(By.linkText("Sign Up"));
        signup.click();

        WebElement firstname= driver.findElement(By.cssSelector("[id='FirstName']"));
        firstname.sendKeys("Kübra");

        WebElement surname= driver.findElement(By.cssSelector("[id='Surname']"));
        surname.sendKeys("Toykun");

        WebElement epost= driver.findElement(By.cssSelector("[id='E_post']"));
        epost.sendKeys("k.toykun@hotmail.com");

        WebElement mobile= driver.findElement(By.cssSelector("[id='Mobile']"));
        mobile.sendKeys("123456");

        WebElement username= driver.findElement(By.cssSelector("[id='Username']"));
        username.sendKeys("k.toykun");

        WebElement password= driver.findElement(By.cssSelector("[id='Password']"));
        password.sendKeys("k.1434");

        WebElement confpassword= driver.findElement(By.cssSelector("[id='ConfirmPassword']"));
        confpassword.sendKeys("k.1434");

        WebElement submit= driver.findElement(By.cssSelector("[id='submit']"));
        submit.click();

        WebElement regs=driver.findElement(By.cssSelector("div[class='col-md-offset-2 col-md-2'] > label"));

        Assert.assertTrue(regs.getText().equals("Registration Successful"));


        BekleKapat();

    }
}
