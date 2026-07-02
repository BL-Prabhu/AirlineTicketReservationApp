# ✈️ Airline Ticket Reservation System

## 📘 Use Case 2: Flight Search and Discovery

---

## 📌 Overview

The Flight Search and Discovery module allows users to search, filter, and explore available flights based on various criteria such as source, destination, date, price, and airline preferences. It enhances user experience by providing flexible search options and advanced data analysis using Java Streams.

---

## 🎯 Objectives

* Enable users to search flights easily
* Provide multiple filtering and sorting options
* Display detailed flight information
* Use Java Streams for advanced operations

---

## 🔍 2.1 Flight Search Operations

* Search flights by source and destination
* Filter flights by departure date
* Support one-way and round-trip search (extendable)
* Apply filters:

  * Price range
  * Stops (non-stop, 1 stop, etc.)
  * Airline preference
* Sort results:

  * Price (low to high)
  * Duration (shortest first)

---

## 📊 2.2 Flight Information Display

* Show list of available flights
* Display:

  * Airline name
  * Flight number
  * Departure and arrival time
  * Duration
  * Price
  * Number of stops
  * Available seats

---

## ⚙️ 2.3 Advanced Features (Java Streams)

* Group flights by airline
* Calculate average fare per airline
* Find cheapest flight using `min()`
* Aggregate total available seats
* Enable scalable filtering and grouping

---

## 🏗️ Design Approach

* Layered architecture:

  * Model (Flight)
  * Repository (Data source)
  * Service (Business logic)
  * Menu (User interaction)
* Use Java Streams for clean and efficient data processing
* Follow OOP principles

---

## ✅ Features Implemented

✔ Flight search (source, destination, date)
✔ Filtering (price, stops)
✔ Sorting (price, duration)
✔ Grouping using Streams
✔ Aggregation and analytics

---

## 📚 Learning Outcomes

* Hands-on experience with Java Streams API
* Understanding filtering, sorting, grouping
* Designing modular and scalable systems
* Implementing real-world search systems

---
