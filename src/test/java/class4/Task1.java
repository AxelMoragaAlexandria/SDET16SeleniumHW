package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
HW1:
goto   http://practice.syntaxtechs.net/basic-select-dropdown-demo.php
select , tuesday, thursday and friday one by one
 */

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
        Thread.sleep(3000);
       WebElement dayOftheWeek=driver.findElement(By.xpath("//select[@class='form-control']"));

        Select sel=new Select(dayOftheWeek);
            sel.selectByVisibleText("Tuesday");
            Thread.sleep(2000);
            sel.selectByVisibleText("Thursday");
            Thread.sleep(2000);
            sel.selectByVisibleText("Friday");



    }
}
