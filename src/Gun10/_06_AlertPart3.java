package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_AlertPart3 extends BaseDriver {
    public static void main(String[] args) {

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement promptbox= driver.findElement(By.xpath("//button[@onclick= 'myPromptFunction()']"));
        promptbox.click();
        MyFunc.Bekle(2);

        driver.switchTo().alert().sendKeys("Kübra"); // yazmadı tekrar izle bu kısmı
        driver.switchTo().alert().accept();

        MyFunc.Bekle(2);
        WebElement txtActual=driver.findElement(By.id("prompt-demo"));

        // Burayı dersten al!!Assert.assertTrue("Beklenen yazi göründü mü?"), txtActual.getText().contains("Kübra");

        BekleKapat();
    }
}
