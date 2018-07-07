package pageObjects.CitadeleAutenificationObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LatviaPage extends CommonPage {
    public SelenideElement userPasswordField() {
        return $("input#pin");
    }
}
