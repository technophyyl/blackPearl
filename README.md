# blackPearl
Spring Boot Application Readme
Project Overview
This Spring Boot application is designed to provide a simple and user-friendly interface for users to perform basic actions, such as opening a browser, logging in with valid credentials, and validating the logged-in user after waiting for the page to load. Additionally, the application utilizes a local database to store and retrieve data, ensuring smooth functionality.

Features
1. Open a Browser
The application includes a feature that allows users to open a web browser directly within the application. This enables seamless interaction with web-based content and services.

2. Login with Valid User Name and Password
Users can log in to the application using their valid credentials. The login functionality is secure and ensures that only authorized users can access the application's features.

3. Validate Logged-in User After Waiting for Page to Load
Upon successful login, the application intelligently waits for the page to load before validating the logged-in user. This ensures that the user's data and session are properly initialized before proceeding with any actions.

4. Local Database Integration
The application is equipped with a local database to store and retrieve data. This feature enables the seamless functioning of the application, ensuring that user data is persistent across sessions.

Getting Started
Follow these steps to set up and run the Spring Boot application:

Clone the Repository:

bash
Copy code
git clone https://github.com/your-username/spring-boot-application.git
Navigate to the Project Directory:

bash
Copy code
cd spring-boot-application
Build the Project:

bash
Copy code
./mvnw clean install
Run the Application:

bash
Copy code
./mvnw spring-boot:run
Access the Application:
Open your preferred web browser and navigate to http://localhost:8085.

Configuration
The application can be configured via the application.properties file located in the src/main/resources directory. Customize settings such as database connection details, server port, and other parameters as needed.

properties
Copy code
# Database Configuration
spring.datasource.url=jdbc:postgresql://localhost:5433/QA
spring.datasource.username=postgres
spring.datasource.password=admin
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQL9Dialect
spring.jpa.show-sql=false
spring.jpa.hibernate.ddl-auto=none
spring.jpa.properties.hibernate.implicit_naming_strategy=org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy
spring.jpa.properties.hibernate.physical_naming_strategy=org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy

# Server Configuration
server.port=8085

# Other Configurations...
Dependencies
This project utilizes the following key dependencies:

Spring Boot
H2 Database
Thymeleaf (or any other preferred templating engine)
Refer to the pom.xml file for a comprehensive list of dependencies.
