import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

import java.util.List;

public class _02_Recap_FB_IG {
    public static void main(String[] args) {
        /*
        Validate both the instagram and facebook items are displayed and enabled
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://techglobal-training.netlify.app/");
        Waiter.pause(2);


        List<WebElement> elementList = driver.findElements(By.xpath("//div[@class='Footer_socials__7h4n1']//a"));

        for (int i = 0; i < elementList.size(); i++) {
            if (elementList.get(i).isDisplayed() && elementList.get(i).isEnabled())
                System.out.println("PASSED");
            else System.out.println("FAIL");


        }


        Driver.quitDriver();





    }
}
