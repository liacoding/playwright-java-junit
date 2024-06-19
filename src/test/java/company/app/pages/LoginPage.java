package company.app.pages;

import com.microsoft.playwright.Locator;
import company.app.utilities.Driver;
import lombok.Getter;

@Getter
public class LoginPage {


    private final Locator emailInput;
    private final Locator passwordInput;
    private final Locator signInButton;
    private final Locator errorMessage;

    public LoginPage() {
        this.emailInput = Driver.getPage().locator("");
        this.passwordInput = Driver.getPage().locator("");
        this.signInButton = Driver.getPage().locator("");
        this.errorMessage = Driver.getPage().locator("");
    }


    public void login(String email, String password) {
        emailInput.fill(email);
        passwordInput.fill(password);
        signInButton.click();

    }


}
