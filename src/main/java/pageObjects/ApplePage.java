package pageObjects;

import Utilities.CommonOps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplePage extends CommonOps {

    @FindBy(xpath = "//div[text()=\"MacBook Air  \"]")
    public static WebElement macBookAir_btn;
}
