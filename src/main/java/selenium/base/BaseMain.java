package selenium.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
}
