package steps;

import static org.junit.Assert.assertTrue;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasicAuthenticationFormPage;

public class BasicAuthenticationFormSteps {
    BasicAuthenticationFormPage basicAutentication = new BasicAuthenticationFormPage();

    @Given("^Como usuario navego al sitio web del formulario de login$")
    public void navegar(){
        basicAutentication.navegar();
    }

    @When("^Como usuario ingreso un (.+)$")
    public void ingresarUsuario(String user){
        basicAutentication.writeUser(user);
    }

    @And("^Como usuario ingreso una (.+)$")
    public void ingresarPassword(String password){
        basicAutentication.writePassword(password);
    }

    @And("^Como usuario doy click en el boton de login$")
    public void clickLogin(){
        basicAutentication.clickLogin();
    }

    @Then("^Como usuario Valido que el login sea exitoso$")
    public void validateCorrectLogon(){
        boolean respuesta = basicAutentication.loginSucess();
        assertTrue(respuesta);
    }

}
