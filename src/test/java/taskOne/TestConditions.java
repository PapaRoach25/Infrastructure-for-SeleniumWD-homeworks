package taskOne;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.*;

import org.openqa.selenium.interactions.Actions;
import pages.AdminPage;
import pages.MainPage;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class TestConditions {
    protected static WebDriver driver;
    MainPage mainPage;
    AdminPage adminPage;
    Actions builder;


    @Before
    public void setUp(){
        if(driver != null){
            return;
        }
        /*ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        options.addArguments("start-maximized");*/
        //options передати в параметри [ new ChromeDriver(options) ];
        driver = new ChromeDriver();
       /* driver = new FirefoxDriver(new GeckoDriverService.Builder()
                .usingFirefoxBinary(new FirefoxBinary(new File("C:\\Program Files\\Firefox Nightly\\firefox.exe")))
                .build());*/
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mainPage = new MainPage(driver);
        adminPage = new AdminPage(driver);
        builder = new Actions(driver);
        driver.manage().window().maximize();
        //driver.get("http://localhost/litecart/en/");

    }
    @After
    public void tearDown(){
        Runtime.getRuntime().addShutdownHook(
                new Thread(() -> { driver.quit(); driver = null; }));
    }


}
