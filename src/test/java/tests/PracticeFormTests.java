package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

public class PracticeFormTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void successfulRegistrationFullTest() {
        //fill in the form
        registrationPage
                .openPage("/automation-practice-form")
                .setFirstName("Sherlock")
                .setLastName("Holmes")
                .setEMail("s@holmes.com")
                .setGender("Male")
                .setUserNumber("1234567890")
                .setBirthDate("30", "June", "1990")
                .setSubjects("Computer Science","Maths", "Physics")
                .setHobbies("Sports", "Reading", "Music")
                .uploadPicture("pic.jpg")
                .setCurrentAddress("Baker Street 221b")
                .setStateAndCity("NCR", "Noida")
                .clickSubmit();

        //check results
        registrationPage
                .checkResults("Student Name", "Sherlock Holmes")
                .checkResults("Student Email", "s@holmes.com")
                .checkResults("Gender", "Male")
                .checkResults("Mobile", "1234567890")
                .checkResults("Date of Birth", "30 June,1990")
                .checkResults("Subjects", "Computer Science, Maths, Physics")
                .checkResults("Hobbies", "Sports, Reading, Music")
                .checkResults("Picture", "pic.jpg")
                .checkResults("Address", "Baker Street 221b")
                .checkResults("State and City", "NCR Noida");
    }

    @Test
    void successfulRegistrationMinTest() {
        //fill in the form
        registrationPage
                .openPage("/automation-practice-form")
                .setFirstName("Sherlock")
                .setLastName("Holmes")
                .setGender("Male")
                .setUserNumber("1234567890")
                .clickSubmit();

        //check results
        registrationPage
                .checkDialogAppears()
                .checkResults("Student Name", "Sherlock Holmes")
                .checkResults("Gender", "Male")
                .checkResults("Mobile", "1234567890");
    }

    @Test
    void negativeRegistrationTest() {
        //fill in the form (not really)
        registrationPage
                .openPage("/automation-practice-form")
                .clickSubmit();

        //check results
        registrationPage
                .checkDialogNotAppears();
    }
}
