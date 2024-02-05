import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import tools.TestData;

public class CreateAccountTest extends BaseTest {
    @Test
    public void createNewAccountTest(){
        // click pe butonul Create an Account
        driver.findElement(By.xpath("(//a[contains(text(),'Create an Account')])[1]")).click();
        //valideaza titlul paginii
        String expectedTitle = "Create New Customer Account";
        String actualTitle = driver.findElement(By.xpath("//span[@data-ui-id='page-title-wrapper']")).getText();
        Assert.assertEquals(actualTitle,expectedTitle, "The page title is not correct");
        //Completam cu date valide
        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Ca");
        driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Teo");
        driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys(TestData.generateNewEmail());
        String inputPassword = "password$$1";
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(inputPassword);
        driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys(inputPassword);
        // Apas pe butonul de Create an Account
        driver.findElement(By.xpath("(//span[contains(text(),'Create an Account')])[1]")).click();
        // Validez ca am ajuns la mesajul de succes
        String expectedSuccesMassage = "My Account";
        String actualSuccesMassage = driver.findElement(By.xpath("//span[@data-ui-id='page-title-wrapper']")).getText();
        Assert.assertEquals(actualSuccesMassage, expectedSuccesMassage, "The success massage is not correct");
    }

}
