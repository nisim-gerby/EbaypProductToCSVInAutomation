package Utilities;

import Extensions.Logs;
import org.openqa.selenium.WebElement;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class UiActions extends CommonOps {


    public static void mouseHoverElements(WebElement elem1, WebElement elem2) {
        action.moveToElement(elem1).pause(1000).moveToElement(elem2).click().build().perform();
    }

    public static void scrollDown(String pixelsToScroll) {
        js.executeScript("window.scrollBy(0," + pixelsToScroll + ")", "");

    }

    public static void writeToCSV(List<WebElement> items, List<WebElement> title, List<WebElement> price) throws IOException {
        for (int i = 0; i <= items.size() - 1; i++) {
            map.put(title.get(i).getText(), price.get(i).getText());
        }

        String eol = System.getProperty("line.separator");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            writer.append(entry.getKey()).append(',').append(entry.getValue()).append(eol);
        }
    }
}
