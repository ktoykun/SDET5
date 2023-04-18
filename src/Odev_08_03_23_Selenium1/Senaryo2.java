package Odev_08_03_23_Selenium1;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Senaryo2 extends BaseDriver {
     /*

 Senaryo
1- https://www.youtube.com/ adresine gidiniz
2- "Selenium" kelimesi ile video aratınız.
3- Listelenen sonuçlarda 80 videoaya kadar lsiteyi uzatınız.
4- Son videonun title ını yazdırınız.

     */

    @Test
    public void Test1 () {
        driver.get("https://www.youtube.com/");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement search= driver.findElement(By.xpath("//input[@id='search']"));
        search.sendKeys("selenium");

        WebElement click= driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
        click.click();

        JavascriptExecutor js=(JavascriptExecutor) driver;

       List<WebElement> videos= driver.findElements(By.xpath("//a[@id='video-title']"));
       while (videos.size()<80)
      {
          js.executeScript("window.scrollTo(0, document.documentElement.scrollHeight);");
          wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//a[@id='video-title']"), videos.size()));
          videos = driver.findElements(By.xpath("//a[@id='video-title']"));

      }

        js.executeScript("arguments[0].scrollIntoView(true);", videos.get(79));
        System.out.println(videos.get(79).getAttribute("Title"));

        BekleKapat();

    }


}
