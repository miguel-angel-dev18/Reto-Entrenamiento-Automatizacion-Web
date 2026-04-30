package com.co.choucair.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SerenityGridPage {


    public static final Target GRID_ROWS =
            Target.the("Grid rows")
                    .locatedBy("//div[contains(@class,'slick-row')]");

    public static final Target CUSTOMER_ID_CELLS =
            Target.the("customer id cells in the grid")
                    .located(By.cssSelector("div.slick-row td:first-child"));


}


