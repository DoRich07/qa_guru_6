package page;

import com.codeborne.selenide.SelenideElement;
import testBase.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AssertRegForm extends TestBase {

    public  SelenideElement title = $("#example-modal-sizes-title-lg");
    public   SelenideElement assertStudentName = $x("//td[text()='Student Name']");
    public   SelenideElement assertStudentEmail = $x("//td[text()='Student Email']");
    public  SelenideElement assertGender = $x("//td[text()='Gender']");
    public   SelenideElement assertMobile = $x("//td[text()='Mobile']");
    public   SelenideElement assertBirthDayStudent = $x("//td[text()='Date of Birth']");
    public   SelenideElement assertSubject = $x("//td[text()='Subjects']");
    public   SelenideElement assertHobbies = $x("//td[text()='Hobbies']");
    public   SelenideElement assertThatPictureDownload = $x("//td[text()='Picture']");
    public  SelenideElement assertCurrentAddress = $x("//td[text()='Address']");
    public   SelenideElement assertStateAndCity = $x("//td[text()='State and City']");


//        public void confirmRegistration(String firstName,String lastName,String email,String mobile,String dayOfBirth,
//                                    String monthOfBirth,String yearOfBirth,String subject,String address
    //                          String state,String city)

    public void assertRegFormOpen() {
        title.shouldHave(text("Thank for submitting the form"));
    }

    public void assertStudentName(String firstName, String lastName) {
        assertStudentName.shouldHave(text(firstName + " " + lastName));
    }

    public void assertEmail(String value) {
        assertStudentEmail.parent().shouldHave(text(email));
    }

    public void assertGender(String value) {
        assertGender.parent().shouldHave(text("Male"));
    }

    public void assertMobile(String value) {
        assertMobile.parent().shouldHave(text(mobile));
    }

    public void assertBirthDayStudent(String value) {
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

    public void assertCurrentAddress(String value) {
        assertCurrentAddress.parent().shouldHave(text(address));
    }

    public void assertStateAndCity(String value) {
        assertStateAndCity.parent().shouldHave(text(state + " " + city));
    }
}
