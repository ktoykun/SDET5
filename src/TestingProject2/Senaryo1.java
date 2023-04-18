package TestingProject2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Senaryo1 extends BaseDriver {
    @Test
    public void Proje () {


     /* //url: http://demowebshop.tricentis.com/
         Senaryo 1: Kayıt oluşturma Testi
        ➢ Siteye gidin
        ➢ Register butonuna tıklayın
        ➢ Kişisel bilgileri doldurun ve register butonuna tıklayın
        ➢ Başarılı bir şekilde kaydolduğunuzu doğrulayınız
      */

        driver.get("http://demowebshop.tricentis.com/");
        Actions aksiyonlar=new Actions(driver);

        WebElement register= driver.findElement(By.linkText("Register"));
        aksiyonlar.moveToElement(register).click().build().perform();
        MyFunc.Bekle(2);

        WebElement female= driver.findElement(By.id("gender-female"));
        aksiyonlar.moveToElement(female).click().build().perform();
        MyFunc.Bekle(2);

        WebElement firstname= driver.findElement(By.xpath("//input[@id='FirstName']"));
        Action aksiyon1=aksiyonlar.moveToElement(firstname).click().sendKeys("Kübra").build();
        aksiyon1.perform();
        MyFunc.Bekle(2);

        WebElement  lastname= driver.findElement(By.xpath("//input[@id='LastName']"));
        Action aksiyon2=aksiyonlar.moveToElement(lastname).click().sendKeys("Toykun").build();
        aksiyon2.perform();
        MyFunc.Bekle(2);

        WebElement  email= driver.findElement(By.xpath("//input[@id='Email']"));
        Action aksyion3=aksiyonlar.moveToElement(email).click().sendKeys("k.toykun@hotmail.com").build();
        aksyion3.perform();

        WebElement  password= driver.findElement(By.xpath("//input[@id='Password']"));
        Action aksyion4=aksiyonlar.moveToElement(password).click().sendKeys("143414").build();
        aksyion4.perform();

        WebElement  conpassword= driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        Action aksyion5=aksiyonlar.moveToElement(conpassword).click().sendKeys("143414").build();
        aksyion5.perform();

        WebElement  regbutton= driver.findElement(By.xpath("//input[@id='register-button']"));
        Action aksyion6=aksiyonlar.moveToElement(regbutton).click().build();
        aksyion6.perform();

        WebElement result= driver.findElement(By.cssSelector("[class='result']"));
        Assert.assertTrue(result.getText().contains("Your registration completed"));

       BekleKapat();




    }



}
