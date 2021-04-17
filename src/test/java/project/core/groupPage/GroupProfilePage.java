package project.core.groupPage;

import org.openqa.selenium.By;
import project.BasePage;

public class GroupProfilePage extends BasePage {

    private static final By participantBtnLocator = By.xpath(".//*[contains(@data-l,'t,join')]/div");
    private static final By leaveGroupBtnLocator = By.xpath(".//*[contains(@data-l,'t,join')]//a[contains(@class, 'dropdown_i')]");

    public GroupProfilePage() {

    }

    @Override
    protected void check() {
        clickable(participantBtnLocator);
    }

    public void leaveGroup() {
        click(participantBtnLocator);
        click(leaveGroupBtnLocator);
    }
}
