package pages;

public class DropDownPage extends BasePage{

    String locatorSelect = "/html/body/div[2]/div/div/select";

    public DropDownPage() {
        super(driver);
    }

    public void navegar(){
        navigateTo("https://the-internet.herokuapp.com/dropdown");
    }

    public void seleccionDropDown(String value){
        selectValuesFromDropDown(locatorSelect, value);
    }

    public void seleccionDropDownIndex(int index){
        selectIndexFromDropDown(locatorSelect, index);
    }

    public void seleccionarDropDownTextShow(String text){
        selectTextShowFromDropDown(locatorSelect, text);
    }
    
}
