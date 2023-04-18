package Proje_22_02_23;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Senaryo4  extends BaseDriver {
    /*
    Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
    Calculate'e tıklayınız.
    İlk input'a herhangi bir sayı giriniz.
    İkinci input'a herhangi bir sayı giriniz.
    Calculate button'una tıklayınız.
    Sonucu alınız.
    Sonucu yazdırınız.
     */

    @Test
    public void Test () {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculate= driver.findElement(By.cssSelector("[id='calculate']"));
        calculate.click();

        WebElement number= driver.findElement(By.cssSelector("[id='number1']"));
        number.sendKeys("5");

        WebElement number2= driver.findElement(By.cssSelector("[id='number2']"));
        number2.sendKeys("3");

        WebElement submit= driver.findElement(By.cssSelector("[id='calculate']"));
        submit.click();

        WebElement result= driver.findElement(By.cssSelector("[id='answer']"));
        System.out.println(result);






    }
}
