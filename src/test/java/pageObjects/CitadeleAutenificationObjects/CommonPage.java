package pageObjects.CitadeleAutenificationObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CommonPage {
    public SelenideElement countrySelectBox() {
        return $("select#loc");
    }

    public SelenideElement continueButton() {
        return $("button#button");
    }

    public SelenideElement userPasswordField() {
        return $("input#password");
    }

    public SelenideElement userNameField() {
        return $("input#loginID");
    }

    public SelenideElement messageText() {
        return $(".css_error>dt");
    }
}
