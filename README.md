# ✈️ Airline Ticket Reservation System

## 📘 Use Case 4: Booking Management

---

## 📌 Overview

The Booking Management module handles the complete flight booking lifecycle from initiation to confirmation. It uses the State Pattern to manage booking stages and ensures a structured and validated booking process.

---

## 🎯 Objectives

* Manage booking lifecycle using State Pattern
* Capture passenger and seat details
* Calculate fare with taxes and seat charges
* Generate unique PNR
* Confirm booking after payment

---

## 🔄 4.1 Booking Creation (State Pattern)

Booking progresses through states:
INITIATED → PASSENGER_DETAILS → SEAT_SELECTED → PAYMENT_PENDING → CONFIRMED

* Each state transition is validated
* Booking expiry time is set
* Seats are locked during process

---

## 👤 4.2 Passenger Management

* Add passenger details
* Validate required fields
* Support multiple passengers
* Store contact details

---

## ✅ 4.3 Booking Confirmation

* Booking moves to CONFIRMED after payment
* Generates PNR
* Calculates total fare (base + tax + seat charges)
* Stores booking in memory

---

## 🔍 4.4 Booking Retrieval

* Retrieve booking by PNR
* Display booking details:

  * Flight info
  * Passenger list
  * Seat details
  * Fare
  * Status

---

## 📊 4.5 Booking History

* View all bookings
* Track booking status
* Extendable for filtering and sorting

---

## 🏗️ Design Approach

* State Pattern for lifecycle management
* Layered architecture:

  * Model
  * Service
  * State
* Clean and modular design

---

## ✅ Features Implemented

✔ Booking lifecycle (State Pattern)
✔ Passenger addition
✔ Seat selection integration
✔ Fare calculation
✔ Booking confirmation
✔ Booking retrieval

---

## 📚 Learning Outcomes

* Understanding State Design Pattern
* Managing real-world booking flows
* Designing scalable systems
* Integrating multiple modules

---

## 🚀 Future Enhancements

* Payment gateway integration
* Email/SMS notifications
* Database persistence
* PDF ticket generation
* Booking cancellation & modification

---
