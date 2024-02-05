package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "(//span[contains(text(), 'Women')])[1]")
    WebElement womenButton;

    @FindBy(xpath = "(//div[@option-id='167'])[1]" )
    WebElement sSizeButton;

    @FindBy(xpath = "(//span[contains(text(),'Add to Cart')])[1]")
     WebElement addToCartButton;

    @FindBy(css = "#ui-id-5")
    WebElement theMenButton;

    @FindBy(xpath = "//span[contains(text(),'Gear')]")
     WebElement theGearButton;
    @FindBy (xpath = "//a[contains(text(), 'Fusion Backpack')]")
    WebElement theBackpackProductButton;

    @FindBy (css = ".action.showcart")
    WebElement theCartButton;


    WebDriver driver;


    public HomePage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickOnTheWomenButton(){
        womenButton.click();
    }

    public void clickOnTheSSize(){
        sSizeButton.click();
    }

    public void clickOnTheAddToCartButton(){
       addToCartButton.click();
    }

    public void clickOnTheMenButton(){
        theMenButton.click();
    }
    public void clickOnTheGearButton(){
        theGearButton.click();
    }

    public void clickOnTheBackpackProductButton(){
       theBackpackProductButton.click();
    }

    public void clickOnTheCartButton(){
        theCartButton.click();
    }



//    public void clickOnTheCartButton(){
//        driver.findElement(By.xpath("(//span[@class='counter qty'])[1]")).click();
//    }



}
