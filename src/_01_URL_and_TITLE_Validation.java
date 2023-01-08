import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_URL_and_TITLE_Validation {
    public static void main(String[] args) throws InterruptedException {



//        Go to https://www.techglobalschool.com
//        Get current url and validate it
//        Get title and validate it
//
//        EXPECTED RESULT:
//        URL  = https://www.techglobalschool.com/
//        Title = SDET Bootcamp | TechGlobal


        // 1. Set up
        System.setProperty("webdriver.chromedriver", "/Users/Java-Tech/IdeaProjects/initial_selenium_project_5/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        //2. Test Validation

        driver.get("https://www.techglobalschool.com/"); // no caches
       // driver.navigate().to("https://www.techglobalschool.com/"); // keeps caches

       if(driver.getTitle().equals("SDET Bootcamp | TechGlobal")) System.out.println("Title validation PASSED");
       else System.out.println("Title validation failed");

       if (driver.getCurrentUrl().equals("https://www.techglobalschool.com/")) System.out.println("URL Validation PASSED");
       else System.out.println("ULR Validation FAILED");






        //3. Teardown
        Thread.sleep(2000);
        driver.close();
    }
}