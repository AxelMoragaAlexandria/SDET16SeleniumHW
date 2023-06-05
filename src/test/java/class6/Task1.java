package class6;

/*
HW1:
goto  http://practice.syntaxtechs.net/dynamic-elements-loading.php
click on start
print the text  "welcome syntax technologies "on console
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task1 {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/dynamic-elements-loading.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

      WebElement StartBtn=driver.findElement(By.xpath("//button[@id='startButton']"));
      StartBtn.click();

      WebElement text=driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
       wait.until(ExpectedConditions.visibilityOf(text));

        WebElement text2=driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        System.out.println(text2.getText());

        driver.close();

    }
}
