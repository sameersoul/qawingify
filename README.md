
# Wingify Demo Project 🚀

Welcome to the Wingify Demo Project! This repository contains automation tests for a web application with a login page and a home page featuring a transactions table. The tests are written using Selenium WebDriver and TestNG.

## 📋 Table of Contents

- [Project Overview](#project-overview)
- [Technology Stack](#technology-stack)
- [Installation](#installation)
- [Running Tests](#running-tests)
- [Test Structure](#test-structure)
- [Contributing](#contributing)
- [License](#license)

## 📜 Project Overview

This project automates the testing of two main functionalities of the web application:
1. **Login Page**: Verifies login functionality with both valid and invalid credentials.
2. **Home Page**: Checks if the transaction amounts are sorted correctly when the 'AMOUNT' header is clicked.

## 🛠 Technology Stack

- **Programming Language**: Java ☕
- **Testing Framework**: TestNG 🧪
- **Automation Tool**: Selenium WebDriver 🌐
- **Build Tool**: Maven 🛠️
- **Browser Driver Management**: WebDriverManager 🚗

## 📦 Installation

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/wingify-demo-project.git
    cd wingify-demo-project
    ```

2. **Setup the project**:
    - Ensure you have JDK 8 or higher installed.
    - Install Maven if not already installed.
    - Use the following command to resolve dependencies:
      ```bash
      mvn clean install
      ```

## ▶️ Running Tests

To run the tests, you have several options:

1. **Using Maven**:
    ```bash
    mvn test
    ```

2. **Using TestNG XML Suite**:
    - You can execute the `testng.xml` directly from your IDE.

## 🗂 Test Structure

The project follows the Page Object Model (POM) design pattern for better maintainability and readability.

- **Pages**: Contains classes that represent web pages.
    - `loginPage.java`: Handles login page interactions.
    - `homePage.java`: Handles home page interactions.

- **Tests**: Contains test classes.
    - `LoginTest.java`: Contains tests for login functionality.
    - `HomePageTest.java`: Contains tests for home page functionality.

- **Utilities**: Contains utility classes and methods used across the tests.

## 🤝 Contributing

Contributions are welcome! If you'd like to contribute, please follow these steps:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -m 'Add some feature'`).
5. Push to the branch (`git push origin feature-branch`).
6. Create a new Pull Request.

## 📄 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

