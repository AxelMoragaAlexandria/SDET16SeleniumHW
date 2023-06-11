package class8;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task1 extends CommonMethods {
    public static void main(String[] args) {

        String URL="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser="chrome";
        openBrowserAndLaunchApplication(URL,browser);

      WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
      userName.sendKeys("Admin");

      WebElement passWord=driver.findElement(By.xpath("//input[@id='txtPassword']"));
      passWord.sendKeys("Hum@nhrm123");

      WebElement LoginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
      LoginBtn.click();

      WebElement recruitmentTab=driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']"));
      recruitmentTab.click();

      WebElement calenderIcon=driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']"));
      calenderIcon.click();

      WebElement monthDD=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));

      Select ss=new Select(monthDD);
      ss.selectByVisibleText("Mar");

     WebElement yearDD= driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
     Select sel=new Select(yearDD);
     sel.selectByVisibleText("2004");

     List<WebElement> allDays=driver.findElements(By.xpath("//table/tbody/tr/td"));

     for(WebElement i:allDays){
        String text= i.getText();
        if(text.equals("3")){
            i.click();
        }
     }







    }
}
