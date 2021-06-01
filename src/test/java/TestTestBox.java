package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import page.StudentRegistration;

import java.util.Locale;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TestTestBox {
    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    Faker faker = new Faker();

    public String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            mobile = faker.phoneNumber().subscriberNumber(10),
            monthOfBirth = "June",
            yearOfBirth = "1996",
            dayOfBirth = "15",
            subject = "Math";
          //  picture = "1.png";

    StudentRegistration studentRegistration = new StudentRegistration();


    @Test
    void successufulSybmitTest() {
        studentRegistration.openBrowser();
        //    open("https://demoqa.com/automation-practice-form");
        studentRegistration.typeFirstName(firstName);
        studentRegistration.typeLastName(lastName);
        studentRegistration.typeEmail(email);
        studentRegistration.selectMaleGender();
        studentRegistration.typePhoneNumber(mobile);
        studentRegistration.chooseDateOfBirth(dayOfBirth, monthOfBirth, yearOfBirth);
        studentRegistration.typeSubject(subject);
        studentRegistration.selectHobbies();
        studentRegistration.uploadImage();
        sleep(3000);
        $("#currentAddress").setValue("My Adress");
        $("[id=react-select-3-input]").setValue("N").pressEnter();
        $("[id=react-select-4-input]").setValue("D").pressEnter();
        $("[id=submit]").click();
        $(".table-responsive").shouldHave(text("Ivan"), text("Ivanov"), text("Ivanov@mail.eu"), text("Male"),
                text("7888888888"), text("My Adress"), text("NCR Delhi"));


    }
}
