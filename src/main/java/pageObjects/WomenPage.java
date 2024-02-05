package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenPage {

    @FindBy(xpath = "//a[contains(text(),'Tops')]")
    WebElement womenTopsButton;
    @FindBy(xpath = "(//div[@class='filter-options-title'])[1]")
    WebElement categoryFilter;

    @FindBy(xpath = "(//div[@class='filter-options-title'])[1]")
    WebElement styleFilter;

    @FindBy(xpath = "//a[contains(text(),'Bras & Tanks')]")
    WebElement subcategoryFromCategoryFilter;

    @FindBy(xpath = "(//a[contains(text(),'Tank')])[9]")
     WebElement subcategoryFromStyle;

    @FindBy(xpath = "(//div[@class='filter-options-title'])[1]")
    WebElement sizeFilter;

    @FindBy(xpath = "(//div[@option-id='166'])[10]")
    WebElement sizeSubcategory;

    @FindBy(xpath = "(//div[@class='filter-options-title'])[3]")
    WebElement priceFilter;

    @FindBy(xpath = "(//span[@class='price'])[15]")
     WebElement priceSubcategory;

    @FindBy(xpath = "(//div[@class='filter-options-title'])[4]")
    WebElement colorFilter;

    @FindBy(xpath = "(//div[@class='swatch-option color '])[3]")
    WebElement colorSubcategory;

    WebDriver driver;

    public WomenPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickOnTheWomenTopsButton(){
        womenTopsButton.click();
    }

    public void clickOnTheCategoryFilter(){
        categoryFilter.click();
    }

    public void clickOnSubcategoryFromCategoryFilter(){
        subcategoryFromCategoryFilter.click();
    }

    public void clickOnTheStyleFilter(){
        categoryFilter.click();
    }

    public void clickOnASubcategoryFromStyle(){
        subcategoryFromStyle.click();
    }

    public void clickOnTheSizeFilter(){
        categoryFilter.click();
    }

    public void clickOnTheSizeSubcategory(){
        sizeSubcategory.click();
    }

    public void clickOnThePriceFilter(){
       categoryFilter.click();
    }

    public void clickOnThePriceSubcategory(){
        priceSubcategory.click();
    }

    public void clickOnTheColorFilter(){
        categoryFilter.click();
    }

    public void clickOnAColorSubcategory(){
        colorSubcategory.click();
    }

}
