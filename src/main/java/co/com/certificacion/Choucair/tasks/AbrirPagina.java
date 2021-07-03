package co.com.certificacion.Choucair.tasks;

import co.com.certificacion.Choucair.userinterface.EntrarPaginaChoucairTesting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task
{
    private EntrarPaginaChoucairTesting entrarPaginaChoucairTesting;


    public static AbrirPagina ChoucairTesting() {
        return Tasks.instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
                Open.browserOn(entrarPaginaChoucairTesting)
        );
    }
}
