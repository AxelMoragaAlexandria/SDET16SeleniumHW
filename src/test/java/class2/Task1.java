package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().window().maximize();
        WebElement click= driver.findElement(By.xpath("//a[text()='Create new account']"));
        click.click();
        Thread.sleep(2000);
        WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Axel");
        Thread.sleep(3000);
        WebElement lastName= driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Moraga");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[contains(@name,'email__')]")).sendKeys("moraxl@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[contains(@name,'confirmation')]")).sendKeys("moraxl@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("rEaLmAdRid@3");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//option[text()='Jan']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//option[text()='5']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//option[text()='2009']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//img[contains(@class,'_8id')]")).click();
        Thread.sleep(5000);
        driver.quit();











    }
}
