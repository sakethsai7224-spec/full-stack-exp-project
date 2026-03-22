# Skill 9 – Global Exception Handling using @ControllerAdvice

Spring Boot REST API demonstrating centralized global exception handling with custom exceptions and structured JSON error responses.

## Project Details

| Field      | Value              |
|------------|--------------------|
| Name       | studentexception   |
| Group      | com                |
| Artifact   | klu                |
| Packaging  | Jar                |
| Java       | 17                 |

## Project Structure

```
skill9/
├── src/main/java/com/klu/
│   ├── StudentexceptionApplication.java
│   ├── dto/
│   │   ├── Student.java
│   │   └── ErrorResponse.java
│   ├── exception/
│   │   ├── StudentNotFoundException.java
│   │   └── InvalidInputException.java
│   ├── controller/
│   │   └── StudentController.java
│   └── advice/
│       └── GlobalExceptionHandler.java
├── src/main/resources/
│   └── application.properties
└── pom.xml
```

## Running the Application

```bash
mvn spring-boot:run
```

Server starts at: `http://localhost:8080`

## API Endpoints

| Request | URL | Expected Response |
|---|---|---|
| Valid student | `GET /student/101` | 200 OK – Student JSON |
| Student not found | `GET /student/200` | 404 NOT_FOUND – ErrorResponse |
| Invalid input | `GET /student/abc` | 400 BAD_REQUEST – ErrorResponse |
| Negative ID | `GET /student/-1` | 400 BAD_REQUEST – ErrorResponse |

## Sample Responses

**Valid Student (200 OK)**
```json
{
  "id": 101,
  "name": "Rishi",
  "department": "CSE"
}
```

**Student Not Found (404)**
```json
{
  "timestamp": "2024-01-01T10:00:00",
  "message": "Student with ID 200 not found",
  "statusCode": 404
}
```

**Invalid Input (400)**
```json
{
  "timestamp": "2024-01-01T10:00:00",
  "message": "Student ID must be a number",
  "statusCode": 400
}
```

## Key Concepts
- `@ControllerAdvice` — centralized exception handling across all controllers
- `@ExceptionHandler` — maps specific exception types to handler methods
- Custom exceptions: `StudentNotFoundException`, `InvalidInputException`
- Structured `ErrorResponse` with timestamp, message, and statusCode
