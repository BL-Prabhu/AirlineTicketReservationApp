# ✈️ Flight Booking System – Exception Handling (Use Case 17)

## 📌 Overview

This module implements **Exception Handling** for the Flight Booking System.

It ensures the system is **robust, reliable, and user-friendly** by handling both:

* System-level failures
* User input validation errors

All exceptions are properly managed and logged for debugging and maintenance.

---

## 🎯 Objective

* Prevent system crashes
* Handle unexpected scenarios gracefully
* Provide meaningful error messages to users
* Improve debugging with proper logging

---

## ⚙️ Exception Categories

### 🔹 17.1 System Exception Scenarios

These exceptions occur due to system or runtime issues.

#### ✅ Handled Cases:

* ❌ Flight Not Found Exception
  Triggered when the requested flight does not exist.

* ❌ Booking Not Found Exception
  Triggered when booking ID is invalid or missing.

* ❌ Seat Unavailable Exception
  Triggered when selected seats are already booked.

* ❌ Payment Failure Exception
  Triggered when payment processing fails.

* ❌ Network Timeout Exception
  Triggered when API or external service does not respond in time.

* ❌ Database Connection Failure
  Triggered when the system cannot connect to the database.

* 📝 Logging
  All system exceptions are logged using logging framework (e.g., Log4j) for debugging.

---

### 🔹 17.2 User Input Validation Exceptions

These exceptions occur due to invalid or incorrect user inputs.

#### ✅ Handled Cases:

* ⚠️ Invalid Date Format
  Example: Wrong date format entered by user.

* ⚠️ Invalid Passenger Count
  Example: Negative or zero passengers.

* ⚠️ Invalid Airport Code
  Example: Unsupported or incorrect airport code.

* ⚠️ Invalid Payment Details
  Example: Incorrect card number or missing fields.

* ⚠️ Expired Booking Session
  Example: User takes too long and session expires.

---

## 💬 User-Friendly Error Messages

The system provides clear and understandable messages:

| Scenario          | Message                                             |
| ----------------- | --------------------------------------------------- |
| Flight not found  | "Sorry, the selected flight is not available."      |
| Booking not found | "Invalid booking ID. Please check and try again."   |
| Seat unavailable  | "Selected seat is already booked."                  |
| Payment failed    | "Payment failed. Please try again."                 |
| Invalid input     | "Please enter valid details."                       |
| Session expired   | "Your session has expired. Please restart booking." |

---

## 🛠️ Implementation Approach

* Custom Exception Classes created for each scenario
* Centralized Exception Handling mechanism used
* Logging enabled for all failures
* Validation checks added before processing requests

---

## 📦 Technologies Used

* Java (Core Java / OOP)
* Exception Handling (try-catch, custom exceptions)
* Logging Framework (Log4j or similar)

---

## 🚀 Outcome

* Improved system stability
* Better user experience
* Easier debugging and maintenance
* Production-ready exception handling design

---

## 📚 Learning

* Importance of exception handling in real-world systems
* Creating custom exceptions
* Separating system errors vs user errors
* Logging best practices

---

✨ This module ensures the Flight Booking System is **safe, stable, and user-friendly even in failure scenarios**.
