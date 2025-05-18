package shop.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.WebDriver;
import shop.navigation.NavigateTo;
import shop.pages.login.LoginPage;
import shop.pages.registro.RegistroUsuarioPage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.waits.WaitUntil.the;
import static shop.pages.login.LoginPage.BTN_REGISTER;
import static shop.pages.login.LoginPage.MY_ACCOUNT_BTN;
import static shop.pages.registro.RegistroUsuarioPage.*;

public class RegisterStepDef {
    @Managed(driver = "chrome")
    WebDriver navegador;

    @Dado("{actor} está en la página de registro de la tienda")
    public void estáEnLaPáginaDeRegistroDeLaTienda(Actor actor) {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(NavigateTo.ShopHomePage());
        the(MY_ACCOUNT_BTN, isVisible()).forNoMoreThan(5).seconds();
        actor.attemptsTo(Click.on(MY_ACCOUNT_BTN));
        the(BTN_REGISTER, isVisible()).forNoMoreThan(5).seconds();
        actor.attemptsTo(Click.on(BTN_REGISTER));

        System.out.println("paso " + actor + " está en la página de registro");
    }

    @Cuando("{actor} hace clic en el botón 'Continue'")
    public void haceClicEnElBotónContinue(Actor actor) {
        the(FIRST_NAME_FIELD, isVisible()).forNoMoreThan(5).seconds();
        System.out.println("paso " + actor + "valida elemento de nombre");
        the(LAST_NAME_FIELD, isVisible()).forNoMoreThan(5).seconds();
        System.out.println("paso " + actor + "valida elemento de apellido");
        the(EMAIL_FIELD_REGISTER, isVisible()).forNoMoreThan(5).seconds();
        System.out.println("paso " + actor + "valida elemento de email");
        the(TELEPHONE_FIELD, isVisible()).forNoMoreThan(5).seconds();
        System.out.println("paso " + actor + "valida elemento de telefono");
        the(PASSWORD_FIELD_REGISTER, isVisible()).forNoMoreThan(5).seconds();
        System.out.println("paso " + actor + "valida elemento de password");
        the(CONFIRM_PASSWORD_FIELD, isVisible()).forNoMoreThan(5).seconds();
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
    @Cuando("{actor} completa el campo First Name")
    public void completaElCampoFirstName(Actor actor) {
        the(FIRST_NAME_FIELD, isVisible()).forNoMoreThan(5).seconds();
        the(FIRST_NAME_FIELD, isClickable()).forNoMoreThan(5).seconds();
        System.out.println("paso " + actor + "valida elemento de nombre");
        actor.attemptsTo(Click.on(FIRST_NAME_FIELD));
        Enter.theValue("Juan").into(FIRST_NAME_FIELD);
        System.out.println("paso " + actor + "ingresa nombre");
    }

}