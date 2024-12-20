package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.AndroidDriverManager;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import objects.LoginObject;
import objects.MenuNavegacionObject;
import org.apache.http.conn.util.PublicSuffixList;

public class MenuNavegacionSteps {
    private AndroidDriver<AndroidElement> driver;

    private MenuNavegacionObject menuNavegacionObject;
    private LoginObject loginObject;


    @Before
    public void setUp() { driver = AndroidDriverManager.getDriver();}

    @Given("El usuario selecciona el menú de navegación")
    public void seleccionarMenu() throws Throwable{
        menuNavegacionObject = new MenuNavegacionObject(driver);
        menuNavegacionObject.clickCajonNavegacion();}

    @When("El usuario selecciona la opción Cerrar sesión en el menú de navegación")
    public void seleccionarCerrarSesion() throws Throwable{
        menuNavegacionObject = new MenuNavegacionObject(driver);
        menuNavegacionObject.clickCerrarSesion();}

    @And("El usuario da clic en el botón de aceptar")
    public void seleccionarCerrarSesionAceptar() throws Throwable{
        menuNavegacionObject = new MenuNavegacionObject(driver);
        menuNavegacionObject.clickCerrarSesionAceptar();}

    @Then("El usuario es redirigido a la pantalla de inicio de sesión")
    public void layoutInicioSesion() throws Throwable{
        loginObject = new LoginObject(driver);
        loginObject.mostrarInicioSesion();}

}
