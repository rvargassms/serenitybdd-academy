package shop.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static net.serenitybdd.screenplay.waits.WaitUntil.the;
import org.openqa.selenium.WebDriver;
import shop.navigation.NavigateTo;
import shop.pages.login.LoginPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver navegador;


    @Dado("{actor} ingresa a la pagina de la tienda sin registrarse")
    public void ingresarAshop(Actor actor) {
       actor.can(BrowseTheWeb.with(navegador));
       actor.wasAbleTo(NavigateTo.ShopHomePage());

       System.out.println("paso 1 - "+actor + "accede");
    }

    @Entonces("{actor} valida que 'My account' se encuentre disponible")
    public void validarMyAccountEnPantalla(Actor actor) {
        actor.attemptsTo(
                the(LoginPage.MY_ACCOUNT_BTN, isVisible()).forNoMoreThan(5).seconds()
        );
       System.out.println("paso 2 - "+actor+"valida elemento");
    }

    @Cuando("{actor} se loguea en la pagina de la tienda")
    public void loginAshop(Actor actor) {

        System.out.println("paso 3");
    }

    @Entonces("{string} valida su nombre en pantalla")
    public void validacionDeLogin(String nombre) {
        System.out.println("paso 4");
    }
}
