# Appium Automation Framework

This project contains an automation framework built with Appium and Java for testing Android applications using the Page Object Model (POM).

## Prerequisites
- Download Node.js 
- Download NPM
- Download aAppium 
- **Java JDK 8 or higher**: [Download JDK](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)
- **Appium**: [Install Appium](https://appium.io/docs/en/about-appium/intro/)
- **Android Studio**: To run Android emulators or use a physical Android device.
- **Maven**: For managing dependencies and running tests.

## Steps to Set Up and Run the Project

1. **Install Prerequisites**:
    - Install Java, Appium, and Android Studio.
    - Ensure Android Emulator is running 

2. **Set Up the Project**:
    - Open the project in IntelliJ IDEA.
    - Ensure **Maven** is installed, and **dependencies** are correctly imported (IntelliJ will do this automatically).

3. **Start Appium Server**:
    - Open a terminal/command prompt and run:
      ```bash
      appium
      ```
    - This starts the Appium server, which listens for connections from the Android emulator/device.

4. **Run Tests**:
    - In IntelliJ, right-click the test class and select **Run**.
    - The tests will execute, and Appium will communicate with the Android device to perform the actions.

5. **Project Structure**:
    - **src/main/java/com/automation/pages**: Page Object classes for different screens of the app
    - **src/main/java/com/automation/tests**: Test classes to execute automated tests.
    - **pom.xml**: Maven dependencies and configuration.
    - **BaseTest.java**: Initializes Appium driver and manages setup/teardown for tests.

