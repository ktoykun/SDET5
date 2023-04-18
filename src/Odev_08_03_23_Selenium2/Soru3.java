package Odev_08_03_23_Selenium2;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru3 extends BaseDriver {

    /*
    Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html](https://testpages.herokuapp.com/styled/index.html)

[Find By Playground'a tıklayınız.](https://testpages.herokuapp.com/find_by_playground.php)

         5. text'i bulunuz.
     */

    @Test
    public void  Test1 () {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement found= driver.findElement(By.id("findbytest"));
        found.click();

        WebElement fifth=driver.findElement(By.cssSelector("[name='mydivname'] > [id='p5']"));
        System.out.println(fifth);




    }

}
