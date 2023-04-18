package Odev_28_02_23;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Cevap1 extends BaseDriver  {public static void main(String[] args) {
    driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

    Actions actions = new Actions(driver);
    List<WebElement> cities = driver.findElements(By.cssSelector("#answerDiv > .dragDropSmallBox"));

    for (WebElement city : cities) {
        String num = city.getAttribute("id");
        num = num.substring(1);

        String cssSelector = "#questionDiv > .dragDropSmallBox[id='q" + num + "']";
        WebElement targetBox = driver.findElement(By.cssSelector(cssSelector));

        actions.clickAndHold(city).perform();
        MyFunc.Bekle(1);
        actions.moveToElement(targetBox).release().perform();
    }

    BekleKapat();
}
}
