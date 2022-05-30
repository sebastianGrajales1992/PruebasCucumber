package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class PagarReservaVueloPage extends BasePage{

    String locatorSelectorTipoTarjeta = "//select[@id='cardType']";
    String buttonPagar = "//body/div[2]/form[1]/div[11]/div[1]/input[1]";
    String locatorTextCompra = "//h1[contains(text(),'Thank you for your purchase today!')]";

    public PagarReservaVueloPage() {
        super(driver);
    }

    public List<String> convertiraTextoLasOpciones(){
        List<WebElement> opciones = getAllChildrenSelector(locatorSelectorTipoTarjeta);
        List<String> textoOpciones = new ArrayList<String>();
        for (WebElement opcion : opciones) {
            textoOpciones.add(opcion.getText());
        }
        return textoOpciones;
    }

    public void navegar(){
        navigateTo("https://www.blazedemo.com/purchase.php");
    }

    public void visualizarTipoTarjetas(){
        click(locatorSelectorTipoTarjeta);
    }

    public void clickPagar(){
        click(buttonPagar);
    }

    public String getTextMensajeCompra(){
        return getTextElement(locatorTextCompra);
    }
    
}
