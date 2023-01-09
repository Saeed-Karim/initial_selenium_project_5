import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

import java.util.List;

public class _01_Recap_Validate_Address {
    public static void main(String[] args) {

        /*
        Validate the address in the footer is displayed and text is "2860 S River Rd Suite 350, Des Plaines IL 60018"
        Validate the copyright in the footer is displayed and text is "© 2023 TechGlobal - All Rights Reserved"
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://techglobal-training.netlify.app/");
        Waiter.pause(2);

        List<WebElement> elements = driver.findElements(By.xpath("//footer[@class='Footer_footer__kXlYa']//p"));

        String[] actualText = {"2860 S River Rd Suite 350, Des Plaines IL 60018", "© 2023 TechGlobal - All Rights Reserved"};

        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getText().equals(actualText[i])){
                System.out.println("passed");
            }
            else System.out.println("FAILED");

        }

        Driver.quitDriver();






    }
}
