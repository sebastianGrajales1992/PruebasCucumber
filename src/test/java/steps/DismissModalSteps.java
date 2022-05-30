package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.DismissModalPage;

public class DismissModalSteps {
    
    DismissModalPage dismiss = new DismissModalPage();


    @Given("^navego al sitio web donde esta el modal$")
    public void navegar() throws InterruptedException{
        dismiss.navegar();
    }

    @When("^Cierro el modal$")
    public void closeModal(){
        dismiss.closeModal();
    }
}
