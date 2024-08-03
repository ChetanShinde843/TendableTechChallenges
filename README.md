Tendable Challenge Test Automation
This repository contains test automation scripts for testing the Tendable website using Selenium WebDriver and TestNG.
Prerequisites
•	Java Development Kit (JDK) installed
•	Maven installed
•	Google Chrome browser installed
•	ChromeDriver executable in system PATH
Setup
1.	Clone the repository
git clone <repository_url>
cd <repository_directory>
Running Tests
Test Cases
1.	verifyToplevelMenu: This test verifies the navigation through the top-level menu items on the Tendable website.
2.	verifyRequestDemo: This test verifies the availability of the "Request A Demo" button on various pages.
3.	verifyErrorMessage: This test verifies that an error message is displayed when a required field is left empty in the Contact Us form.
Running Tests Using TestNG
You can run the test cases using TestNG. Ensure that you have the TestNG plugin installed in your IDE.
Run Specific Test Case
To run a specific test case, uncomment the @Test annotation for the desired test case in the TendablechallengeTest class.
Example
@Test(priority=1)
public void verifyToplevelMenu() {
}
Run All Test Cases
To run all test cases, you can use the testng.xml configuration file.
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
<suite name="Tendable Test Suite">
    <test name="Tendable Tests">
        <classes>
            <class name="testcases.TendablechallengeTest"/>
        </classes>
    </test>
</suite>
Test Execution
TestNG Configuration
The TendablechallengeTest class contains the following test cases:
•	verifyToplevelMenu(): Verifies navigation through the top-level menu items.
•	verifyRequestDemo(): Verifies the availability of the "Request A Demo" button on various pages.
•	verifyErrorMessage(): Verifies that an error message is displayed when a required field is left empty in the Contact Us form.

