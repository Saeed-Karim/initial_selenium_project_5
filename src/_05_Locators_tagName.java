import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.TechGlobalUtil;
import utils.Waiter;

public class _05_Locators_tagName {
    public static void main(String[] args) {
        /*
        TEST CASE:
        Go to https://techglobal-training.netlify.app/
        Select “Frontend Testing” from the “Practices” dropdown
        Select the “Locators” card
        Validate the "Locators" header

        NOTE  : Make sure the header is displayed, make sure the text is exactly "Locators"
         */

        try {

            WebDriver driver = Driver.getDriver();

            driver.get("https://techglobal-training.netlify.app/");
            Waiter.pause(2);

            TechGlobalUtil.getFrontEndTesting();

            driver.findElement(By.id("card-1")).click();
            Waiter.pause(2);

            WebElement heading = driver.findElement(By.id("main_heading"));
            System.out.println(heading.isDisplayed()); // true
            System.out.println(heading.getText()); // locators


            if (heading.isDisplayed()) System.out.println("Heading displayed Passed");
            else System.out.println("Header displayed FAILED");

            if (heading.getText().equals("Locators")) System.out.println("Heading text PASSED");
            else System.out.println("Heading text FAILED");



        } catch (Exception e) {
            System.out.println("TEST FAILED due to : " + e.getMessage());
        } finally {

            //3. Teardown
            Driver.quitDriver();
        }



    }
}
