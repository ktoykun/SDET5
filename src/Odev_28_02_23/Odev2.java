package Odev_28_02_23;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Odev2 extends BaseDriver {

   /*
    http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html
     buradaki bütün öğrencileri bütün kutucukları doldurana kadar atınız.
    */

    @Test
    public void Test1 (){
       driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");

        Actions actions = new Actions(driver);
        List<WebElement> ogrenciler = driver.findElements(By.xpath("//*[contains(@id,'node')]"));
        List<WebElement> takimlar=driver.findElements(By.xpath("//*[contains(@id, 'box')]"));

        for (WebElement ogr: ogrenciler) {
            actions.moveToElement(ogr).clickAndHold().build().perform();
            MyFunc.Bekle(1);
            WebElement takim=driver.findElement(By.id("//*[@id='box1')]"));
            actions.moveToElement(takim).release().perform();


        }

        BekleKapat();
          }


}
