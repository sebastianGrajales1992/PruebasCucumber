package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javafx.scene.paint.Color;
import pages.AlertPage;

public class AlertSteps {

    AlertPage alertPage = new AlertPage();

    @Given("^Navegar al sitio web donde esta el alert$")
    public void navegar(){
        alertPage.navegar();
    }

    @When("^Como usuario doy click al boton show alert$")
    public void clickAlertShow(){
        alertPage.clickShowModal();
    }

    @Then("^Como usuario valido si se muestra el alert$")
    public void mostrarAlert(){
        alertPage.lanzarAlert();
    }
    
    @When("^Como usuario doy click en el boton show alertbox$")
    public void clickAlertShowBox(){
        alertPage.clickShowModal();
    }

    @Then("^Como usuario doy click en aceptar$")
    public void aceptarAlertShowBox() throws InterruptedException{
        alertPage.aceptarAlert();
    }

    @When("^Como usuario doy click al boton show confirm box$")
    public void clickShowConformBox(){
        alertPage.ClickBotonShowConfirmBox();
    }

    @And("^Como usuario hago una (.+)$")
    public void realizarAccion(String accion) throws InterruptedException{
        if(accion.equals("aceptar")){
            alertPage.aceptarAlert();
        }
        else{
            alertPage.closeAlert();
        }
    }

    @Then("^Como usuario espero una (.+) de acuerdo a la accion seleccionada$")
    public void validarRespuesta(String respuesta){
        String textoReal = alertPage.getTextResult();
        assertEquals(respuesta, textoReal);
    }

    @When("^Como usuario doy click al boton show prompt box$")
    public void clickEnBotonShowPrompt(){
        alertPage.clickBotonShowPromptBox();
    }

    @And("^Como usuario envio un (.+) al alert$")
    public void enviarTextoAlert(String texto){
        alertPage.escribirTexto(texto);
    }

    @And("^Como usuario en prompt hago una (.+)$")
    public void accionPrompt(String accion) throws InterruptedException{
        if(accion.equals("aceptar")){
            alertPage.aceptarAlert();
        }
        else{
            alertPage.closeAlert();
        }
    }

    @Then("^Como usuario espero visualizar el (.+) que se digito$")
    public void validarRespuestaTexto(String textoRespuesta){
        String textoReal = alertPage.getTextResultPrompt();
        assertEquals(textoRespuesta, textoReal);
    }

    @When("^Como usuario doy click en el boton show prompt box$")
    public void clickBotonShowPromptBox(){
        alertPage.clickBotonShowPromptBox();
    }

    @And("^Como usuario en prompt doy click en cancelar$")
    public void clickCancelar(){
        alertPage.closeAlert();
    }

    @Then("^Como usuario Espero no visualizar el texto$")
    public void validarExistenciaTexto(){
        boolean valorReal = alertPage.existeTexto();
        assertFalse(valorReal);
    }

    @When("^Como usuario hago hover en boton$")
    public void hoverButton() throws InterruptedException{
        alertPage.hoverButton();
    }

    @Then("^Como usuario valido el color del hover$")
    public void obtenerColorBoton(){
        String color = alertPage.obtenerColorShowAlert();
        //String colorReal = Color.valueOf(color).toString();
        //String colorExperado = Color.DARKGREEN.toString();
        String colorReal = org.openqa.selenium.support.Color.fromString(color).toString();
        String colorExperado = org.openqa.selenium.support.Color.fromString("DARKGREEN").toString();
        assertEquals(colorExperado, colorReal);
    }
}
