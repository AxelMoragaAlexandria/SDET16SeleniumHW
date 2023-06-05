package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/*
goto http://practice.syntaxtechs.net/dynamic-data-loading-demo.php
click on get new user
print the firstname of user
 */
public class Task2 {
    public static void main(String[] args)  {

        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/dynamic-data-loading-demo.php");
        driver.manage().window().maximize();

       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

     WebElement GetUserBtn=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
     GetUserBtn.click();

    WebElement FirstName= driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        System.out.println(FirstName.getText());

        driver.close();

    }
}
