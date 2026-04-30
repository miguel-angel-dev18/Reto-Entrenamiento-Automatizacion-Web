package com.co.choucair.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.choucair.userinterfaces.SerenityGridPage.CUSTOMER_ID_CELLS;

public class CustomerIsNotInGrid implements Question<Boolean> {

    private final String customerId;

    public CustomerIsNotInGrid(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return CUSTOMER_ID_CELLS.resolveAllFor(actor)
                .stream()
                .map(WebElementFacade::getText)
                .noneMatch(text -> text.equals(customerId));
    }

    public static CustomerIsNotInGrid withId(String customerId) {
        return new CustomerIsNotInGrid(customerId);
    }
}
