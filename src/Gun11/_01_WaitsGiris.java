package Gun11;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

/*
Selenium bekletme komutları:

1- Implicitly wait: tüm sayfadaki elemanlar için, elemanın locatorı sayfa içinde bulunabilir
hale gelene kadar verilen bekleme süresi. verilen süre kadar bekler.bütün elemanlar için geçerli. eleman bulunduğunda
kalan süreyi beklemez. bu "no such element" hatası ile ilgili. ekranda görünmesi ayrı bir konu.
Bu sadece locatora bakar. Kullanımı şöyle:

        Duration muhlet=Duration.ofSeconds(5);
        driver.manage().timeouts().implicitlyWait(muhlet);

2- MyFunc.Bekle özelliği ise web sayfası ile bağlantılı değildir. verilen tüm süreyi
kullanır. element kendine geldikten sonra bile bekler. bütün programı durdurur.
interview larda bunu kullanıyoruz denmez. seleniumun kendi beklemetleri varken bu kullanılmaz.

 3- Explicit Wait: bu elemente özeldir. her şeyi kontrol eder. sadece locator değildir. tıklanabilrlik,
 görünürlük vs.

 Interview'da explicit ve implicit wait farkı sorulur.
 Implicitly:
 Explicit: sadece ilgili elemanda geçerli olur.

/*
     Selenium Bekletme Komutları

      pageLoadTimeout :
      driver.manage().timeouts().pageLoadTimeout(dr);
      30 sn süresinde sayfanın yüklenmesini bekliyor, bu süreden sonra timeout düşerek hata verir.

     ImplicitlyWait:
     Tüm sayfadaki elemanlar için, elemanın locatorı sayfa içinde bulanabilir hale getirene kadar verilen bekleme süresi.
     Bütün elemanlar için geçerli ve eleman bulunduğunda kalan süreyi beklemez.NoSuchElement hatasını için verilen süre
     kadar beler.

        Duration muhlet=Duration.ofSeconds(120);
        driver.manage().timeouts().implicitlyWait(muhlet);

     Explicit  Wait  : Tek bir eleman özel Kriter olarak tanımlanır sadece ilgili elemanda geçerli olur
 */


public class _01_WaitsGiris extends BaseDriver {
    public static void main(String[] args) {

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement buton=driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        buton.click();

        Duration muhlet=Duration.ofSeconds(120);
        driver.manage().timeouts().implicitlyWait(muhlet);

        WebElement mesaj= driver.findElement(By.xpath("//p[text()='WebDriver']"));
        BekleKapat();



    }


}
