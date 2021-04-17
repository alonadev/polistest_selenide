package project.core.homePage;

import project.BasePage;
import project.core.header.Header;

public class HomePage extends BasePage {

    private final HPLeftContent leftContent;
    private final Header header;

    public HomePage() {
        super();
        leftContent = new HPLeftContent();
        header = new Header();
    }

    @Override
    protected void check() {
    }

    public Header getHeader() {
        return header;
    }

    public HPLeftContent getLeftColumnContent() {
        return leftContent;
    }
}
