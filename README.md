# ✈️ Use Case 11: Singleton Pattern Implementation

## 📌 Overview

This use case introduces the **Singleton Design Pattern** to ensure that only **one instance** of key management classes exists throughout the system.

It provides **centralized control, better performance, and consistency** across booking, flight, and payment operations.

---

## 🎯 Objectives

* Ensure a single shared instance for critical services
* Avoid duplicate object creation
* Provide centralized data and state management
* Improve system performance using caching

---

## 🧠 Design Pattern Used

### 🔹 Singleton Pattern

* Restricts class to **only one instance**
* Provides a **global access point**
* Ensures **thread safety**

---

## 🏗️ Components

---

## 🔹 1. BookingManager Singleton

### 📌 Responsibilities

* Manage all booking operations
* Store and retrieve bookings
* Handle booking modifications
* Maintain booking cache

### ⚙️ Features

* Single instance across system
* Prevent duplicate bookings
* Fast retrieval using in-memory storage
* Centralized booking state

### 💡 Example Responsibilities

* Create booking
* Get booking by ID
* Update booking
* Delete booking

---

## 🔹 2. FlightManager Singleton

### 📌 Responsibilities

* Manage all flight data
* Handle seat availability
* Maintain flight inventory

### ⚙️ Features

* Thread-safe seat allocation
* Synchronize seat updates
* Cache flight data for fast search
* Handle flight CRUD operations

### 💡 Example Responsibilities

* Add flight
* Update flight details
* Check seat availability
* Allocate seats

---

## 🔹 3. PaymentManager Singleton

### 📌 Responsibilities

* Handle all payment operations
* Coordinate payment processing
* Manage refunds and transactions

### ⚙️ Features

* Route to correct payment gateway (UPI/Card)
* Maintain transaction logs
* Handle callbacks/webhooks
* Centralized refund processing

### 💡 Example Responsibilities

* Process payment
* Validate payment
* Process refund
* Log transactions

---

## 🔒 Thread Safety

Singleton classes use:

* `synchronized` method OR
* Double-checked locking

This ensures safe usage in **multi-threaded environments**.

---

## ⚙️ Workflow

1. Call `getInstance()` to access manager
2. Use instance to perform operations
3. Same instance used across application

---

## 📊 Advantages

✔ Ensures single source of truth
✔ Reduces memory usage
✔ Improves performance with caching
✔ Prevents inconsistent data
✔ Easy global access

---

## ⚠️ Considerations

* Must handle thread safety properly
* Avoid overuse (not all classes should be Singleton)
* Global state should be managed carefully

---

## 🔥 Integration

This use case integrates with:

* UC1–UC5 → Booking System
* UC6 → Modification
* UC7 → Cancellation
* UC8 → Flight Management
* UC9 → Airport Management
* UC10 → Priority Booking (Queue Processing)

---

## 🎉 Conclusion

The Singleton Pattern ensures **centralized, efficient, and consistent management** of bookings, flights, and payments, making the airline reservation system more scalable and production-ready.

---
