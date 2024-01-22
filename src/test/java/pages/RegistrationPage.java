package pages;

import static com.codeborne.selenide.Selenide.executeJavaScript;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    private SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            eMailInput = $("#userEmail"),
            genderWrapper = $("#genterWrapper"),
            userNumberInput = $("#userNumber");

    public RegistrationPage openPage(String relativeOrAbsoluteUrl) {
        open(relativeOrAbsoluteUrl);
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public RegistrationPage setFirstName(String firstName){
        firstNameInput.setValue(firstName);
        return this;
    }

    public RegistrationPage setLastName(String lastName){
        lastNameInput.setValue(lastName);
        return this;
    }

    public RegistrationPage setEMail(String eMail){
        eMailInput.setValue(eMail);
        return this;
    }

    public RegistrationPage setGender(String gender){
        genderWrapper.$(byText(gender)).click();
        return this;
    }
    public RegistrationPage setUserNumber(String userNumber){
        userNumberInput.setValue(userNumber);
        return this;
    }

}
