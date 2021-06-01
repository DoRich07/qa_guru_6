package page;

import com.codeborne.selenide.Condition;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class StudentRegistration {

    public void openBrowser(){
        open("https://demoqa.com/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(Condition.text("Student Registration Form"));
    }

    public void typeFirstName(String value){
        $("#firstName").setValue(value);
    }

    public void typeLastName(String value){
        $("#lastName").setValue(value);
    }

    public void typeEmail(String value){
        $("#userEmail").setValue(value);
    }
    public void selectMaleGender(){
        $("[for=gender-radio-1]").click();
    }
    public void typePhoneNumber(String value){
        $("#userNumber").setValue(value);
    }
    public void chooseDateOfBirth(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__month-select").selectOption(month);
        $(String.format(".react-datepicker__day--0%s:not(.react-datepicker__day--outside-month)", day)).click();
    }
    public void typeSubject(String value){
        $("#subjectsInput").setValue(value).pressEnter();
    }
    public void selectHobbies(){
        $("[for =hobbies-checkbox-1]").click();
    }
    public void uploadImage(){
        $("#uploadPicture").uploadFile(new File("C:\\Users\\User\\IdeaProjects\\qa_guru_6\\src\\test\\resources\\1.png"));
    }

}
