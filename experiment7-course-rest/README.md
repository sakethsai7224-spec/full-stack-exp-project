# Experiment 8 - Course REST API (Spring Boot + JPA + ResponseEntity)

## Overview
Spring Boot REST API for Course management using ResponseEntity for all endpoints.

## REST Endpoints
| Method | URL | Description |
|--------|-----|-------------|
| POST | /courses | Create course |
| GET | /courses | Get all courses |
| GET | /courses/{id} | Get by ID |
| PUT | /courses/{id} | Update course |
| DELETE | /courses/{id} | Delete course |
| GET | /courses/search/{title} | Search by title |

## Database Setup
```sql
CREATE DATABASE coursedb;
```

## Configuration
Update `application.properties` with your MySQL password.

## How to Run
Right-click main application class → Run As → Spring Boot App
