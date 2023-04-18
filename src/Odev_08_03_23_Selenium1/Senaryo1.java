package Odev_08_03_23_Selenium1;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class Senaryo1 extends BaseDriver { /*

    Senaryo
1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
2- random 100 e kadar 2 sayı üretiniz.
3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
4- Sonuçları Assert ile kontrol ediniz.
5- Yukarıdaki işlemi 5 kez tekrar ettiriniz.

    */

    @Test
    public void Test1 () {

        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        WebElement firstno= driver.findElement(By.xpath("//input[@id='number1Field']"));
        WebElement secondno= driver.findElement(By.xpath("//input[@id='number2Field']"));
        Select menu=new Select(driver.findElement(By.xpath("//select[@id='selectOperationDropdown']")));
        WebElement calculate= driver.findElement(By.xpath("//input[@id='calculateButton']"));
        WebElement answerbox= driver.findElement(By.xpath("//input[@id='numberAnswerField']"));
        WebElement clear=driver.findElement(By.id("clearButton"));


            for (int i = 0; i < 5; i++) {
                Random r=new Random();
                int a= r.nextInt(101);
                int b= r.nextInt(101);
                String sayı1=String.valueOf(a);
                String sayı2=String.valueOf(b);
                int sonuc=0;
                String strsonuc;

                firstno.sendKeys(sayı1);
                secondno.sendKeys(sayı2);
                String value=Integer.toString(i);
                menu.selectByValue(value);
                calculate.click();

                switch (i){
                    case 0: sonuc=(a+b);
                    strsonuc=Integer.toString(sonuc);
                        System.out.println("a+b sonuc = " + sonuc);
                        MyFunc.Bekle(2);
                        Assert.assertTrue(answerbox.isDisplayed());
                        Assert.assertEquals(answerbox.getAttribute("value"), strsonuc);
                        break;

                    case 1: sonuc=(a-b);
                    strsonuc=Integer.toString(sonuc);
                        System.out.println("a-b sonuc"+sonuc);
                        MyFunc.Bekle(2);
                        Assert.assertTrue(answerbox.isDisplayed());
                        Assert.assertEquals(answerbox.getAttribute("value"), strsonuc);
                        break;

                    case 2: sonuc=(a*b);
                    strsonuc=Integer.toString(sonuc);
                        System.out.println("a*b sonuc = " + sonuc);
                        MyFunc.Bekle(2);
                        Assert.assertTrue(answerbox.isDisplayed());
                        Assert.assertEquals(answerbox.getAttribute("value"), strsonuc);
                        break;

                    case 3: sonuc=(a/b);
                    strsonuc=Integer.toString(sonuc);
                    MyFunc.Bekle(2);
                    Assert.assertTrue(answerbox.isDisplayed());
                    //Assert.assertEquals(answerbox.getAttribute("value"), strsonuc);
                        System.out.println("a/b sonuc = " + sonuc);

                    case 4: strsonuc=sayı1+sayı2;
                        System.out.println("ab yanyana sonuc = " + strsonuc);
                        MyFunc.Bekle(2);
                        Assert.assertTrue(answerbox.isDisplayed());
                      //  Assert.assertEquals(answerbox.getAttribute("value"), strsonuc);
                        break;

                }


                clear.click();
                firstno.clear();
                secondno.clear();

            }

        BekleKapat();


    }


}
