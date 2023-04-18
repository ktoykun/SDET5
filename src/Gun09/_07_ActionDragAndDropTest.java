package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _07_ActionDragAndDropTest extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        Actions aksyiyonlar=new Actions(driver);

        MyFunc.Bekle(2);
        WebElement oslo= driver.findElement(By.xpath("//div[@id='box1']"));
        WebElement norway= driver.findElement(By.xpath(" //div[@id='box101']"));

        //1. yol
        aksyiyonlar.dragAndDrop(oslo, norway).build().perform();
        //osloyu sürükle norwaya bırak.


        //2. yol. bu yol bazen sitenin performasın tek adımda sürükle bırak yapaya yetmediğinde
        // tercih edilir. önce tıklanır sonra sürüklenir.
        aksyiyonlar.clickAndHold(oslo).build().perform();
        aksyiyonlar.release(norway).build().perform();

        BekleKapat();







}



}
