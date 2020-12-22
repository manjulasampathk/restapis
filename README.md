# restapis

This is ths very basic sample project to understand spring-boot basic and spring-JPA

Here,I have developed all the API for Student entity and you can create any number of entity and do the same process.We'll discuss more complex logic later.

here is the starting point of the application 

public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
}

we have used apache derby as in-memory database.

All the CRUD operation have been implemented for student entity.Please check the controller class.

Here,We have defined Student Service as interface since it may have different implementation later

Project Lombok used for common tasks.

Specilly we have defined student age and grade as short types due to it's maximum value less than 128

Below Dependency usded for managment tasks

<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
            <scope>provided</scope>
</dependency>

