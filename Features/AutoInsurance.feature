Feature: Validating auto insurance feature

@auto @singleData
Scenario: Validating Auto Insurance Feature
Given user click the cookies cancel
When user select 'Auto' in the prodactDropDown
And user input '11219' into the zipCode field
Then user click startQoute button
When user enters their personal info 
Then user will navigate to vehicle page


@auto @MultiData
Scenario Outline: Validating Auto Insurance with MultiData
Given user click the cookies cancel
When user select 'Auto' in the prodactDropDown
And user input '11219' into the zipCode field
Then user click startQoute button
When user enters their personal info 
Then user will navigate to vehicle page

Examples:
|zip     |
|'11219'|
|'11418'|
 





