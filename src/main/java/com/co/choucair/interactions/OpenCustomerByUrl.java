package com.co.choucair.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenCustomerByUrl implements Interaction {

    private final String customerId;

    public OpenCustomerByUrl(String customerId) {
        this.customerId = customerId;
    }

    public static OpenCustomerByUrl withId(String customerId) {
        return instrumented(OpenCustomerByUrl.class, customerId);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String baseUrl = "https://demo.serenity.is/Northwind/Customer";
        String finalUrl = baseUrl + "#edit/" + customerId;

        BrowseTheWeb.as(actor).getDriver().get(finalUrl);
    }
}

