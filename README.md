# ✈️ Airline Ticket Reservation System

## 📘 Use Case 1: User Management

---

## 📌 Overview

The User Management module is a core component of the Airline Ticket Reservation System. It handles user registration, authentication, profile management, and role-based access control. This ensures secure and personalized access for passengers, administrators, and airline staff.

---

## 🎯 Objectives

* Enable secure user registration and login
* Manage user profiles and personal data
* Implement role-based access control
* Provide account security features like OTP verification and password reset

---

## 🧩 Functional Requirements

### 🔹 1.1 User Registration and Authentication

* Register new users with personal details (Name, Email, Phone, DOB, Passport/ID)
* Verify email and mobile number using OTP
* Store encrypted passwords for security
* Implement role-based access (Passenger, Admin, Airline Staff)
* User login with session management
* "Remember Me" functionality for persistent login
* Password reset via Email/SMS
* Multi-Factor Authentication (MFA) for enhanced security
* Update user profile details
* Deactivate or delete user accounts

---

### 🔹 1.2 User Profile Management

* View complete user profile including booking history
* Update personal and contact information
* Add or update passport and identification details
* Manage multiple passenger profiles (family members or frequent travelers)
* Set travel preferences (meal type, seat preference, assistance needs)
* Manage notification preferences (Email/SMS)
* Add emergency contact details

---

### 🔹 1.3 User Role Management (Polymorphism & Inheritance)

* Create an abstract `User` class with common attributes
* Implement derived classes:

    * `Passenger`
    * `Admin`
    * `AirlineStaff`
* Apply inheritance and polymorphism for role behavior
* Define role-based permissions:

    * **Passenger:** Manage own bookings
    * **Admin:** Manage users and bookings
    * **Airline Staff:** Manage flights and view bookings
* Restrict access to features based on user roles

---

## 🔐 Security Features

* Password encryption (e.g., BCrypt)
* OTP verification for email and mobile
* Multi-factor authentication (MFA)
* Secure session handling
* Role-based authorization

---

## 🏗️ Design Approach

* Object-Oriented Programming (OOP) principles
* Use of inheritance and polymorphism for role management
* Separation of concerns using layered architecture (Controller, Service, Repository)
* Validation and exception handling for user inputs

---

## 📊 Expected Outcome

* Secure and scalable user management system
* Personalized user experience
* Controlled access to system functionalities
* Improved data security and integrity

---

## 📚 Learning Outcomes

* Understanding authentication and authorization mechanisms
* Implementing role-based access control (RBAC)
* Applying OOP concepts like inheritance and polymorphism
* Handling user data securely with encryption and validation

---
