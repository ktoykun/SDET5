package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionDoubleClickTest extends BaseDriver {

    @Test
    public void Test1 () {
        driver.get("https://demoqa.com/buttons");

        WebElement element= driver.findElement(By.id("doubleClickBtn"));
        MyFunc.Bekle(2);

        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.moveToElement(element).doubleClick().build();
        aksiyon.perform();

        // daha kısa olarak: aksiyonlar.doubleClick(element).build().perform();;
        // diğer yol: aksiyonlar.moveToElement(element).doubleClick().build().perform();

        BekleKapat();
    }
}
