Feature: Loging test of newtours web
      This is to test the newtours login page functionality
  with different credentials
  
  Scennario: Login Succes with user name a and password a
  Given: I am in newtours home page "http://newtours.demoaut.com/"
  When I insert user name ="a" and password ="a"
  And I press Login button
  Then I should get login success and "SIGN-OFF" link
      should be seen on top menu
  
  Scennario Outline: Login with different user name abc and password def
  Given: I am in newtours home page "http://newtours.demoaut.com/"
  When I insert user name =<username> and password =<password>
  And I press Login button
  Then <link> link should be seen on top menu
  
  
  |username|password|link|
  |a|5|SIGN-OFF|
  |b|b|SIGN-OFF|
  |abc|def|SIGN-ONF|
  |link|7|SIGN-ON|
