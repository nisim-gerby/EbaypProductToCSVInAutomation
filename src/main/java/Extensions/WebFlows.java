package Extensions;

import Utilities.CommonOps;
import pageObjects.*;

import java.io.IOException;

public class WebFlows extends CommonOps {

    public static void navigateToMacbook() {
        HomePage.moveToApplePage();
        ApplePage.macBookAir_btn.click();
    }

    public static void writeResultsToCSV() throws IOException {
        MacBookPage.getTitleAndPrice();
    }
}

