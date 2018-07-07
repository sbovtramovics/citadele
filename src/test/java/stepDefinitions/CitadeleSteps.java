package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import pageObjects.CitadeleAutenificationObjects.CommonPage;
import pageObjects.CitadeleAutenificationObjects.LatviaPage;
import pageObjects.CitadeleAutenificationObjects.LithuaniaPage;

import static org.assertj.core.api.Assertions.assertThat;

import pageObjects.CitadeleHomePage;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;
import static util.PropertiesUtil.loadSiteProperty;
import static util.Randomizers.randomName;
import static util.Randomizers.randomPassword;

public class CitadeleSteps {
    private CitadeleHomePage citadeleHomePage;
    private CommonPage commonPage;
    private LatviaPage latviaPage;
    private LithuaniaPage lithuaniaPage;

    public CitadeleSteps() {
        citadeleHomePage = new CitadeleHomePage();
        commonPage = new CommonPage();
        latviaPage = new LatviaPage();
        lithuaniaPage = new LithuaniaPage();
    }

    @Given("^Load the Home page$")
    public void loadTheHomePage() throws IOException {
        System.setProperty("selenide.browser", "chrome");
        open(loadSiteProperty("genericPageUrl"));
    }

    @When("^click login button$")
    public void clickLoginButton() {
        citadeleHomePage
                .loginButton()
                .click();
    }

    @And("^select country \"([^\"]*)\"$")
    public void selectCountry(String country) {
        commonPage
                .countrySelectBox()
                .selectOptionByValue(country);
    }

    @And("^set random UserName$")
    public void setRandomUserName() {
        commonPage
                .userNameField()
                .setValue(randomName());
    }

    @And("^click Continue button$")
    public void clickContinueButton() {
        commonPage
                .continueButton()
                .click();
    }

    @And("^set random LtUserName$")
    public void setRandomLtUserName() {
        lithuaniaPage
                .userNameField()
                .setValue(randomName());
    }

    @And("^set random Password$")
    public void setRandomPassword() {
        commonPage
                .userPasswordField()
                .setValue(randomPassword());
    }

    @And("^click Login button$")
    public void clickLoginLtButton() {
        lithuaniaPage
                .loginButton()
                .click();
    }

    @And("^set random LvPassword$")
    public void setRandomLvPassword() {
        latviaPage
                .userPasswordField()
                .setValue(randomPassword());
    }

    @And("^verify that the Message is received: \"([^\"]*)\"$")
    public void verifyThatTheMessageIsReceived(String message) {
        assertThat(commonPage
                .messageText()
                .getText())
                .contains(message);
    }

    @And("^verify that the LtMessage is received: \"([^\"]*)\"$")
    public void verifyThatTheLtMessageIsReceived(String message) {
        assertThat(lithuaniaPage
                .messageText()
                .getText())
                .contains(message);
    }
}
