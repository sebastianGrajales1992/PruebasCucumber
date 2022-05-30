package steps;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GooglePage;

public class GoogleSteps {
    
    GooglePage googlePage = new GooglePage();

    @Given("^Como usuario navego al sitio web de google$")
    public void navegarAGoogle(){
        googlePage.navegarGoogle();
    }

    @When("^Como usuario busco la palabra pinguino$")
    public void escribirCriterioBusqueda(){
        googlePage.escribirBusqueda("Pinguino");
    }

    @And("^Como usuario doy click en el boton buscar$")
    public void clickBotonBusqueda(){
        googlePage.clickBotonBusqueda();
    }

    @Then("^Espero que se visualice el elemento con el texto Spheniscidae$")
    public void obtenerTextoDeBusqueda(){
        String textoEsperado = "Spheniscidae";
        String texto = googlePage.obtenerTextoDeBusquedaPinguino();
        boolean estado = texto.contains(textoEsperado);
        assertTrue("No se encontro el resultado esperado", estado);
    }

    @When("^Como usuario busco la palabra ping pong$")
    public void escribirCriterioBusquedaPingPong(){
        googlePage.escribirBusqueda("ping pong");
    }

    @And("^Como usuario doy enter$")
    public void darTeclaEnter(){
        googlePage.darEnter();
    }
    
}
