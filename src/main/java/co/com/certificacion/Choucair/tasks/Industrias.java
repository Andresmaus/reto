package co.com.certificacion.Choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Industrias implements Task
{

    public static Industrias inChoucair() {
            return Tasks.instrumented(Industrias.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
                Click.on(co.com.certificacion.Choucair.userinterface.Industrias.CLIC_INDUSTRIAS),
                Click.on(co.com.certificacion.Choucair.userinterface.Industrias.CLIC_TELECOMUNICACIONES)
        );

    }
}
