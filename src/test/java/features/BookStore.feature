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
    And I search a book "JavaScript"
    #fazer uma lista para escolher um livro especifico
  #capturar a proxima tela com os dados do livro
  #Como validação de sucesso, registre a captura de tela exibindo a
  #mensagem de sucesso “Book added to your collection.”
