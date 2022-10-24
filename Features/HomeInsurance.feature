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
  # @tag2
  # Scenario Outline: Title of your scenario outline
  # Given I want to write a step with <name>
  #  When I check for the <value> in step
  #  Then I verify the <status> in step

   # Examples: 
   #  | name  | value | status  |
   #  | name1 |     5 | success |
   #  | name2 |     7 | Fail    |

Feature: validating home insurance
  @home @singleData
  Scenario: home insurance validation
    Given user in the home page
    When selecting 'Homeowners' from product dropdown
    And Entering '11418' in zip code
    And click start qoute button
    And User enters all personal info 
    Then User will see the quote


  @home @multiData
  Scenario Outline: validation with scenario outline
    Given user in the home page
    When selecting <insuranceType> from product dropdown
    And Entering <zip> in zip code
    And click start qoute button
    And User enters all personal info 
    Then User will see the quote
    
 Examples: 
  |zip       |insuranceType|
  |'11217'|'Auto'|
  |'11218'|'Homeowners'|







