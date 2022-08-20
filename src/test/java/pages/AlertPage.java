package pages;

public class AlertPage extends BasePage{

    String locator = "//input[@id='alertexamples']";
    String locatorShowConfirm = "//input[@id='confirmexample']";
    String locatorTextResult = "//p[@id='confirmreturn']";
    String locatorShowPrompt = "//input[@id='promptexample']";
    String locatorTextResultPrompt = "//p[@id='promptreturn']";

    public AlertPage() {
        super(driver);
    }

    public void navegar(){
        navigateTo("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
    }

    public void clickShowModal(){
        click(locator);
    }

    public void lanzarAlert(){
        existAlert();
        closeAlert();
    }

    public void aceptarAlert() throws InterruptedException{
        Thread.sleep(5000);
        aceptAlert();
    }

    public void ClickBotonShowConfirmBox(){
        click(locatorShowConfirm);
    }

    public String getTextResult(){
        return getTextElement(locatorTextResult);
    }

    public void clickBotonShowPromptBox(){
        click(locatorShowPrompt);
    }

    public void escribirTexto(String value){
        sendKeysAlert(value);
    }

    public String getTextResultPrompt(){
        return getTextElement(locatorTextResultPrompt);
    }

    public boolean existeTexto(){
        try {
            return validateExistElement(locatorTextResultPrompt);
        } catch (Exception e) {
            return false;
        }
        
    }

    public void hoverButton() throws InterruptedException{
        hoverElement(locator);
        Thread.sleep(2000);
    }

    public String obtenerColorShowAlert(){
        return obtenerColor(locator);
    }
}
