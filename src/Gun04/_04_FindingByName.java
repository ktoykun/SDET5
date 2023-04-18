package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_FindingByName {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get(" https://www.jotform.com/signup/ ");

        WebElement ad=driver.findElement(By.name("name"));
        ad.sendKeys("Kübra");

        MyFunc.Bekle(5);
        driver.quit();
    }
}
