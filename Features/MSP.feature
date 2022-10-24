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
Feature: Adding and removing device from admin account

  @single
  Scenario: Adding device with valid Device Id
    Given User is in MSP portal
    When User click in Device Tab
    Then User will be in Device module
    And User enter the License No. in license field
    And User enter the Device ID in Device ID field
    And User click add device button
    Then A new device will be added with a successful message

  @multiple
  Scenario Outline: Adding device with Device Id
    Given User is in MSP portal
    When User click in Device Tab
    Then User will be in Device module
    And User enter the License No. in license field
    And User enter the <Device ID> in Device ID field
    And User click Add Device button
    Then A new device will be added with a successful message

    Examples: 
      |  Device ID   |
      | DIN123456  |
      | DIN12 3456 |
