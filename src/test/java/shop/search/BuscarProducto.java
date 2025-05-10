package shop.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static shop.pages.ShopHomePage.INPUT_BUSQUEDA;

public class BuscarProducto {
    public static Performable about(String producto) {
        return Task.where("{0} buscar producto: '" + producto + "'",
                Enter.theValue(producto)
                        .into(INPUT_BUSQUEDA)
                        .thenHit(Keys.ENTER)
        );
    }
}
