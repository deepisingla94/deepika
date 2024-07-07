import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import selenium.base.BaseMain;
import selenium.pages.LoginPage;

public class Test {
    @BeforeSuite
    public  void  setUp(){
        BaseMain.initializeDriver();
    }

    @org.testng.annotations.Test
    public void mainTest(){
        BaseMain.sendKeys(LoginPage.userxpath,"");

    }


   @AfterSuite
        public  void tearDown(){
        BaseMain.tearDown();

   }


   }




