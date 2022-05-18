package Utilities;

import org.openqa.selenium.support.PageFactory;
import pageObjects.*;

public class ManagePages extends Base {
    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        applePage = PageFactory.initElements(driver, ApplePage.class);
        macBookPageA = PageFactory.initElements(driver, MacBookPage.class);

    }

}
