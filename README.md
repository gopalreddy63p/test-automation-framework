# test-automation-framework

Maven-based Selenium + TestNG sample automation framework.

## Tech stack

- Java 11+
- Maven
- Selenium WebDriver
- TestNG

## Project structure

```text
test-automation-framework-github/
├── pom.xml
├── README.md
└── src/
	└── test/
		├── java/
		│   └── com/gopalreddypatlolla/automation/
		│       ├── base/
		│       │   └── BaseUiTest.java
		│       └── tests/
		│           └── SampleUiTests.java
		└── resources/
			└── pages/
				└── sample-form.html
```

## Included sample test cases

`SampleUiTests` contains 5 TestNG test cases:

1. Verify the local sample page loads with the expected title and heading
2. Verify text can be entered into the name field
3. Verify the subscription checkbox can be selected
4. Verify a country can be selected from the dropdown
5. Verify clicking submit shows the confirmation message

## Prerequisites

- Java 11 or later
- Maven 3.8+
- Google Chrome installed locally

Selenium 4 uses Selenium Manager to resolve the driver automatically. The suite is configured to run Chrome in headless mode by default.

## Run the tests

```powershell
mvn test
```

To force headed execution:

```powershell
mvn test -Dheadless=false
```

## Notes

- The sample tests open a local HTML page from `src/test/resources/pages/sample-form.html`, so they do not depend on an external website.
- If Chrome is unavailable in the environment, the sample UI tests are skipped rather than failing during driver setup.
