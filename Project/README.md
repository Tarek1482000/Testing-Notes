# Project Name: Swinji Test Automation(GUI + API + Answers To Questions)
## Overview
The Swinji Test Automation project aims to automate the testing of the website Swinji. The project includes both GUI and API tests, implemented using Data-Driven Testing (DDT) and the Page Object Model (POM) design pattern.

## Project Structure:
- src/main/java/: Contains the main source code of the project.
  * pages: Page Object Model (POM) classes representing web pages.
  * utils: Utility classes for various functionalities.
- src/test/java/: Contains the test code for the project.
  * api/tests: API test scripts.
  * gui/tests: GUI test scripts.
- src/test/java/resources: Contains test data

### Dependencies:
- Java
- Maven
- Selenium WebDriver
- JUnit
- RestAssured (for API testing)
- Cucumber (for BDD-style testing)

### Setup Instructions:
- Clone the repository to your local machine using git clone.
- Ensure that Java and Maven are installed on your machine.
- Import the project into your favorite IDE (Eclipse, IntelliJ IDEA, etc.).
- Install the necessary dependencies using Maven by running mvn clean install in the project directory.

## Answers To Questions:
-   What are the different types of locators in Selenium?
    * ID: Locating elements by their unique ID attribute.
    * Name: Locating elements by their name attribute.
    * Class Name: Locating elements by their class attribute.
    * Tag Name: Locating elements by their HTML tag name
    * XPath:
    * CSS Selectors: allows you to target elements based on their CSS attributes, such as class, ID, or attributes.
    * Link Text: Locating anchor elements (<a><a/> tags) by the visible text within the anchor tag.
    * Partial Link Text: Locating anchor elements by a partial match of their visible text.
-   What are the different types of Drivers available in WebDriver?
    * FirefoxDriver: This driver is used to automate the Mozilla Firefox browser.
    * ChromeDriver: ChromeDriver is used to automate the Google Chrome browser.
    * InternetExplorerDriver: InternetExplorerDriver is used to automate the Internet Explorer browse
    * EdgeDriver: EdgeDriver is used to automate the Microsoft Edge browser.
    * SafariDriver: SafariDriver is used to automate the Safari browser on macOS.
    * OperaDriver: OperaDriver is used to automate the Opera browser.
    * HtmlUnitDriver: HtmlUnitDriver is a headless browser implementation that simulates the behavior of a browser without rendering the UI
    * RemoteWebDriver: RemoteWebDriver allows you to execute tests on remote machines or Selenium Grid
-   What are the different types of waits available in WebDriver?
    In Selenium WebDriver, there are three main types of waits available:
    * Implicit Waits: Implicit waits instruct WebDriver to wait for a certain amount of time before throwing an exception if an element is not immediately present. It is applied globally, meaning it affects all subsequent WebDriver commands. It's useful for scenarios where elements may take varying amounts of time to load. Implicit waits can be set using the implicitlyWait() method.
    * Explicit Waits: Explicit waits tell WebDriver to wait for a certain condition to occur before proceeding with the execution. It allows waiting for specific conditions on certain elements with more precision than implicit waits. Explicit waits are applied to specific elements or conditions using the WebDriverWait class. WebDriverWait is used in conjunction with ExpectedConditions to define the conditions to wait for, such as element visibility, element presence, element click ability, etc.
    * Fluent Wait: FluentWait is an extension of WebDriverWait that provides more flexible and customized wait conditions. It allows defining the polling interval, maximum wait time, and exceptions to ignore during the wait. FluentWait is useful when dealing with dynamic web elements or situations where explicit waits alone may not be sufficient.

- What is the difference between driver.quite() and driver.close()?
    * driver.quit() is used to close all browser windows and terminate the WebDriver session completely
    * driver.close() is used to close the current browser window or tab that the WebDriver is currently controlling


   