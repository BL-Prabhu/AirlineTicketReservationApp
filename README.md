# ✈️ Airline Ticket Reservation System

## 📘 Use Case 3: Seat Selection

---

## 📌 Overview

The Seat Selection module enables passengers to view seat layouts and select preferred seats during the booking process. It provides real-time seat availability, pricing for premium seats, and automated seat assignment options.

---

## 🎯 Objectives

* Provide seat map visualization
* Allow users to select preferred seats
* Handle premium seat pricing
* Ensure seat availability validation
* Support auto seat assignment

---

## 🪑 3.1 Seat Map Visualization

* Display seat layout based on aircraft
* Show seat availability:

  * 🟢 Available
  * 🔴 Booked
  * ⚪ Blocked
* Identify seat types:

  * Window
  * Middle
  * Aisle
* Highlight premium seats with extra charges

---

## 🎯 3.2 Seat Selection and Assignment

* Allow passenger to select seats
* Validate seat availability before booking
* Apply additional charges for premium seats
* Enable seat selection for multiple passengers
* Auto-assign seats if not selected
* Support group seat allocation (extendable)

---

## ⚙️ Features Implemented

✔ Seat map generation
✔ Seat availability tracking
✔ Seat booking
✔ Premium seat handling
✔ Auto seat assignment

---

## 🏗️ Design Approach

* Model:

  * Seat
  * SeatMap
* Service:

  * SeatService (business logic)
* Menu:

  * Integrated into Passenger Menu
* Use OOP principles and clean structure

---

## 📚 Learning Outcomes

* Designing seat allocation systems
* Handling real-time availability
* Applying OOP concepts (encapsulation, enums)
* Implementing business rules (premium pricing, validation)

---

## 🚀 Future Enhancements

* Graphical seat map UI
* Group seat booking logic
* Seat blocking for companions
* Integration with booking and payment modules

---
