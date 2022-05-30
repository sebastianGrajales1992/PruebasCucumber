package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.DropDownPage;

public class DropDownSteps {
    
    DropDownPage dropDown = new DropDownPage();

    @Given("^navego al sitio web del dropDown$")
    public void navegar() throws InterruptedException{
        dropDown.navegar();
    }

    @When("^selecciono una opcion por su valor$")
    public void seleccionarPorValorDropDown() throws InterruptedException{
        Thread.sleep(2000);
        dropDown.seleccionDropDown("2");
        Thread.sleep(3000);
    }

    @When("^selecciono una opcion por su indice$")
    public void seleccionarPorIndiceDropDown() throws InterruptedException{
        Thread.sleep(2000);
        dropDown.seleccionDropDownIndex(1);
        Thread.sleep(3000);
    }

    @When("^selecciono una opcion por su texto visible$")
    public void seleccionarPorTextoVisibleDropDown() throws InterruptedException{
        Thread.sleep(2000);
        dropDown.seleccionarDropDownTextShow("Option 2");
        Thread.sleep(3000);
    }
}
