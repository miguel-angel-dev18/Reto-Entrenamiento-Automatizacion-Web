package com.co.choucair.interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SelectFromList
{

    public static Performable byValue(Target field, String option) {
        return Task.where("{0} selects " + option,
                Click.on(field),
                Click.on(Target.the("Option " + option)
                        .locatedBy("//li[normalize-space(.)='" + option + "']"))
        );
    }

}
