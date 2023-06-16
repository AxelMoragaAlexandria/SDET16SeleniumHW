package Class9;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Task1 extends CommonMethods {
    public static void main(String[] args) {

        /*
        Get the screenshot of Invalid Credentials
         */

        String URL="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser="chrome";
        openBrowserAndLaunchApplication(URL,browser);

        WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");

        WebElement passWord=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        passWord.sendKeys("blablabla", Keys.ENTER);

        takeScreenShot("/Users/axelmoraga/IdeaProjects/SDET16SeleniumHW/Screenshots/ErrorMsg.png");




    }
}
