package pages;

public class BasicAuthenticationFormPage extends BasePage{

    String locatorUser = "//input[@id='username']";
    String locatorPassword = "//input[@id='password']";
    String locatorButtonLogin = "//i[contains(text(),'Login')]";
    String DivSucessLogin = "//div[@id='flash']";

    public BasicAuthenticationFormPage() {
        super(driver);
    }

    public void  navegar(){
        navigateTo("https://the-internet.herokuapp.com/login");
    }

    public void writeUser(String value){
        write(locatorUser, value);
    }

    public void writePassword(String value){
        write(locatorPassword, value);
    }

    public void clickLogin(){
        click(locatorButtonLogin);
    }

    public boolean loginSucess(){
        return validateExistElement(DivSucessLogin);
    }

}