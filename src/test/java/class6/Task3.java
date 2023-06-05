package class6;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
HW3:
develop a function in common methods to select from dropdown(single select)
 */
public class Task3 extends CommonMethods {
    public static void main(String[] args) {
        String URL="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser="chrome";

            openBrowserAndLaunchApplication(URL,browser);

        WebElement Dropdown=driver.findElement(By.xpath("//select[@class='form-control']"));

       SingleSelectDD(Dropdown,"visibletext","Sunday");

    }
}
