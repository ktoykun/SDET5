package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByLinkText {
    public static void main(String[] args) {
        // bu sadece a tag ine özel.
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        WebElement siparislerimlinki=driver.findElement(By.linkText("Siparişlerim"));
        // gözüken texti Siparişlerim olan a tag li elementi bulur
        // a taglerinde link text ile çok kolay bi şekilde elementi bulabiliyoruz
        // id veya name ihtiyaç olmuyor. içinde link barındıran tagler a tag i oluyor

        System.out.println("siparislerimlinki.getText() = " + siparislerimlinki.getText());

        // siteye gidip siparişlerime kısmına incele dediğimizde o kısma ait
        // parametreleri href title ve rel olarak görüyoruz. html dersini bunları
        // anlamak için gördük. bu elementin
        // paratmetrelerini uulaştığımızda ekrana bunları yazdırabiliriz
        // ve her türlü özelliğini alabiliriz. bunu da get attribute ile yapıyoruz. görelim:

        System.out.println("siparislerimlinki.getAttribute(\"href\") = " + siparislerimlinki.getAttribute("href"));
        System.out.println("siparislerimlinki.getAttribute(\"title\") = " + siparislerimlinki.getAttribute("title"));
        System.out.println("siparislerimlinki.getAttribute(\"rel\") = " + siparislerimlinki.getAttribute("rel"));

        //PartialLinktext
        // bunda parçalı da olarak da texti alabiliriz.
        WebElement link2= driver.findElement(By.partialLinkText("Süper Fiyat"));
        System.out.println("link2.getText() = " + link2.getText());

        MyFunc.Bekle(5);
        driver.quit();
    }
}
