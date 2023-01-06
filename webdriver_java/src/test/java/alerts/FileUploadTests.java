package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("/Users/angie/workspace/test_automation_u/webdriver_java/resources/chromedriver-old");
        assertEquals(uploadPage.getUploadedFiles(), "chromedriver-old", "Uploaded files incorrect");
    }
}
