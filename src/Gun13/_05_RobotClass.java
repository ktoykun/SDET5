package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class _05_RobotClass extends BaseDriver {

    // bu fonksiyonu web dışında kalan yerlerde kullanıyoruz. örneğin web sayfasına dosya
    // yüklerken windows sayfası açılıyor yada bir web sayfasına girdiğimizde
    // bildirimlere izin ver seçeneği çıkııyor bunları kontrol için kullanıyoruz.

       @Test
    public void Test1 () throws AWTException {
           driver.get("http://demo.guru99.com/test/upload/");
           MyFunc.Bekle(2);

           Robot rbt= new Robot();
           for (int i = 0; i <21 ; i++) {

               rbt.keyPress(KeyEvent.VK_TAB); // tuşa bastık
               rbt.keyRelease(KeyEvent.VK_TAB); // tuşu bıraktık. bunu unutmuyoruz.
               // unutursak pc yi baştan başlatmak gerekir.

               // buraya kadar yüklemek istediğimiz dosyanın windows sayfa
               //
               //      C:\Users\Halil\Desktop\Gonderılecek Dosya.odt\sı açılmış oldu
               //şimdi yüklenecek dosyanın yolunu kopyalayıp çıkan yere yapışitıracağız"C:\Users\Halil\Desktop\Gonderılecek Dosya.odt"
               // önce dosyanın yolunu hafızaya kopyalayacağız. Şöyle:
               // copy to clipboard in javascript
               // buraya kadar windows dosya bul açıldı
               // aşağıdaki bölüm dosyanın yolunu hafızaya kopyalıyor

           }

            rbt.keyPress(KeyEvent.VK_ENTER);
            rbt.keyRelease(KeyEvent.VK_ENTER);

            MyFunc.Bekle(1);

           // buraya kadar windows dosya bul açıldı
           // aşağıdaki bölüm dosyanın yolunu hafızaya kopyalıyor

            StringSelection dosyaYolu = new StringSelection("C:\\Users\\Halil\\Desktop\\Gonderılecek Dosya.odt\\");
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);

            MyFunc.Bekle(1);
            rbt.keyPress(KeyEvent.VK_CONTROL);
            rbt.keyPress(KeyEvent.VK_V);

            MyFunc.Bekle(1);
            rbt.keyRelease(KeyEvent.VK_CONTROL);
            rbt.keyRelease(KeyEvent.VK_V);

            MyFunc.Bekle(1);
            rbt.keyPress(KeyEvent.VK_ENTER);
            rbt.keyRelease(KeyEvent.VK_ENTER);

            MyFunc.Bekle(1);
            for (int j = 0; j <2 ; j++) {
                rbt.keyPress(KeyEvent.VK_TAB);
                rbt.keyRelease(KeyEvent.VK_TAB);

            }

            MyFunc.Bekle(1);
            rbt.keyPress(KeyEvent.VK_SPACE);
            rbt.keyRelease(KeyEvent.VK_SPACE);

           // butona gelindi gelindi

           MyFunc.Bekle(1);
           for (int j = 0; j <2 ; j++) {
               rbt.keyPress(KeyEvent.VK_TAB);
               rbt.keyRelease(KeyEvent.VK_TAB);

           }

           MyFunc.Bekle(1);
           rbt.keyPress(KeyEvent.VK_ENTER);
           rbt.keyRelease(KeyEvent.VK_ENTER);

           WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));

           WebElement mesaj2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='has been successfully uploaded.']")));
           Assert.assertTrue(mesaj2.isDisplayed());

           // visibilityOfElementLocated bu koda özel olarak bunu web elemente eşitleyebiliyoruz.
           BekleKapat();

        }


    }

