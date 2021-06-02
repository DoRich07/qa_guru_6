package tests;

import page.AssertRegForm;
import testBase.TestBase;
import org.junit.jupiter.api.Test;
import page.Calendar;
import page.StudentRegistration;

public class TestTestBox extends TestBase {

    StudentRegistration studentRegistration = new StudentRegistration();
    Calendar calendar = new Calendar();
    AssertRegForm assertRegForm = new AssertRegForm();



    @Test
    void successufulSubmitTest() {
        studentRegistration.openPage();
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

        //Asserts

//        assertRegForm.assertRegFormOpen();
        assertRegForm.assertStudentName(firstName,lastName);
        assertRegForm.assertEmail(email);
        assertRegForm.assertGender("Male");
        assertRegForm.assertMobile(mobile);
        assertRegForm.assertBirthDayStudent(dayOfBirth + " " + monthOfBirth + "," + yearOfBirth);
        assertRegForm.assertSubject("Maths");
        assertRegForm.assertHobbies("Sports");
        assertRegForm.assertThatPictureDownload("1.png");
        assertRegForm.assertCurrentAddress(address);
        assertRegForm.assertStateAndCity(state + " " + city );
//        studentRegistration.confirmRegistration(firstName,lastName,email,mobile,dayOfBirth,monthOfBirth,yearOfBirth,
//                subject,address,state,city);




    }
}
