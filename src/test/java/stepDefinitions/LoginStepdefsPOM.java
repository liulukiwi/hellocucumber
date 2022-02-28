package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.loginPage;

public class LoginStepdefsPOM {
    private final WebDriver driver = new ChromeDriver();
    loginPage login;

    @Given("^Browser is open$")
    public void browser_is_open() {
        driver.get("http://localhost:8080/");
    }

    @Given("^User click sign in link$")
    public void user_click_sign_in_link() throws InterruptedException {
        login= new loginPage(driver);

        login.clickSignInLink();

        Thread.sleep(2000);
    }

    @When("^User uses (.*) and (.*)$")
    public void user_uses_emailName_and_psw(String emailName, String psw) throws InterruptedException {
        login.inputEmail(emailName);

        Thread.sleep(2000);

        login.inputPassword(psw);
    }

    @When("^User click sign in button$")
    public void user_click_sign_in_button() {

        login.clickSignInButton();
    }

    @Then("^User is redirected to home page$")
    public void user_is_redirected_to_home_page() {
        if(driver.getCurrentUrl().equalsIgnoreCase(
                "http://localhost:8080/web/guest")){
            System.out.println("Test Pass");
        } else {
            throw new IllegalStateException("This is not a Home Page");
        }
    }

    @After()
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }
}
