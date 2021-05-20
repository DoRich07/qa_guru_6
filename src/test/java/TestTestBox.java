package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestTestBox {
    @BeforeAll
    static void setup(){
        Configuration.startMaximized = true;
    }
    @Test
    void successufulSybmitTest(){
        open("https://demoqa.com/automation-practice-form");
        $("[id=firstName]").setValue("Ivan");
        $("[id=lastName]").setValue("Ivanov");
        $("[id=userEmail]").setValue("Ivanov@mail.eu");
        $("[for=gender-radio-2]").click();
        $("[id=userNumber]").setValue("7888888888");
        $("#currentAddress").setValue("My Adress");
        $("[id=react-select-3-input]").setValue("NCR").pressEnter();
        $("[id=react-select-4-input]").setValue("Delhi").pressEnter();
        $("[id=submit]").click();
        $(".table-responsive").shouldHave(text("Ivan"), text("Ivanov"), text("Ivanov@mail.eu"),text("Male"),
                text("7888888888"), text("My Adress"), text("NCR Delhi"));





    }
}
