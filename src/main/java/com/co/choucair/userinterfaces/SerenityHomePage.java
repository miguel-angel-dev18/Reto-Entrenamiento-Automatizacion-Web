package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SerenityHomePage
{

    public static final Target NORTHWIND =
            Target.the("Northwind module")
                    .locatedBy("//span[normalize-space(.)='Northwind']");

    public static Target subModule(String moduleName) {
        return Target.the("Sub module " + moduleName)
                .locatedBy("//span[normalize-space(.)='" + moduleName + "']");
    }

}
