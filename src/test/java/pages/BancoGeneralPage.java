package pages;

import org.openqa.selenium.By;

public class BancoGeneralPage extends BasePage{

    String locatorBotonEntendido = "/html/body/div[6]/span/div/div[2]/a";
    String locatorBotonBancaLinea = "//header/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/button[1]";
    String locatorUsario = "/html/body/app-root/form/div/div[1]/input";

    public BancoGeneralPage() {
        super(driver);
    }
    
    public void navegar(){
        navigateTo("https://www.bgeneral.com/");
    }

    public void clickBotonEntendido(){
        click(locatorBotonEntendido);
    }

    public void clickBancaLinea() throws InterruptedException{
        click(locatorBotonBancaLinea);
        switchToIFrame("inbank");
        Thread.sleep(5000);
    }

    public void escribirUsuario(String value) throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.id("txtLoginD")).sendKeys(value);
        Thread.sleep(3000);
    }
}
