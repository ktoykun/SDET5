package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;
import java.util.List;

public class _01_FindingByElements_tag extends BaseDriver {

    public static void main(String[] args) {

        // java der ki: eğer static klassta tanımladığın kodları
        // bu sayfanın en başında kullanacaksan, yani ilk bu özellik çalışacaksa
        // şu kodu yazmana gerek yok: "DriverBaslat();" Bu kodu çağırmaya bile gerek kalmadan
        // bu classın içindeki kodları aynen kullandık.

        driver.get("https://www.hepsiburada.com/");

        // a tag'i ile başlayan bütün elemanları bul. verilen taglerdeki tüm elemanları alır.
        // ekranda görünmez bu linkler inceleme içindeki linkleri bulur
        List <WebElement> linkler= driver.findElements(By.tagName("a"));

        for (WebElement e: linkler ) {
            if (e.getText().isEmpty())

            System.out.print("(\"href\") = " + e.getAttribute("href"));
            System.out.print("(\"title\") = " + e.getAttribute("title"));
            System.out.print("(\"rel\") = " + e.getAttribute("rel"));

        }



        BekleKapat();
    }
}
