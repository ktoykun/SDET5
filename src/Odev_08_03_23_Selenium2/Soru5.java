package Odev_08_03_23_Selenium2;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru5 extends BaseDriver {

    /*
    Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html](https://testpages.herokuapp.com/styled/index.html)

Calculate'e tıklayınız.

         İlk input'a herhangi bir sayı giriniz.

         İkinci input'a herhangi bir sayı giriniz.

Calculate button'una tıklayınız.

Sonucu alınız.

Sonucu yazdırınız.

     */

    @Test
    public void Test1(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement calculate= driver.findElement(By.id("calculate"));
        calculate.click();

        WebElement number1= driver.findElement(By.id("number1"));
        number1.sendKeys("2");

        WebElement number2= driver.findElement(By.id("number2"));
        number2.sendKeys("3");

        WebElement calcul= driver.findElement(By.xpath("//input[@value='Calculate']"));
        calcul.click();

        WebElement answer= driver.findElement(By.xpath("//span[@id='answer']"));
        System.out.println(answer.getText());

        BekleKapat();
    }
}
