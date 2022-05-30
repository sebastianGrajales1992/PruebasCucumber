package pages;

public class HoverPage extends BasePage{

    String locatorImage = "/html/body/div[2]/div/div/div[1]";
    String locatorDivInfoImage1 = "//body/div[2]/div[1]/div[1]/div[1]/div[1]";

    public HoverPage() {
        super(driver);
    }

    public void navegar(){
        navigateTo("https://the-internet.herokuapp.com/hovers");
    }

    public void hoverImage() throws InterruptedException{
        hoverElement(locatorImage);
        Thread.sleep(2000);
    }

    public boolean displayInfoImage1(){
        return validateExistElement(locatorDivInfoImage1);
    }
    
}
