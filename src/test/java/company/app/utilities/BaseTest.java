package company.app.utilities;

import company.app.pages.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {


    @BeforeEach
    void setUp() {
        Driver.getPage().navigate(ConfigurationReader.getProperty("url"));
    }

    @AfterEach
    void tearDown() {
        BrowserUtils.sleepWithThread(3);
        Driver.closeDriver();
    }

}
