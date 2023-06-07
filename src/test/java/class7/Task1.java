package class7;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/*
HW:
goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
login
click on PIM

from the table choose any ID
and print out the row number of that id

please make sure that ur code is dynamic enough to cater if another row gets delted , it still prints the row correctly
 */
public class Task1 extends CommonMethods  {
    public static void main(String[] args) {

        String URL="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser="chrome";
        openBrowserAndLaunchApplication(URL,browser);

       WebElement userName= driver.findElement(By.xpath("//input[@id='txtUsername']"));
       userName.sendKeys("Admin");

       WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
       password.sendKeys("Hum@nhrm123");

       WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
       loginBtn.click();

       driver.findElement(By.xpath("//b[text()='PIM']")).click();

        List<WebElement> allIDs=driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

        for (int i = 0; i < allIDs.size(); i++) {
               String allid= allIDs.get(i).getText();

               if(allid.equals("53866A")){
                   System.out.println("The row in which the ID is present at is "+(i + 1));
               }
        }
//      Enhanced loop
        int count=0;
        for(WebElement i:allIDs){
          String t=  i.getText();
                count++;
            if(t.equals("53866A")){
                System.out.println("Row is "+count);
            }
        }






    }
}
