package steps;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HoverPage;

public class HoverPageSteps {
    
    public HoverPage hoverPage = new HoverPage();

    @Given("^navegar al sitio web donde se va hacer hover$")
    public void navegar(){
        hoverPage.navegar();
    }

    @When("^paso el mouse por encima de la imagen$")
    public void hover() throws InterruptedException{
        hoverPage.hoverImage();
    }

    @Then("^valido que se muestre la informacion$")
    public void validarMostrarInformacion(){
        boolean mostrarInfo = hoverPage.displayInfoImage1();
        assertTrue(mostrarInfo);
    }
}
