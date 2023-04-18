package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_AlertPart2 extends BaseDriver {

    public static void main(String[] args) {

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement alertbox2 = driver.findElement(By.xpath("//button[@onclick= 'myConfirmFunction()']"));
        MyFunc.Bekle(3);
        alertbox2.click();

        MyFunc.Bekle(3);
        // alert açılıyor
        driver.switchTo().alert().dismiss(); // alert kutusu ok yine bas.

        BekleKapat();

    }


}
