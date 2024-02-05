import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageObjects.HeaderPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.WomenPage;
import tools.Wait;

public class FiltersTest extends BaseTest{
    @Test

    public void goToTheTopsPage(){
        // click pe butonul de sign in
       HeaderPage headerPage = new HeaderPage(driver);
       headerPage.clickSignInButton();
        // adaug un email valid
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputEmail();
        // adaug o parola valida
        loginPage.inputPassword();
        // click pe butonul de Sign In
        loginPage.clickOnTheSignInButton();
        // click on the women button from the home page
        HomePage homePage = new HomePage(driver);
        homePage.clickOnTheWomenButton();
        // click on the women tops button
        WomenPage womenPage = new WomenPage(driver);
        womenPage.clickOnTheWomenTopsButton();
        // click on the Category filter
        womenPage.clickOnTheCategoryFilter();
        // click on a subcategory from the Category filter
        womenPage.clickOnSubcategoryFromCategoryFilter();

        Wait.sleepInSecond(1);
        // click on the Style Filter
        womenPage.clickOnTheStyleFilter();
        Wait.sleepInSecond(1);
        // click on a subcategory from style
        womenPage.clickOnASubcategoryFromStyle();
        Wait.sleepInSecond(1);
        // click on the Size category
        womenPage.clickOnTheSizeFilter();
        Wait.sleepInSecond(1);
        // click on the size subcategory
        womenPage.clickOnTheSizeSubcategory();
        Wait.sleepInSecond(1);
        // click on the price filter
        womenPage.clickOnThePriceFilter();
        Wait.sleepInSecond(1);
        // click on the price subcategory
        womenPage.clickOnThePriceSubcategory();
        Wait.sleepInSecond(1);
        // click on the color filter
        womenPage.clickOnTheColorFilter();
        Wait.sleepInSecond(1);
        //click on a color subcategory
        womenPage.clickOnAColorSubcategory();
        Wait.sleepInSecond(1);



       // headerPage.clickOnTheWomenDropDownMenu();

    }
}
