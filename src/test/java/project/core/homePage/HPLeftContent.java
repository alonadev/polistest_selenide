package project.core.homePage;

import org.openqa.selenium.By;
import project.BasePage;
import project.core.groupPage.GroupPage;

public class HPLeftContent extends BasePage {

    private static final By navigationBarLocator = By.xpath(".//*[contains(@data-l,'t,navigation')]/div[contains(@class, 'nav-side')]/*");

    public HPLeftContent() {
        super();
    }

    @Override
    protected void check() {
        clickableAll(navigationBarLocator);
    }

    public GroupPage clickGroups() {
        new LeftContentBarItemsWrapper(LeftContentBarItemsWrapper.Items.Groups)
                .click();
        return new GroupPage();
    }

    public LeftContentBarItemsWrapper getWrappedItem(LeftContentBarItemsWrapper.Items item)  {
        return new LeftContentBarItemsWrapper(item);
    }

}
