package pageObjects;

import Utilities.CommonOps;
import Utilities.UiActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonOps {

    @FindBy(xpath = "//li[@class=\"hl-cat-nav__js-tab\"]/a[text()=\"Electronics\"]")
    public static WebElement electronixTub_btn;

    @FindBy(xpath = "//a[text()=\"Apple\"]")
    public static WebElement apple_btn;


    public static void moveToApplePage(){
        UiActions.mouseHoverElements(electronixTub_btn,apple_btn);
    }
}
