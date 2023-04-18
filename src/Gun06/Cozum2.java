package Gun06;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Cozum2 extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://formsmarts.com/form/yu?mode=h5");

        WebElement business= driver.findElement(By.cssSelector("input[id='u_WQT_4586_0'] + span"));
        business.click();

        WebElement discoverXYZ= driver.findElement(By.cssSelector("[id='u_WQT_4588'][name='u_WQT_4588']"));
        discoverXYZ.click();

        WebElement advertising= driver.findElement(By.cssSelector("option[value='Online Advertising']"));
        advertising.click();

        WebElement everyday= driver.findElement(By.cssSelector(" label[for='u_WQT_89585_0'] > span"));
        everyday.click();

        WebElement good= driver.findElement(By.cssSelector(" input[name='u_WQT_4589'][id='u_WQT_4589_0'] + span"));
        good.click();

        WebElement usingXYZ= driver.findElement(By.cssSelector("select[id='u_WQT_4597']"));
        usingXYZ.click();

        WebElement foramont= driver.findElement(By.cssSelector(" [id='u_WQT_4597'] > :nth-child(4)"));
        foramont.click();

        BekleKapat();

    }

    public void Cozum () {




    }



}
