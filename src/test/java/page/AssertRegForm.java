package page;

import com.codeborne.selenide.SelenideElement;
import testBase.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AssertRegForm extends TestBase {

    public SelenideElement title = $("#example-modal-sizes-title-lg");
    public SelenideElement StudentName = $x("//td[text()='Student Name']").parent();
    public SelenideElement assertStudentEmail = $x("//td[text()='Student Email']").parent();
    public SelenideElement assertGender = $x("//td[text()='Gender']").parent();
    public SelenideElement assertMobile = $x("//td[text()='Mobile']").parent();
    public SelenideElement assertBirthDayStudent = $x("//td[text()='Date of Birth']").parent();
    public SelenideElement assertSubject = $x("//td[text()='Subjects']").parent();
    public SelenideElement assertHobbies = $x("//td[text()='Hobbies']").parent();
    public SelenideElement assertThatPictureDownload = $x("//td[text()='Picture']").parent();
    public SelenideElement assertCurrentAddress = $x("//td[text()='Address']").parent();
    public SelenideElement assertStateAndCity = $x("//td[text()='State and City']").parent();


    public void assertTitle() {
        title.shouldHave(text("Thanks for submitting the form"));
    }

    public void assertStudentName(String firstName, String lastName) {
        StudentName.shouldHave(text(firstName + " " + lastName));
    }

    public void assertEmail(String email) {
        assertStudentEmail.parent().shouldHave(text(email));
    }

    public void assertGender(String value) {
        assertGender.parent().shouldHave(text("Male"));
    }

    public void assertMobile(String mobile) {
        assertMobile.parent().shouldHave(text(mobile));
    }

    public void assertBirthDayStudent(String dayOfBirth, String monthOfBirth, String yearOfBirth) {
        assertBirthDayStudent.parent().shouldHave(text(dayOfBirth + " " + monthOfBirth + "," + yearOfBirth));
    }

    public void assertSubject(String value) {
        assertSubject.parent().shouldHave(text("Maths"));
    }

    public void assertHobbies(String value) {
        assertHobbies.parent().shouldHave(text("Sports"));
    }

    public void assertThatPictureDownload(String value) {
        assertThatPictureDownload.parent().shouldHave(text("1.png"));
    }

    public void assertCurrentAddress(String address) {
        assertCurrentAddress.parent().shouldHave(text(address));
    }

    public void assertStateAndCity(String state, String city) {
        assertStateAndCity.parent().shouldHave(text(state + " " + city));
    }
}
