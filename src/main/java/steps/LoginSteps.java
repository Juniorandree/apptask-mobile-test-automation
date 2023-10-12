package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import driver.AndroidDriverManager;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import objects.LoginObject;

public class LoginSteps {

    private AndroidDriver<AndroidElement> driver;

    private LoginObject loginObject;

    @Before
    public void setUp() { driver = AndroidDriverManager.getDriver();}

    @Given("usuario ingresa datos correctos")
    public void SeIngresanDatos() {
        loginObject = new LoginObject(driver);
        loginObject.writeLicencia();
    }

}
