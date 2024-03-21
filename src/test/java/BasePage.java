import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

;

public abstract class BasePage {
    @BeforeAll
    static void beforeAll() {
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";

    }

    @AfterAll
    static void afterAll() {

    }
}
