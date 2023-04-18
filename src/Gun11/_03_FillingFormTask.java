package Gun11;

import Utility.BaseDriver;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _03_FillingFormTask extends BaseDriver {
    /*
Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        assert ile kontrol ediniz
 */
    public static void main(String[] args) {

        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");
        WebElement name= driver.findElement(By.id("title"));
        name.sendKeys("Kübra");

        WebElement surname= driver.findElement(By.id("description"));
        surname.sendKeys("toykun");

        WebElement submit= driver.findElement(By.id("btn-submit"));
        submit.click();

       //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // bu olmaz çünkü sayfada çıkması görünürlük bu kod ile karşılanmıyor. aynı locatorda
        // iki tane text çıkıyor. bu ilklini buluyor. bize spesifik bir şey lazım.
        // bu durumda bize expectcondition lazım
        // imlicitlyWait elemanın locator bulması süresiyle ilgili buradaki zaten elemanlar hemen bulunuyor
        // burada kriter bulunan elemanın görünen yazısının oluşma süresi
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // findElement


        WebDriverWait bekle=new WebDriverWait(driver, Duration.ofSeconds(30));
        bekle.until(ExpectedConditions.textToBe(By.id("submit-control"), "Form submitted Succesfully!"));

        WebElement sub= driver.findElement(By.id("submit-control"));
        // Assert.assertEquals("Form submitted Succesfully!", mesaj.getText());
        // bu kod çalışmıyor. bir göz at!

        BekleKapat();



    }
}
