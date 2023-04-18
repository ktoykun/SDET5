package Gun14;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Dimension;

import java.awt.*;

public class _02_WindowsSize extends BaseDriver {
    // ekrandaki durumlar değişebilir. tablet ekranı, pc ekranı, tel ekranı vb
    // bazı elementler görünmeyebilir vs. test edeceğimiz şeylerin ekranı değişebilir
    // bunun için ekran boyutunu ayarlayabileceğimiz bir kod var.

    @Test
    public void Test1 () {
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        MyFunc.Bekle(4);

        Dimension yeniboyut=new Dimension(516, 600);
        driver.manage().window().setSize(yeniboyut);

        BekleKapat();


    }
}
