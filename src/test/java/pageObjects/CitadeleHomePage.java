package pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CitadeleHomePage {
    public SelenideElement loginButton() {
        return $(".internet-banking button.button");
    }

}
