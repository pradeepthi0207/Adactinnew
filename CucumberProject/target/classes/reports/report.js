$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Adactin Application Login Scenarios.",
  "description": "",
  "id": "adactin-application-login-scenarios.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 11,
  "name": "User Should  verify whether the check-out date field accepts a later date than checkin date.",
  "description": "",
  "id": "adactin-application-login-scenarios.;user-should--verify-whether-the-check-out-date-field-accepts-a-later-date-than-checkin-date.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@test1"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User should select location \"\u003clocation\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user shouls select hotel \"\u003chotel\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user should select room type \"\u003croomtype\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user select no.of rooms \"\u003cnoofrooms\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user enter check in date as today afetr seven days \"\u003ccheckindate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user enter check out date as today after five days \"\u003ccheckoutdate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user should click the search button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user verify that system gives an error that checkoutdate should be after checkin date.",
  "keyword": "Then "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "adactin-application-login-scenarios.;user-should--verify-whether-the-check-out-date-field-accepts-a-later-date-than-checkin-date.;",
  "rows": [
    {
      "cells": [
        "location",
        "hotel",
        "roomtype",
        "noofrooms",
        "checkindate",
        "checkoutdate"
      ],
      "line": 22,
      "id": "adactin-application-login-scenarios.;user-should--verify-whether-the-check-out-date-field-accepts-a-later-date-than-checkin-date.;;1"
    },
    {
      "cells": [
        "Sydney",
        "Hotel Creek",
        "Standard",
        "1",
        "05/06/2019",
        "03/06/2019"
      ],
      "line": 23,
      "id": "adactin-application-login-scenarios.;user-should--verify-whether-the-check-out-date-field-accepts-a-later-date-than-checkin-date.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "User should login with valid credentials.",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User Should Launch the browser.",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter email Address \"\u003cusername\u003e\".",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enter password \"\u003cpassword\u003e\".",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user click login.",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user check the name is valid or not.",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefinition.user_Should_Launch_the_browser()"
});
formatter.result({
  "duration": 2153275928,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cusername\u003e",
      "offset": 26
    }
  ],
  "location": "AdactinStepDefinition.user_enter_email_Address(String)"
});
formatter.result({
  "duration": 219525358,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cpassword\u003e",
      "offset": 21
    }
  ],
  "location": "AdactinStepDefinition.user_enter_password(String)"
});
formatter.result({
  "duration": 162776760,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_click_login()"
});
formatter.result({
  "duration": 1034033356,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_check_the_name_is_valid_or_not()"
});
formatter.result({
  "duration": 56376845,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "User Should  verify whether the check-out date field accepts a later date than checkin date.",
  "description": "",
  "id": "adactin-application-login-scenarios.;user-should--verify-whether-the-check-out-date-field-accepts-a-later-date-than-checkin-date.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@test1"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User should select location \"Sydney\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user shouls select hotel \"Hotel Creek\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user should select room type \"Standard\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user select no.of rooms \"1\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user enter check in date as today afetr seven days \"05/06/2019\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user enter check out date as today after five days \"03/06/2019\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user should click the search button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user verify that system gives an error that checkoutdate should be after checkin date.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Sydney",
      "offset": 29
    }
  ],
  "location": "AdactinStepDefinition.user_should_select_location(String)"
});
formatter.result({
  "duration": 145749613,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Creek",
      "offset": 26
    }
  ],
  "location": "AdactinStepDefinition.user_shouls_select_hotel(String)"
});
formatter.result({
  "duration": 140711000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Standard",
      "offset": 30
    }
  ],
  "location": "AdactinStepDefinition.user_should_select_room_type(String)"
});
formatter.result({
  "duration": 157919086,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 25
    }
  ],
  "location": "AdactinStepDefinition.user_select_no_of_rooms(String)"
});
formatter.result({
  "duration": 98424416,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "05/06/2019",
      "offset": 52
    }
  ],
  "location": "AdactinStepDefinition.user_enter_check_in_date_as_today_afetr_seven_days(String)"
});
formatter.result({
  "duration": 263747347,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "03/06/2019",
      "offset": 52
    }
  ],
  "location": "AdactinStepDefinition.user_enter_check_out_date_as_today_after_five_days(String)"
});
formatter.result({
  "duration": 225080316,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_should_click_the_search_button()"
});
formatter.result({
  "duration": 112503615,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_verify_that_system_gives_an_error_that_checkoutdate_should_be_after_checkin_date()"
});
formatter.result({
  "duration": 22630698,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 44,
  "name": "User Should  verify whether the check-out date field accepts a later date than checkin date.",
  "description": "",
  "id": "adactin-application-login-scenarios.;user-should--verify-whether-the-check-out-date-field-accepts-a-later-date-than-checkin-date.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 43,
      "name": "@test3"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "User should select location \"\u003clocation\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "user shouls select hotel \"\u003chotel\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "user should select room type \"\u003croomtype\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "user select no.of rooms \"\u003cnoofrooms\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "user enter check in date as today afetr seven days \"\u003ccheckindate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "user enter check out date as today after five days \"\u003ccheckoutdate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "user should select noOfAdults \"\u003cnoOfAdults\u003e\".",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "user should select noOfChildren \"\u003cnoOfChildren\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "user should click the search button",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "user Select the hotel",
  "keyword": "When "
});
formatter.step({
  "line": 55,
  "name": "click on continue button.",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "Check the details",
  "keyword": "When "
});
formatter.step({
  "line": 57,
  "name": "click on logout",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "verify we have been logged out of the application",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "user check no of rooms should be displayed and match with number of rooms in search hotel page",
  "keyword": "And "
});
formatter.examples({
  "line": 64,
  "name": "",
  "description": "",
  "id": "adactin-application-login-scenarios.;user-should--verify-whether-the-check-out-date-field-accepts-a-later-date-than-checkin-date.;",
  "rows": [
    {
      "cells": [
        "location",
        "hotel",
        "roomtype",
        "noofrooms",
        "checkindate",
        "checkoutdate",
        "noOfAdults",
        "noOfChildren"
      ],
      "line": 65,
      "id": "adactin-application-login-scenarios.;user-should--verify-whether-the-check-out-date-field-accepts-a-later-date-than-checkin-date.;;1"
    },
    {
      "cells": [
        "Sydney",
        "Hotel Creek",
        "Standard",
        "2",
        "02/06/2019",
        "03/06/2019",
        "1",
        "1"
      ],
      "line": 66,
      "id": "adactin-application-login-scenarios.;user-should--verify-whether-the-check-out-date-field-accepts-a-later-date-than-checkin-date.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "User should login with valid credentials.",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User Should Launch the browser.",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter email Address \"\u003cusername\u003e\".",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enter password \"\u003cpassword\u003e\".",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user click login.",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user check the name is valid or not.",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefinition.user_Should_Launch_the_browser()"
});
formatter.result({
  "duration": 374807013,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cusername\u003e",
      "offset": 26
    }
  ],
  "location": "AdactinStepDefinition.user_enter_email_Address(String)"
});
formatter.result({
  "duration": 168559274,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cpassword\u003e",
      "offset": 21
    }
  ],
  "location": "AdactinStepDefinition.user_enter_password(String)"
});
formatter.result({
  "duration": 171812605,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_click_login()"
});
formatter.result({
  "duration": 774696869,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_check_the_name_is_valid_or_not()"
});
formatter.result({
  "duration": 44537644,
  "status": "passed"
});
formatter.scenario({
  "line": 66,
  "name": "User Should  verify whether the check-out date field accepts a later date than checkin date.",
  "description": "",
  "id": "adactin-application-login-scenarios.;user-should--verify-whether-the-check-out-date-field-accepts-a-later-date-than-checkin-date.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 43,
      "name": "@test3"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "User should select location \"Sydney\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "user shouls select hotel \"Hotel Creek\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "user should select room type \"Standard\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "user select no.of rooms \"2\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "user enter check in date as today afetr seven days \"02/06/2019\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "user enter check out date as today after five days \"03/06/2019\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "user should select noOfAdults \"1\".",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "user should select noOfChildren \"1\"",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "user should click the search button",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "user Select the hotel",
  "keyword": "When "
});
formatter.step({
  "line": 55,
  "name": "click on continue button.",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "Check the details",
  "keyword": "When "
});
formatter.step({
  "line": 57,
  "name": "click on logout",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "verify we have been logged out of the application",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "user check no of rooms should be displayed and match with number of rooms in search hotel page",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Sydney",
      "offset": 29
    }
  ],
  "location": "AdactinStepDefinition.user_should_select_location(String)"
});
formatter.result({
  "duration": 157994542,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Creek",
      "offset": 26
    }
  ],
  "location": "AdactinStepDefinition.user_shouls_select_hotel(String)"
});
formatter.result({
  "duration": 141719592,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Standard",
      "offset": 30
    }
  ],
  "location": "AdactinStepDefinition.user_should_select_room_type(String)"
});
formatter.result({
  "duration": 131820142,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 25
    }
  ],
  "location": "AdactinStepDefinition.user_select_no_of_rooms(String)"
});
formatter.result({
  "duration": 138372631,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "02/06/2019",
      "offset": 52
    }
  ],
  "location": "AdactinStepDefinition.user_enter_check_in_date_as_today_afetr_seven_days(String)"
});
formatter.result({
  "duration": 274382400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "03/06/2019",
      "offset": 52
    }
  ],
  "location": "AdactinStepDefinition.user_enter_check_out_date_as_today_after_five_days(String)"
});
formatter.result({
  "duration": 224187477,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 31
    }
  ],
  "location": "AdactinStepDefinition.user_should_select_noOfAdults(String)"
});
formatter.result({
  "duration": 97553305,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 33
    }
  ],
  "location": "AdactinStepDefinition.user_should_select_noOfChildren(String)"
});
formatter.result({
  "duration": 153745261,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_should_click_the_search_button()"
});
formatter.result({
  "duration": 945570808,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_Select_the_hotel()"
});
formatter.result({
  "duration": 141325715,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.click_on_continue_button()"
});
formatter.result({
  "duration": 831854355,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.check_the_details()"
});
formatter.result({
  "duration": 1471552022,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.click_on_logout()"
});
formatter.result({
  "duration": 6445733574,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.verify_we_have_been_logged_out_of_the_application()"
});
formatter.result({
  "duration": 47100012,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_check_no_of_rooms_should_be_displayed_and_match_with_number_of_rooms_in_search_hotel_page()"
});
formatter.result({
  "duration": 14222,
  "status": "passed"
});
});