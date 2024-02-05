import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tools.Wait;

public class HeaderTest extends BaseTest{
    @Test
    public void verifySearchBarTest(){
        WebElement searchBar = driver.findElement(By.cssSelector("#search"));
        Wait.waitUntilElementIsVisible(driver, searchBar);
        searchBar.sendKeys("pants", Keys.ENTER);

    }
}
