# Automaton-v13
Automation testing framework - an example. Based on Java, Junit, Cucumber

[![GitHub](https://img.shields.io/github/license/mashape/apistatus.svg)](https://github.com/BurhanH/automaton-v13/blob/master/LICENSE)
![Java CI](https://github.com/BurhanH/automaton-v13/workflows/Java%20CI/badge.svg?branch=master)


## Requirements
JDK 12, Junit 4.12, Cucumber 4.2.6, <br>
Maven (software project management) <br>

## Project structure
```text
-- automaton-v13
   |-- .gitignore
   |-- .travis.yml
   `-- .github
       `-- workflows
          |-- maven.yml
   |-- LICENSE
   |-- pom.xml
   |-- README.md
   `-- src
       `-- test
           `-- java
               `-- hellocucumber
                  |-- RunCucumberTest.java
                  |-- Stepdefs.java
           `-- resources
               `-- hellocucumber
                  |-- is_it_friday_yet.feature
```

## Screenshots

![alt text](/screenshots/cucumber_actions_1.png "Results for Actions") <br>

![alt text](/screenshots/cucumber_actions_2.png "Results for Actions") <br>
