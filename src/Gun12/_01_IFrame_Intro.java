package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IFrame_Intro extends BaseDriver {

    // sayfadak bir iframe olması onun orada olduğunu göstermez.
    // onun orada görünmesine sadece izin verilir.aslında o o sayfada yoktur.
    // alert gibi framenin olduğu o sayfaya geçiş yapmamız gerekiyor.
    // locator gözükse bile oraya geçiş yapmadan işlem yapamayız.
    // yine oradan çıkmadan da ana kısımda(parent frame) işlem yapamayız.
    // giriş çıkış yapacağız. bunu anlamak için ters tıkladığımız frame incele kısmı çıkar.
    // çerçeveyi yeniden yükle vs. buradan da anlayabiliriz
    @Test
    public void Test () {
        driver.get("https://chercher.tech/practice/frames");
        driver.switchTo().frame(0); // bu çok hızlı ve index mantığıyla çalışır.
        // yani bulunduğu sayfadaki kod sırası. kaçıncı index olduğunu bulmak için <iframe yazıp aratmalıyız

        //driver.switchTo().frame("id veya name") hem id hem name ile bulunabilir. ancak bu oldukça yavaş çalışır
        // driver.switchTo().parentFrame(); bir üstteki frame geçmek için bu kullanılır
        // driver.switchTo().defaultContent(); // diyelim çok içiçe frame açtık. direkt ana sayfaya dönmek için bunu kullanırız.



        WebElement input= driver.findElement(By.cssSelector("b[id='topic']+input"));
        input.sendKeys("Türkiye");

        BekleKapat();


    }

}
