package Gun11;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _04_WaitSoru extends BaseDriver {
    /*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */
    public static void main(String[] args) {

        driver.get(" https://www.demoblaze.com/index.html");

        WebElement s6link= driver.findElement(By.linkText("Samsung galaxy s6"));
        s6link.click();

        WebElement chart=driver.findElement(By.linkText("Add to cart"));
        chart.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.alertIsPresent());// alert çıkana kadar bekle

        driver.switchTo().alert().accept(); // java o kadar hızlı ki sayfada alert çıkmadan
       // daha tıklamaya çalışıyor. o yüzden biz diyeceğiz ki alert çıkana kadar bekle.

        WebElement anaekran= driver.findElement(By.id("nava"));
        anaekran.click();

        BekleKapat();
    }




}
