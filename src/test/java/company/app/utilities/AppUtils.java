package company.app.utilities;

import com.microsoft.playwright.Page;
import org.jetbrains.annotations.NotNull;

public class AppUtils {


    public static void login(@NotNull Page page,String username,String password) {

        page.getByPlaceholder("email").fill(username);
        page.getByPlaceholder("password").fill(password);
        page.locator(".login-btn").click();

    }

}
