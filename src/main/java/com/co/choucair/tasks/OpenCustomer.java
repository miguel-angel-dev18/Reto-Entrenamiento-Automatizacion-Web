package com.co.choucair.tasks;


import com.co.choucair.interactions.OpenCustomerByUrl;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenCustomer implements Task {

    private final String customerId;

    public OpenCustomer(String customerId) {
        this.customerId = customerId;
    }

    public static OpenCustomer byId(String customerId) {
        return instrumented(OpenCustomer.class, customerId);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                OpenCustomerByUrl.withId(customerId)
        );
    }
}

