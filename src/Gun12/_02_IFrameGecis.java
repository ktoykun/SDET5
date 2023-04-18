package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class _02_IFrameGecis extends BaseDriver {
    /*
   Senaryo :
   https://chercher.tech/practice/frames sitesine gidiniz
   Ekranda gözüken ilk kutucuğa Türkiye yazınız.
   Daha sonra animals dan seçeneklerinden avatar ı seçiniz.
 */
    @Test
    public void Test () {
        Actions aksiyonlar=new Actions(driver);
        driver.get("https://chercher.tech/practice/frames");
        driver.switchTo().frame(0);
        WebElement topic= driver.findElement(By.cssSelector("b[id='topic']+input"));
        topic.sendKeys("Türkiye");

        // alternatif locator bulma yolları:
        // b[@id='topic']/following-sibling::input
        // b[id='topic']~input
        // bunun başında  slash yok #topic+input

        driver.switchTo().parentFrame();
      // driver.switchTo().defaultContent();// aynı işlemi yapar çünkü bir kademe içeri giridk.
        driver.switchTo().frame(1);
        WebElement webmenu= driver.findElement(By.className("col-lg-3"));
        Select avatar=new Select(webmenu);
        avatar.selectByVisibleText("Avatar");

        // avatar.click();
        // Action aksiyon= aksiyonlar.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).click().build();
        // aksiyon.perform();

        BekleKapat();



    }

}
