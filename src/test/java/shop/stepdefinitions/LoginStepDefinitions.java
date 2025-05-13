package shop.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static net.serenitybdd.screenplay.waits.WaitUntil.the;
import org.openqa.selenium.WebDriver;
import shop.model.ActorUsuario;
import shop.navigation.NavigateTo;
import shop.pages.login.LoginPage;
import shop.tasks.LoginTask;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginStepDefinitions {

    @Managed
    WebDriver navegador;
    ActorUsuario usuario;

    @Dado("{actor} ingresa a la pagina de la tienda sin registrarse")
    public void ingresarAshop(Actor actor) {
        usuario = new ActorUsuario(actor.getName(), "Perez", "juanp@mail.com", "1234");
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(NavigateTo.ShopHomePage());

        System.out.println("paso 1");
    }

    @Entonces("{actor} valida que el buscador se encuentre disponible")
    public void validarBuscadorEnPantalla(Actor actor) {
        actor.attemptsTo(
                the(LoginPage.MY_ACCOUNT_BTN, isVisible()).forNoMoreThan(5).seconds()
        );
        System.out.println("Buscador visible");
        System.out.println("paso 2");
    }

    @Cuando("{actor} se loguea en la pagina de la tienda")
    public void loginAshop(Actor actor) {
        actor.attemptsTo(LoginTask.con(usuario));
        System.out.println("paso 2");
    }

    @Entonces("{string} valida su nombre en pantalla")
    public void validacionDeLogin(String nombre) {
        System.out.println("paso 3");
    }
}
