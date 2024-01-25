package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    private SelenideElement yearSelector = $(".react-datepicker__year-select"),
            monthSelector = $(".react-datepicker__month-select");

    public void setDate(String day, String month, String year){
        yearSelector.selectOption(year);
        monthSelector.selectOption(month);
        $(String.format("[class*='%s'][aria-label*='%s']", day, month))
                .click();
    }
}
