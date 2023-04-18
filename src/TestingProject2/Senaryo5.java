package TestingProject2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Senaryo5 extends BaseDriver {

    /*
    ➢ Siteye gidin
➢ Login olun
➢ Computers>Notebook un altında “14.1-inch Laptop” adli ürüne tıklatınız
➢ Ad to Cart butonuna tıklatınız ve urunun başarılı bir şekilde eklendiğini doğrulayın
➢ Shopping cart butonuna tıklatıp sepetinize gidin ve urunun orda görüldüğünü doğrulayın
➢ Agree check box tıklatıp Sartları Kabul edin
➢ Checkout butonuna tıklatın
➢ Açılan sayfada tüm bilgileri doldurun ve confirm order butonuna tıklatın
➢ “Your order has been successfully processed!” mesajının görüldüğünü doğrulayın
     */

    @Test
    public void Proje() {

        driver.get("http://demowebshop.tricentis.com/");
        Actions aksiyonlar = new Actions(driver);

        WebElement login = driver.findElement(By.linkText("Log in"));
        aksiyonlar.moveToElement(login).click().build().perform();

        WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
        Action aksiyon1 = aksiyonlar.moveToElement(email).click().sendKeys("k.toykun@hotmail.com").build();
        aksiyon1.perform();

        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        Action aksiyon2 = aksiyonlar.moveToElement(password).click().sendKeys("143414").build();
        aksiyon2.perform();

        WebElement submit = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        Action aksiyon3 = aksiyonlar.moveToElement(submit).click().build();
        aksiyon3.perform();
        MyFunc.Bekle(2);

        WebElement comp = driver.findElement(By.linkText("Computers"));
        Action aksiyon4 = aksiyonlar.moveToElement(comp).build();
        aksiyon4.perform();
        MyFunc.Bekle(2);

        WebElement notebook = driver.findElement(By.linkText("Notebooks"));
        Action aksiyon5 = aksiyonlar.moveToElement(notebook).click().build();
        aksiyon5.perform();
        MyFunc.Bekle(2);

        WebElement laptop = driver.findElement(By.linkText("14.1-inch Laptop"));
        Action aksiyon6 = aksiyonlar.moveToElement(laptop).click().build();
        aksiyon6.perform();

        WebElement addtochart = driver.findElement(By.xpath("//input[@id='add-to-cart-button-31']"));
        Action aksiyon7 = aksiyonlar.moveToElement(addtochart).click().build();
        aksiyon7.perform();
        MyFunc.Bekle(2);

        WebElement succesful=driver.findElement(By.xpath("//*[contains (text(), 'The product has been added to your')]"));
        Assert.assertTrue(succesful.getText().contains("The product has been added to your"));
        MyFunc.Bekle(2);

        WebElement shopcart = driver.findElement(By.linkText("Shopping cart"));
        Action aksiyon8 = aksiyonlar.moveToElement(shopcart).click().build();
        aksiyon8.perform();
        MyFunc.Bekle(2);

        WebElement item=driver.findElement(By.name("removefromcart"));
        Assert.assertTrue(item.isDisplayed());
        MyFunc.Bekle(2);

        WebElement agree=driver.findElement(By.xpath("//input[@id='termsofservice']"));
        Action aksiyon9 = aksiyonlar.moveToElement(agree).click().build();
        aksiyon9.perform();
        MyFunc.Bekle(2);

        WebElement checkout=driver.findElement(By.xpath("//button[@id='checkout']"));
        Action aksiyon10 = aksiyonlar.moveToElement(checkout).click().build();
        aksiyon10.perform();
        MyFunc.Bekle(2);

        WebElement continue1=driver.findElement(By.xpath("//input[@class='button-1 new-address-next-step-button' and @onclick='Billing.save()']"));
        Action aksiyon11=aksiyonlar.moveToElement(continue1).click().build();
        aksiyon11.perform();
        MyFunc.Bekle(2);

        WebElement pickup= driver.findElement(By.id("PickUpInStore"));
        Action pick=aksiyonlar.moveToElement(pickup).click().build();

        WebElement continue2=driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));
        Action aksinyon12=aksiyonlar.moveToElement(continue2).click().build();
        aksinyon12.perform();

        MyFunc.Bekle(3);

        WebElement continue3=driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']"));
        Action aksinyon13=aksiyonlar.moveToElement(continue3).click().build();
        aksinyon13.perform();
        MyFunc.Bekle(2);

        WebElement continue4=driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']"));
        Action aksinyon14=aksiyonlar.moveToElement(continue4).click().build();
        aksinyon14.perform();
        MyFunc.Bekle(2);

        WebElement continue5=driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']"));
        Action aksinyon15=aksiyonlar.moveToElement(continue5).click().build();
        aksinyon15.perform();
        MyFunc.Bekle(2);

        WebElement continue6=driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']"));
        Action aksinyon16=aksiyonlar.moveToElement(continue6).click().build();
        aksinyon16.perform();
        MyFunc.Bekle(2);

        WebElement confirm= driver.findElement(By.xpath("//*[text()='Your order has been successfully processed!']"));
        Assert.assertTrue(confirm.getText().contains("successfully"));
        MyFunc.Bekle(2);

        BekleKapat();

    }
}
