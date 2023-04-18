package Odev_28_02_23;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Odev1 extends BaseDriver {

    //http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html
    //buradaki ülke ve şehirleri findElements ile topluca bularak bir döngü ile bütün şehirleri doğru ülkere dağıtınız.

@Test
    public void Test1 (){
    driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

    List < WebElement> ülkeler=driver.findElements(By.cssSelector("[id='answerDiv'] [class='dragDropSmallBox']"));
    Actions aksiyonlar=new Actions(driver);

    WebElement italy= driver.findElement(By.xpath("//*[text()='Italy'] / following-sibling::div[1]"));
    WebElement roma= driver.findElement(By.xpath("//*[text()='Rome']"));
    aksiyonlar.dragAndDrop(roma,italy ).build().perform();


    BekleKapat();



}


}
