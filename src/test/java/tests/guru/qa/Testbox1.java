package tests.guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.id;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ByIdOrName;

import java.util.Objects;

public class Testbox1 {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void SuccessfullTest() {
        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");

        $("[id=dateOfBirthInput]").setValue("28 May 2000");
        $("[id=gender-radio-1]").parent().click();
        $("[id=hobbies-checkbox-1]").parent().click();
        $("[id=lastName]").setValue("Kotov");
        $("[id=firstName]").setValue("Vova");
        $("[id=userEmail]").setValue("kotov@gm.com");
        $("[id=userNumber]").setValue("89103100101");
        $("[id=currentAddress]").setValue("myadress");
        $("[id=subjectsContainer]").setValue("English").pressEnter();

        $("[id=submit]").click();
        $("[id=submit]").click();
      //  $("[tbody]")
    }
}