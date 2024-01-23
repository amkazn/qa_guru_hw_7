package pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ResultsTableComponent {
    private String locator;

    public void setLocator(String locator) {
        this.locator = locator;
    }

    public void checkEntry (String key, String value) {
        $(locator)
                .$(byText(key))
                .parent()
                .shouldHave(text(value));

    }
}
