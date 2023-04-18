package TestingProject1;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Case2 extends BaseDriver {

    @Test
    public void Test () {

        driver.get("https://itera-qa.azurewebsites.net/");

        WebElement login= driver.findElement(By.linkText("Login"));
        login.click();

        WebElement username= driver.findElement(By.cssSelector("[id='Username']"));
        username.sendKeys("k.toykun");

        WebElement password= driver.findElement(By.cssSelector("[id='Password']"));
        password.sendKeys("k.1434");

        WebElement submit= driver.findElement(By.cssSelector("[value='Login']"));
        submit.click();

        WebElement welcome=driver.findElement(By.cssSelector("div[class='container body-content']  h3"));
        Assert.assertTrue(welcome.getText().contains("k.toykun"));

        BekleKapat();





    }
}
