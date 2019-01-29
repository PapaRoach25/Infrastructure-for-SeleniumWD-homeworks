package taskOne;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class AutoTest extends TestConditions{
    @Test
    public void checkCurrentURL(){
        String expectedURL = "https://www.instagram.com/";
        Assert.assertThat("URL not appropriate to current", driver.getCurrentUrl(), is(expectedURL));
    }
}
