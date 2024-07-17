package co.uk.rightMove.pages;

import co.uk.rightMove.commons.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PropertyDetailsPage extends BasePage{

    public PropertyDetailsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
}
