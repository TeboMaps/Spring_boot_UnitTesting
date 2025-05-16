# Spring Boot Unit Testing Demo

A demonstration of unit testing in a Spring Boot application using JUnit 5 and Mockito. This project showcases a simple user management system with a clean architecture and comprehensive test coverage.

## 🚀 Features

- User management (add, remove, get users)
- Layered architecture (Controller → Service → Repository)
- In-memory data storage
- Comprehensive unit tests with Mockito
- Clean code practices

## 🛠️ Tech Stack

- **Framework**: Spring Boot 3.4.5
- **Language**: Java 17
- **Build Tool**: Gradle
- **Testing**:
  - JUnit 5
  - Mockito
  - AssertJ (via Spring Boot Test)

## 📁 Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/example/demo/
│   │       ├── model/         # Domain models
│   │       ├── repo/          # Data access layer
│   │       └── service/       # Business logic
│   └── resources/             # Configuration files
└── test/
    └── java/
        └── com/example/demo/
            └── service/       # Unit tests
```

## 🚀 Getting Started

### Prerequisites

- Java 17 or higher
- Gradle 7.6+

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/TeboMaps/Spring_boot_UnitTesting.git
   cd Spring_boot_UnitTesting/demo
   ```

2. Build the project:
   ```bash
   ./gradlew build
   ```

## 🧪 Running Tests

To run all tests:

```bash
./gradlew test
```

To run a specific test class:

```bash
./gradlew test --tests "com.example.demo.service.UserServiceTests"
```

## 🧩 Project Components

### User Model
- `User.java`: Represents a user with id, name, and surname

### Repository Layer
- `FakeRepoInterface.java`: Defines CRUD operations
- `FakeRepo.java`: In-memory implementation of the repository

### Service Layer
- `UserService.java`: Service interface
- `UserServiceImpl.java`: Service implementation with business logic

### Tests
- `UserServiceTests.java`: Unit tests for the UserService

## 🧪 Testing Strategy

- **Unit Tests**: Test individual components in isolation
- **Mocking**: Uses Mockito to mock dependencies
- **Test Coverage**: Focuses on service layer testing with mocked repository

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Made with ❤️ by Tebogo Maphatsoe | [GitHub Profile](https://github.com/TeboMaps)
