package company.app.tests;

import com.microsoft.playwright.options.FilePayload;
import company.app.utilities.BaseTest;
import company.app.utilities.BrowserUtils;
import company.app.utilities.ConfigurationReader;
import company.app.utilities.Driver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Tests_01 extends BaseTest {

    // In this test we will upload a file
    @Test
    void test1() {
        // Path of the file
        String pathOfFile = System.getProperty("user.dir") + ConfigurationReader.getProperty("filePath");

        Driver.getPage().getByTestId("here_is_your_file_upload_element").setInputFiles(Paths.get(pathOfFile));

        BrowserUtils.sleepWithThread(3);
        Driver.getPage().getByTestId("file-submit").click();

        BrowserUtils.sleepWithThread(3);
        Assertions.assertEquals("File Uploaded!",Driver.getPage().locator("your_text_selector").textContent());

        //Delete Uploaded file
        Driver.getPage().getByTestId("here_is_your_file_upload_element").setInputFiles(new Path[0]);
    }

    // we will test if the Dynamic Page has loaded its content
    @Test
    void test2() {

        Driver.getPage().waitForFunction("document.title === 'Your_Page_Title_Here'");
        Assertions.assertTrue(Driver.getPage().locator("your_selector").textContent().contains("Expected_Text_Here"));

    }

}
