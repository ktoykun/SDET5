package Gun09;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _08_DragAndDropBy extends BaseDriver {

    @Test

    public void Test1() {
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");
        Actions aksiyonlar=new Actions(driver);

        WebElement solsürgü= driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
        Action aksiyon=aksiyonlar.dragAndDropBy(solsürgü, 100, 0).build();
        // sol sürgü  x ve y yönünde gidebilir. diker gidemez. onun için y hep sıfır olur.
        // kaç birim gidecekse onu x e yazarız. -100 dersek örneğin diğer tarafa gider.
        aksiyon.perform();

        BekleKapat();

    }

}
