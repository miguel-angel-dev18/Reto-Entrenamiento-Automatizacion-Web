package com.co.choucair.questions;

import net.serenitybdd.screenplay.Question;
import static com.co.choucair.userinterfaces.SerenityCustomerRegistrationPage.customerLink;

public class CustomerIsVisible
{

    public static Question<Boolean> inGrid(String customerId)

    {
        return actor ->
                customerLink(customerId)
                        .resolveFor(actor)
                        .isPresent();
    }

}

