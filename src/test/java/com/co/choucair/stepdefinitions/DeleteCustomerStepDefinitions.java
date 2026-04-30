package com.co.choucair.stepdefinitions;

import com.co.choucair.interactions.ConfirmModal;
import com.co.choucair.interactions.OpenCustomerByUrl;

import com.co.choucair.questions.CustomerIsNotInGrid;

import com.co.choucair.tasks.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.co.choucair.userinterfaces.SerenityGridPage.GRID_ROWS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;


public class DeleteCustomerStepDefinitions
{



    @And("the user searches for customerId {string} in the customer grid")
    public void theUserSearchesForCustomerIdInTheCustomerGrid(String customerId)  {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SearchRecord.by(customerId)
        );
        OnStage.theActorInTheSpotlight().attemptsTo(

                OpenCustomerByUrl.withId(customerId)
        );


    }

    @And("the user deletes the selected customer")
    public void theUserDeletesTheSelectedCustomer() {
        OnStage.theActorInTheSpotlight().attemptsTo(

                DeleteCustomer.delete("Delete"),
                ConfirmModal.yes()


        );




    }

    @Then("the customer should not be displayed in the customer grid")
    public void theCustomerShouldNotBeDisplayedInTheCustomerGrid()  {


        OnStage.theActorInTheSpotlight().should(
                seeThat(CustomerIsNotInGrid.withId("C001"))
        );


    }



}
