package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPage {
    private static WebDriver webDriver;
    private WebDriverWait wait;

    public AdminPage(WebDriver driver){
        webDriver = driver;
        wait = new WebDriverWait(webDriver, 30);
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//input[@name = \"username\"]")
    WebElement username;

    @FindBy(xpath = "//input[@name = \"password\"]")
    WebElement password;

    @FindBy(xpath = "//button[@name = \"login\"]")
    WebElement btnLogin;

    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getBtnLogin() {
        return btnLogin;
    }
}
