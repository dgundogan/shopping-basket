# 'Shopping Basket' Service
`shopping-basket` is a standalone java application.

## Implementation

Following tech spec is used for the TDD based implementation.

- *Java*
- *maven*
- *JUnit*

The project is organized as a *maven* project and in order to compile, test and create a package *maven* is used.

### Building the application

You could use maven to test and build the jar file.

* In the root directory of the project run the following commands

```bash
# Compile
mvn -B clean compile

#Test
mvn -B clean test


#Create the package
mvn -B clean package

```


### Running the application

* Start the application with the following command:

```bash

#Under the root folder of the project

java -jar target/shopping-basket-1.0-SNAPSHOT.jar

```