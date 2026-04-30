package com.co.choucair.stepdefinitions;

import com.co.choucair.models.CustomerLoombokData;
import com.co.choucair.models.UserLoombokData;
import com.co.choucair.questions.CustomerIsVisible;
import com.co.choucair.tasks.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.WebDriver;

import java.util.List;
import static com.co.choucair.utils.GlobalData.ACTOR;
import static com.co.choucair.utils.GlobalData.URL;
import static org.hamcrest.Matchers.is;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegisterCustomerStepDefinitions
{

    //@Managed
   // WebDriver driver;


    @Given("the user is authenticated")
    public void theUserIsAuthenticated(DataTable dataTable) {

        List<UserLoombokData> userData = UserLoombokData.setData(dataTable);

        OnStage.theActorCalled(ACTOR).attemptsTo(
                OpenTheApplication.at(URL),
                Login.onTheSite(userData.get(0))
        );
    }


    @When("the user opens the {string} module from Northwind")
    public void theUserOpensTheModuleFromNorthwind(String module) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                OpenDemoModule.called(module)
        );
    }
    @And("the user registers a {string} with valid data")
    public void theUserRegistersANewCustomerWithValidData(String formName,DataTable dataTable)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(
                OpenRegistrationForm.forEntity(formName)
        );

       CustomerLoombokData customerData = CustomerLoombokData.setData(dataTable).get(0);

        OnStage.theActorInTheSpotlight().remember(
                "CUSTOMER_DATA", customerData
        );


        OnStage.theActorInTheSpotlight().attemptsTo(
               RegisterCustomer.with(customerData),
               SaveRegistration.save("Save")
       );
    }

    @Then("the customer should be registered successfully")
    public void theCustomerShouldBeRegisteredSuccessfully() {

        CustomerLoombokData customerData =
                OnStage.theActorInTheSpotlight()
                        .recall("CUSTOMER_DATA");

        OnStage.theActorInTheSpotlight().should(
                seeThat(
                        CustomerIsVisible.inGrid(customerData.getCustomerId()),
                        is(true)
                )
        );
    }


}
