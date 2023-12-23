Feature: Registration functionality scenarios

@Register @One
Scenario: verify whether the user is able to register into the application by providing all the details
Given I launch the application
And I navigate to the account registration page
When I provide all the below valid details
|FirstName | Shajeb                     |
|lastname  | Faruqui                    |
|Email     | shajebfaruqui555@gmail.com |
|Telephone | 9716766718                 |
|Password  | Shajeb7860                 |
And I select the privacy policy
And I click on continue Button
Then I should see that the user account has been created successfully