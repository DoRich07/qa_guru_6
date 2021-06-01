package page;

import TestBase.TestBase;
import com.codeborne.selenide.Condition;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.textCaseSensitive;
import static com.codeborne.selenide.Selenide.*;

public class StudentRegistration extends TestBase {

    public void openBrowser() {
        open("https://demoqa.com/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
    }

    public void typeFirstName(String value) {
        $("#firstName").setValue(value);
    }

    public void typeLastName(String value) {
        $("#lastName").setValue(value);
    }

    public void typeEmail(String value) {
        $("#userEmail").setValue(value);
    }

    public void selectMaleGender() {
        $("[for=gender-radio-1]").click();
    }

    public void typePhoneNumber(String value) {
        $("#userNumber").setValue(value);
    }


    public void typeSubject(String value) {
        $("#subjectsInput").setValue(value).pressEnter();
    }

    public void selectHobbies() {
        $("[for =hobbies-checkbox-1]").click();
    }

    public void uploadImage() {
        $("#uploadPicture").uploadFile(new File("C:\\Users\\Ivan345\\IdeaProjects\\qa_guru_6\\src\\test\\resources\\1.png"));
    }

    public void typeAddress(String value) {
        $("#currentAddress").setValue(value);
    }

    public void selectState(String value) {
        $("#react-select-3-input").setValue(value).pressEnter();
    }

    public void selectCity(String value) {
        $("#react-select-4-input").setValue(value).pressEnter();
    }

    public void submitForm() {
        $("#submit").click();
    }
    public void confirmRegistration(String firstName,String lastName,String email,String mobile,String dayOfBirth,
                                    String monthOfBirth,String yearOfBirth,String subject,String address,
                                    String state,String city){
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $x("//td[text()='Student Name']").parent().shouldHave(text(firstName + " " + lastName));
        $x("//td[text()='Student Email']").parent().shouldHave(text(email));
        $x("//td[text()='Gender']").parent().shouldHave(text("Male"));
        $x("//td[text()='Mobile']").parent().shouldHave(text(mobile));
        $x("//td[text()='Date of Birth']").parent().shouldHave(text(dayOfBirth + " " + monthOfBirth + "," + yearOfBirth));
        $x("//td[text()='Subjects']").parent().shouldHave(text("Maths"));
        $x("//td[text()='Hobbies']").parent().shouldHave(text("Sports"));
        $x("//td[text()='Picture']").parent().shouldHave(text("1.png"));
        $x("//td[text()='Address']").parent().shouldHave(text(address));
        $x("//td[text()='State and City']").parent().shouldHave(text(state + " " + city ));
    }

}
