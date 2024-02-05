package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {

    @FindBy (xpath = "(//a[contains(text(),'Create an Account')])[1]")
    WebElement createAnAccount;

    @FindBy(xpath = "(//a[contains(text(),'Sign In')])[1]")
     WebElement signInButton;

    @FindBy(xpath = "(//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'])[1]")
     WebElement womenDropDownMenu;

    @FindBy(css = "#ui-id-9")
    WebElement topsButton;

   WebDriver driver;

    public HeaderPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickCreateAccountButton(){
       createAnAccount.click();
    }

   public void clickSignInButton(){
        signInButton.click();
   }
   public void clickOnTheWomenDropDownMenu(){
        womenDropDownMenu.click();
    }

   public void clickOnTheTopsButton(){
        topsButton.click();
   }

        //(//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'])[1]

}
