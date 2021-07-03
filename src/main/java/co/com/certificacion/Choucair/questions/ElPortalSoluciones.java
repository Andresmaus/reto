package co.com.certificacion.Choucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.certificacion.Choucair.userinterface.Contactenos.MENSAJE_VERIFICAR;

public class ElPortalSoluciones implements Question<Boolean>
{

    String word;

    public ElPortalSoluciones(String word)
    {
        this.word = word;
    }



    public static ElPortalSoluciones NosLlevaaPruebasMoviles(String questionv)
    {
        return new ElPortalSoluciones(questionv);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String texto = Text.of(MENSAJE_VERIFICAR).viewedBy(actor).asString();
        return word.equals(texto);
    }
}
