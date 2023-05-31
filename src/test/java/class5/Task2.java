package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
HW2:
goto https://chercher.tech/practice/frames

click on check box
then select bay cat from drop down
then enter text in text box
 */
public class Task2 {
    public static void main(String[] args) {
            WebDriver driver=new ChromeDriver();

            driver.get("https://chercher.tech/practice/frames");
            driver.manage().window().maximize();


            driver.switchTo().frame("frame1");
            driver.switchTo().frame("frame3");

            WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
            checkbox.click();

            driver.switchTo().defaultContent();

            driver.switchTo().frame("frame2");
            WebElement dropdown=driver.findElement(By.xpath("//select[@id='animals']"));

            Select sel=new Select(dropdown);
            sel.selectByVisibleText("Baby Cat");

            driver.switchTo().defaultContent();
            driver.switchTo().frame("frame1");

            WebElement textBox=driver.findElement(By.xpath("//input"));
            textBox.sendKeys("My Name is Axel");






    }
}
