package TestingProject1;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Case3 extends BaseDriver {

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

        WebElement create=driver.findElement(By.linkText("CREATE NEW"));
        create.click();

        WebElement name=driver.findElement(By.cssSelector("[id='Name']"));
        name.sendKeys("Kübra");

        WebElement company=driver.findElement(By.cssSelector("[id='Company']"));
        company.sendKeys("Google");

        WebElement address=driver.findElement(By.cssSelector("[id='Address']"));
        address.sendKeys("Utah");

        WebElement city=driver.findElement(By.cssSelector("[id='City']"));
        city.sendKeys("LA");

        WebElement phone=driver.findElement(By.cssSelector("[id='Phone']"));
        phone.sendKeys("1234");

        WebElement email=driver.findElement(By.cssSelector("[id='Email']"));
        email.sendKeys("k.toykun@hotmail.com");

        WebElement create1=driver.findElement(By.cssSelector("[value='Create']"));
        create1.click();


        BekleKapat();


    }
}
