package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    public static WebDriver driver;// her tarafta kullanılsın diye public.
    // bir tane olduğu için static. driver bi tane var.

     static

         // bu kısım static ile birleşikti. intelige kolaylığı
         // bu zaten static canlı ve diğer klastan çağırılabilir. o yüzden silinebilir.

    {
        KalanOncekileriKapat();

        Logger logger= Logger.getLogger(""); // sisteme ait bütün logları üreten objeye/servise ulaştım ""
        logger.setLevel(Level.SEVERE); // Sadece errorları göster

       // System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);


        // driver=new ChromeDriver(); //  WebDriver  yazıyordu. bu kodun başında.
        // yukarıda tanımladığımız için burada kaldırdık.

        // outputtaki gereksiz logları kaldırdık.
        // yukarıdaki kodlar ile alt tarafta çıkan kırmızı kısımları kaldırıyoruz.
        // ChromeDriver was started successfully. sadece bu kaldı o da kalacak.


        //***************************************\

        driver.manage().window().maximize(); // sayfayı max yapar

        Duration dr= Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr); // Sadece tüm sayfanın kodlarının
        // bilgisyarınıza inmesi süresiyle ilgili
        //bu eklenmezse Selenium sayfa yüklenene kadar (sonsuza) bekler.:
        // 30 sn süresince sayfanın yüklenmesini bekle yüklenmezse hata ver.
        // eğer 2 sn yüklerse 30 sn. beklemez.

        driver.manage().timeouts().implicitlyWait(dr); // Bütün weblementlerin element bazında,
        // elemente özel işlem yapılmadan önce
        // hazır hale gelmesi verilen mühlet yani süre.
        // eğer 2 sn yüklerse 30 sn. beklemez.


    }

        public static void BekleKapat (){

        MyFunc.Bekle(3);
        driver.quit();

    }

    public static void KalanOncekileriKapat() { // arkada çalışan görünmeyen ama
         // aktif olan/ kullanılmayan chromelerı hafızayı yormasın diye kapatma işlemi

        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ignored) {

        }
    }
}
