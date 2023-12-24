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

@Register @Two
Scenario: verify the user is not allowed to register on skipping  the mandatory fields
Given I launch the application
And I navigate to the account registration page
And I click on continue Button
Then I should see that user account is not created
And i should see the error messages informing the user to fill the mandatory fields


@Register @Three
Scenario: verify whether the user is able to register into the application by opting for Newsletter subscription
Given I launch the application
And I navigate to the account registration page
When I provide all the below valid details
|FirstName | Shajeb                     |
|lastname  | Faruqui                    |
|Email     | shajebfaruqui555@gmail.com |
|Telephone | 9716766718                 |
|Password  | Shajeb7860                 |
And I select the privacy policy
And I subscribe to Newsletter
And I click on continue Button
Then I should see that the user account has been created successfully

@Register @Four
Scenario: verify whether the user is restricted from creating a duplicate account
Given I launch the application
And I navigate to the account registration page
When I provide the below duplicate details
|FirstName | Shajeb                     |
|lastname  | Faruqui                    |
|Email     | shajebfaruqui555@gmail.com |
|Telephone | 9716766718                 |
|Password  | Shajeb7860                 |
And I select the privacy policy
And I click on continue Button
Then I should see that user is restricted from creating duplicate account