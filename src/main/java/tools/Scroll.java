package tools;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroll {

    public static void scrollDown(int pxNum, WebDriver driver){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
       Wait.sleepInSecond(1);
        jse.executeScript(String.format("window.scrollBy(0,%d)",pxNum));

    }

    public static void scrollToElement(WebElement element, WebDriver driver) {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
    }

}
