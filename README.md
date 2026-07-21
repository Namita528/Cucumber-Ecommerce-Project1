
Overview

This repository contains a Selenium automation framework developed as a Phase-End Project for performing functional testing on a Java-based e-commerce web application. The project demonstrates the implementation of UI test automation using Selenium WebDriver, TestNG, and Cucumber within a Maven project, following industry-standard automation practices.

The application under test is deployed locally on an Apache HTTP Server and accessed through http://localhost:80/ecomm. The framework validates key functionalities such as page navigation, alerts, user interactions, and the checkout process using both TestNG and Behavior-Driven Development (BDD) with Cucumber.

Project Objective

To automate the functional testing of an e-commerce web application by validating core user workflows, including:

Home page navigation
Contact page validation
Alert handling
UI element interaction
Add to Cart functionality
Checkout process
Billing address submission
Order placement
Technologies Used
Java 8+
Selenium WebDriver
TestNG
Cucumber
JUnit
Maven
Apache HTTP Server
Page Object Model (POM)
Eclipse IDE
Git & GitHub
Framework Features
Selenium WebDriver-based UI Automation
TestNG Test Framework
Cucumber BDD Framework
JUnit Test Runner
Maven Build Management
Page Object Model (POM)
Cross-page reusable test methods
Browser setup using a Base Test class
Automated browser configuration and cleanup
Functional validation of UI components
TestNG Reports for execution results
Git version control
Test Scenario 1 – Selenium with TestNG

This module validates the Home page, Contact page, alerts, and UI interactions using Selenium and TestNG.

Automated Flow
Launch Chrome browser.
Maximize the browser window.
Open the e-commerce application.
Delete browser cookies.
Configure page load timeout.
Navigate to the Home page.
Perform mouse hover on the Pages menu.
Select the Contact option.
Handle and validate the alert popup.
Validate navigation and UI behavior.
Framework Implementation
Base Test class for browser initialization
Reusable OpenBrowser() method
Selenium WebDriver commands
TestNG annotations and execution
TestNG Report generation
Test Scenario 2 – Cucumber with JUnit

This module validates the checkout workflow using Behavior-Driven Development (BDD).

Automated Flow
Launch the application.
Navigate to the product page.
Click the Add to Cart button.
Proceed to Checkout.
Enter Billing Address details.
Click the Place Order button.
Validate successful execution of the checkout flow.
Framework Implementation
Feature File written using Gherkin syntax
Step Definition classes
JUnit Test Runner
Cucumber execution
Maven project configuration


Project Structure


ECommerce-Automation/
│
├── src
│   ├── main
│   │   └── java
│   │       ├── base
│   │       ├── pages
│   │       └── utilities
│   │
│   └── test
│       ├── java
│       │   ├── tests
│       │   ├── stepDefinitions
│       │   └── runners
│       │
│       └── resources
│           └── features
│
├── pom.xml
├── testng.xml
└── README.md
Application Setup
Clone the application repository:
git clone https://github.com/Simplilearn-Edu/ATE_PEP2_Testing_Using_TestNG.git
Deploy the application to the Apache HTTP Server:
/var/www/html
Launch the application at:
http://localhost:80/ecomm
Running the Tests
Execute TestNG Tests
mvn test

or execute the testng.xml suite from your IDE.

Execute Cucumber Tests

Run the JUnit Test Runner or execute:

mvn test
Expected Deliverables
Maven-based Selenium automation framework
Selenium WebDriver integration
TestNG-based functional testing
Cucumber BDD implementation
JUnit Test Runner
Page Object Model (POM) architecture
Automated browser setup using a Base Test class
Functional validation of Home, Contact, Add to Cart, and Checkout pages
TestNG execution reports
Maven-compatible project execution
Source code managed with Git and GitHub
Learning Outcomes

This project demonstrates how to build a maintainable and scalable UI automation framework by combining Selenium WebDriver with TestNG and Cucumber. It showcases best practices such as the Page Object Model, reusable test components, browser lifecycle management, BDD implementation, Maven dependency management, and automated functional testing of an e-commerce web application.
