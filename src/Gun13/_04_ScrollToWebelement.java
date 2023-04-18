package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _04_ScrollToWebelement extends BaseDriver {
    @Test
    public void Test1 () {
        driver.manage().deleteAllCookies(); // cookiesleri sildik. bu durduğunda accept her zaman çıkar. tıklama özelliğini
        // görmek için bunu burada kaldırdık
        driver.get("https://www.copado.com/robotic-testing");
        MyFunc.Bekle(2);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        MyFunc.Bekle(2);

        WebElement element=driver.findElement(By.xpath("//a[text()='See customer Stories']"));
        // element.click(); // bunun çalışmadığı durumlar var. sayfa scroll olduğunda element
        // herhangi bir şeyin altında kalırsa bu çalşmaz.o yüzden en sağlamı javascriptin click
        // özelliğini kullanmak.

        js.executeScript("arguments[0].scrollIntoView(true);", element);
        // arguments[0] burada elementin yerine geçer. virgülden sonraki ilk elementi temsil eder.
        // virgülden sonrası uzayıp gidebilir. true olduğu zaman sayfanın üst kısmında gözükene kadar,
        // false olduğunda sayfanın altında gözüne kadar scroll yapar.
        // default true'dur. bir şey yazmazsan da true gibi çalışır.
        // basically element görünür olana kadar aşağı in diyoruz.
        // şimdi tıklama işlemi yapabiliriz: Şöyle:
        js.executeScript("arguments[0].click();", element);// bu kod elementi html içinden bulup tıklatır
        // ekrandan bulmadığı için daha garantidir.

        MyFunc.Bekle(2);
        BekleKapat();

    }
}
