package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.AndroidDriverManager;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import objects.LoginObject;

public class LoginSteps {

    private AndroidDriver<AndroidElement> driver;

    private LoginObject loginObject;

    private String operador1, operador2, operador3;

    @Before
    public void setUp() { driver = AndroidDriverManager.getDriver();}

    @Given("transportista ingresa licencia \"([^\"]*)\" placa \"([^\"]*)\" contraseña \"([^\"]*)\"")
    public void ingresarCredenciales(String licencia, String placa, String contrasenha) throws Exception{
       operador1 = licencia;
       operador2 = placa;
       operador3 = contrasenha;
    }
    @When("transportista realiza operacion de inicio de sesion")
    public void realizaOperacion()throws Throwable{
        loginObject = new LoginObject(driver);
        loginObject.ingresarLicencia(operador1);
        loginObject.ingresarPlaca(operador2);
        loginObject.ingresarContrasenha(operador3);
        loginObject.tocarInicioSesion();
    }
    @Then("resultado se tendra ingreso a punto de visita")
    public void verificaResultado()throws Throwable{
        loginObject = new LoginObject(driver);
        loginObject.mostrarPuntoVisita();
    }

}
