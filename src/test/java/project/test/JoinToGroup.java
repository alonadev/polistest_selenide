package project.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import project.core.groupPage.GroupCard;
import project.core.groupPage.GroupProfilePage;
import project.core.homePage.HomePage;
import project.core.loginPage.LoginPage;
import project.model.TestBot;

public class JoinToGroup extends TestBase{

    private static HomePage homePage;
    private static TestBot bot = new TestBot("tests", "tests");
    private String groupName = "Технополис OK (Mail.ru) и Политеха";
    private String groupUrl = "https://ok.ru/technopolis";
    private String joinStatus = "Вы в группе!";

    @Before
    public void login() {
        homePage = new LoginPage().doLogin(bot);
    }

    @Test
    public void joinToGroup() {
        GroupCard cardByTitle = homePage.getLeftColumnContent()
                .clickGroups()
                .search(groupName)
                .getCardByTitle(groupName);
        String title = cardByTitle
                .join();
        Assert.assertEquals(joinStatus, title);
        String href = cardByTitle.getHref();
        Assert.assertEquals(groupUrl, href);

    }



    @After
    public void quitFromGroup() {
        goToUrl(groupUrl);
        new GroupProfilePage().leaveGroup();

    }
}
