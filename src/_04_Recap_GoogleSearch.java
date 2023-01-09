import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

public class _04_Recap_GoogleSearch {
    public static void main(String[] args) {
        /*
        TEST CASE 4
        Go to https://www.google.com/
        Enter "Software Engineer in Test" to search input box
        Click the search button
        Validate the first result contains the text "Software Engineer in Test"
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.google.com/");
        Waiter.pause(2);



        WebElement searchInput = driver.findElement(By.className("gLFyf"));
        WebElement searchButton = driver.findElement(By.xpath("(//input[@class='gNO89b'])[1]"));

        searchInput.sendKeys("Software Engineer in Test");
        Waiter.pause(1);
        searchButton.click();

        if (driver.findElement(By.xpath("(//div[@class='yuRUbf']//h3)[1]")).getText().contains("Software Engineer in Test"))
            System.out.println("PASSED");
        else System.out.println("FAILED");

        Driver.quitDriver();






    }
}
