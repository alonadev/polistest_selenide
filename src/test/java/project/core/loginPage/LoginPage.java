package project.core.loginPage;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import project.BasePage;
import project.core.homePage.HomePage;
import project.model.TestBot;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {

    private static final By loginField = By.name("st.email");
    private static final By passwordField = By.name("st.password");
    private static final By signInButton = By.xpath(".//*[@data-l='t,sign_in']");

    public LoginPage() {
        super();
    }

    @Override
    protected void check() {
        clickable(loginField);
        clickable(passwordField);
        clickable(signInButton);
    }

    public HomePage doLogin(final TestBot bot) {
        setValue(loginField, bot.getLogin());
        setValue(passwordField, bot.getPassword());
        click(signInButton);
        return new HomePage();
    }
}
