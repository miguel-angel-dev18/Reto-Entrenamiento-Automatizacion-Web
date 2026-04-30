package com.co.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTheApplication implements Task
{

    private final String url;

    public OpenTheApplication(String url)
    {
        this.url = url;
    }
    @Override
    public <T extends Actor> void performAs(T actor)
    {

        actor.attemptsTo(
                Open.url(url)
        );

    }

    public static OpenTheApplication at(String url) {
        return instrumented(OpenTheApplication.class, url);
    }

}
