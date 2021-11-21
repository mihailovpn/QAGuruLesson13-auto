package cloud.autotests.tests.pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DownloadPage {
    public String url = "https://www.selenium.dev/downloads/";
    public String headerLocator = ".display-1";
    public String supportedBrowserLocator = ".btn-dark";
    public String supportBrowserButtonName = "\n" +
            "Browsers";
    public String SeleniumLogoLocator = "#selenium_logo";

    public DownloadPage openPage() {
        open(url);
        return this;
    }

    public  DownloadPage clickBrowserSupportButton () {
        $(supportedBrowserLocator).click();
        return this;
    }

    public  DownloadPage clickMainPageButton () {
        $(SeleniumLogoLocator).click();
        return this;
    }

}
