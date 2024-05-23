import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class LoginPageTest extends TestBase {

    @Test
    public void ValidLoginTC() {
        loginPage.EnterEmail("testregister@aaa.com");
        loginPage.EnterPassword("Wakram_123");
        loginPage.ClickingOnRememberMe();
        homePage = loginPage.ClickingOnLogin();
        Assert.assertTrue(homePage.getSuccessLogin().getText().contains("Institute Management"),
                "Login was not successful");


        homePage.ClickingOnCourse();
        homePage.ClickingOnAddCourse();
        homePage.FillCourseData("TarekJave");



        homePage.ClickingOnCourse();
        homePage.SearchOnCourse("TarekJave");
        assertTrue(PageBase.getContent(homePage.courseTitle).contains("TarekJave"));
    }

    @AfterTest
    public void close()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.quit();
    }
}
