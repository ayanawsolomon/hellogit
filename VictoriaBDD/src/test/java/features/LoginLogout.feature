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
Feature: Testimg Travel Portal Login Logout

@tag1
Scenario: Check login with correct credentials
Given I am in new tours website "http://newtours.demoaut.com/"
When I insert user name ="b" and password ="b" 
And press "sign in" button
Then "SIGN-OFF" link should be displayed

Scenario: Check login with correct credentials
Given I am in new tours website "http://newtours.demoaut.com/"
When I insert user name ="c" and password ="c" 
And press "sign in" button
Then "SIGN-OFF" link should be displayed

