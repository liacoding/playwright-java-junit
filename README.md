<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
    </li>
  </ol>
</details>


<!-- ABOUT THE PROJECT -->
## About The Project

This project showcases a robust and scalable testing framework leveraging Playwright with Java and JUnit. Designed for modern web application testing, it encompasses several best practices and architectural patterns to ensure maintainability, reusability, and efficiency.

1) Key Features:
Playwright Integration:
Utilizes Playwright, a powerful automation library, for cross-browser testing and interaction with web applications.
Supports testing on modern web browsers, including Chromium, Firefox, and Msedge, ensuring comprehensive browser compatibility.

2) Java and JUnit:
Written in Java, providing a versatile and widely-used programming environment.
Employs JUnit for structuring and running tests, offering a familiar and robust testing framework for Java developers.

3) Singleton Driver Implementation:
The WebDriver instance is managed as a Singleton, ensuring a single instance is used throughout the test execution.
This design pattern reduces resource consumption and avoids issues related to multiple driver instances, enhancing the stability and efficiency of test runs.

4) Page Object Model (POM):
Implements the Page Object Model to encapsulate the behavior and elements of web pages in dedicated classes.
Promotes clean separation of test logic and UI interaction, facilitating easier maintenance and updates to the test suite.

5) Configuration Properties:
Uses configuration files for managing test settings, such as URLs, browser types, and environment-specific variables.
Enables flexibility and ease of modification without altering the code, supporting different testing environments and scenarios.

6) Utilities and Helpers:
A collection of utility classes and helper methods streamline common tasks like waiting for elements, taking screenshots, and handling test data.
Enhances code reuse and reduces boilerplate code, allowing testers to focus on writing meaningful test cases.


### Built With
- <img src="https://img.shields.io/badge/Playwright-45ba4b?style=for-the-badge&logo=Playwright&logoColor=white" />
- <img src="https://img.shields.io/badge/Java-f89820?style=for-the-badge&logo=java&logoColor=white" alt="Java Badge" />
- <img src="https://img.shields.io/badge/Junit5-25A162?style=for-the-badge&logo=junit5&logoColor=white" />



<!-- GETTING STARTED -->
## Getting Started

- Ensure you have the following installed on your machine: JDK, Maven, Git
- Clone the repository
- Install the dependencies with 'mvn clean install' command
- Update your configuration files in configuration.properties
