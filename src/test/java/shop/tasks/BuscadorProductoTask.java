package shop.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import shop.pages.home.HomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscadorProductoTask implements Task {

    public static BuscadorProductoTask terminoBusquedaRecordado() {
        return instrumented(BuscadorProductoTask.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        String termino = actor.recall("terminoBusqueda");

        actor.attemptsTo(
                Enter.theValue(termino).into(HomePage.SEARCH_INPUT),
                Click.on(HomePage.SEARCH_BTN)
        );
    }
}