package Gun08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://itera-qa.azurewebsites.net/");

        WebElement sign = driver.findElement(By.xpath("//a[text()='Sign Up']"));
        sign.click();

        WebElement firstname=driver.findElement(By.xpath("//*[text()='First Name']"));
        firstname.sendKeys("Kübra");

        WebElement surname=driver.findElement(By.xpath("//*[text()='Surname']"));
        surname.sendKeys("Toykun");

        WebElement eposta=driver.findElement(By.xpath("//*[text()='E-post']"));
        eposta.sendKeys("k.toykun@hotmail.com");

        WebElement mobile=driver.findElement(By.xpath("//*[text()='Mobile']"));
        mobile.sendKeys("123456789");

        WebElement Username=driver.findElement(By.xpath("//*[text()='Username']"));
        Username.sendKeys("k.toykun");

        WebElement password =driver.findElement(By.xpath("//*[text()='Password']"));
        password.sendKeys("k12345");

        WebElement confirm=driver.findElement(By.xpath("//*[text()='Confirm']"));
        Username.sendKeys("k12345");

        WebElement submit=driver.findElement(By.xpath("//*[text()='Submit']"));
        submit.click();




    }

}
