package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tools.TestData;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@id='email']")
    WebElement inputEmail;

    @FindBy(xpath = "(//input[@id='pass'])[1]")
    WebElement inputPassword;

    @FindBy(xpath = "(//span[contains(text(),'Sign In')])[1]")
    WebElement signInButton;
    public LoginPage(WebDriver driver) {

        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void inputEmail(){
        inputEmail.sendKeys("catteo@gmail.com");
    }

    public void inputPassword(){

       this.inputPassword.sendKeys(TestData.PASSWORD);
    }

    public void clickOnTheSignInButton(){
        signInButton.click();
    }

}
