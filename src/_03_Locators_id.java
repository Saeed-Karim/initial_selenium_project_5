import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_Locators_id {
    public static void main(String[] args) throws InterruptedException {
        /*
        Go to https://techglobal-training.netlify.app/
        Validate the company logo is displayed
        */

        //1.  Setup - before action

        System.setProperty("webdriver.chromedriver", "/Users/Java-Tech/IdeaProjects/initial_selenium_project_5/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //2. Validation - action
        driver.get("https://techglobal-training.netlify.app/");

        Thread.sleep(2000);

        // locate the logo and validate it is displayed

        WebElement logo = driver.findElement(By.id("logo"));

        if (logo.isDisplayed()) System.out.println("logo validation PASSED");
        else System.out.println("logo validation FAILED");


        //3. Teardown - after actions
        driver.quit();




    }
}
