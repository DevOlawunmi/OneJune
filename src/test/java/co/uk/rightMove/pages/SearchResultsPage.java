package co.uk.rightMove.pages;

import co.uk.rightMove.commons.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultsPage extends BasePage{

    public SearchResultsPage(WebDriver driver){
        DriverManager.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (className = "propertyCard-priceValue")
    List<WebElement> searchResults;

    public PropertyDetailsPage clickFirstProperty(){
        searchResults.get(0).click();
        return new PropertyDetailsPage(driver);
    }
}
