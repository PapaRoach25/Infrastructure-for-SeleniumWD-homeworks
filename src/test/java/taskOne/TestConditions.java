package taskOne;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestConditions {
    protected WebDriver driver;
    @Before
    public void setUp(){
        if(driver != null){
            return;
        }
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.instagram.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @After
    public void tearDown(){
        Runtime.getRuntime().addShutdownHook(
                new Thread(() -> { driver.quit(); driver = null; }));
    }

}
