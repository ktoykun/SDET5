package Gun11;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _02_ExplicitWait extends BaseDriver {
    public static void main(String[] args) {

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement btn=driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        btn.click();

        WebDriverWait bekle=new WebDriverWait(driver, Duration.ofSeconds(30));
        bekle.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));

        // beklenen kriterlerden >> expectedConditions
        // verilen locatordaki element görünür >> visibilityOfElementLocated
        // gelene kadar bekle >> bekle.until

        System.out.println("bitti");


    }


}
