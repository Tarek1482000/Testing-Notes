import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;


public class LoginPageTest extends TestBase {

    @Test
    private void ValidLoginTC() {
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
        Assert.assertTrue(PageBase.getContent(homePage.courseTitle).contains("TarekJave"));

    }
}
