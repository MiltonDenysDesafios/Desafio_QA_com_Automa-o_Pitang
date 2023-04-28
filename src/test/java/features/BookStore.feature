#Author: Milton Denys

@BookStore
Feature: Book Store

  @RegisterToBookStore
  Scenario: Register to Book Store

    Given I access register to book store page
    When I fill the fields First Name "John", LastName "Doe", UserName "johndoe123" and Password "P@ssw0rd123"
    And I click on register button
    #captcha

  @ValidateIfUserWasCreated
  Scenario: Validate if user was created

    Given I access login to book store page
    When I fill the fields UserName "johndoe123" and Password "P@ssw0rd123"
    And I click on login button
    Then I validate if user name "JohnDoe123" is correct

  @AddToCollection
  Scenario: Add a book to collection

    Given I access login to book store page
    When I fill the fields UserName "johndoe123" and Password "P@ssw0rd123"
    And I click on login button
    Then I validate if user name "JohnDoe123" is correct
    Given I search a book "JavaScript"
    When I select a book that is in the list "Learning JavaScript Design Patterns"
    Then I validate if informations page for "Learning JavaScript Design Patterns" book is correct
    When I click on Add To Your Collection button
    Then I validate if message "Book added to your collection." is displayed in a pop up



