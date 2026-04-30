package com.co.choucair.tasks;

import com.co.choucair.userinterfaces.common.CommonButtons;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenRegistrationForm implements Task
{

    private final String formName;

    public OpenRegistrationForm(String formName) {
        this.formName = formName;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(CommonButtons.newButton(formName))
        );
    }


    public static OpenRegistrationForm forEntity(String formName) {
        return instrumented(OpenRegistrationForm.class, formName);
    }


}
