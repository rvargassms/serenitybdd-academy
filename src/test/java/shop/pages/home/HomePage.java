package shop.pages.home;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class HomePage {

    public static final Target SEARCH_INPUT = Target.the("Campo de texto ")
            .located(By.xpath("//input[@name='search' and @placeholder='Search For Products' and @aria-label='Search For Products']"));

    public static final Target CATEGORY_DROPDOWN = Target.the("categoria")
            .located(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div[1]"));

    public static final Target SEARCH_BTN = Target.the("Botón de buscador")
                .located(By.cssSelector("#search > div.search-button > button"));

    public static final Target RESULT = Target.the("Resultado")
            .located(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/ul/li[1]"));

    public static final Target SELECTED_CATEGORY_OPTION = Target.the("All Categories")
            .located(By.cssSelector("#searchDropdownBox option:checked"));


    //li/div/h4[contains(text(), 'parametro')]
    //*[@id="search"]/div[1]/div[1]/div[1]/button
    }