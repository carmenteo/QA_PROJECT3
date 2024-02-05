
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {

    @Test

    public void loginTest(){

        //click pe butonul de Login
        driver.findElement(By.xpath("(//a[contains(text(),'Sign In')])[1]")).click();
        // adaug un email valid
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("catteo@gmail.com");
        // adaug o parola valida
        String inputPassword="password$$1";
        driver.findElement(By.xpath("(//input[@id='pass'])[1]")).sendKeys(inputPassword);
        // click on the SignIn button
        driver.findElement(By.xpath("(//span[contains(text(),'Sign In')])[1]")).click();
        // validez ca am fost logat
//      String expectedSuccessMessage = "What's New";
//       String actualSuccessMessage = driver.findElement(By.xpath("(//span[contains(text(), 'Welcome, Ca Teo!')])[1]")).getText();
//        Assert.assertEquals(actualSuccessMessage,expectedSuccessMessage,"The success message is not correct");

//span[contains(text(),'What')]
      //  (//span[@class='logged-in'])[1]

    }
}
