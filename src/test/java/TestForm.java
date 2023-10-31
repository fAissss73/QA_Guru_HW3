import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestForm {

    @Test
    void ValidateForm() {

        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;


        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Aleksander");
        $("#lastName").setValue("Kuzmin");
        $("#userEmail").setValue("Test24@proverka.ru");
        $("#genterWrapper .custom-control-label").click();
        $("#userNumber").setValue("1234567890");
        $(".react-datepicker-wrapper").click();
        $(".react-datepicker__month-container .react-datepicker__month-select").selectOption(9);
        $(".react-datepicker__month-container .react-datepicker__year-select").selectOption(97);
        $(".react-datepicker__month-container .react-datepicker__day.react-datepicker__day--006").click();
        $("#subjectsContainer #subjectsInput").setValue("Eco").pressEnter();
        $(".custom-control.custom-checkbox.custom-control-inline", 0).click();
        $(".custom-control.custom-checkbox.custom-control-inline", 1).click();
        $("#currentAddress").setValue("Street 1");
        $("#state #react-select-3-input").setValue("Raj").pressEnter();
        $("#city #react-select-4-input").setValue("Jaip").pressEnter();
        $("#uploadPicture").uploadFromClasspath("pngtree-cartoon-cute-lion-cub-png-image_9960755.png");
    }
}