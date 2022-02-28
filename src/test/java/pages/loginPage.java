package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    WebDriver driver;
    By signInLink = By.linkText("Sign In");
    By emailField = By.name("_com_liferay_login_web_portlet_LoginPortlet_login");
    By password = By.name("_com_liferay_login_web_portlet_LoginPortlet_password");
    By signInButton = By.xpath("//button[contains(.,'Sign In')]");

    public loginPage(WebDriver driver){

        this.driver = driver;
    }

    public void clickSignInLink(){

        driver.findElement(signInLink).click();
    }

    public void inputEmail(String emailName){

        driver.findElement(emailField).sendKeys(emailName);
    }

    public void inputPassword(String psw){

        driver.findElement(password).sendKeys(psw);
    }

    public void clickSignInButton(){

        driver.findElement(signInButton).click();
    }

    public void submit(){
        driver.findElement(password).submit();
    }
}
