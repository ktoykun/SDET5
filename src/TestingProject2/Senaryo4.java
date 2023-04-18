package TestingProject2;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Senaryo4 extends BaseDriver {
    /*
    Senaryo 4: Negatif Login Test
➢ Siteye gidin
➢ Login butonuna tıklayın
➢ Geçersiz email veya password giriniz
➢ Login butonuna tıklatınız ve login olamadığınızı doğrulayınız
     */

    @Test
    public void Proje() {

        driver.get("http://demowebshop.tricentis.com/");
        Actions aksiyonlar = new Actions(driver);

        WebElement login = driver.findElement(By.linkText("Log in"));
        aksiyonlar.moveToElement(login).click().build().perform();

        WebElement email= driver.findElement(By.xpath("//input[@id='Email']"));
        Action aksiyon1= aksiyonlar.moveToElement(email).click().sendKeys("k.toykun@hotmail.com").build();
        aksiyon1.perform();

        WebElement password= driver.findElement(By.xpath("//input[@id='Password']"));
        Action aksiyon2= aksiyonlar.moveToElement(password).click().sendKeys("14341434").build();
        aksiyon2.perform();

        WebElement submit= driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        Action aksiyon3= aksiyonlar.moveToElement(submit).click().build();
        aksiyon3.perform();

        WebElement unsuccesful=driver.findElement(By.xpath("//*[text()='Login was unsuccessful. Please correct the errors and try again.']"));
        Assert.assertFalse(unsuccesful.getText().contains("unsuccesful"));

        BekleKapat();

    }
}