package pageObjects;

import Extensions.Logs;
import Utilities.CommonOps;
import Utilities.UiActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.IOException;
import java.util.List;

public class MacBookPage extends CommonOps {

    static String stringNum;

    @FindBy(xpath = "//li[@class=\"s-item s-item--large\"]")
    public static List<WebElement> macBookAir_item;

    @FindBy(xpath = "//a[@target=\"_blank\"]/h3")
    public static List<WebElement> macBookAir_title;

    @FindBy(xpath = "//span[@class=\"s-item__price\"]")
    public static List<WebElement> macBookAir_price;

    @FindBy(xpath = "//span[@class=\"s-item__price\"]")
    public static List<WebElement> page_btn;


    public static void getTitleAndPrice() throws IOException {
        for (int i = 1; i < 5; i++) {
            stringNum = i + "";
            Logs.addLog("Get title and price of page" + stringNum);
            UiActions.scrollDown("300");
            UiActions.writeToCSV(macBookAir_item, macBookAir_title, macBookAir_price);
            Logs.addLog("Writing to CSV file successfully in page " + stringNum);
            page_btn.get(i + 1).click();
        }
    }

}
