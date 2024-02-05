package tools;

import java.util.Random;

public class TestData {
    public static final String URL = "https://magento.softwaretestingboard.com/";
    public static final String RED_COLOR = "rgba(224, 43, 39, 1)";
    public static final String CREATE_ACCOUNT_TITLE = "Create New Customer Account";
    public static final String COLOR_PROPERTY = "color";
    public static final String SELECTED_PRODUCT_NAME1 = "Radiant Tee";
    public static final String SELECTED_PRODUCT_NAME2 = "Argus All-Weather Tank";
    public static final String SELECTED_PRODUCT_NAME3 = "Fusion Backpack";
    public static final String PASSWORD =  "password$$1";






    public static String generateNewEmail() {
        Random random = new Random();
        return "ca" + random.nextInt(1_000_000) + "@gmail.com";
    }
}
