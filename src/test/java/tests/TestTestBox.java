package tests;

import TestBase.TestBase;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import page.Calendar;
import page.StudentRegistration;

import java.util.Locale;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TestTestBox extends TestBase {

    StudentRegistration studentRegistration = new StudentRegistration();
    Calendar calendar = new Calendar();



    @Test
    void successufulSybmitTest() {
        studentRegistration.openBrowser();
        studentRegistration.typeFirstName(firstName);
        studentRegistration.typeLastName(lastName);
        studentRegistration.typeEmail(email);
        studentRegistration.selectMaleGender();
        studentRegistration.typePhoneNumber(mobile);
        calendar.chooseDateOfBirth(dayOfBirth, monthOfBirth, yearOfBirth);
        studentRegistration.typeSubject(subject);
        studentRegistration.selectHobbies();
        studentRegistration.uploadImage();
        studentRegistration.typeAddress(address);
        studentRegistration.selectState(state);
        studentRegistration.selectCity(city);
        studentRegistration.submitForm();
        studentRegistration.confirmRegistration(firstName,lastName,email,mobile,dayOfBirth,monthOfBirth,yearOfBirth,
                subject,address,state,city);



    }
}
