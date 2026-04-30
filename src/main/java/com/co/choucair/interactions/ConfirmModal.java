package com.co.choucair.interactions;

import com.co.choucair.userinterfaces.SerenityConfirmacionModal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class ConfirmModal implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SerenityConfirmacionModal.YES_BUTTON)
        );
    }

    public static ConfirmModal yes() {
        return new ConfirmModal();
    }
}

