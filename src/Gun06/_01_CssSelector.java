package Gun06;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelector extends BaseDriver {
    // 1-Açılan sayfadaki kutucuğa mesajınızı yazını.
    // 2-Butona tıklatınız
    // 3-Butona basıldığında mesajınızın sayfada göründüğünü test ediniz.
    public static void main(String[] args) {

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement gırıs=driver.findElement(By.cssSelector("[id='details-button']"));
        gırıs.click();

        WebElement gırıs2=driver.findElement(By.id("proceed-link"));
        gırıs2.click();

        WebElement showmessage= driver.findElement(By.cssSelector("input[id='user-message']"));
        showmessage.click();
        showmessage.sendKeys("biz testerlar geliyoruz");

        WebElement buton= driver.findElement(By.cssSelector("button[type='button'][class='btn btn-default'][onclick='showInput();']"));
        buton.click();
        // sadece on click de diyebilirdik. yine teke indirmiş olurduk.

        //css selectorde olayımız köşeli parantez.parantezin içine parametresini veriyoruz.
        //yanyana ekleyerek istediğimiz kadar özellik içeren elemanı bulabiliriz.
        // [id='...'][class='...'] gerekiyorsa başına div diye input diye ekleyebiliriz.
        // o da şu demek: inputlardan idsi şu olan, divlerden id si bu olan vb
        // sayfada alt tarafında kaç tane bulduğunu veriyor. Orası 1 olana ve sarı işaretli
        // alana ulaşana kadar yapıyoruz.

        WebElement msg= driver.findElement(By.cssSelector("[id='display']"));

        if (msg.getText().equals("biz testerlar geliyoruz"))
            System.out.println("Test başarılı");
        else
            System.out.println("Failed");

        // get text ile "ekranda gözüken" yazıyı alabiliyoruz.
        BekleKapat();
    }
}
