package com.co.choucair.tasks;

import com.co.choucair.userinterfaces.common.CommonButtons;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SaveRegistration implements Task
{

    private final String botonName;

    public SaveRegistration (String botonName) {
        this.botonName = botonName;
    }


    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(

                Click.on(CommonButtons.newButton(botonName))
        );
    }

    public static SaveRegistration save(String botonName) {
        return instrumented(SaveRegistration.class, botonName);
    }
}
