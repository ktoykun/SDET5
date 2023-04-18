package Gun07;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.List;

public class _02_OdevCozum extends BaseDriver {

    @Test
    public void Test () {

        driver.get("https://www.saucedemo.com/");

        WebElement user= driver.findElement(By.xpath("//input[@id='user-name'] "));
        user.sendKeys("standard_user");

        WebElement password= driver.findElement(By.xpath("//input[@id='password'] "));
        password.sendKeys("secret_sauce");

        WebElement login= driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();

        // 1. ürün ekleme
        WebElement product1= driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        product1.click();

        WebElement back=driver.findElement(By.xpath("//button[@id='back-to-products']"));
        back.click();

        //2. ürün ekle

        WebElement product2=driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        product2.click();

        WebElement addchart=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        addchart.click();

        //sepet

        WebElement sepet=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        sepet.click();

        WebElement checkout=driver.findElement(By.xpath("//button[@id='checkout']"));
        checkout.click();

        //kullanıcı bilgileri
        WebElement firstname=driver.findElement(By.xpath("//input[@id='first-name']"));
        firstname.sendKeys("kübra");

        WebElement lastname=driver.findElement(By.xpath("//input[@id='last-name']"));
        lastname.sendKeys("toykun");

        WebElement zipcodu=driver.findElement(By.xpath("//input[@id='postal-code']"));
        zipcodu.sendKeys("123456");

        WebElement cont=driver.findElement(By.xpath("//input[@id='continue']"));
        cont.click();

        // ürün toplamlarının testi

        double toplam=0;
        List <WebElement> ücretler= (List<WebElement>) driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        // bu şekilde 2 tane buluyor. bize de bu ikisi lazım. bu ikisini list olarak aldık.
        // texten bulmadık çünkü yarın öbür gün ordaki rakam değişebilir. her zaman çalışması lazım
        // o yüzden çok spesifik yazmamak lazım.

        for (WebElement e :ücretler ) { // for kullandık dedik ki önce şu list ile aldıklarımı bi yazdırayım
            System.out.println("e.getText() = " + e.getText()); // $29.99
            // bu text ler bana nasıl geliyor, ekrana bir yazsın ne veriyor onu bi görelim.
            // sonra içinden sadece rakamları alacağız.
            toplam=toplam + Double.parseDouble(e.getText().substring(1)); // sadece rakam verdiğimizde
            // o rakamdan sonra sonuna kadar alır. 1 den sonrasını al. yani 29.99
            // dolar işareti kısmından sonrasını alıp doublea çevirdik.
            // double parse yani doublea çevir
        }

        System.out.println("toplam = " + toplam); // ürünleri tek tek aldı topladı.
        // bir ekrana yazdırayım doğru oldu mu? hemen sayfadaki subtotal kısmına geçmeyelim.


        // alttoplam
        WebElement webAltToplam=driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        System.out.println("webAltToplam.getText() = " + webAltToplam.getText());
        System.out.println("webAltToplam.getText() = " + webAltToplam.getText().replaceAll("[^0-9,.]", ""));

        Double altToplam=Double.parseDouble(webAltToplam.getText().replaceAll("[^0-9,.]", ""));
        Assert.assertTrue("Değerler Eşit Değil", (toplam==altToplam));
        // assert der ki, sen bana bekleneni ver beklenmeyen bir şeyi olursan ben sana söylerim.
        // mantık olarak if gibi çalışır.

        BekleKapat();

        // EK Not:Double Parse nasıl çalışır? string haldeki bir rakamı
        // toplanabilir bir hale int. double vs getirmek için kullanırız.
        // replace de aynı işi görür. rakam ve nokta virgül haricindeki
        // her şeyi boşalt mantığında çalışır.
        String sayı="22.99"; // bu aliyle bunu toplayamazsın
        double cevir=Double.parseDouble(sayı); // bu haliyle toplarsın


    }
}
