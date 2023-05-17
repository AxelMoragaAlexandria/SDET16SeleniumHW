package class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
            driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
            driver.manage().window().maximize();
            driver.findElement(By.name("customer.firstName")).sendKeys("Axel");
            driver.findElement(By.name("customer.lastName")).sendKeys("Moraga");
            driver.findElement(By.id("customer.address.street")).sendKeys("3730 Bethesda Highway");
            driver.findElement(By.id("customer.address.city")).sendKeys("Lorton");
            driver.findElement(By.id("customer.address.state")).sendKeys("Virginia");
            driver.findElement(By.name("customer.address.zipCode")).sendKeys("22206");
            driver.findElement(By.name("customer.phoneNumber")).sendKeys("123-456-7890");
            driver.findElement(By.id("customer.ssn")).sendKeys("12345");
            driver.findElement(By.id("customer.username")).sendKeys("axlem123@ma");
            driver.findElement(By.name("customer.password")).sendKeys("Realmadrid123$");
            driver.findElement(By.id("repeatedPassword")).sendKeys("Realmadrid123$");
            Thread.sleep(10000);
            driver.quit();






    }
}
