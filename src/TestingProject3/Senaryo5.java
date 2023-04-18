package TestingProject3;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Senaryo5 extends BaseDriver {
    /*
    Test Case:5
➢ https://shopdemo.e-junkie.com/ sitesine gidiniz
➢ ContactUs butonuna tıklattınız
➢ Name, Email, Subject ve mesaj kısımlarını doldurun
➢ Send butonuna tıklatın
➢ Alert in görüldüğünü doğrulayın ve alert I kapatın
     */
    @Test
    public void Proje() {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("https://shopdemo.e-junkie.com/");
        WebElement contact= driver.findElement(By.linkText("Contact Us"));
        contact.click();

        WebElement name= driver.findElement(By.id("sender_name"));
        name.sendKeys("kübra");

        WebElement email= driver.findElement(By.id("sender_email"));
        email.sendKeys("k.toykun@blabla.com");

        WebElement subject= driver.findElement(By.id("sender_subject"));
        subject.sendKeys("subject");

        WebElement msg= driver.findElement(By.id("sender_message"));
        msg.sendKeys("message");

        driver.switchTo().frame(0);
        WebElement notarobot= driver.findElement(By.id("recaptcha-anchor"));
        notarobot.click();

        driver.switchTo().parentFrame();
        WebElement submit= driver.findElement(By.id("send_message_button"));
        submit.click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();


        BekleKapat();






    }

}
