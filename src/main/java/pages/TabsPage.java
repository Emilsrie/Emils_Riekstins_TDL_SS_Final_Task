package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.objects.Button;
import pages.objects.Link;

public class TabsPage {

    public Link mainLogo = new Link("Main logo", "css=a > img");

    public TabsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public boolean isInitialized() {
        return this.mainLogo.isVisible();
    }

}