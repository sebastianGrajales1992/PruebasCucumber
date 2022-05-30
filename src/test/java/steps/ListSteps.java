package steps;

import static org.junit.Assert.assertTrue;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ListPage;

public class ListSteps {
    
    ListPage listPage = new ListPage();

    @Given("^Como usuario navego al sitio web de la lista$")
    public void navegarAlsitio(){
        listPage.navegar();
    }

    @When("^Como usuario busco un (.+) en la lista$")
    public void escribirBusqueda(String estado) throws InterruptedException{
        listPage.EscribirEstado(estado);
    }

    @Then("^Como usuario encuentro la (.+) de la lista$")
    public void validarElementos(String ciudad){
        List<String> lista = listPage.getAllResult();
        boolean existeCiudad = lista.contains(ciudad);
        assertTrue(existeCiudad);
    }
}
