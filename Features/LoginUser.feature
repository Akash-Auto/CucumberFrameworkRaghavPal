 Feature: LoginUser

Scenario: Successful Login with Valid Credentials 
	Given User Launch Chrome browser 
	When User opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F" 
	And User enters Email as "admin@yourstore.com" and Password as "admin"
	And Click on Login 
	Then Page Title should be "Dashboard / nopCommerce administration" 
	When User click on Log out link 
	Then Page Title should be "Your store. Login" 
	And close browser

	
	#  Dashboard / nopCommerce administration
	#And click on remember me