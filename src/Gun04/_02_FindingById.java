package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingById {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get(" https://www.jotform.com/enterprise/");

        WebElement butonatıkla= driver.findElement(By.id("hero-contact-sales-btn"));
        butonatıkla.click(); // id si bu olana tıkla

        WebElement name= driver.findElement(By.id("search-input")); // elemanı id si ile bul.
        name.sendKeys("Kübra"); // kutucuklara yazı gönderme işlemi bununla olur.

        // Chrome ctrl+f basıldığında inspect bölümünde
        // first_name yazarsak bütün kelimelerin içinde arar
        // başına # koyarsak sadece ID parametreleri içinde arar
        // önemli olan teke indirmek ve onu bulmak

         name.clear(); // içine yazdığımızı siler.

         WebElement isim=driver.findElement(By.id("hero-contact-sales-btn"));
         System.out.println("isim = " + isim.getText()); // bu bir sonraki sayfada çalışıyor

        // hocanın web sitesi farklı o yüzden bu kodların bazısı çalışmıyor.
        // mantığı şu: sayfadaki düz yazıyı get text ile alıp
        // ekrana yazdırabiliyoruz.

        MyFunc.Bekle(5);
        driver.quit();
    }


}
