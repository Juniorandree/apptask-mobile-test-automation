package objects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PerfilViajeObject {

    private AndroidDriver<AndroidElement> driver;

    private WebDriverWait wait;

    public PerfilViajeObject(AndroidDriver<AndroidElement> driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),  this);
        wait = new WebDriverWait(this.driver, 20);
    }


    @AndroidFindBy(id = "txt_licencia")
    private AndroidElement txtLicencia;

}
