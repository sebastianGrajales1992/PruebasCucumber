package pages;


public class DismissModalPage extends BasePage{

    String locatorCloseModal = "//p[contains(text(),'Close')]";
    public DismissModalPage() {
        super(driver);
    }

    public void navegar() throws InterruptedException{
        navigateTo("https://the-internet.herokuapp.com/entry_ad");
        Thread.sleep(2000);
    }

    public void closeModal(){
        click(locatorCloseModal);
    }


    
}
