# Skill 12 – Full-Stack CRUD Application (React + Spring Boot)

A Full-Stack Student Management CRUD application using Spring Boot as backend and React as frontend.

## Project Structure

```
skill12/
├── backend/               ← Spring Boot REST API
│   ├── src/main/java/com/example/demo/
│   │   ├── model/Student.java
│   │   ├── repository/StudentRepository.java
│   │   ├── service/StudentService.java
│   │   ├── controller/StudentController.java
│   │   └── DemoApplication.java
│   ├── src/main/resources/application.properties
│   └── pom.xml
│
└── frontend/              ← React Frontend
    ├── src/
    │   ├── components/
    │   │   ├── StudentList.jsx
    │   │   └── AddStudent.jsx
    │   ├── App.jsx
    │   ├── main.jsx
    │   └── index.css
    ├── index.html
    ├── package.json
    └── vite.config.js
```

## Setup & Run

### Backend
1. Create MySQL database: `studentdb`
2. Update `application.properties` with your DB credentials
3. Run: `mvn spring-boot:run`  
   Backend runs on: `http://localhost:8080`

### Frontend
```bash
cd frontend
npm install
npm run dev
```
Frontend runs on: `http://localhost:3000`

## REST API Endpoints

| Method | Endpoint            | Description       |
|--------|---------------------|-------------------|
| GET    | /students           | Get all students  |
| POST   | /students           | Add new student   |
| PUT    | /students/{id}      | Update student    |
| DELETE | /students/{id}      | Delete student    |

## GitHub
https://github.com/Durgabhavani0707/Skill12
