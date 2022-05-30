package steps;

import static org.junit.Assert.assertTrue;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ListCheckPage;

public class ListCheckSteps {
    ListCheckPage listCheck = new ListCheckPage();

    @Given("^Como usuario navego al sitio web de pruebas y selecciono el apartado checbox$")
    public void navegar(){
        listCheck.navegar();
    }

    @When("^Como usuario doy click al icino de desplegar lista$")
    public void clickIconDepslegar(){
        listCheck.clickDesplegarLista();
    }

    @Then("^Valido si la lista existe el (.+) desplegada$")
    public void validarSiMuestraLista(String elementoLista){
        List<String> lista = listCheck.getAllResult();
        boolean existeCiudad = lista.contains(elementoLista);
        assertTrue(existeCiudad);
    }
}
