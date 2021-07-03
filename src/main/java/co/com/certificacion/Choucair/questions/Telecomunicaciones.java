package co.com.certificacion.Choucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static co.com.certificacion.Choucair.userinterface.Industrias.MENSAJE_VERIFICAR_COMUNICACIONES;

public class Telecomunicaciones implements Question<Boolean>
{
    String word;

    public Telecomunicaciones(String word)
    {
        this.word = word;
    }



    public static Telecomunicaciones RetosTransformacion(String questionv)
    {
        return new Telecomunicaciones(questionv);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String texto = Text.of(MENSAJE_VERIFICAR_COMUNICACIONES).viewedBy(actor).asString();
        return word.equals(texto);
    }
}
