package steps;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SeleccionarVueloPage;

public class SeleccionarVueloSteps {
    
    SeleccionarVueloPage seleccionaVuelo = new SeleccionarVueloPage();

    @Given("^Como usuario navego a la pagina web para seleccionar el vuelo$")
    public void navegar(){
        seleccionaVuelo.navegar();
    }

    @When("^Como usuario doy click en el boton seleccionar un vuelo$")
    public void clickSeleccionarVuelo(){
        seleccionaVuelo.clickSeleccionarVuelo();
    }

    @Then("^Como usuario valido la respuesta de la reserva$")
    public void validarReserva(){
        String resultadoReal = seleccionaVuelo.obtenerTextoReserva();
        boolean respuestaCorrecta = resultadoReal.contains("has been reserved.");
        assertTrue(respuestaCorrecta);
    }
}
