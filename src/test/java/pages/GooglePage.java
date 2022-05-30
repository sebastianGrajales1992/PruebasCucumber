package pages;

public class GooglePage extends BasePage{

    private String locatorInputBusqueda = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input";
    private String locatorClickBusqueda = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[2]/div[5]/center[1]/input[1]";
    private String locatorTextFound = "/html/body/div[7]/div/div[10]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div[1]/div[1]/div/a/h3";

    public GooglePage() {
        super(driver);
    }

    public void navegarGoogle(){
        navigateTo("https://www.google.com/");
    }

    public void escribirBusqueda(String criterio){
        write(locatorInputBusqueda, criterio);
    }

    public void clickBotonBusqueda(){
        click(locatorClickBusqueda);
    }

    public String obtenerTextoDeBusquedaPinguino(){
        return getTextElement(locatorTextFound);
    }

    public void darEnter(){
        keyEnter(locatorInputBusqueda);
    }
    
}
