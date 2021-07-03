package co.com.certificacion.Choucair.stepdefinitions;

import co.com.certificacion.Choucair.model.ObjetosInicializados;
import co.com.certificacion.Choucair.questions.ElPortalSoluciones;
import co.com.certificacion.Choucair.questions.Telecomunicaciones;
import co.com.certificacion.Choucair.tasks.AbrirPagina;
import co.com.certificacion.Choucair.tasks.Contatenos;
import co.com.certificacion.Choucair.tasks.Industrias;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static co.com.certificacion.Choucair.util.Constantes.CONSUMER;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RetoChoucair
{
    @Dado("^que el usuario quiere entrar a la pagina y dirigirse a la opcion de contatenos$")
    public void queElUsuarioQuiereEntrarALaPaginaYDirigirseALaOpcionDeContatenos()
    {
        theActorCalled(CONSUMER).wasAbleTo(AbrirPagina.ChoucairTesting());

    }


    @Cuando("^el abre el navegador y busca la pagina de Choucair y se dirige a esa opcion$")
    public void elAbreElNavegadorYBuscaLaPaginaDeChoucairYSeDirigeAEsaOpcion(List<ObjetosInicializados> data)
    {
        theActorInTheSpotlight().attemptsTo(Contatenos.enChoucairTesting(data));

    }

    @Entonces("^el sistema me debe mostrar el siguiente mensaje (.*)$")
    public void elSistemaMeDebeMostrarElSiguienteMensaje(String questionv)
    {
        theActorInTheSpotlight().should(seeThat(ElPortalSoluciones.NosLlevaaPruebasMoviles(questionv)));

    }


    @Dado("^que el usuario quiere entrar a la pagina y dirigirse a la opcion de Industrias$")
    public void queElUsuarioQuiereEntrarALaPaginaYDirigirseALaOpcionDeIndustrias()
    {
        theActorCalled(CONSUMER).wasAbleTo(AbrirPagina.ChoucairTesting());
    }


    @Cuando("^el abre el navegador y busca la pagina de Choucair y se dirige a esa opcion de Industrias$")
    public void elAbreElNavegadorYBuscaLaPaginaDeChoucairYSeDirigeAEsaOpcionDeIndustrias()
    {
        theActorInTheSpotlight().attemptsTo(Industrias.inChoucair());
    }

    @Entonces("^el sistema de la pagina me debe mostrar el siguiente mensaje (.*)$")
    public void elSistemaDeLaPaginaMeDebeMostrarElSiguienteMensaje(String questionv)
    {
        theActorInTheSpotlight().should(seeThat(Telecomunicaciones.RetosTransformacion(questionv)));
    }

}
