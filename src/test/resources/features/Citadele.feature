@CitadeleFeature
Feature: Testing of Admin Page

  Background:
    Given Load the Home page
    Given click login button

  #  - Valsts Igaunija, pieslēgšanās mēģinājums ar ID karti
  @CitadelePageEstonia
  Scenario: Testing of Citadele Page for Estonia
    And select country "et_ee"
    And set random UserName
    And click Continue button
    And verify that the Message is received: "Kasutaja autentimine ebaõnnestus."

  #  - Valsts Lietuva, pieslēgšanās mēģinājums ar kodu kalkulatoru
  @CitadelePageLithuania
  Scenario: Testing of Citadele Page for Lithuania
    And select country "lt_lt"
    And set random LtUserName
    And set random Password
    And click Login button
    And verify that the LtMessage is received: "Neteisingas vartotojas arba slaptažodis"

#  - Valsts Latvija, pieslēgšanās mēģinājums ar kodu kalkulatoru
  @CitadelePageLatvia
  Scenario: Testing of Citadele Page for Latvia
    And select country "lv_lv"
    And set random UserName
    And set random LvPassword
    And click Continue button
    And verify that the Message is received: "Identification failed."