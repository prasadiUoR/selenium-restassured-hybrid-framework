# Selenium Restassured Hybrid Framework

## 📌 Project Overview

This project is an end-to-end automation framework developed for the ParaBank demo banking application with

 👉 UI ref  : https://parabank.parasoft.com/parabank/login.htm
 👉 API ref : https://parabank.parasoft.com/parabank/api-docs/index.html

It is built using **Java**, **Selenium WebDriver**, **RestAssured**, **TestNG**, **Maven**, **Page Object Models**, and **Extent Reports**.

This framework demonstrates enterprise-style hybrid testing practices including request/response specifications, test data management, reporting, and CI/CD integration.

---

## 🎯Key Features
- [x] UI Automation Testing
- [x] API Automation Testing
- [x] Hybrid UI + API Validation
- [x] Page Object Model (POM)
- [x] Dynamic Test Data Generation using Faker
- [x] Logging with Log4j
- [x] HTML Reporting with Extent Reports
- [x] Maven-based build system
- [x] CI Ready

---
## 🚀 Tech Stack
- Java
- Selenium WebDriver
- RestAssured
- TestNG
- Maven
- Faker
- Log4j
- Extent Report
- Git / GitHub Actions

---
## 📁 Repository Structure

```
hybridAutomation/
│
|   mvnw
|   mvnw.cmd
|   pom.xml
|   structure.txt
|   testngAPI.xml
|   testngHybrid.xml
|   testngUI.xml
|   
+---.mvn
|   \---wrapper
|           maven-wrapper.properties
|           
+---reports
|       Test-Report-2026.06.11.13.36.31.html       
|       
+---src
|   +---main
|   |   +---java
|   |   |   +---api
|   |   |   |   +---base
|   |   |   |   |       BaseAPI.java
|   |   |   |   |       
|   |   |   |   +---models
|   |   |   |   |       Customer.java
|   |   |   |   |       
|   |   |   |   +---service
|   |   |   |   |       CustomerService.java
|   |   |   |   |       
|   |   |   |   \---specs
|   |   |   |           RequestSpecs.java
|   |   |   |           ResponseSpecs.java
|   |   |   |           
|   |   |   +---ui
|   |   |   |   +---base
|   |   |   |   |       BaseUI.java
|   |   |   |   |       
|   |   |   |   \---pages
|   |   |   |           AccountOverview.java
|   |   |   |           BasePage.java
|   |   |   |           CustomerHomePage.java
|   |   |   |           LoginPage.java
|   |   |   |           RegisterPage.java
|   |   |   |           
|   |   |   \---utils
|   |   |           ConfigReader.java
|   |   |           FakerUtil.java
|   |   |           
|   |   \---resources
|   |           config.properties
|   |           
|   \---test
|       +---java
|       |   +---api
|       |   |       LoginAPITest.java
|       |   |       
|       |   +---base
|       |   |       BaseAPITest.java
|       |   |       BaseHybridTest.java
|       |   |       BaseUITest.java
|       |   |       
|       |   +---hybrid
|       |   |       CustomerRegistrationHybridTest.java
|       |   |       
|       |   +---ui
|       |   |       CustomerRegistrationTest.java
|       |   |       LoginTest.java
|       |   |       
|       |   \---utils
|       |           ExtentReportManager.java
|       |           
|       \---resources
|               log4j2.xml
              

```
---
## ⚙️ Getting Started

1.Clone the project
```
git clone https://github.com/prasadiUoR/selenium-restassured-hybrid-framework.git
```
2.Go to the project directory
```
cd hybridAutomation
```
3.Install Dependencies
```
mvn clean install
```
4.Run tests
```
mvn test
```
5.Run TestNG suite
```
mvn test -DsuiteXmlFile=testngHybrid.xml
```
---
## GitHub Actions

Tests are automatically executed on:

- Push to main branch

CI/CD Status:  
[![Java CI with Maven](https://github.com/prasadiUoR/selenium-restassured-hybrid-framework/actions/workflows/maven.yml/badge.svg)](https://github.com/prasadiUoR/selenium-restassured-hybrid-framework/actions/workflows/maven.yml)

---
## Project Results
- Test Execution Screenshot
  
  ![Test Execution](restAssuredAutomation/screenshots/test-execution.png)
- Extent Report Screenshot
  
  ![Test Execution](restAssuredAutomation/screenshots/test-execution-report.png)


---  
## Future Enhancements

The framework is actively being enhanced. Planned additions include:
- Account Management Module
- Fund Transfer Module
- Loan Processing Module
- Framework enhancements with data-driven testing and parallel execution
