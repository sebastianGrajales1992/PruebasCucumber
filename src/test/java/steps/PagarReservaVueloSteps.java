package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PagarReservaVueloPage;

public class PagarReservaVueloSteps {
    
    PagarReservaVueloPage pagarReserva = new PagarReservaVueloPage();


    @Given("^navegar al sitio web de pagar la reserva$")
    public void navegar(){
        pagarReserva.navegar();
    }

    @When("^Como usuario obtengo la lista de opciones de tipo de tarjetas$")
    public void visualizarTipoTarjetas(){
        pagarReserva.visualizarTipoTarjetas();
    }

    @Then("^Como usuario valido si se encuentra el (.+) en la lista$")
    public void validarSiExistenLasTarjetas(String tipoTarjeta){
        List<String> tiposTarjeta = pagarReserva.convertiraTextoLasOpciones();
        boolean existeOpcion = false;
        //existeOpcion = tiposTarjeta.contains(tiposTarjeta);
        int index = 0;
        while (!existeOpcion && index < tiposTarjeta.size()) {
            if(tipoTarjeta.equals(tiposTarjeta.get(index))){
                existeOpcion = true;
            }
            index++;
        }
        assertTrue(existeOpcion);
    }

    @When("^Como usuario doy click en el boton de pagar$")
    public void pagarVuelo(){
        pagarReserva.clickPagar();
    }

    @Then("^Como usuario deseo ver un mensaje informando del exito de la transaccion.$")
    public void confirmarPagoVuelo(){
        String mensajeExito = pagarReserva.getTextMensajeCompra();
        assertEquals("Thank you for your purchase today!", mensajeExito);
    }
}
