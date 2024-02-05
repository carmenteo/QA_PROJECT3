import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HeaderPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ProductPage;
import tools.ErrorMessage;
import tools.Scroll;
import tools.TestData;

public class EndToEndTest extends BaseTest{
    @Test

    public void buyThreeItemsTest(){
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
    // scroll down
        Scroll.scrollDown(1800,driver);
     // click on the S size of a product
     homePage.clickOnTheSSize();
     // click on the Add to Cart Button
      homePage.clickOnTheAddToCartButton();
      // validez ca am ajuns pe pagina produsului dorit
      //  String expectedProductName = "Radiant Tee";
        ProductPage productPage = new ProductPage(driver);
        String actualProductName1 = productPage.getProductName1();
        Assert.assertEquals(actualProductName1, TestData.SELECTED_PRODUCT_NAME1, ErrorMessage.INCORRECT_TEXT);
        // click on the s size
        productPage.clickOnTheSSize();
        // click on the blue color
        productPage.clickOnTheBlueColor();
        // click on Add to Cart
        productPage.clickOnAddToCart();
        // click on the men button
        homePage.clickOnTheMenButton();
        // scroll down
        Scroll.scrollDown(1800,driver);
        // click on the s size
        productPage.clickOnTheSSize();
        // click on the Add to Cart Button
        homePage.clickOnTheAddToCartButton();
        // validez ca am ajuns pe pagina produsului dorit
        String actualProductName2 = productPage.getProductName2();
        Assert.assertEquals(actualProductName2, TestData.SELECTED_PRODUCT_NAME2, ErrorMessage.INCORRECT_TEXT);
        // click on the L size
        productPage.clickOnTheLSize();
        // click on the grey color
        productPage.clickOnTheGreyColor();
        // click on the Add to Cart Button
        homePage.clickOnTheAddToCartButton();
        // click on the gear button
        homePage.clickOnTheGearButton();
        // scroll down
        Scroll.scrollDown(1800,driver);
        // click on the fusion backpack product button
        homePage.clickOnTheBackpackProductButton();
        // validez ca am ajuns pe pagina produsului dorit
        String actualProductName3 = productPage.getProductName3();
        Assert.assertEquals(actualProductName3, TestData.SELECTED_PRODUCT_NAME3, ErrorMessage.INCORRECT_TEXT);
        // click on the Add to Cart Button
        productPage.clickOnTheAddToCartBagButton();
        // click on the cart button
        homePage.clickOnTheCartButton();
    }
}
