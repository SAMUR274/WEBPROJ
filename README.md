# Hotel Management System Project

This project is a web development project aimed at creating a hotel management system. It includes backend development using Spring Boot and frontend development with HTML, CSS, and Thymeleaf.

## Project Structure
```hotel-management-system
├── src
│ ├── main
│ │ ├── java
│ │ │ └── com
│ │ │ └── webdevuoit3230
│ │ │ └── hotel_management_system
│ │ │ ├── model
│ │ │ │ ├── Customer.java
│ │ │ │ ├── Room.java
│ │ │ │ ├── Booking.java
│ │ │ │ └── ProvidedService.java
│ │ │ ├── repository
│ │ │ │ ├── CustomerRepository.java
│ │ │ │ ├── RoomRepository.java
│ │ │ │ ├── BookingRepository.java
│ │ │ │ └── ProvidedServiceRepository.java
│ │ │ ├── service
│ │ │ │ ├── CustomerService.java
│ │ │ │ ├── RoomService.java
│ │ │ │ ├── BookingService.java
│ │ │ │ └── ProvidedServiceService.java
│ │ │ └── controller
│ │ │ ├── CustomerController.java
│ │ │ ├── RoomController.java
│ │ │ ├── BookingController.java
│ │ │ └── ProvidedServiceController.java
│ │ └── resources
│ │ ├── application.properties
│ │ ├── static
│ │ │ └── style.css
│ │ └── templates
│ │ ├── customers.html
│ │ ├── rooms.html
│ │ ├── bookings.html
│ │ └── services.html
│ └── test
│ └── java
│ └── com
│ └── webdevuoit3230
│ └── hotel_management_system
│ └── SimpleStrategyTest.java
└── pom.xml
```


## Technologies Used

- **Backend Framework:** Spring Boot
- **Database:** H2
- **ORM:** Spring Data JPA
- **Frontend:** HTML, CSS, Thymeleaf
- **Build Tool:** Maven
- **Java Version:** 8 or above

## Instructions

To run the project:

1. Clone the repository.
2. Import the project into your IDE (e.g., Eclipse or IntelliJ IDEA).
3. Ensure you have Maven installed and configured.
4. Run the `Application.java` class to start the Spring Boot application.
5. Access the application in your web browser using the provided URLs.

## Frontend Development

The frontend development includes Thymeleaf templates for managing customers, rooms, bookings, and services. The `style.css` file in the `static` directory contains CSS styles for consistent styling across the application.

## Backend Development

The backend development consists of model classes representing entities in the application, Spring Data JPA repositories for data access, service classes for business logic, and controllers to handle HTTP requests and responses.

## Project Submission

Submit your project as a `.zip` file containing the entire Spring Boot project structure. Ensure your project follows the specified guidelines and includes a README.md file with instructions on how to run the project.
