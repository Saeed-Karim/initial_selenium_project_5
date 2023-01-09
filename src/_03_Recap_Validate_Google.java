import org.openqa.selenium.WebDriver;
import utils.Driver;
import utils.Waiter;

public class _03_Recap_Validate_Google {
    public static void main(String[] args) {
        /*
        Go to https://www.google.com/
        Validate the page title is "Google"
        Validate the page url is "https://www.google.com/"
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.google.com/");
        Waiter.pause(2);


        if (driver.getTitle().equals("Google")) System.out.println("Title validation PASSED");
        else System.out.println("Title validation failed");

        if (driver.getCurrentUrl().equals("https://www.google.com/")) System.out.println("URL Validation PASSED");
        else System.out.println("ULR Validation FAILED");

        Driver.quitDriver();





    }


}
