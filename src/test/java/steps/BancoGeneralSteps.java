package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.BancoGeneralPage;

public class BancoGeneralSteps {
    
    BancoGeneralPage banco = new BancoGeneralPage();

    @Given("^Navego al sitio web del banco$")
    public void navegar(){
        banco.navegar();
    }

    @When("^Le doy click al boton de entendido$")
    public void clickEntendido(){
        banco.clickBotonEntendido();
    }

    @And("^Le doy click a banca en linea$")
    public void clickBancaLinea() throws InterruptedException{
        banco.clickBancaLinea();
    }

    @And("^Escribo el usuario$")
    public void EscribirUsuaruo() throws InterruptedException{
        banco.escribirUsuario("SebastianTest");
    }
}
