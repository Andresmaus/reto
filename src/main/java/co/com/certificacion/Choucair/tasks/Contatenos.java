package co.com.certificacion.Choucair.tasks;

import co.com.certificacion.Choucair.model.ObjetosInicializados;
import co.com.certificacion.Choucair.userinterface.Contactenos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.certificacion.Choucair.util.Constantes.ZERO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Contatenos implements Task
{

    private List<ObjetosInicializados> data;

    public Contatenos (List<ObjetosInicializados> data)
    {
        this.data = data;
    }


    public static Contatenos enChoucairTesting(List<ObjetosInicializados> objetosInicializados) {
        return Tasks.instrumented(Contatenos.class, objetosInicializados);
    }

    @Override
    public <T extends Actor> void performAs(T actor)

    { ObjetosInicializados info = data.get(ZERO);
        actor.attemptsTo(
                Click.on(Contactenos.CLIC_SERVICIOS));
        /*try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
               // WaitUntil.the(Contactenos.TEMA_INTERES, isVisible()),
                /*Click.on(Contactenos.TEMA_INTERES),
                Click.on(Contactenos.TEMA_INTERES),*/
         actor.attemptsTo(
                 Click.on(Contactenos.CLIC_PORTAFOLIO_SOLUCIONES),
                Click.on(Contactenos.CLIC_PRUEBAS_MOBILE)
                //SelectFromOptions.byVisibleText(info.getTemaInteres()).from(Contactenos.TEMA_INTERES)
        );
    }
}
