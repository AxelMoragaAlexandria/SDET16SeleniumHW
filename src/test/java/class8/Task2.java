package class8;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Task2 extends CommonMethods {
    public static void main(String[] args) {

        String URL="https://www.aa.com/homePage.do?locale=en_US";
        String browser="chrome";
        openBrowserAndLaunchApplication(URL,browser);

        //Get September 3, 2023

     WebElement calenderIcon=driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']"));
     calenderIcon.click();

   boolean result=false;

   while(!result) {
       WebElement monthAndYear=  driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
       String text = monthAndYear.getText();
       if (text.equals("December 2023")){
         List<WebElement> allDays=driver.findElements(By.xpath("//table/tbody/tr/td"));
                for(WebElement w:allDays){
                    String day=w.getText();
                    if(day.equals("3")){
                        w.click();
                        result=true;
                        break;
                    }
                }
       }else{
         WebElement arrow=driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']"));
         arrow.click();
       }
   }






    }
}
