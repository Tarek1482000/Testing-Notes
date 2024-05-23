import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class HomePageTest extends TestBase {


    @Test
    public void CreateCourseTC()
    {
//        homePage.ClickingOnCourse();
//        homePage.ClickingOnAddCourse();
//        homePage.FillCourseData("TarekJave");
//
//        homePage.ClickingOnCourse();
//        homePage.SearchOnCourse("TarekJave");
//        assertTrue(PageBase.getContent(homePage.courseTitle).contains("TarekJave"));

    }


    @AfterTest
    public void close()
    {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.quit();
    }
}
