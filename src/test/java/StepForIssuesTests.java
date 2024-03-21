import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;


public class StepForIssuesTests {

    private static final String REPOSITORY_NAME = "eroshenkoam/allure-example";
    @Step("Открываем главную страницу github.com")
    public StepForIssuesTests stepOpenPage() {
        open("https://github.com/");
        return this;
    }
    @Step("Вводим имя репозитория")
    public StepForIssuesTests inputRepoName() {
        $(".search-input-container").click();
        $("#query-builder-test").sendKeys(REPOSITORY_NAME, Keys.ENTER);
        return this;
    }
    @Step("Открываем репозиторий")
    public StepForIssuesTests openRepo() {
        $x("//a[@href=\"/eroshenkoam/allure-example\"]").click();
        return this;
    }
    @Step("Открываем вкладку Issues")
    public StepForIssuesTests openIssues() {
        $("#issues-tab").click();
        return this;
    }
    @Step("Проверяем, что есть Issue с номером 80")
    public StepForIssuesTests checkForNumberInTest() {
        $x("//*[contains(text(), \"#80\")]")
                .shouldHave(Condition.text("#80"));
        return this;
    }
}
