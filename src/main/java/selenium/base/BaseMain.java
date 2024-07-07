package selenium.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseMain {


     static WebDriver driver;

    public static void initializeDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

    }

    public static  void tearDown(){

driver.quit();

    }

    public static void click(String xpath){
        driver.findElement(By.xpath(xpath)).click();

    }
    public static void sendKeys(String xpath,String value){
        driver.findElement(By.xpath(xpath)).sendKeys(value);


    }

    public static void selectValueFromDropdown(String xpath,int index){
       WebElement element = driver.findElement(By.xpath(xpath));
        Select select = new Select(element);
        select.selectByIndex(index);

    }
    public static void selectValueFromDropdown(String xpath,String value){
        WebElement element = driver.findElement(By.xpath(xpath));
        Select select = new Select(element);
        select.selectByValue(value );

    }

     public static void dragAndDrop(String xpath,String value){
        WebElement element = driver.findElement(By.xpath(xpath));
        Select select = new Select(element);
        select.selectByValue(value );

    }

}
