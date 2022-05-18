package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pageObjects.*;

import java.io.File;
import java.io.Writer;
import java.util.HashMap;

public class Base {

    public static WebDriver driver;
    public static Actions action;
    public static JavascriptExecutor js;
    public static File csvFile;
    public static HashMap<String, String> map;
    public static Writer writer;
    //public static ChromeOptions options;

    public static HomePage homePage;
    public static ApplePage applePage;
    public static MacBookPage macBookPageA;



}



