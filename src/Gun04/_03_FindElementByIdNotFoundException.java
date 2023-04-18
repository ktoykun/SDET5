package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindElementByIdNotFoundException {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get(" https://www.jotform.com/enterprise/");

        // WebElement isim=driver.findElement(By.id("hero-contact-sales-btn"));
        // System.out.println("isim = " + isim.getText());

        // peki locator doğru verilmezse ve aranılan şey bulunamazsa ne olur görelim:

        try{
        WebElement isim=driver.findElement(By.id("hatalilocator"));
        }
        catch (Exception ex)
        {
            System.out.println("WebElement Bulunamadı= " + ex.getMessage());
        }
        // aşağıda çıkan yazıların içinden exception bizim için önemli olan
        // o kısımda "no such element: Unable to locate element:" diyor.
        // yani böyle bir element yok. bunu gördüğümüz zaman
        // locator doğru vermediğimizi anlayacağız.
        // hata verdiğinde try catch kullanmalıyız.
        // buna ek, web element kısmı hata verdiği için
        // bir sonraki kod olan kapatma komutu da çalışmaz.

        MyFunc.Bekle(5);
        driver.quit();
    }
}
