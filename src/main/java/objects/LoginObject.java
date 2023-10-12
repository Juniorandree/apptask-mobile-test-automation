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

    public void writeLicencia() {
        wait.until(ExpectedConditions.visibilityOf(txtLicencia)).click();}
/*
    public void writePlaca(String placa) {
        wait.until(ExpectedConditions.visibilityOf(txtPlaca)).sendKeys(placa);}

    public void writePassword(String password) {
        wait.until(ExpectedConditions.visibilityOf(txtPassword)).sendKeys(password);}

    public void touchIngresar() {
        wait.until(ExpectedConditions.visibilityOf(btnIngresar)).click();}

    public String getPuntoVisita(){return wait.until(ExpectedConditions.visibilityOf(winPuntoVisita)).getText();}
    */

}
