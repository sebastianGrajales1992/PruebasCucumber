package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions action;
    private static JavascriptExecutor jse;

    static {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        jse = (JavascriptExecutor)driver;
    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        BasePage.jse = (JavascriptExecutor)driver;
    }

    public static void closeBrowser(){
        driver.quit();
    }

    public static void navigateTo(String url){
        driver.get(url);
    }

    private WebElement find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void write(String locator, String value){
        find(locator).clear();
        find(locator).sendKeys(value);
    }

    public void click(String locator){
        find(locator).click();
    }

    public String getTextElement(String locator){
        return find(locator).getText();
    }

    public void keyEnter(String locator){
        find(locator).sendKeys(Keys.ENTER);
    }

    public String getValueFromTable(String locator, int row, int column){
        String cell = locator + "/table/tbody/tr[" + row + "]/td[" + column + "]";
        return find(cell).getText();
    }

    public void setvalueFromTable(String locator, int row, int column, String value){
        String cell = locator + "/table/tbody/tr[" + row + "]/td[" + column + "]";
        WebElement cellElement = find(cell);
        jse.executeScript("arguments[0].innerHTML ='" + value + "';",cellElement);
    }

    public boolean validateExistElement(String locator){
        return find(locator).isDisplayed();
    } 

    public List<WebElement> AllElements(String locator){
        return driver.findElements(By.className(locator));
    }

    public void hoverElement(String locator){
        WebElement element = find(locator);
        action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    public void existAlert(){
        driver.switchTo().alert();
    }

    public void aceptAlert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void closeAlert(){
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void sendKeysAlert(String value){
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(value);
    }

    public void selectValuesFromDropDown(String locator, String value){
        Select dropDown = new Select(find(locator));
        dropDown.selectByValue(value);
    }

    public void selectIndexFromDropDown(String locator, int index){
        Select dropDown = new Select(find(locator));
        dropDown.selectByIndex(index);
    }

    public void selectTextShowFromDropDown(String locator, String texto){
        Select dropDown = new Select(find(locator));
        dropDown.selectByVisibleText(texto);
    }

    public List<WebElement> getAllChildrenSelector(String locator){
        Select dropDown = new Select(find(locator));
        return dropDown.getOptions();
    }

    public void switchToIFrame(String id){
        driver.switchTo().frame(id);
    }

    public void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }

    public String  obtenerColor(String locator){
        return find(locator).getCssValue("background-color");
    }
}
