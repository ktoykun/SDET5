package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_IntroAlert extends BaseDriver {

    /*
     Interview sorusu: Alertleri nasıl kullanırsın ?
        driver.switchTo().alert()     -> alerte geçerim
        komutları:
        1- accept : OK, TAMAM botunan basmamızı sağlar.
        2- dismiss : CANCEL, HAYIR, yani olumsuz butonuna basmamızı sağlıyor.
        3- sendKeys : yazı gönderme
        4- getText : uyarı yazısını alma

     */
    public static void main(String[] args) {

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement alertbox = driver.findElement(By.xpath("//button[@onclick= 'myAlertFunction()']"));
        MyFunc.Bekle(3);
        alertbox.click();

        MyFunc.Bekle(3);
        // alert açılıyor
        driver.switchTo().alert().accept();

        BekleKapat();

    }



   /*
    public void Test() {
    */


}