package taskOne;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import static org.hamcrest.core.Is.is;

public class MainPageTest extends TestConditions{
    @Test
    public void checkCurrentURL(){
        String expectedURL = "http://localhost/litecart/en/";
        Assert.assertThat("URL not appropriate to current", driver.getCurrentUrl(), is(expectedURL));
    }
    @Test
    public void authorization(){
        mainPage.getEmail().sendKeys("bobmarleymetal1996@gmail.com");
        mainPage.getPassword().sendKeys("1");
        mainPage.getBtnLogin().click();
        Assert.assertThat("You are not authorized", mainPage.getSuccessfullyLoged().isDisplayed(),is(true));
    }
    @Test
    public void searchGood(){
        mainPage.getInputSearch().sendKeys("red duck" +Keys.ENTER);
        Assert.assertThat("Element not found", mainPage.getGoodRedDuck().isDisplayed(), is(true));
    }
}
