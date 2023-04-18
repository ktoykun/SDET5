package Gun10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Utility.BaseDriver.driver;

public class AcceptCookiesCode {
    public static void main(String[] args) {

        List<WebElement> cookiesAccept= driver.findElements(By.cssSelector("[class='wt-btn wt-btn--filled wt-mb-xs-0']"));
        if (cookiesAccept.size() > 0) // varsa
            cookiesAccept.get(0).click(); // kapat, tıklat
    }

}
