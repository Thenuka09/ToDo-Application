# To-Do Application (Spring Boot & MySQL)

## 📌 Overview
This is a simple **To-Do Application** built using **Spring Boot** and **MySQL**. The application allows users to **add, view, delete, and mark tasks as complete** through a web-based interface styled with Bootstrap.

---

## 🛠️ Tech Stack
- **Backend:** Java (Spring Boot)
- **Database:** MySQL
- **Frontend:** Thymeleaf, Bootstrap
- **IDE Used:** IntelliJ IDEA (Community Edition)
- **Dependencies:** Spring Web, Spring Data JPA, MySQL Driver, Lombok, Thymeleaf

---

## 🚀 How to Run the Application

### 1️⃣ **Clone or Download the Project**
```sh
 git clone <your-repository-link>
 cd <your-project-folder>
```

### 2️⃣ **Open the Project in an IDE**
Use any Java IDE such as **IntelliJ IDEA**, **Eclipse**, or **VS Code**. This project was created using IntelliJ IDEA (Community Edition).

### 3️⃣ **Install Java**
Ensure that **Java 21 or later** is installed on your computer. You can check your Java version using:
```sh
 java -version
```

### 4️⃣ **Set Up MySQL Database**
- Install and run MySQL Server (via **XAMPP, MySQL Workbench, or any MySQL service**).
- Create a database named **`todo_application`**:
```sql
 CREATE DATABASE todo_application;
```
- Update your **application.properties** file (located in `src/main/resources`) with your database details:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todo_application
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update
```

### 5️⃣ **Run the MySQL Server**
Ensure your MySQL server is running before starting the Spring Boot application.

### 6️⃣ **Run the Application**
Navigate to the main class (`ToDoApplication.java`) inside `src/main/java` and run the application using your IDE **or** execute the following command in the terminal:
```sh
 mvn spring-boot:run
```

### 7️⃣ **Access the Application**
Once the application starts, you should see the following message in the console:
```
 Tomcat started on port 8080
```
Open your web browser and go to:
```sh
 http://localhost:8080
```
Now you can **add, view, delete, and mark tasks as complete** using the application! ✅

---

## 📦 Dependencies Used
```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
    </dependency>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <scope>provided</scope>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-thymeleaf</artifactId>
    </dependency>
</dependencies>
```

---

## 📌 Annotations Used
This project makes use of various Spring Boot annotations:
- `@Entity` → Defines a model as a database entity.
- `@Id` → Marks a field as the primary key.
- `@GeneratedValue(strategy = GenerationType.AUTO)` → Automatically generates the primary key value.
- `@Data` → Generates getters and setters (from Lombok).
- `@Service` → Defines a service layer.
- `@Controller` → Marks a class as a Spring MVC controller.
- `@GetMapping` → Handles HTTP GET requests.
- `@PostMapping` → Handles HTTP POST requests.
- `@RequestParam` → Extracts request parameters.
- `@PathVariable` → Extracts values from URL paths.

---

## 🙏 Acknowledgments
This project was made possible using:
- **Spring Boot Initializer** → For setting up the Spring Boot project.
- **Bootstrap** → For responsive UI design.

---

## 📌 Future Enhancements
- ✅ Add user authentication for personal task management.
- ✅ Implement task categories and priorities.
- ✅ Enhance the UI with better styling and animations.
- ✅ Deploy the application to a cloud service.

---

### 🎉 Thank you for checking out this project! Feel free to contribute and improve it. 🚀

