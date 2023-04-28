package pages;

import config.browser_factory.DriverFactory;
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
    public static String addToYourCollectionButton = "//button[contains(text(),'Add To Your Collection')]";

    public static void accessLoginPage(){
        try {
            click(By.cssSelector(loginButton));
            click(By.cssSelector(newUserButton));
        } catch (Exception e) {
            System.err.println("Error while I access register to book store page");
        }
    }
    public static void clickLoginButton(){
        try {
            click(By.cssSelector(loginButton));
        } catch (Exception e) {
            System.err.println("Error while I click on login button");
        }
    }
    public static void clickAddToYourColletctionButton(){
        try {
            click(By.xpath(addToYourCollectionButton));
        } catch (Exception e) {
            System.err.println("Error while I click on Add To Your Collection button");
        }
    }
    public static void searchBox(String book){
        try {
            write(By.cssSelector(searchBox),book);
            captureScreenshot(DriverFactory.getDriver(),"I search a book "+book+".png");
        } catch (Exception e) {
            System.err.println("Error while I search a book "+book+"");
        }
    }
    public static void selectBookInList(String book){
        try {
            click(By.xpath("//a[contains(text(),'" + book +"')]"));
        } catch (Exception e) {
            System.err.println("Error I select a book that is in the list " + book +"");
        }
    }
    public static void validateBookInformationsPage(String book){
        try {
            String bookNameReturn = getText(By.xpath("//*[text() = '"+book+"' and not(text()[0])]"));
            Assert.assertEquals(bookNameReturn,book);
            captureScreenshot(DriverFactory.getDriver(),"I validate if informations page for "+ book+" book is correct.png");

        } catch (Exception e) {
            System.err.println("Error while I validate if informations page for "+ book+ " book is correct");
        }
    }

    public static void fillRegisterToBookFields(String firstName,String lastName,String userName,String password){
        try {
            write(By.cssSelector(firstnameField),firstName);
            write(By.cssSelector(lastNameField),lastName);
            write(By.cssSelector(userNameField),userName);
            write(By.cssSelector(passwordField),password);
        } catch (Exception e) {
            System.err.println("Error while I fill the fields of Register to Book page");
        }
    }
    public static void fillLoginToBookFields(String userName,String password){
        try {
            write(By.cssSelector(userNameField),userName);
            write(By.cssSelector(passwordField),password);
        } catch (Exception e) {
            System.err.println("Error while I fill the login fields");
        }
    }
    public static void clickRegisterButton(){
        try {
            click(By.cssSelector(recaptchaButton));
            click(By.cssSelector(registerButton));
            System.out.println("teste");
        } catch (Exception e) {
            System.err.println("Error while I click on register button");
        }
    }
    public static void validateIfUserNameIsCorrect(String userName){
        try {
            String userNameTextReturn = getText(By.cssSelector(userNameValue));
            Assert.assertEquals(userNameTextReturn,userName);
            captureScreenshot(DriverFactory.getDriver(),"I validate if user name "+userName+" is correct.png");
        } catch (Exception e) {
            System.err.println("Error while I validate if user name "+userName+" is correct");

        }
    }
    public static void validatePopUpMessage(String message){
        try {
            switchToIFrame(("//iframe[starts-with(@id, 'aswift_0')]"));

            String messagePopUp = getText(By.cssSelector("google_ads_iframe_/21849154601,22343295815/Ad.Plus-728x90_0"));
            System.out.println();
            //Assert.assertEquals(userNameTextReturn,userName);
        } catch (Exception e) {
            System.err.println("Error while validateIfUserNameIsCorrect");

        }
    }
}
