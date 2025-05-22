package shop.stepdefinitions;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.targets.Target;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;
import shop.navigation.NavigateTo;
import shop.tasks.RegisterTask;
import util.CampoMapper;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.waits.WaitUntil.the;
import static shop.pages.registro.RegistroUsuarioPage.*;

public class RegisterStepDefinitions {
    @Managed(driver = "chrome")
    WebDriver navegador;

    @Dado("{actor} está en la página de registro de la tienda")
    public void estáEnLaPáginaDeRegistroDeLaTienda(Actor actor) {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(NavigateTo.RegisterHomePage());

        System.out.println("paso " + actor + " está en la página de registro");
    }

    @Cuando("{actor} hace clic en el botón 'Continue'")
    public void haceClicEnElBotónContinue(Actor actor) {
        the(FIRST_NAME_FIELD_REGISTER, isVisible()).forNoMoreThan(5).seconds();
        System.out.println("paso " + actor + "valida elemento de nombre");
        the(LAST_NAME_FIELD_REGISTER, isVisible()).forNoMoreThan(5).seconds();
        System.out.println("paso " + actor + "valida elemento de apellido");
        the(EMAIL_FIELD_REGISTER, isVisible()).forNoMoreThan(5).seconds();
        System.out.println("paso " + actor + "valida elemento de email");
        the(TELEPHONE_FIELD, isVisible()).forNoMoreThan(5).seconds();
        System.out.println("paso " + actor + "valida elemento de telefono");
        the(PASSWORD_FIELD_REGISTER, isVisible()).forNoMoreThan(5).seconds();
        System.out.println("paso " + actor + "valida elemento de password");
        the(CONFIRM_PASSWORD_FIELD_REGISTER, isVisible()).forNoMoreThan(5).seconds();
        System.out.println("paso " + actor + "valida elemento de confirmar password");
        the(PRIVACY_POLICY_CHECKBOX, isVisible()).forNoMoreThan(5).seconds();
        System.out.println("paso " + actor + "valida elemento de checkbox");
        the(BTN_YES, isVisible()).forNoMoreThan(5).seconds();
        the(CONTINUE_BUTTON, isVisible()).forNoMoreThan(5).seconds();
        System.out.println("paso " + actor + "valida elemento de continue button");
        Click.on(CONTINUE_BUTTON);
        System.out.println("paso " + actor + " hace clic en Continue Y VALIDA CAMPOS ");
    }
    @Entonces ("{actor} debería ver un mensaje de error indicando en cada campo los campos son obligatorios")
    public void ValidaAlertas(Actor actor) {
        the(ALERT_FIRSTNAME, isVisible()).forNoMoreThan(5).seconds();
        System.out.println("paso " + actor + "valida alerta de nombre");
        the(ALERT_LASTNAME, isVisible()).forNoMoreThan(5).seconds();
        System.out.println("paso " + actor + "valida alerta de apellido");
        the(ALERT_EMAIL, isVisible()).forNoMoreThan(5).seconds();
        System.out.println("paso " + actor + "valida alerta de email");
        the(ALERT_TELEPHONE, isVisible()).forNoMoreThan(5).seconds();
        System.out.println("paso " + actor + "valida alerta de telefono");
        the(ALERT_PASSWORD, isVisible()).forNoMoreThan(5).seconds();
        System.out.println("paso " + actor + "valida alerta de password");

    }
    @Y("{actor} completa el formulario con los siguientes datos:")
    public void completarFormulario(Actor actor, DataTable dataTable) {
        List<Map<String, String>> filas = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> fila : filas) {
            String campo = fila.get("campo");
            String valor = fila.get("valor");

            Target target = CampoMapper.obtenerCampoPorTexto(campo);

            actor.attemptsTo(
                    JavaScriptClick.on(target),
                    Click.on(target),
                    Enter.theValue(valor).into(target),
                    WaitUntil.the(target, isVisible()).forNoMoreThan(5).seconds()
            );
        }
    }
    @Cuando("{actor} completa el formulario de registro")
    public void completarFormularioRegistro(Actor actor) {
        actor.attemptsTo(
                RegisterTask.completarFormulario()
        );
    }


}

