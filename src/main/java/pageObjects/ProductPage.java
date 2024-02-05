package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProductPage extends BasePage{

    @FindBy(xpath = "//span[contains(text(),'Radiant Tee')]")
    WebElement radiantTeeProduct;
    @FindBy(css = "#option-label-size-143-item-167")
    WebElement radiantTeeSizeS;
    @FindBy(css = "#option-label-color-93-item-50")
    WebElement radiantTeeBlueColor;

    @FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
    WebElement addToCartButton;

    @FindBy(css = "#option-label-size-143-item-169")
    WebElement radianTeeSizeL;

    @FindBy(xpath = "//span[contains(text(),'Argus All-Weather Tank')]")
    WebElement argusAllWeatherTankProduct;

    @FindBy(css = "#option-label-color-93-item-52")
    WebElement argusAllWeatherTankGreyColor;

    @FindBy (xpath = "//span[contains(text(), 'Fusion Backpack')]")
    WebElement fusionBackpackProduct;

    @FindBy (css = "#product-addtocart-button")
    WebElement addToCartBagButton;
    public ProductPage(WebDriver driver) {
        super(driver);
    }


    public String getProductName1(){
    return radiantTeeProduct.getText();
    }

    public void clickOnTheSSize(){
        radiantTeeSizeS.click();
    }

    public void clickOnTheBlueColor(){
        radiantTeeBlueColor.click();
    }

    public void clickOnAddToCart(){
        addToCartButton.click();
    }

    public void clickOnTheLSize(){
        radianTeeSizeL.click();
    }

    public String getProductName2(){
        return argusAllWeatherTankProduct.getText();
    }
    public void clickOnTheGreyColor(){
       argusAllWeatherTankGreyColor.click();
    }

    public String getProductName3(){
        return fusionBackpackProduct.getText();
    }

    public void clickOnTheAddToCartBagButton(){
        addToCartBagButton.click();
    }

}
