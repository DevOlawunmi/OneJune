package co.uk.rightMove.stepDefs;

import co.uk.rightMove.pages.BasePage;
import co.uk.rightMove.pages.HomePage;
import co.uk.rightMove.pages.SearchCriteriaPage;
import co.uk.rightMove.pages.SearchResultsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class SearchPropertyForSaleStepDefs extends BasePage {
    HomePage homePage = new HomePage(driver);
    SearchCriteriaPage searchCriteriaPage = new SearchCriteriaPage(driver);
    SearchResultsPage searchResultsPage = new SearchResultsPage(driver);



    @Given("I navigate to the homepage")
    public void i_navigate_to_the_homepage()
    {

        launchURL();

    }

    @Given("I click accept cookies")
    public void i_click_accept_cookies() {
homePage.clickAcceptCookies();
    }

    @When("I enter {string} in the search bar")
    public void i_enter_in_the_search_bar(String location) throws InterruptedException {
            homePage.enterLocation(location);
    }

    @When("I click on {string}")
    public void i_click_on(String string) {
homePage.clickForSaleButton();
    }

    @Then("the search criteria page is displayed")
    public void the_search_criteria_page_is_displayed() {
searchCriteriaPage.isSearchCriteriaPageDisplayed();
    }

    @Then("select the search radius as {string}")
    public void select_the_search_radius_as(String searchRadius) {
        searchCriteriaPage.selectRadius(searchRadius);

    }

    @Then("I select the minimum price range as {string}")
    public void i_select_the_minimum_price_range_as(String minimumPrice) {
searchCriteriaPage.selectMinPrice(minimumPrice);
    }

    @Then("I select the maximum price range as {string}")
    public void i_select_the_maximum_price_range_as(String string) {

    }

    @Then("I select the min number of bedrooms as {string}")
    public void i_select_the_min_number_of_bedrooms_as(String string) {

    }

    @Then("I select the max number of bedrooms as {string}")
    public void i_select_the_max_number_of_bedrooms_as(String maxBeds) {
searchCriteriaPage.selectMaxNumOfBeds(maxBeds);
    }

    @Then("I select the property type {string}")
    public void i_select_the_property_type(String propertyType) {
searchCriteriaPage.selectPropertyType(propertyType);
    }

    @Then("I select added to site {string}")
    public void i_select_added_to_site(String string) {

    }

    @Then("I click find properties")
    public void i_click_find_properties() {
searchCriteriaPage.clickFindPropertyButton();
    }

    @Then("the property details page is displayed")
    public void the_property_details_page_is_displayed() {

    }


    @And("I click on the first property")
    public void iClickOnTheFirstProperty() {
        searchResultsPage.clickFirstProperty();
    }
}
