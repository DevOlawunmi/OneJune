package co.uk.rightMove.pages;

import co.uk.rightMove.commons.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCriteriaPage extends BasePage{
    public SearchCriteriaPage(WebDriver driver){
        DriverManager.driver = driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(id = "radius")
    private WebElement searchRadius;

    @FindBy(id = "minPrice")
    private WebElement minimumPrice;

    @FindBy(id = "maxBedrooms")
    private WebElement maximumBeds;

    @FindBy (id = "displayPropertyType")
    private WebElement propertyType;

    @FindBy (id = "submit")
    private WebElement findPropertyButton;

public boolean isSearchCriteriaPageDisplayed(){
    return driver.getCurrentUrl().contains("search");
}
    public void selectRadius(String text){
selectElementByText(searchRadius,text);
    }

    public void selectMinPrice(String text){
        selectElementByText(minimumPrice,text);
    }

    public void selectMaxNumOfBeds(String text){
    selectElementByText(maximumBeds, text);
    }

    public void selectPropertyType(String text){
    selectElementByText(propertyType, text);
    }


    public SearchResultsPage clickFindPropertyButton(){
    findPropertyButton.click();
    return new SearchResultsPage(driver);
    }
}
