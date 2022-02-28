package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.basePage;
import pages.homePage;
import pages.loginPage;

public class SmokeTestStepdefsPOM {

    private final WebDriver driver = new ChromeDriver();

    basePage base;
    loginPage login;
    homePage home;

    @Given("I login as admin")
    public void i_login() throws InterruptedException {
        // go to website
        base= new basePage(driver);

        base.gotoPage("http://localhost:8080/");

        login= new loginPage(driver);

        login.clickSignInLink();

        Thread.sleep(2000);

        login.inputEmail("test");

        Thread.sleep(2000);

        login.inputPassword("test");

        login.submit();
    }

    @When("I go to Home page")
    public void i_go_to_home_page() {
        base.gotoPage("http://localhost:8080/web/guest/home");
    }

    @Then("I could view \"Welcome to Liferay\" in page")
    public void i_could_view_text_in_content_page() {
        home= new homePage(driver);

        String actulText =home.getText();
        String expectedText = "Welcome to Liferay";

        Assert.assertEquals(actulText,expectedText);
    }

    @And("I could view welcome image in page")
    public void i_could_view_welcome_page_in_content_page() {
        String src = home.getAttribute("src");

        Assert.assertTrue(src.contains("tree.png"));
    }

    @After()
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }
}
