#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: LogInPageFunctionality
 

  @tag1
  Scenario: user should be able to lopgin with valid credential
    Given user should be on login page
    When enter username "Admin"
    And eneter password "admin123"
    And click on login button
    Then user is on homepage
   

   @tag2
  Scenario Outline: user should not be able to login with invalid credentials
     Given user should be on login page
    When enter username<username>
    And eneter password<password>
    And click on login button
    Then user is on loginpage
   
   Examples:
   |username| password|
   |amin		| admin456|
   |amnner	| adm789	|
   |admmiinn|	admi9876|
   |admin11	|	admin777|
   |admin00	|	admin7654|
   

