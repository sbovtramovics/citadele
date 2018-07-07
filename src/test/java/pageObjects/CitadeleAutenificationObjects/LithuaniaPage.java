package pageObjects.CitadeleAutenificationObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LithuaniaPage extends CommonPage {
    public SelenideElement loginButton() {
        return $("input#doLogin");
    }

    @Override
    public SelenideElement userNameField() {
        return $("input#name");
    }

    @Override
    public SelenideElement messageText() {
        return $(".contentLine");
    }
}
