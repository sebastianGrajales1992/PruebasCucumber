package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class ListPage extends BasePage{

    String locatorBusquedaEstado = "//body/form[1]/input[1]";
    String locatorListCss = "name";
    public ListPage() {
        super(driver);
    }

    public void navegar(){
        navigateTo("https://andreidbr.github.io/JS30/06AjaxTypeAhead/index.html");
    }
    
    public void EscribirEstado(String value) throws InterruptedException{
        Thread.sleep(600);
        write(locatorBusquedaEstado, value);
    }

    public List<String> getAllResult(){
        List<WebElement> list = AllElements(locatorListCss);
        List<String> stringFromList = new ArrayList<String>();
        for (WebElement e : list) {
            stringFromList.add(e.getText());
        }
        return stringFromList;
    }

    
    public void funcion2(){
        
    }

    public void test(){
        
    }

    public void metodoRamaA(){
        
    }


}
