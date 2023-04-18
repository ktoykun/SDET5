package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_IFrameSoru extends BaseDriver {
    /*
   1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
 */

    @Test
    public void Test1 () {
        driver.get("http://chercher.tech/practice/frames");
        driver.switchTo().frame(0);
        WebElement topic= driver.findElement(By.cssSelector("b[id='topic']~input"));
        topic.sendKeys("Türkiye");

        driver.switchTo().frame(0); // iki kademe içeri girmiş oldu. 1. framemin içindeki ilk frame. yani indexi 0
        WebElement checkbox= driver.findElement(By.cssSelector("[id='a']"));
        checkbox.click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);

        WebElement animal= driver.findElement(By.id("animals"));
        Select avatar=new Select(animal);
        avatar.selectByIndex(3); // 4. elemanı seçer

        BekleKapat();

    }
}
