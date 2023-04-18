package Gun14;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.apache.commons.io.FileUtils; // FileUtils. mavenden aldık bunu
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class _01_EkranKaydet extends BaseDriver {
    // hata olduğunda ekran görüntüsü almamız lazım
    // 100 lerce test olacak hepsini göz ile takip etmek
    // mümkün değil. sayfaya şu olduysa bu bir hatadır.
    // bunun ekran görüntüsünü al diyeceğiz.

    @Test
    public void Test1 () throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        MyFunc.Bekle(1);

        WebElement username=driver.findElement(By.name("username"));
        username.sendKeys("k.toykun");
        MyFunc.Bekle(1);

        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("k.1434");
        MyFunc.Bekle(1);

        WebElement classname=driver.findElement(By.cssSelector("[type='submit']"));
        classname.click();
        MyFunc.Bekle(1);

        // hata varsa liste atacağız. sağlam bir locator bulacağız hata olduğunda her zaman çalışacak olan
        // hata varsa çıkan element aşağıdaki gibi olacak
        List<WebElement> hatamesajı=driver.findElements(By.xpath("//p[text()='Invalid credentials']"));
        if (hatamesajı.size()>0) // hata buldu demektir
            // ekran kaydet
            System.out.println("Hata oluştu");

            TakesScreenshot ts=(TakesScreenshot)driver;  // 1. aşama: ekran görüntüsü almak için değişken bu şekilde tanımlanır
        // seni ekran kaydetme olarak kullanacacğım diyoruz.
            File hafizadakihali = ts.getScreenshotAs(OutputType.FILE);//2. aşama ekran görüntüsü hafızaya alındı.
        // File dışındaki seçenekler databese olarak kaydediyor. bizim görebilmemiz için file olmalı.
        // şimdi hafizadaki bu bilgiyi dosya olarak kaydetmeliyiz. file utily hafızadaki hali okuyor
        // ve normal dosya haline getiriyor.
        // Now you can do whatever you need to do with it, for example copy somewhere
            FileUtils.copyFile(hafizadakihali, new File("Ekran Görüntüleri\\screenshot.png")); // noktadan sonra jpeg vs yazabilirsin o algılayıp kaydediyor. pdf hariç
            // nereye kaydedeceğini burada gösteriyoruz. javaya kaydet dedik

        // TODO: burada her hata da aynı dosyayı yeniliyor ve üzerine yazıyor.sonuna local date ekleyeceğiz
        // biz istiyoruz ki her dosya ayrı olsun yani her kayıt ayrı olsun
        // bunu nasıl yaparız
        // bilgileri LocalDateTime ile alacağız
        //YılAyGunSaatDk >>2020_10_07_1319_20.png

        MyFunc.Bekle(2);
        BekleKapat();


    }
}
