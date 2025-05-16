package shop.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateToLogin {
    public static Performable ShopLoginPage() {
        return Task.where("{0} abre la pagina del login de la tienda",
                Open.browserOn().the(ShopHomePage.class));
    }
}