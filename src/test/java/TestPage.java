import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

public class TestPage extends BasePage{
    StepForIssuesTests stepForIssuesTests = new StepForIssuesTests();
    @Test
    public void mailTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        stepForIssuesTests.stepOpenPage()
                .inputRepoName()
                .openRepo()
                .openIssues()
                .checkForNumberInTest();
    }
}
