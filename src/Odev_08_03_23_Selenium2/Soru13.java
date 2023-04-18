package Odev_08_03_23_Selenium2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru13 extends BaseDriver {
    /*
    Bu websitesine gidiniz. http://demo.seleniumeasy.com/basic-first-form-demo.html

List box'a tıklayınız.

Bootstrap List Box'a tıklayınız.(http://demo.seleniumeasy.com/bootstrap-dual-list-box-demo.html)

**bootstrap-duallist**'e tıklayınız. Sonra sağ ok (>)'a tıklayınız.

**Dapibus ac facilisis in'**e tıklayınız ve sağ ok (>)'a tıklayınız.

Sağa gönderilen elemanların üstüne bir kere daha tıklayıp beyaz hale getiriniz.

**Cras husto odio**'a tıklayınız ve sol ok(<)'a tıklayınız.

**Dapibus ac facilisis in**'a tıklayınız ve sol ok(<)'a tıklayınız.

Sol kutu bu şekilde olmalıdır.

- Morbi leo risus
- Porta ac consectetur ac
- Vestibulum at eros
- Cras justo odio
- Dapibus ac facilisis in

Sağ kutu bu şekilde olmalıdır.

- Morbi leo risus
- Porta ac consectetur ac
- Vestibulum at eros
- bootstrap-duallist
- Dapibus ac facilisis in

     */


    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
        WebElement listbox= driver.findElement(By.linkText("List Box"));
        listbox.click();
        MyFunc.Bekle(1);

        WebElement bootstrap= driver.findElement(By.linkText("Bootstrap List Box"));
        bootstrap.click();
        MyFunc.Bekle(1);

        WebElement duallist= driver.findElement(By.xpath("//li[text()='bootstrap-duallist ']"));
        duallist.click();
        MyFunc.Bekle(1);

        WebElement sağok= driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm move-right']"));
        sağok.click();
        MyFunc.Bekle(1);

        WebElement Dapibus= driver.findElement(By.xpath("//li[text()='Dapibus ac facilisis in'][1]"));
        Dapibus.click();
        sağok.click();
        MyFunc.Bekle(1);

        WebElement active1= driver.findElement(By.xpath("//li[text()='bootstrap-duallist ']"));
        active1.click();
        MyFunc.Bekle(1);

        WebElement active2= driver.findElement(By.xpath("//li[text()='Dapibus ac facilisis in'][2]"));
        active2.click();
        MyFunc.Bekle(1);

        WebElement solok= driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm move-left']"));

        WebElement crashusto= driver.findElement(By.xpath("//li[text()='Cras justo odio']"));
        crashusto.click();
        solok.click();
        MyFunc.Bekle(1);

        WebElement dapi= driver.findElement(By.xpath("//li[text()='Dapibus ac facilisis in'][1]"));
        dapi.click();
        solok.click();



        MyFunc.Bekle(10);

        BekleKapat();


    }
}
