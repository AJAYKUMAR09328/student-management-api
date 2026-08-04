Student Management API

A RESTful Student Management System built using **Java Spring Boot**, **Spring Data JPA**, **MySQL**, and **Maven**. This project provides APIs to perform CRUD operations on student records.



Features

- Add a new student
- View all students
- View student by ID
- Update student details
- Delete a student
- RESTful API architecture
- Layered architecture (Controller, Service, Repository)



Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- H2
- Maven
- Postman
- Git & GitHub



API Endpoints

<img width="1384" height="752" alt="Gemini_Generated_Image_xs2y9fxs2y9fxs2y" src="https://github.com/user-attachments/assets/9590e624-dd53-4c97-994e-94e9d7321ccb" />



Screenshots

Swagger UI

<img width="1474" height="923" alt="image" src="https://github.com/user-attachments/assets/7acad3f8-4ea3-4fcb-9c94-331e54cf8f4f" />


Schema of student response and student request

<img width="1240" height="502" alt="image" src="https://github.com/user-attachments/assets/6ce4a511-15c5-4fa1-b8be-b72a571c5f3c" />


Get  Student by id

<img width="1907" height="599" alt="image" src="https://github.com/user-attachments/assets/8a3cbcce-56ae-44b9-8bfa-a8d58dcf2ea8" />

<img width="1725" height="322" alt="image" src="https://github.com/user-attachments/assets/812492e8-6633-460f-a629-6fcb9cbf4959" />


Get Student by email id 
<img width="1880" height="595" alt="image" src="https://github.com/user-attachments/assets/807cd439-ba5e-472d-89a0-1910890e35f5" />

<img width="1882" height="755" alt="image" src="https://github.com/user-attachments/assets/3cd3180e-6a93-45c1-9ff0-8e1ce0f45617" />

We can download response in json 

example:

{
  "id": 1,
  "firstName": "Ajay Kumar",
  "lastName": "Tammali",
  "email": "tammaliajay0504@gmail.com",
  "department": "CSE",
  "phoneNumber": "6695021077"
}

Run the application

./mvnw spring-boot:run


Database Configuration

This project uses an **H2 in-memory database** for testing and development.

Update your `application.properties` as follows:

properties

spring.datasource.url=jdbc:h2:mem:studentdb

spring.datasource.driverClassName=org.h2.Driver

spring.datasource.username=sa

spring.datasource.password=

spring.jpa.hibernate.ddl-auto=create

spring.jpa.defer-datasource-initialization=true

spring.h2.console.enabled=true

spring.jpa.show-sql=true

 
H2 Database Console

Open the H2 Console:

http://localhost:8080/h2-console



Testing

The REST APIs can be tested using:

- Postman
- Swagger UI

Swagger URL

https://student-management-api-zycl.onrender.com/swagger-ui/index.html#/

Future Improvements

- Student Search
- Pagination & Sorting
- Authentication & Authorization
- JWT Security
- Input Validation
- Exception Handling
- Docker Support
- Unit Testing
- Cloud Deployment
- Student Profile Image Upload


Author

Ajay Kumar Tammali

GitHub: https://github.com/AJAYKUMAR09328
