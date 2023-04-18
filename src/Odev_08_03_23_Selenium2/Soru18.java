package Odev_08_03_23_Selenium2;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru18 extends BaseDriver {
    /*
    Bu web sitesine gidiniz. http://demo.seleniumeasy.com/table-search-filter-demo.html
Task tablosunda;

"in progress" giriniz.

Tablodaki bütün Taskları bulun ve yazdırın.

Tablodaki bütün Assignee olanları bulun ve yazdırın.

Not: find element kullanın ve yazdırırken for loop kullanın.
     */


    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
        WebElement taskfilter= driver.findElement(By.id("task-table-filter"));
        taskfilter.sendKeys("in progress");





    }
    }
