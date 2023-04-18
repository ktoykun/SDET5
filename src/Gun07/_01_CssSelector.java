package Gun07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_CssSelector {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://formsmarts.com/form/yu?mode=h5");

        WebElement business=driver.findElement(By.cssSelector("[type='radio'][value='Business']"));
        business.click();

        WebElement dropdownDiscover= driver.findElement(By.cssSelector("select[id$='_4588']"));
        dropdownDiscover.click();

        WebElement optionOnlineAdvertising=driver.findElement(By.cssSelector("[value='Online Advertising']"));
        optionOnlineAdvertising.click();

        WebElement buttonEveryDay=driver.findElement(By.cssSelector("[type='radio'][value='Every Day']"));
        buttonEveryDay.click();

        WebElement goodRadio =driver.findElement(By.cssSelector("[type='radio'][value='Good']"));
        goodRadio.click();

        WebElement seçenek4=driver.findElement(By.cssSelector("select[id$='_4597'] > :nth-child(4)"));
        seçenek4.click();


    }
}
