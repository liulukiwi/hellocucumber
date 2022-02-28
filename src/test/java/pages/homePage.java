package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
    WebDriver driver;

    By welcomeHeading = By.xpath("//*[contains(@data-lfr-editable-id,'element-text')]");
    By welcomeImage = By.xpath("//*[contains(@data-lfr-editable-id,'image-square')]");

    public homePage(WebDriver driver){

        this.driver = driver;
    }

    public String getText(){
        String text=driver.findElement(welcomeHeading).getText();
        return text;
    }

    public String getAttribute(String attributeName){
        String attibuteValue = driver.findElement(welcomeImage).getAttribute(attributeName);
        return attibuteValue;
    }

}
