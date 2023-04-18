package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_RightClickTest extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://demoqa.com/buttons");

        WebElement element= driver.findElement(By.xpath("//button[text()='Right Click Me']"));
        MyFunc.Bekle(2);

        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.moveToElement(element).contextClick().build();
        // contextclick right click demek
        aksiyon.perform();

        // tek satırda yazmak için:
        // new Actions(driver).contextClick(element).build().perform();
        // bu yöntem hafıza için çok iyi değil hep yeni akstion oluşturur. istersen
        // bundan bir tane tanımlayıp hep kullanabilirsin.

        BekleKapat();

    }
}
