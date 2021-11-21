package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import cloud.autotests.tests.pages.DownloadPage;
import cloud.autotests.tests.pages.MainPage;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {

    DownloadPage downloadPage = new DownloadPage();
    MainPage mainPage = new MainPage();


    @Test
    @DisplayName("Page have Browser Support button")
    void generatedTest() {
        step("Open url " + downloadPage.url, () ->
                open(downloadPage.url));

        step("Page have Browser Support button", () -> {
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