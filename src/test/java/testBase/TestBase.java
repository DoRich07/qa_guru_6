package testBase;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    Faker faker = new Faker();

    public String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            mobile = faker.phoneNumber().subscriberNumber(10),
            monthOfBirth = "June",
            yearOfBirth = "1996",
            dayOfBirth = "15",
            subject = "Math",
            address = faker.address().fullAddress(),
            state = "NCR",
            city = "Delhi";

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }
}
