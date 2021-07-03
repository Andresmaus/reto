package co.com.certificacion.Choucair.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Contactenos
{
    public static final Target CLIC_SERVICIOS = Target.the("Clic en Servicios").located(By.xpath("(//a[@href=\"https://www.choucairtesting.com/servicio/\"])[1]"));
    public static final Target CLIC_PORTAFOLIO_SOLUCIONES = Target.the("Servicios").located(By.xpath("(//img[@class=\"elementor-animation-grow attachment-full size-full\"])[2]"));
    public static final Target CLIC_PRUEBAS_MOBILE = Target.the("Pruebas Mobile").located(By.xpath("(//img[@class=\"elementor-animation-grow attachment-full size-full\"])[4]"));
    public static final Target MENSAJE_VERIFICAR = Target.the("Verificar mensaje").located(By.xpath("//*[@id=\"main\"]/div/div/div/div/section[23]/div/div/div[1]/div/div/div[1]/div/div/p[1]/strong"));
}
