# Spring Boot Testing — JUnit 5, Mockito & MockMvc 🧪

A Spring Boot learning project demonstrating the fundamentals of automated testing using JUnit 5, Mockito, and MockMvc.

## Tech Stack

- Java
- Spring Boot
- JUnit 5
- Mockito
- MockMvc
- Maven

## Concepts Covered

### 1. JUnit 5 — Unit Testing
- Writing and executing test cases using `@Test`
- Validating results using assertions
- Testing expected behavior and exceptions

### 2. Mockito — Mocking Dependencies
- Creating mock objects using `@Mock`
- Injecting mocked dependencies using `@InjectMocks`
- Stubbing method responses using `when().thenReturn()`
- Verifying method interactions using `verify()`

### 3. MockMvc — Controller Testing
- Testing REST API endpoints using `MockMvc`
- Performing HTTP requests using `perform()`
- Validating HTTP status codes using `andExpect()`
- Verifying API response data

## Testing Approach

**JUnit 5:** Test execution and assertions.

**Mockito:** Isolating business logic by mocking dependencies.

**MockMvc:** Testing Spring MVC controllers without starting a real HTTP server.

## Running the Tests

**Prerequisites:**
- Java (compatible with the project's configured version)
- Maven

Clone the repository:

```bash
git clone https://github.com/elahi-k/spring-testing.git
cd spring-testing
```

Run all tests:

```bash
mvn test
```

Or run tests directly using your IDE's test runner.

## Learning Outcome

This project helped me understand how automated testing improves code reliability, reduces manual testing effort, and helps detect issues when application code changes.

---

**Focus:** Learning the fundamentals of unit testing, mocking, and REST API testing in Spring Boot.