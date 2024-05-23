import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected HomePage homePage;

    @BeforeTest
    public void setup(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://swinji.azurewebsites.net/account/login");
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

//    @Test
//    public void LoginPageTest(){
//        loginPage =new LoginPage(driver);
//        loginPage.EnterEmail("Trook");
//    }

    @AfterTest
    public void close()
    {
//        driver.quit();
    }
}
