package objects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginObject {

    private AndroidDriver<AndroidElement> driver;

    private WebDriverWait wait;

    //Constructor
    public LoginObject(AndroidDriver<AndroidElement> driver){
       this.driver = driver;
       PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
       wait = new WebDriverWait(this.driver, 20);
   }


    @AndroidFindBy(id = "txt_licencia")
    private AndroidElement txtLicencia;

    @AndroidFindBy(id = "txt_placa")
    private AndroidElement txtPlaca;

    @AndroidFindBy(id = "txt_password")
    private AndroidElement txtPassword;

    @AndroidFindBy(id = "btn_ingresar")
    private AndroidElement btnIngresar;

    @AndroidFindBy(id = "drawer_layout")
    private AndroidElement winPuntoVisita;

    public void ingresarLicencia(String licencia) {
        wait.until(ExpectedConditions.visibilityOf(txtLicencia)).sendKeys(licencia);}

    public void ingresarPlaca(String placa) {
        wait.until(ExpectedConditions.visibilityOf(txtPlaca)).sendKeys(placa);}

    public void ingresarContrasenha(String contrasenha) {
        wait.until(ExpectedConditions.visibilityOf(txtPassword)).sendKeys(contrasenha);}

    public void tocarInicioSesion() {
        wait.until(ExpectedConditions.visibilityOf(btnIngresar)).click();}

    public void mostrarPuntoVisita(){
        wait.until(ExpectedConditions.visibilityOf(winPuntoVisita)).getText();}


}
