package Gun08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://itera-qa.azurewebsites.net/");

        WebElement login=driver.findElement(By.xpath("//*[text()='Login']"));
        login.click();
    }
}
