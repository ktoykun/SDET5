package TestingProject2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Senaryo3 extends BaseDriver {

    /*
    Senaryo 3: Login Test
    ➢ Siteye gidin
    ➢ Login butonuna tıklayın
    ➢ Geçerli email ve password I giriniz
    ➢ Login butonuna tıklatınız ve login olduğunuzu doğrulayınız
     */
    @Test
    public void Proje () {

        driver.get("http://demowebshop.tricentis.com/");
        Actions aksiyonlar = new Actions(driver);

        WebElement login= driver.findElement(By.linkText("Log in"));
        aksiyonlar.moveToElement(login).click().build().perform();

        WebElement email= driver.findElement(By.xpath("//input[@id='Email']"));
        Action aksiyon1= aksiyonlar.moveToElement(email).click().sendKeys("k.toykun@hotmail.com").build();
        aksiyon1.perform();

        WebElement password= driver.findElement(By.xpath("//input[@id='Password']"));
        Action aksiyon2= aksiyonlar.moveToElement(password).click().sendKeys("143414").build();
        aksiyon2.perform();

        WebElement submit= driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        Action aksiyon3= aksiyonlar.moveToElement(submit).click().build();
        aksiyon3.perform();

        WebElement logout= driver.findElement(By.linkText("Log out"));
        Assert.assertTrue(logout.getText().contains("Log out"));

        BekleKapat();

    }
}
