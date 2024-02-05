import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import tools.Scroll;
import tools.Wait;

import java.sql.SQLOutput;
import java.util.List;

public class FooterTest extends BaseTest {
   @Test

   public void verifyFooterTest ()
        {

           // dam scroll
           // Scroll.scrollDown(2000,driver);
            WebElement footer = driver.findElement(By.cssSelector(".page-footer")),
                    hotSellersTitle =driver.findElement(By.cssSelector(".content-heading"));
            Wait.sleepInSecond(2);
            Scroll.scrollToElement(footer,driver);
            List<WebElement> links = driver.findElements(By.cssSelector(".footer.content li"));
            Assert.assertEquals(links.size(), 9);
            for (WebElement element: links){
                System.out.println(element.getText());
            }
        }
}
