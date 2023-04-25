package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class BookStorePage extends BasePage{
    public static String loginButton = "#login";
    public static String newUserButton = "#newUser";
    public static String firstnameField = "#firstname";
    public static String lastNameField = "#lastname";
    public static String userNameField = "#userName";
    public static String passwordField = "#password";
    public static String registerButton = "#register";
    public static String recaptchaButton = "#recaptcha-anchor";
    public static String userNameValue = "#userName-value";
    public static String searchBox = "#searchBox";

    public static void accessLoginPage(){
        try {
            click(By.cssSelector(loginButton));
            click(By.cssSelector(newUserButton));
        } catch (Exception e) {
            System.err.println("Error while accessing LoginPage");
        }
    }
    public static void clickLoginButton(){
        try {
            click(By.cssSelector(loginButton));
        } catch (Exception e) {
            System.err.println("Error while accessing clickLoginButton");
        }
    }
    public static void searchBox(String book){
        try {
            write(By.cssSelector(searchBox),book);
        } catch (Exception e) {
            System.err.println("Error while accessing searchBox");
        }
    }

    public static void fillRegisterToBookFields(String firstName,String lastName,String userName,String password){
        try {
            write(By.cssSelector(firstnameField),firstName);
            write(By.cssSelector(lastNameField),lastName);
            write(By.cssSelector(userNameField),userName);
            write(By.cssSelector(passwordField),password);
        } catch (Exception e) {
            System.err.println("Error while fillRegisterToBookFields");
        }
    }
    public static void fillLoginToBookFields(String userName,String password){
        try {
            write(By.cssSelector(userNameField),userName);
            write(By.cssSelector(passwordField),password);
        } catch (Exception e) {
            System.err.println("Error while fillLoginToBookFields");
        }
    }
    public static void clickRegisterButton(){
        try {
            click(By.cssSelector(recaptchaButton));
            click(By.cssSelector(registerButton));
            System.out.println("teste");
        } catch (Exception e) {
            System.err.println("Error while clickRegisterButton");
        }
    }
    public static void validateIfUserNameIsCorrect(String userName){
        try {
            String userNameTextReturn = getText(By.cssSelector(userNameValue));
            Assert.assertEquals(userNameTextReturn,userName);
        } catch (Exception e) {
            System.err.println("Error while validateIfUserNameIsCorrect");

        }
    }
}
