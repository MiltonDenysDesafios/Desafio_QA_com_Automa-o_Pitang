# Pitang QA Automation Challenge

This project is a solution for the QA Automation Challenge proposed by Pitang. The challenge consists of automating the testing of a web application.
# Description:

[BookStore.feature](https://github.com/MiltonDenysDesafios/Desafio_QA_com_Automa-o_Pitang/tree/master/src/test/java/features)

This project contains automated tests for the Book Store feature of a website. The tests were created using the Selenium WebDriver framework in conjunction with Java and cucumber framework.


# Technologies

- Cucumber: Acceptance testing framework (BDD) that uses Gherkin language to write test scenarios in natural language.
- Selenium WebDriver: UI automated testing library for web that allows interacting with webpage elements and automating tasks on browsers.
- JUnit: Unit testing framework for Java.

# Environment Setup

Install java development environment
- Windows- https://vinayrajsingh.medium.com/how-to-setup-java-development-environment-on-windows-ba4b46c0eebc
- Mac- https://medium.com/macoclock/setting-up-your-macbook-for-java-development-102-f50cbaa18350

Install Maven environment
- Win/Mac/Linux- https://www.baeldung.com/install-maven-on-windows-linux-mac

# Run by IDE locally using Runner class:

- Open the project in your IDE of choice.
- Navigate to the 'Runners' package.
- Open the 'Runner' class.
- Set an specific tag on IncludeTags if you want to for example:   tags = "@RegisterToBookStore"
- Right-click on the class and select 'Run'.
- The automation suite should start executing, and the test results will be displayed in the IDE console.

# Chromedriver and Geckodriver versions

- Chromedriver version: 112.0.2615.19
- Geckodriver version: 0.33.0
- 
The system allows running tests on two different browsers: Google Chrome and Mozilla Firefox. To select the browser of your preference, use the following code:

```java
// Define the default browser as Chrome
public static Browsers browser = Browsers.CHROME;

// Enum to define the available browsers
public enum Browsers {
CHROME,
FIREFOX
}


