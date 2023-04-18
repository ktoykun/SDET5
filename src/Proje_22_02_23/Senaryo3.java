package Proje_22_02_23;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Senaryo3 extends BaseDriver {

    @Test
    public void Test () {
        /*
        3-
1) Bu siteye gidin. -> https://www.snapdeal.com/
2) "teddy bear" aratın ve Search butonuna tıklayın.
3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.
         */

        driver.get("https://www.snapdeal.com/");

        WebElement search= driver.findElement(By.cssSelector("[id='inputValEnter']"));
        search.sendKeys("teddy bear");

        WebElement button= driver.findElement(By.cssSelector("[class='searchformButton col-xs-4 rippleGrey'] > span"));
        button.click();

        WebElement result= driver.findElement(By.cssSelector("[class='search-result-txt-section  marT12'] > span"));

        Assert.assertTrue(result.getText().equals("We've got 373 results for teddy bear"));

        BekleKapat();



    }
}
