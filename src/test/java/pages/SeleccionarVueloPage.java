package pages;

public class SeleccionarVueloPage extends BasePage{

    String locator = "//tbody/tr[3]/td[1]/input[1]";
    String locatorRespuestaReserva = "/html[1]/body[1]/div[2]/h2[1]";

    public SeleccionarVueloPage() {
        super(driver);
    }
    
    public void clickSeleccionarVuelo(){
        click(locator);
    }

    public String obtenerTextoReserva(){
        return getTextElement(locatorRespuestaReserva);
    }

    public void navegar(){
        navigateTo("https://www.blazedemo.com/reserve.php");
    }
}
