package taskOne;

import org.junit.Test;

public class AdminPageTest extends TestConditions {
    @Test
    public void enterToAdminPanel(){
        driver.navigate().to("http://localhost/litecart/admin/login.php");
        adminPage.getPassword().sendKeys("Admin");
        adminPage.getPassword().sendKeys("1");
        builder.moveToElement(adminPage.getBtnLogin()).click().perform();
    }

}
