package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tools.TestData;

public class CreateAccountPage{

    //page factory and web elements
    @FindBy(css = "#password-error")
    WebElement passwordError;

    @FindBy(xpath = "//span[@data-ui-id='page-title-wrapper']")
    WebElement pageTitle;

    @FindBy(xpath = "(//span[contains(text(),'Create an Account')])[1]")
    WebElement createAccountButton;

    @FindBy(css = "#firstname-error")
    WebElement firstNameError;

    @FindBy(css = "#lastname-error")
    WebElement lastNameError;

    @FindBy(css = "#email_address-error")
    WebElement emailAddressError;

    @FindBy(css = "#password-confirmation-error")
    WebElement passwordConfirmationError;



   WebDriver driver;
    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String getPageTitleText(){
       return pageTitle.getText();
    }

    public void clickCreateAccountButton(){
       createAccountButton.click();
    }

    public String getFirstNameErrorMessage(){
        return firstNameError.getText();
    }

    public String getFirstNameErrorMessageColor(){
        return firstNameError.getCssValue(TestData.COLOR_PROPERTY);
    }

    public String getLastNameErrorMessage(){
        return lastNameError.getText();
    }

    public String getLastNameErrorMessageColor(){
        return lastNameError.getCssValue(TestData.COLOR_PROPERTY);
    }

    public String getEmailFieldErrorMessage(){
        return emailAddressError.getText();
    }
    public String getEmailFieldMessageColor(){
        return emailAddressError.getCssValue(TestData.COLOR_PROPERTY);
    }

    public String getPasswordFieldErrorMessage(){
        return passwordError.getText();
    }
    public String getPasswordFieldMessageColor(){
        return passwordError.getCssValue(TestData.COLOR_PROPERTY);
    }

    public String getConfirmPasswordErrorMessage(){
        return passwordConfirmationError.getText();
    }

    public String getConfirmPasswordFieldMessageColor(){
        return passwordError.getCssValue(TestData.COLOR_PROPERTY);
    }

}
