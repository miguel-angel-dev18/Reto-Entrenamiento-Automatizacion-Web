package com.co.choucair.userinterfaces.common;


import net.serenitybdd.screenplay.targets.Target;

public class CommonButtons {

    private CommonButtons() {
        // Utility class
    }

    public static Target newButton(String text) {
        return Target.the("Button " + text)
                .locatedBy("//span[normalize-space(.)='" + text + "']");
    }
}

