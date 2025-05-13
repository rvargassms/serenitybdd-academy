package shop.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import shop.model.ActorUsuario;
import shop.pages.login.LoginPage;

public class LoginTask implements Task {

    private final ActorUsuario usuario;

    public LoginTask(ActorUsuario usuario) {
        this.usuario = usuario;
    }

    public static LoginTask con(ActorUsuario usuario) {
        return Tasks.instrumented(LoginTask.class, usuario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario.getEmail()).into(LoginPage.EMAIL_FIELD),
                Enter.theValue(usuario.getContrasenia()).into(LoginPage.PASSWORD_FIELD),
                Click.on(LoginPage.MY_ACCOUNT_BTN)
        );
    }
}
