# Ejemplos_junit4 by toteabe(IES Vega de Mijas - DAW)
# Las Lagunas (Mijas)


## Get started with Junit

* [Course Overview](#topics)
  - [Section 1 Foundation](#section-1-foundation)
  - [Section 2 First JUnit Example](#section-2-first-junit-example)
  - [Section 3 Second JUnit Example](#section-3-second-junit-example)
  - [Section 4 JUnit Simple Test Scenarios](#section-4-junit-simple-test-scenarios)
  - [Section 5 JUnit Intermediate Test Scenarios](#section-5-junit-intermediate-test-scenarios)
  - [Section 6 JUnit Best Practices](#section-6-junit-best-practices)
  - [Starting Examples](#starting-examples)
* [About in28Minutes](#about-in28minutes)
  - [Our Beliefs](#our-beliefs)
  - [Our Approach](#our-approach)
  - [Find Us](#useful-links)
  - [Other Courses](#other-courses)

## Topics
### Section 1 Foundation
- What is JUnit?
- Why Unit Testing?

### Section 2 First JUnit Example
@Test Annotation
- Running JUnit
- No Failure = Success
- Basic Assert methods

### Section 3 Second JUnit Example
- assertTrue and assertFalse methods
- @Before @After annotations
- @BeforeClass @AfterClass annotations

### Section 4 JUnit Simple Test Scenarios
- Comparing Arrays
- Testing Exceptions
- Performance Unit Tests

### Section 5 JUnit Intermediate Test Scenarios 
- Parameterized Tests
- Test Suites

### Section 6 JUnit Best Practices
- Naming Test Methods
- Highlight Important Values in Tests
- Handle Exceptions Properly
- Readable Assert Statements

### Starting Examples
```

public class StringHelper {

	public String truncateAInFirst2Positions(String str) {
		if (str.length() <= 2)
			return str.replaceAll("A", "");

		String first2Chars = str.substring(0, 2);
		String stringMinusFirst2Chars = str.substring(2);

		return first2Chars.replaceAll("A", "") 
				+ stringMinusFirst2Chars;
	}

	public boolean areFirstAndLastTwoCharactersTheSame(String str) {

		if (str.length() <= 1)
			return false;
		if (str.length() == 2)
			return true;

		String first2Chars = str.substring(0, 2);

		String last2Chars = str.substring(str.length() - 2);

		return first2Chars.equals(last2Chars);
	}

}

```


