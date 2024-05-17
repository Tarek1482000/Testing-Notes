import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Test {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver =new EdgeDriver();
        driver.get("https://swinji.azurewebsites.net/account/login");
        WebElement Email = driver.findElement(By.id("Email"));
        WebElement Pass =  driver.findElement(By.id("inputPassword"));
        WebElement Remember =   driver.findElement(By.xpath("//*[@id=\"frmlogin\"]/div[4]/div[1]/label/i"));
        WebElement Login =    driver.findElement(By.id("btnLogin"));

        Email.sendKeys("testregister@aaa.com");
        Pass.sendKeys("Wakram_123");
        Remember.click();
        Login.click();
    }
}
