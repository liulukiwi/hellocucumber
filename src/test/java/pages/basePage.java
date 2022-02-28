package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basePage {
    WebDriver driver;

    public basePage(WebDriver driver){

        this.driver = driver;
    }

    public void gotoPage(String baseURL){
        driver.get(baseURL);
    }
}
