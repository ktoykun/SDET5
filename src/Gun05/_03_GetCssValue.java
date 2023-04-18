package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.backgroundservice.BackgroundService;

public class _03_GetCssValue extends BaseDriver {
    public static void main(String[] args) {
        // Css değeri şekillendirme değeri olarak geçer.

        driver.get("https://www.snapdeal.com/");

        WebElement inputValEnter= driver.findElement(By.id("inputValEnter"));

        // <input autocomplete="off" name="keyword" type="text" class="col-xs-20 searchformInput keyword"
        // id="inputValEnter" onkeypress="clickGo(event, this)" placeholder="Search products &amp; brands" value="">

        // bu elemanın yukaırda yazan parametrelerine ulaşmak için izlediğimiz yol(get attribute): bulunduğu classı şöyle yazdırırız:
        System.out.println("inputValEnter.getAttribute(\"class\") = " + inputValEnter.getAttribute("class"));

        // inspect yaptığımızda sağ tarafta açılan kısım o elementin css özelliklerini
        // veriyor. Bu yöntemle bu özellikleri alabiliyoruz.bu da classın karşılığı olan
        // Css şekillendirme değerlerini almak için izlediğimiz yol:
        System.out.println("inputValEnter.getCssValue(\"color\") = " + inputValEnter.getCssValue("color"));
        System.out.println("inputValEnter.getCssValue(\"background\") = " + inputValEnter.getCssValue("background"));
        System.out.println("inputValEnter.getCssValue(\"font-size\") = " + inputValEnter.getCssValue("font-size"));
        
        // zeminin rengini almak birçok yerde işimize yarar.
        
        BekleKapat();
    }
}
