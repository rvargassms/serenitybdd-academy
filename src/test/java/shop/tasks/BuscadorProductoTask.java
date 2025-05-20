package shop.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import shop.model.ActorUsuarioBusqueda;
import shop.pages.home.HomePage;

public class BuscarProductoTask implements Task {

    private final ActorUsuarioBusqueda usuario;

    public BuscarProductoTask(ActorUsuarioBusqueda usuario) {
        this.usuario = usuario;
    }

    public static BuscarProductoTask con(ActorUsuarioBusqueda usuario) {
        return Tasks.instrumented(BuscarProductoTask.class, usuario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario.getTerminoBusqueda()).into(HomePage.SEARCH_INPUT),
                Click.on(HomePage.SEARCH_BTN)
        );
    }
}