package com.co.choucair.tasks;

import com.co.choucair.interactions.SelectFromList;
import com.co.choucair.interactions.Write;
import com.co.choucair.models.CustomerLoombokData;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static com.co.choucair.userinterfaces.SerenityCustomerRegistrationPage.*;
import static com.co.choucair.utils.GlobalData.*;


public class RegisterCustomer implements Task
{
    CustomerLoombokData customerLoombokData;


    public RegisterCustomer(CustomerLoombokData customerLoombokData)
    {
        this.customerLoombokData=customerLoombokData;
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
                Write.theValue(customerLoombokData.getCustomerId(),CUSTOMER_ID_INPUT ),
                Write.theValue(customerLoombokData.getCompanyName(),COMPANY_NAME_INPUT),
                Write.theValue(customerLoombokData.getContactName(),CONTACT_NAME_INPUT),
                Write.theValue(customerLoombokData.getContactTitle(),CONTACT_TITLE_INPUT ),
                SelectFromList.byValue(REPRESENTATIVES, DEFAULT_REPRESENTATIVE),
                Write.theValue(customerLoombokData.getAddress(),ADDRESS_INPUT),
                SelectFromList.byValue(COUNTRY_SELECT,DEFAULT_COUNTRY),
                SelectFromList.byValue(CITY_SELECT,DEFAULT_CITY),
                Write.theValue(customerLoombokData.getRegion(),REGION_INPUT),
                Write.theValue(customerLoombokData.getPostalCode(),POSTAL_CODE_INPUT),
                Write.theValue(customerLoombokData.getPhone(),PHONE_INPUT),
                Write.theValue(customerLoombokData.getFax(),FAX_INPUT),
                Write.theValue(customerLoombokData.getEmail(),EMAIL_INPUT)

        );


    }

    public static RegisterCustomer with(CustomerLoombokData customerLoombokData){
        return Instrumented.instanceOf(RegisterCustomer.class).withProperties(customerLoombokData);
    }

}

