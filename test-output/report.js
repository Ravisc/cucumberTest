$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/workspace-eclipse/CucumberTest/src/main/java/feature/login.feature");
formatter.feature({
  "line": 1,
  "name": "Free Crm Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free Crm Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of loginpage is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on home page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 26228002908,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_loginpage_is_Free_CRM()"
});
formatter.result({
  "duration": 20949142,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enter_username_and_password()"
});
formatter.result({
  "duration": 599816005,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 9384729225,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 17732734,
  "status": "passed"
});
});