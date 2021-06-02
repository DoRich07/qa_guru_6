package page;

import testBase.TestBase;
import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class StudentRegistration extends TestBase {

    private SelenideElement fistName = $("#firstName");
    private SelenideElement lastName = $("#lastName");
    private SelenideElement email = $("#userEmail");
    private SelenideElement userNumber = $("#userNumber");
    private SelenideElement subject = $("#subjectsInput");
    private SelenideElement currentAddress = $("#currentAddress");
    private SelenideElement state = $("#react-select-3-input");
    private SelenideElement city = $("#react-select-4-input");
    private SelenideElement radioButtonGenderMale = $("[for=gender-radio-1]");
    private SelenideElement hobbiesCheckBoxSports = $("[for =hobbies-checkbox-1]");
    private SelenideElement submitForm = $("#submit");


    public void openPage() {
        open("https://demoqa.com/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
    }

    public void typeFirstName(String value) {
        fistName.setValue(value);
    }

    public void typeLastName(String value) {
        lastName.setValue(value);
    }

    public void typeEmail(String value) {
        email.setValue(value);
    }

    public void selectMaleGender() {
        radioButtonGenderMale.click();
    }

    public void typePhoneNumber(String value) {
        userNumber.setValue(value);
    }


    public void typeSubject(String value) {
        subject.setValue(value).pressEnter();
    }

    public void selectHobbies() {
        hobbiesCheckBoxSports.click();
    }

    public void uploadImage() {
        $("#uploadPicture").uploadFile(new File("C:\\Users\\User\\IdeaProjects\\qa_guru_6\\src\\test\\resources\\1.png"));
    }

    public void typeAddress(String value) {
        currentAddress.setValue(value);
    }

    public void selectState(String value) {
        state.setValue(value).pressEnter();
    }

    public void selectCity(String value) {
        city.setValue(value).pressEnter();
    }

    public void submitForm() {
        submitForm.click();
    }

}
