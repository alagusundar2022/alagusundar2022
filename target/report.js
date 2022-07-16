$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/MobileValidationExtend.feature");
formatter.feature({
  "name": "RealmeMobileValidation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Hardcoded Values",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@map"
    }
  ]
});
formatter.step({
  "name": "user launches flipkart application",
  "keyword": "Given "
});
formatter.match({
  "location": "MobileValidationStepsExtends.user_launches_flipkart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login by entering valid crendentials",
  "keyword": "And "
});
formatter.match({
  "location": "MobileValidationStepsExtends.user_login_by_entering_valid_crendentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search mobile",
  "keyword": "When "
});
formatter.match({
  "location": "MobileValidationStepsExtends.user_search_mobile()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.sendKeys(Unknown Source)\r\n\tat com.flipkart.resources.CommonActions.insertText(CommonActions.java:25)\r\n\tat com.flipkart.stepdefinitions.MobileValidationStepsExtends.user_search_mobile(MobileValidationStepsExtends.java:54)\r\n\tat ✽.user search mobile(src/test/resources/Features/MobileValidationExtend.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user click on the mobile name",
  "keyword": "And "
});
formatter.match({
  "location": "MobileValidationStepsExtends.user_click_on_the_mobile_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user validate the mobile names",
  "keyword": "Then "
});
formatter.match({
  "location": "MobileValidationStepsExtends.user_validate_the_mobile_names()"
});
formatter.result({
  "status": "skipped"
});
});