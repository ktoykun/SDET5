package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _03_ScrollToBottomOfThePage extends BaseDriver {
    @Test
    public void Test1 () {
        driver.get("https://p-del.co/");
        MyFunc.Bekle(2);


        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        MyFunc.Bekle(2);
        //sayfanın sonuna gitti

        js.executeScript("window.scrollTo(0,0);");
        MyFunc.Bekle(2);
        // en başa direkt gidiyor. 0 noktasına git

        js.executeScript("window.scrollBy(0,0);");
        MyFunc.Bekle(2);
        //bulunduğu yerden 0 kadar ggider


        BekleKapat();

    }
}
