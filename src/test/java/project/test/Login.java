package project.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import project.core.homePage.HomePage;
import project.core.homePage.LeftContentBarItemsWrapper;
import project.core.loginPage.LoginPage;
import project.model.TestBot;

import static com.codeborne.selenide.Selenide.*;

public class Login extends TestBase {

    private TestBot bot = new TestBot("tests", "tests");
    private String name = "Alona Deveraux";

    @Test
    public void login() {
        String actualName = new LoginPage().doLogin(bot)
                .getLeftColumnContent()
                .getWrappedItem(LeftContentBarItemsWrapper.Items.UserInfo)
                .getText();
        Assert.assertEquals(name, actualName);
    }
}
