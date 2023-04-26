package steps;

import io.cucumber.java.en.Given;
import pages.BookStorePage;

public class BookStoreSteps {

    @Given("I access register to book store page")
    public void accessRegisterToBookStorePage() {
        BookStorePage.accessLoginPage();
    }
    @Given("I access login to book store page")
    public void accessLoginToBookStorePage() {
        BookStorePage.clickLoginButton();
    }
    @Given("I click on register button")
    public void clickRegisterButton() {
        BookStorePage.clickRegisterButton();
    }
    @Given("I click on login button")
    public void clickLoginButton() {
        BookStorePage.clickLoginButton();
    }
    @Given("I click on Add To Your Collection button")
    public void clickAddToYourColletctionButton() {
        BookStorePage.clickAddToYourColletctionButton();
    }
    @Given("I fill the fields First Name {string}, LastName {string}, UserName {string} and Password {string}")
    public void fillRegisterToBookFields(String firstName,String lastName,String userName,String password) {
        BookStorePage.fillRegisterToBookFields(firstName,lastName,userName,password);
    }
    @Given("I fill the fields UserName {string} and Password {string}")
    public void fillLoginToBookFields(String userName,String password) {
        BookStorePage.fillLoginToBookFields(userName,password);
    }
    @Given("I validate if user name {string} is correct")
    public void validateIfUserNameIsCorrect(String userName) {
        BookStorePage.validateIfUserNameIsCorrect(userName);
    }
    @Given("I search a book {string}")
    public void searchBox(String book) {
        BookStorePage.searchBox(book);
    }
    @Given("I select a book that is in the list {string}")
    public void selectBookInList(String book) {
        BookStorePage.selectBookInList(book);
    }
    @Given("I validate if informations page for {string} book is correct")
    public void validateBookInformationsPage(String book) {
        BookStorePage.validateBookInformationsPage(book);
    }
    @Given("I validate if message {string} is displayed in a pop up")
    public void validatePopUpMessage(String message) {
        BookStorePage.validatePopUpMessage(message);
    }
}
