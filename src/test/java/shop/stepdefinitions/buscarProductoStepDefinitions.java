package shop.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.openqa.selenium.WebDriver;
import shop.navigation.NavigateTo;
import shop.pages.home.HomePage;
import shop.pages.login.LoginPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.waits.WaitUntil.the;


public class buscarProductoStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver navegador;

    @Dado("que {actor} tiene acceso al buscador desde la homepage")
    public void buscadorProducto(Actor actor){
                actor.can(BrowseTheWeb.with(navegador));
                actor.wasAbleTo(NavigateTo.ShopHomePage());
        actor.attemptsTo(
                Ensure.that(HomePage.SEARCH_BTN).isDisplayed()
        );
    }

    @Cuando("{actor} busca un producto en la tienda: {string}")
    public void buscarProducto(Actor actor, String producto) {
        actor(
                the(LoginPage.SEARCH_BTN, isVisible()).forNoMoreThan(5).seconds()
        );

    }

    @Entonces("{actor} valida la informacion del producto: {string}")
    public void validarInfoDeProducto(Actor actor, String info) {
        actor.attemptsTo(
                Ensure.that(TheWebPage.title()).containsIgnoringCase(info)
        );
    }

}