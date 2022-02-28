package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmokeTestStepdefs {

    private final WebDriver driver = new ChromeDriver();

//    @Given("I login as admin")
//    public void i_login() throws InterruptedException {
//        // go to website
//        driver.get("http://localhost:8080/");
//
//        WebElement signInLink = driver.findElement(By.linkText("Sign In"));
//
//        signInLink.click();
//
//        Thread.sleep(2000);
//
//        WebElement email = driver.findElement(By.name("_com_liferay_login_web_portlet_LoginPortlet_login"));
//
//        email.sendKeys("test");
//
//        Thread.sleep(2000);
//
//        WebElement password = driver.findElement(By.name("_com_liferay_login_web_portlet_LoginPortlet_password"));
//
//        password.sendKeys("test");
//
//        password.submit();
//    }
//
//    @When("I go to Home page")
//    public void i_go_to_home_page() {
//        driver.get("http://localhost:8080/web/guest/home");
//    }
//
//    @Then("I could view \"Welcome to Liferay\" in page")
//    public void i_could_view_text_in_content_page() {
//
//        String actulText = driver.findElement(By.xpath("//*[contains(@data-lfr-editable-id,'element-text')]")).getText();
//
//        String expectedText = "Welcome to Liferay";
//
//        Assert.assertEquals(actulText,expectedText);
//    }
//
//    @And("I could view welcome image in page")
//    public void i_could_view_welcome_page_in_content_page() {
//        WebElement image = driver.findElement(By.xpath("//*[contains(@data-lfr-editable-id,'image-square')]"));
//
//        String src = image.getAttribute("src");
//
//        Assert.assertTrue(src.contains("tree.png"));
//
//
//    }
//
//    @After()
//    public void closeBrowser() {
//        driver.close();
//        driver.quit();
//    }
}
