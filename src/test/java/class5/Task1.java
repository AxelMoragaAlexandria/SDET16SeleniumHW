package class5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
http://practice.syntaxtechs.net/javascript-alert-box-demo.php
click on the last alert
send keys and accept it

Note: don't worry if the text u send does not appear up in the text-box
 */
public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");
        driver.manage().window().maximize();

      WebElement button=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
      button.click();

     Alert textbox= driver.switchTo().alert();
     textbox.sendKeys("Axel is learning Automation Testing!!");
     Thread.sleep(2000);
        textbox.accept();









    }
}
