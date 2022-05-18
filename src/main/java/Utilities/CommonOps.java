package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

public class CommonOps extends Base{

    @BeforeMethod
    public static void startSession() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        action = new Actions(driver);
        js = (JavascriptExecutor) driver;
        csvFile = new File("csvFile.csv");
        writer = new FileWriter(csvFile);
        map=new HashMap<String,String>();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ManagePages.init();
    }

    @AfterMethod
    public static void closeSession(){
        driver.close();
    }

}
