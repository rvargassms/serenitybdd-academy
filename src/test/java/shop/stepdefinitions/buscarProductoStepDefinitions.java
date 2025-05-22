package shop.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.WebDriver;
import shop.navigation.NavigateTo;
import shop.pages.home.HomePage;
import shop.tasks.BuscadorProductoTask;


public class buscarProductoStepDefinitions {

    public Actor yas = Actor.named("Yas");

    @Managed(driver = "chrome")
    WebDriver navegador;

    @Dado("que {actor} tiene acceso al buscador desde la homepage")
    public void buscadorProducto(Actor actor){
                actor.can(
                        BrowseTheWeb.with(navegador));
                actor.wasAbleTo(
                        NavigateTo.ShopHomePage());
                actor.attemptsTo(
                        Ensure.that(HomePage.SEARCH_BTN).isDisplayed()
        );
    }

    @Y("{actor} tiene seleccionada la opcion {categoria}")
    public void seleccionarOpcionCategoria(String categoria) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SelectFromOptions.byVisibleText(categoria).from(HomePage.CATEGORY_DROPDOWN)
        );
    }

    @Cuando("{actor} ingresa un {string} en el campo de busqueda")
    public void ingresarProducto(Actor actor, String producto) {
        actor.remember("terminoBusqueda", producto);
        actor.attemptsTo(
                BuscadorProductoTask.terminoBusquedaRecordado()
        );
    }

    @Y("{actor} presiona el boton buscar")
        public void clickEnBotonBuscar (Actor actor){
        actor.attemptsTo(
                Click.on(HomePage.SEARCH_BTN)
        );
    }

    @Entonces("{actor} valida la informacion del producto: {string}")
    public void validarInfoDeProducto(Actor actor, String info) {
    }

}