# Budget and Expense Management System

## Project Overview

This project is a Budget and Expense Management System designed to help users track their expenses and manage their budgets efficiently. The system allows users to manage categories, expenses, and products, leveraging Spring Boot for the backend and Thymeleaf for the frontend.

## Table of Contents

- [Project Structure](#project-structure)
- [Technology Stack](#technology-stack)
- [MVC Architecture](#mvc-architecture)
- [Design Patterns](#design-patterns)
- [Principles](#principles)
- [Setup and Installation](#setup-and-installation)
- [Usage](#usage)

## Project Structure

- **`yourtech.demo.models.Observor`**:
  - `Subject`: Interface defining methods for observer management.
  - `Observer`: Interface defining the update method for observers.
  - `GoalObserver`: Implements the `Observer` interface to check if budget goals are met.
  - `BudgetSubject`: Implements the `Subject` interface to manage and notify observers.

- **`yourtech.demo.controllers`**:
  - `BudgetController`: Manages budget-related operations and interactions with the user.
  - `ExpenseController`: Handles expense-related operations.
  - `ProductsController`: Manages product-related operations, including image uploads.

- **`yourtech.demo.services`**:
  - `BudgetService`: Service layer for budget-related logic.
  - `ExpenseService`: Service layer for expense-related logic.
  - `ProductsRepository`: Repository for product data access.

## Technology Stack

- **Backend**: Spring Boot, Java
- **Frontend**: Thymeleaf, HTML, CSS
- **Database**: MySQL
- **Build Tool**: Maven

## MVC Architecture

The project follows the **Model-View-Controller (MVC)** architecture:

- **Model**: Represents the data layer and business logic. In this project, models are represented by entities like `Category`, `Expense`, and `Product`. The repository classes interact with the database to perform CRUD operations.

- **View**: The presentation layer, managed by Thymeleaf templates, displays the data to the user. For example, `budget.html` and `expenses.html` are Thymeleaf templates that present budget and expense information.

- **Controller**: Manages user input and interactions. Controllers like `BudgetController`, `ExpenseController`, and `ProductsController` handle HTTP requests, invoke service methods, and return appropriate views.

## Design Patterns

### 1. Observer Pattern

- **Purpose**: Allows a subject to notify multiple observers about changes. This pattern is used in the `GoalObserver` and `BudgetSubject` classes.
- **Implementation**: 
  - `Subject` interface defines methods for managing observers.
  - `Observer` interface defines the `update` method that observers implement.
  - `GoalObserver` observes changes in categories and updates based on expense goals.
  - `BudgetSubject` maintains a list of observers and notifies them of changes.

### 2. Singleton Pattern

- **Purpose**: Ensures a class has only one instance and provides a global point of access. Although not explicitly shown in the provided code, this pattern is commonly used in Spring Boot applications to manage beans and services with a single instance.

### 3. Factory Pattern

- **Purpose**: Creates objects without specifying the exact class of object that will be created. In the project, although not explicitly implemented, a factory pattern can be used to manage the creation of different types of services or controllers.

### 4. Strategy Pattern

- **Purpose**: Defines a family of algorithms, encapsulates each one, and makes them interchangeable. This pattern can be used for different budget calculation strategies or expense tracking methods.

## Principles

### 1. **Separation of Concerns**

- **Implementation**: The project separates the data handling (models), user interface (views), and request handling (controllers) into different components, promoting a clean and manageable codebase.

### 2. **Dependency Injection**

- **Implementation**: Spring Boot’s dependency injection mechanism is used to manage dependencies, such as injecting `BudgetService` and `ExpenseService` into controllers. This reduces coupling and improves testability.

### 3. **Single Responsibility Principle**

- **Implementation**: Each class has a single responsibility. For example, `BudgetController` handles budget-related user interactions, while `BudgetService` manages business logic related to budgets.

### 4. **Open/Closed Principle**

- **Implementation**: The system is designed to be open for extension but closed for modification. New features or changes can be added with minimal modifications to existing code, adhering to principles of extensibility and maintainability.

## Setup and Installation

1. **Clone the Repository**

   ```bash
   git clone https://github.com/yourusername/budget-expense-management-system.git

