package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import cloud.autotests.tests.pages.DownloadPage;
import cloud.autotests.tests.pages.MainPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.AllureId;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class DownloadPageTests extends TestBase {

    DownloadPage downloadPage = new DownloadPage();
    MainPage mainPage = new MainPage();


    @Test
    @DisplayName("Page have Main page button and it works")
    void MainPageButtonTest() {
        step("Open url " + downloadPage.url, () ->
                open(downloadPage.url));

        step("Click Main Page button", () -> {
            downloadPage.clickMainPageButton();
            $(mainPage.mainPageLogoLocator).should(Condition.text(mainPage.mainPageLogoText));
        });
    }

    @Test
    @AllureId("5893")
    @DisplayName("Page have Browser Support button")
    void browserSupportButtonTest() {
        step("Open url " + downloadPage.url, () ->
                open(downloadPage.url));

        step("Click Browser Support button", () -> {
            downloadPage.clickBrowserSupportButton();
        });
    }

    @Test
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url " + downloadPage.url, () ->
            open(downloadPage.url));

        step("Page title should have text 'Downloads | Selenium'", () -> {
            String expectedTitle = "Downloads | Selenium";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url " + downloadPage.url, () ->
            open(downloadPage.url));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}