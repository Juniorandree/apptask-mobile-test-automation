package objects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuNavegacionObject {
    private AndroidDriver<AndroidElement> driver;

    private WebDriverWait wait;


    public MenuNavegacionObject(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
        wait = new WebDriverWait(this.driver, 20);
    }

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Open the navigation drawer']")
    private AndroidElement btnCajonNavegacion;

    @AndroidFindBy(id = "nav_sign_out")
    private AndroidElement btnCerrarSesion;

    @AndroidFindBy(id = "nav_exit")
    private AndroidElement btnSalir;

    @AndroidFindBy(id = "btn_add_paquete_aceptar")
    private AndroidElement btnCerrarSesionAceptar;

    @AndroidFindBy(id = "btn_cancelar")
    private AndroidElement btnCerrarSesionCancelar;

    public void clickCajonNavegacion(){
        wait.until(ExpectedConditions.visibilityOf(btnCajonNavegacion)).click();}

    public void clickCerrarSesion(){
        wait.until(ExpectedConditions.visibilityOf(btnCerrarSesion)).click();}

    public void clickCerrarSesionAceptar(){
        wait.until(ExpectedConditions.visibilityOf(btnCerrarSesionAceptar)).click();}

    public void clickCerrarSesionCancelar(){
        wait.until(ExpectedConditions.visibilityOf(btnCerrarSesionCancelar)).click();}

}
