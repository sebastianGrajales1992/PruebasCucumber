package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class ListCheckPage extends BasePage{

    String locatorIconDesplegar = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/button[1]";
    public ListCheckPage() {
        super(driver);
    }

    public void navegar(){
        navigateTo("https://demoqa.com/checkbox");
    }

    public void clickDesplegarLista(){
        click(locatorIconDesplegar);
    }

    public List<String> getAllResult(){
        List<WebElement> list = AllElements("rct-text");
        List<String> stringFromList = new ArrayList<String>();
        for (WebElement e : list) {
            stringFromList.add(e.getText());
        }
        return stringFromList;
    }


    
}
