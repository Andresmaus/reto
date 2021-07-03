package co.com.certificacion.Choucair.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Industrias
{
    public static final Target CLIC_INDUSTRIAS = Target.the("Clic en la opcion industrias").located(By.xpath("//*[@id=\"menu-item-870\"]/a"));
    public static final Target CLIC_TELECOMUNICACIONES = Target.the("Clic en telecomunicaciones").located(By.xpath("(//img[@class=\"elementor-animation-grow attachment-full size-full\"])[3]"));
    public static final Target MENSAJE_VERIFICAR_COMUNICACIONES = Target.the(" Verificar ").located(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[11]/div/div/div[1]/div/div/div[1]/div/h2/b"));
}
