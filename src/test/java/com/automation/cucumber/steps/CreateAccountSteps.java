package com.automation.cucumber.steps;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;


public class CreateAccountSteps {
    @When("^I click on women tab$")
    public void iClickOnWomenTab() {
        new HomePage().clickonWomenButtonOnHomePage();
    }

    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String name) {
        new CreateAccountPage().enterYourFirstName(name);

    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastname) {
        new CreateAccountPage().enterYourLastName(lastname);

    }

    @And("^I enter register password \"([^\"]*)\"$")
    public void iEnterRegisterPassword(String pass) {
        new CreateAccountPage().enterYourPassword(pass);
    }

    @And("^I enter address \"([^\"]*)\"$")
    public void iEnterAddress(String add) {
        new CreateAccountPage().enterYourAddress(add);

    }

    @And("^I enter city \"([^\"]*)\"$")
    public void iEnterCity(String city) {
        new CreateAccountPage().enterYourCity(city);
    }

    @And("^I select state \"([^\"]*)\"$")
    public void iSelectState(String state) {
        new CreateAccountPage().selectYourState(state);

    }

    @And("^I enter postal code \"([^\"]*)\"$")
    public void iEnterPostalCode(String postal) {
        new CreateAccountPage().enterYourPostalCode(postal);
    }

    @And("^I select country \"([^\"]*)\"$")
    public void iSelectCountry(String country) {
        new CreateAccountPage().selectYourCountry(country);
    }

    @And("^I enter phone number \"([^\"]*)\"$")
    public void iEnterPhoneNumber(String phn) {
        new CreateAccountPage().enterYourPhoneNumber(phn);
    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new CreateAccountPage().clickOnRegisterButton();
    }
}
