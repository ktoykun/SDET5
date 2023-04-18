package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_ElemanınStatusu extends BaseDriver {
    // burada sayfadaki belirli bir elementin durumunu alma işlemi yapıyoruz.
    // ilgili elementin durumunu kontrol ediyoruz. aktif mi, görünüyor mu vs
    @Test
    public void Test1 () {
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");
        WebElement sali= driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));

        System.out.println("sali.isDisplayed() = " + sali.isDisplayed());
        System.out.println("sali. = " + sali.isEnabled());
        System.out.println("sali.isSelected() = " + sali.isSelected());

        MyFunc.Bekle(2);
        sali.click();
        MyFunc.Bekle(2);
        System.out.println("sali.isSelected() = " + sali.isSelected());
        
        WebElement saturday= driver.findElement(By.id("gwt-debug-cwCheckBox-Saturday-input"));
        System.out.println("saturday.isEnabled() = " + saturday.isEnabled());
        System.out.println("saturday.isDisplayed() = " + saturday.isDisplayed());
        System.out.println("saturday.isSelected() = " + saturday.isSelected());

        WebElement wednesday= driver.findElement(By.id("gwt-debug-cwCheckBox-Wednesday-input"));
        System.out.println("wednesday.isEnabled() = " + wednesday.isEnabled());
        System.out.println("wednesday.isSelected() = " + wednesday.isSelected());
        System.out.println("wednesday.isDisplayed() = " + wednesday.isDisplayed());

        BekleKapat();


    }





}
