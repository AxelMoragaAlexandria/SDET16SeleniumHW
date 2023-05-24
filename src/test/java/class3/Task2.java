package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
HW2:
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D
Enter valid username
Leave password field empty
Click on login button
Verify error message with text “Password cannot be empty” is displayed.
 */
public class Task2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement username=driver.findElement(By.cssSelector("input[name='txtUsername']"));
        username.sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[id='btnLogin']")).click();
        Thread.sleep(2000);
       WebElement errorMessage= driver.findElement(By.cssSelector("span[id='spanMessage']"));
       String text=errorMessage.getText();
       Thread.sleep(2000);
       if(text.equals("Password cannot be empty")){
           System.out.println("Error message appeared");
       }else{
           System.out.println("Error message not appeared");
       }
       driver.quit();
    }
}
