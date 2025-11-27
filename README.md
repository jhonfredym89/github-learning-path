## Repository Objective

This repository will be used to learn GitHub step by step, exploring topics such as:
- Professional use of repositories
- Issues
- Pull Requests
- Projects
- Branches and workflows
- GitHub Actions
- Organizations and permissions
- Security and automation

Each step will be documented and versioned within this same repository.

## 🧱 Project Structure (Hexagonal Architecture + DDD)

The project follows Hexagonal Architecture (Ports & Adapters) combined with Domain-Driven Design (DDD).
The folder structure is organized to keep the domain model pure, isolate application logic, and cleanly separate external concerns.

src/
 └── main/
     ├── java/
     │   └── com.example.project/
     │       ├── domain/
     │       │   ├── model/
     │       │   │   ├── aggregate/
     │       │   │   ├── entity/
     │       │   │   ├── valueobject/
     │       │   ├── service/
     │       │   ├── repository/
     │       │   └── event/
     │       │
     │       ├── application/
     │       │   ├── usecase/
     │       │   ├── service/
     │       │   └── dto/
     │       │
     │       ├── infrastructure/
     │       │   ├── persistence/
     │       │   │   ├── repository/
     │       │   │   └── entity/
     │       │   ├── config/
     │       │   ├── mapper/
     │       │   └── adapter/
     │       │
     │       └── api/
     │           ├── controller/
     │           ├── request/
     │           └── response/
     │
     └── resources/
         ├── application.yml
         └── schema.sql