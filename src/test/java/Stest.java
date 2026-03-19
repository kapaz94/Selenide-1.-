import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class Stest {

    @Test
    void shouldFindSelenideRepositoryAtTheTop() {

        // открыть главную страницу
        open("https://github.com/");

        $(".header-search-button").click();

        $("#query-builder-test").setValue("selenide").pressEnter();
        // ввести в поле поиска selenide и нажать enter
        $$("a[href='/selenide/selenide']").first().click();
        // проверка: заголовок selenide/selenide
        $("#repository-container-header").shouldHave(text("selenide / selenide"));


        // ARRANGE
        // ACT
        // ACT
        // (ASSERT)
        // ACT
        // ASSERT
    }
}
