package Gun05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement element=driver.findElement(By.id("alerttest"));
       // 2. yol:  WebElement element2=driver.findElement(By.linkText("Alerts (JavaScript)"));
        MyFunc.Bekle(3);

        element.click();// yeni sayfaya gittik
        MyFunc.Bekle(3);

        System.out.println( driver.getCurrentUrl()); // o anda bulunduğun url'yi verir.

        driver.navigate().back(); // bu tarayıcı historysinden geri gelme işlemi
        MyFunc.Bekle(3);

        driver.navigate().forward();// tarayıcı historysinden ileri gidecek
        MyFunc.Bekle(3);

        BekleKapat ();
    }

}
