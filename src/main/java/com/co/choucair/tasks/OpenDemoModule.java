package com.co.choucair.tasks;

import com.co.choucair.userinterfaces.SerenityHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenDemoModule implements Task {

    private final String moduleName;

    public OpenDemoModule(String moduleName) {
        this.moduleName = moduleName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SerenityHomePage.NORTHWIND),
                Click.on(SerenityHomePage.subModule(moduleName))
        );
    }

    public static OpenDemoModule called(String moduleName)
    {
        return instrumented(OpenDemoModule.class, moduleName);
    }
}
