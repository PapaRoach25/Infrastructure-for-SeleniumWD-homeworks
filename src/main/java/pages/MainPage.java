package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;



public class MainPage {
    private static WebDriver webDriver;
    private WebDriverWait wait;

    public MainPage(WebDriver driver){
        webDriver = driver;
        wait = new WebDriverWait(webDriver, 30);
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//input[@name=\"email\"]")
    WebElement email;

    @FindBy(xpath = "//input[@data-type=\"password\"]" )
    WebElement password;

    @FindBy(xpath = "//button[@name=\"login\"]")
    WebElement btnLogin;

    @FindBy(xpath = "//*[text()=\" You are now logged in as Oleh Koren.\"] ")
    WebElement successfullyLoged;

    @FindBy(xpath = "//input[@type=\"search\"]")
    WebElement inputSearch;

    @FindBy(xpath = "//span[text()=\"RD003\"]")
    WebElement goodRedDuck;


    public WebElement getEmail() {
        return email;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getBtnLogin() {
        return btnLogin;
    }

    public WebElement getInputSearch() {
        return inputSearch;
    }
    public WebElement getGoodRedDuck(){
        return goodRedDuck;
    }

    public WebElement getSuccessfullyLoged() {
        return successfullyLoged;
    }
}
