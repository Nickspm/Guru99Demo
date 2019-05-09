$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("guru99.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Guru99 Automation",
  "description": "",
  "id": "guru99-automation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 24,
  "name": "Page Validation",
  "description": "",
  "id": "guru99-automation;page-validation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "User is at home page",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "User hovers on selenium and clicks on selenium lable",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user clicks on radio and checkbox",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user verifies the page",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user selects second radio button and third checkbox",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.user_is_at_home_page()"
});
formatter.result({
  "duration": 232254231,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.user_hovers_on_selenium_and_clicks_on_selenium_lable()"
});
formatter.result({
  "duration": 464667045,
  "error_message": "java.lang.NullPointerException\r\n\tat java.util.Objects.requireNonNull(Objects.java:203)\r\n\tat org.openqa.selenium.interactions.Actions.\u003cinit\u003e(Actions.java:65)\r\n\tat com.guru99.pages.Homepage.seleniumHoverClick(Homepage.java:26)\r\n\tat com.guru99.stepdef.HomePageStep.user_hovers_on_selenium_and_clicks_on_selenium_lable(HomePageStep.java:20)\r\n\tat ✽.Then User hovers on selenium and clicks on selenium lable(guru99.feature:26)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HomePageStep.user_clicks_on_radio_and_checkbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageStep.user_verifies_the_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageStep.user_selects_second_radio_button_and_third_checkbox(int)"
});
formatter.result({
  "status": "skipped"
});
});