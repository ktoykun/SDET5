package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionHoverOverTest extends BaseDriver {


    @Test
    public void Test1(){
        driver.get("https://www.hepsiburada.com/");

        WebElement moda= driver.findElement(By.xpath("//span[text()='Moda']"));
        MyFunc.Bekle(2);

        Actions aksyionlar=new Actions(driver);
        Action aksyion=aksyionlar.moveToElement(moda).build();
        aksyion.perform();
        // mouse o elementin üzerine geliyor ve menüsünü açıyor
        BekleKapat();



    }
}
