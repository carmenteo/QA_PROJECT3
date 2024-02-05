import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CreateAccountPage;
import pageObjects.HeaderPage;
import tools.ErrorMessage;
import tools.TestData;

public class CreateAccountErrorsTest extends BaseTest {

    @Test
    public void checkThatErrorsAreDisplayedIfAllFieldsAreEmptyTest(){
        // click pe butonul Create an Account
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickCreateAccountButton();
        // valideaza titlul paginii
        CreateAccountPage createAccountPage =new CreateAccountPage(driver);
        String actualTitle = createAccountPage.getPageTitleText();
        Assert.assertEquals(actualTitle, TestData.CREATE_ACCOUNT_TITLE, ErrorMessage.INCORRECT_PAGE_TITLE_ERROR);
        // Apas pe butonul de Create an Account
        createAccountPage.clickCreateAccountButton();
        // Validez ca pe campul FirstName primesc eroare
        String actualFirstNameErrorMassage = createAccountPage.getFirstNameErrorMessage();
        Assert.assertEquals(actualFirstNameErrorMassage, ErrorMessage.EXPECTED_EMPTY_FIELD_ERROR,
                ErrorMessage.INCORRECT_ERROR_MESSAGE);
        // Validez ca mesajul de eroare are culoarea rosu
        String actualFirstNameColor = createAccountPage.getFirstNameErrorMessageColor();
        Assert.assertEquals(actualFirstNameColor,TestData.RED_COLOR, ErrorMessage.INCORRECT_ERROR_COLOR);
        // Validez ca pe campul LastName primesc eroare

        String actualLastNameErrorMassage = createAccountPage.getLastNameErrorMessage();
        Assert.assertEquals(actualLastNameErrorMassage, ErrorMessage.EXPECTED_EMPTY_FIELD_ERROR,
                ErrorMessage.INCORRECT_ERROR_MESSAGE);
        // Validez ca mesajul de eroare are culoarea rosu
        String actualLastNameColor = createAccountPage.getLastNameErrorMessageColor();
        Assert.assertEquals(actualLastNameColor,TestData.RED_COLOR, ErrorMessage.INCORRECT_ERROR_COLOR);
        // Validez ca pe campul Email primesc eroare

        String actualEmailFieldErrorMassage = createAccountPage.getEmailFieldErrorMessage();
        Assert.assertEquals(actualEmailFieldErrorMassage, ErrorMessage.EXPECTED_EMPTY_FIELD_ERROR,
                ErrorMessage.INCORRECT_ERROR_MESSAGE);
        // Validez ca mesajul de eroare are culoarea rosu
        String actualEmailFieldErrorColor = createAccountPage.getEmailFieldMessageColor();
        Assert.assertEquals(actualLastNameColor,TestData.RED_COLOR, ErrorMessage.INCORRECT_ERROR_COLOR);
        // Validez ca pe campul Password primesc eroare

        String actualPasswordFieldErrorMassage = createAccountPage.getPasswordFieldErrorMessage();
        Assert.assertEquals(actualPasswordFieldErrorMassage, ErrorMessage.EXPECTED_EMPTY_FIELD_ERROR,
                ErrorMessage.INCORRECT_ERROR_MESSAGE);
        // Validez ca mesajul de eroare are culoarea rosu
        String actualPasswordFieldErrorColor = createAccountPage.getPasswordFieldMessageColor();
        Assert.assertEquals(actualPasswordFieldErrorColor,TestData.RED_COLOR, ErrorMessage.INCORRECT_ERROR_COLOR);
        // Validez ca pe campul Confirm Password primesc eroare

        String actualConfirmPasswordFieldErrorMassage = createAccountPage.getConfirmPasswordErrorMessage();
        Assert.assertEquals(actualConfirmPasswordFieldErrorMassage, ErrorMessage.EXPECTED_EMPTY_FIELD_ERROR,
                ErrorMessage.INCORRECT_ERROR_MESSAGE);
        // Validez ca mesajul de eroare are culoarea rosu
        String actualConfirmPasswordFieldErrorColor = createAccountPage.getConfirmPasswordFieldMessageColor();
        Assert.assertEquals(actualConfirmPasswordFieldErrorColor,TestData.RED_COLOR,
                ErrorMessage.INCORRECT_ERROR_COLOR);
    }

    @Test
    public void checkEmailFieldErrors(){
        // click pe butonul Create an Account
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickCreateAccountButton();
        CreateAccountPage createAccountPage =new CreateAccountPage(driver);
        // adaug un email invalid in campul de email
        driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("c.com");
        // apas pe butonul de Create an Account
        driver.findElement(By.xpath("(//span[contains(text(),'Create an Account')])[1]")).click();
        // validez ca pentru campul email address primesc eroarea corecta

        String actualEmailFieldErrorMassage = driver.findElement(By.cssSelector("#email_address-error")).getText();
        Assert.assertEquals(actualEmailFieldErrorMassage, ErrorMessage.INCORRECT_EMAIL_ERROR, ErrorMessage.INCORRECT_ERROR_MESSAGE);
    }

}
