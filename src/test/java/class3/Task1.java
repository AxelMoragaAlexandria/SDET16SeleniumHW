package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
HW1:
Open chrome browser
Go to “http://practice.syntaxtechs.net/input-form-demo.php%E2%80%9D
fill in the complete form
 */
public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);
       WebElement firstName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstName.sendKeys("Axel");
        WebElement lastName=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastName.sendKeys("Moraga");
        Thread.sleep(2000);
        WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("axelmor@yahoo.com");
        WebElement phoneNumber=driver.findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys("(123)456-7890");
        Thread.sleep(2000);
       WebElement address= driver.findElement(By.xpath("//input[@name='address']"));
       address.sendKeys("12345 Glebe Rd.");
       WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
       city.sendKeys("Lorton");
        Thread.sleep(2000);
       driver.findElement(By.xpath("//option[text()='Virginia']")).click();
       WebElement zipCode=driver.findElement(By.xpath("//input[@name='zip']"));
       zipCode.sendKeys("12345");
      WebElement domainNmae=driver.findElement(By.xpath("//input[@name='website']"));
      domainNmae.sendKeys("Syntax");
        Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@value='yes']")).click();
      WebElement description=driver.findElement(By.xpath("//textarea[@name='comment']"));
      description.sendKeys("Manual Testing, Running the website...");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
      Thread.sleep(2000);
      driver.quit();








    }
}
