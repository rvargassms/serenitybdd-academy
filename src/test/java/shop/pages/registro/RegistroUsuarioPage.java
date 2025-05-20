package shop.pages.registro;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroUsuarioPage {
    public static final Target FIRST_NAME_FIELD_REGISTER = Target.the("Campo de nombre")
            .located(By.xpath("//*[@id='input-firstname']"));

    public static final Target LAST_NAME_FIELD_REGISTER = Target.the("Campo de apellido")
            .located(By.id("input-lastname"));

    public static final Target EMAIL_FIELD_REGISTER = Target.the("Campo de email")
            .located(By.id("input-email"));

    public static final Target TELEPHONE_FIELD = Target.the("Campo de telefono")
            .located(By.id("input-telephone"));

    public static final Target PASSWORD_FIELD_REGISTER = Target.the("Campo de contraseña")
            .located(By.xpath("//*[@id='input-password']"));

    public static final Target CONFIRM_PASSWORD_FIELD = Target.the("Campo de confirmar contraseña")
            .located(By.xpath("//*[@id='input-firstname']"));

    public static final Target PRIVACY_POLICY_CHECKBOX = Target.the("Checkbox de privacidad")
            .located(By.name("agree"));
    public static final Target BTN_YES = Target.the("Botón de aceptar")
            .located(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]"));

    public static final Target BTN_NO = Target.the("Botón de no aceptar")
            .located(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));

    public static final Target CONTINUE_BUTTON = Target.the("Botón continuar")
            .located(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
    public static final Target ALERT_FIRSTNAME = Target.the("Alerta de nombre")
            .located(By.xpath("//div[@class='text-danger' and contains(text(), 'First Name must be between')]"));
    public static final Target ALERT_LASTNAME = Target.the("Alerta de apellido")
            .located(By.xpath("//div[@class='text-danger' and contains(text(), 'Last Name must be between')]"));
    public static final Target ALERT_EMAIL = Target.the("Alerta de email")
            .located(By.xpath("//div[@class='text-danger' and contains(text(), 'E-Mail Address does not appear to be valid')]"));
    public static final Target ALERT_TELEPHONE = Target.the("Alerta de telefono")
            .located(By.xpath("//div[@class='text-danger' and contains(text(), 'Telephone must be between')]"));
    public static final Target ALERT_PASSWORD = Target.the("Alerta de contraseña")
            .located(By.xpath("//div[@class='text-danger' and contains(text(), 'Password must be between')]"));

}
