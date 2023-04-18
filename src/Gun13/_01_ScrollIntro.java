package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _01_ScrollIntro extends BaseDriver {
    // bazen elementin tıklanabilir, locatorının bulunabilir
    // hale gelmesi için scroll yapmamız gerekiyor. yani bazı
    // element scroll yapınca yükleniyor. sayfadaki scroll sürgüsü web elemet
    // değil chrome'un bir elementi. ama yine de kontrol edilebilir.
    // html içinde script kodları var. bunlara java script kodları deniyor.
    // java ile bir ilgisi yok. o anda çalışan bir kod.lazım olduğunda yani.
    // hareketin ve etkileşimin olduğu yerde çalışır. renk değişimi vs
    // işte sayfa kaydırırken de biz bunlardan faydalanacağız

    @Test
    public void Test1 () {

        driver.get("https://p-del.co/");
        MyFunc.Bekle(2);

        // bunu tanımlarken new diyerek tanımlamıyoruz.şöyle:
        JavascriptExecutor js= (JavascriptExecutor) driver; // cast yapıldı
        js.executeScript("window.scrollBy(0,3000)"); // 3000 pixel aşağı kaydır dedik
        MyFunc.Bekle(2);
        js.executeScript("window.scrollBy(0,-3000)");// geri gitti

        BekleKapat();

        // genelde elemente kadar kaydır diyerek kullanacağız. sayfanın sonu/başına
        // kadar gitmeyi 80 video görene kadar kaydır demeyi kullanacağız. burada çift
        // parametre devereye giriyor. virgül ile ayırıp 2 parametre kullanabiliriz

        //  Actions aksiyonlar=new Actions(driver);  // driver üzerinden Aksiyon işlemleri için
//        Select webSelect=new Select(element); // bir tane element için

        // JavaScript komutlarını çalıştırmak için önce js değişkeni tanımlandı.
// (      0,1500) -> (x,y) Sayfayı sağa x kadar ve aşağı y kaydırır
        // 1500 pixel kadar aşağı kaydıracak.


    }
}
