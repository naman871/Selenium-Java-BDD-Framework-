package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import steps.OpportunitiesSteps;

public class OpportunitiesStepdefinition {

    OpportunitiesSteps opportunitiesSteps = new OpportunitiesSteps();

    @And("clicks on create opportunity under opportunities dropdown")
    public void clickOnCreateOpportunity(){
        opportunitiesSteps.clickOpportunities();
        opportunitiesSteps.createOpportunity();
    }


    @Then("enter mandatory fields like opportunity name {string} sales stage {string}")
    public void enterManditoryFieldsUnderOpportunity(String opportunityName , String salesStageName) {
        opportunitiesSteps.enterDetailsToCreateOpportunity(opportunityName,salesStageName);
    }
}
