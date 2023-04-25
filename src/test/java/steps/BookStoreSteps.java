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
}
