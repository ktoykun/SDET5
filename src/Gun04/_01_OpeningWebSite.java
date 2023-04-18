package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebSite {
    public static void main(String[] args) {

        // 1- bilmem ne sayfasına git
        // 2- arama kutusuna usb yaz
        // 3- ara butonuna bas
        // 4- çıkan ürünlerin açıklamasında USB kelimesini kontrol et

        WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com");

        // eleman bulmak istediğimizde driverden çağıracağız. bana şu elemanı ver
        // diyeceğiz. eleman arama kutusunu bul. bu kutuya yazı gönder. ürünlerin
        // listesini al. for döngüsü ile kontrol et.

        MyFunc.Bekle(5); // bu kadar saniye bekle
        driver.quit(); // sayfaları kapattık ki pc nin arka planında çalışmasın. hafızayı şişirmesin.

    }
}
