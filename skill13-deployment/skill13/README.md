# Skill 13 – Deployment of Full-Stack Application (Spring Boot + React)

Deploy a production-ready full-stack application by generating a React production build, packaging the Spring Boot backend as a JAR, and serving both from a single port.

## Project Structure

```
skill13/
├── backend/
│   ├── src/main/java/com/example/demo/
│   │   ├── DemoApplication.java
│   │   └── TestController.java
│   ├── src/main/resources/
│   │   ├── application.properties
│   │   └── static/          ← React build goes here
│   └── pom.xml
│
└── frontend/
    ├── src/
    │   ├── App.jsx
    │   ├── main.jsx
    │   └── index.css
    ├── index.html
    ├── package.json
    └── vite.config.js
```

## Deployment Steps

### Step 1 – Generate React Production Build
```bash
cd frontend
npm install
npm run build
```

### Step 2 – Copy build into Spring Boot static folder
```bash
cp -r frontend/dist/* backend/src/main/resources/static/
```

### Step 3 – Configure Environment Variables
Set these in your system or `.env`:
```
DB_URL=jdbc:mysql://localhost:3306/studentdb
DB_USERNAME=root
DB_PASSWORD=root
```

### Step 4 – Package Backend as JAR
```bash
cd backend
mvn clean package
```

### Step 5 – Run the Application
```bash
java -jar backend/target/demo-0.0.1-SNAPSHOT.jar
```

### Step 6 – Verify
- Open: http://localhost:8080  → React UI loads
- Test API: http://localhost:8080/api/test → `Backend Working Successfully!`

## Result
Both frontend and backend run together on port 8080 as a single deployed system.

## GitHub
https://github.com/Durgabhavani0707/skill-13
