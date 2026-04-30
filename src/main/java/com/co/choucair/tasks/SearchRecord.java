package com.co.choucair.tasks;

import com.co.choucair.interactions.Write;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.choucair.userinterfaces.SerenityCustomerRegistrationPage.QUICK_SEARCH;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchRecord implements Task
{
    private final String criterion;

    public SearchRecord(String criterion)
    {
        this.criterion = criterion;
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {

        actor.attemptsTo(

                WaitUntil.the(QUICK_SEARCH, isVisible()).forNoMoreThan(10).seconds(),
               // TypeCharByChar.theValue(criterion, QUICK_SEARCH),
                Write.theValue(criterion, QUICK_SEARCH)


                );

    }

    public static SearchRecord by(String criterion) {
        return Tasks.instrumented(SearchRecord.class, criterion);
    }


}





