package Gun06;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert; // projeye assert kısmını eklemiş olduk.

public class _01_CssSelector2 extends BaseDriver {

    @Test // sen bir testsin tets gibi davran. artık mainde test yapmıyoruz.
    public void Test1 () {

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        String mesaj="Biz testerlar geliyoruz";

        WebElement gırıs=driver.findElement(By.cssSelector("[id='details-button']"));
        gırıs.click();

        WebElement gırıs2=driver.findElement(By.id("proceed-link"));
        gırıs2.click();

        WebElement showmessage= driver.findElement(By.cssSelector("input[id='user-message']"));
        showmessage.sendKeys(mesaj);

        WebElement buton= driver.findElement(By.cssSelector("[onclick='showInput();']"));
        buton.click();

        WebElement msg= driver.findElement(By.cssSelector("[id='display']"));

        // if yerine kullanacağımız bir şey var o da şu: Assert junıt olanı ama.
        // assert doğrulama demek

        Assert.assertTrue(msg.getText().equals(mesaj)); // verilen değer TRUE mu kontrol et.
        // if den farkı şu: sadece hata varsa gösterir. ses çıkarmıyorsa hata yok, doğru demektir.
        // Assert kodu yukarıdaki @test ile birleşince tam bir test gibi çelışır. sol tarafta tick verir.
        // hatalı olursa sol taraf çarpı işareti ve kırmızı olur

        // hatalı hali de şu
        // Assert.assertTrue("aranılan mesaj bulunamadı", msg.getText().equals(mesaj+".."));

        BekleKapat();

        /*
        JUNIT
        Javanın birim test kütüphanesi
        junit eski kalıyor. bunun kullannlar üzülüyor.
        bu üzülenler bunun yerine daha gelişmişini
        yazıyor, daha yenisini yazıyor
        yeni nesil test ünitesi
        testNG
        new generation

        [id^='u_'] -> id si    u_ ile başlayan  startWith
        [id*='u_'] -> id sinde u_ geçen         contains
        [id$='u_'] -> id si    u_ ile biten     endWith
       */

    }
}
