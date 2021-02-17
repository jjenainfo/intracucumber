Feature: Login

Scenario: Successful login with valid credential
   Given lunch chrome Browser
    When url provided is "http://intrauat.dtdc.co.in/"
     And User enters username "C22642" and Password "Jan@2021"
     And Click submit button
    Then login successful to intrapage
     And close popup
    When clicked on logout
    Then close Browser
     
     
