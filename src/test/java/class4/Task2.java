package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
HW 2:
goto facebook.com
 click on create account
and select your date of birth using select class
 */
public class Task2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().window().maximize();

        WebElement loginBtn=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        loginBtn.click();
        Thread.sleep(2000);


      WebElement month= driver.findElement(By.xpath("//select[@name='birthday_month']"));
      Select sel=new Select(month);
      sel.selectByVisibleText("Mar");


      WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
      Select sel2=new Select(day);
      sel2.selectByValue("3");


      WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
      Select sel3=new Select(year);
      sel3.selectByValue("2004");










    }
}
