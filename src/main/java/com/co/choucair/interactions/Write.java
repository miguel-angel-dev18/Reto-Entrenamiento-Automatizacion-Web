package com.co.choucair.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class Write implements Interaction {
    private final Target target;
    private final String value;

    public Write(String value, Target target) {
        this.target = target;
        this.value = value;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Enter.theValue(value).into(target)
        );
    }

    public static Write theValue(String value, Target target) {
        return instrumented(Write.class, value, target);
    }

}
