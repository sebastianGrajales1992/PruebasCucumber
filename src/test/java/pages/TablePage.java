package pages;

public class TablePage extends BasePage{

    String locatorDivTable = "//body/div[@id='root']/div[1]";
    String locatorTable = "//body/div[@id='root']/div[1]/table";

    public TablePage() {
        super(driver);
    }

    public void navegarPaginaWeb(){
        navigateTo("https://1v2njkypo4.csb.app/");
    }

    public String obtenerValorCelda(int row, int column){
        row ++;
        column ++;
        return getValueFromTable(locatorDivTable, row, column);
    }

    public boolean visualizarTabla(){
        return validateExistElement(locatorTable);
    }

    public void modificarValorCelda(int row, int column, String value) throws InterruptedException{
        Thread.sleep(5000);
        row ++;
        column ++;
        setvalueFromTable(locatorDivTable, row, column, value);
    }


    
}
