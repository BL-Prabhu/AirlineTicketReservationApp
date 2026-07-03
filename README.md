# ✈️ Airline Ticket Reservation System

## 📌 Use Case 8: Flight Management (Admin / Airline Staff)

---

## 📖 Overview

Use Case 8 focuses on **admin-side flight management**.
It allows airline staff to **create, update, search, and monitor flights** in the system.

This module works along with previous use cases (UC1–UC7) and provides full control over flight operations.

---

## 🎯 Features

### 🔹 8.1 Flight Creation and Setup

* Create new flights with:

   * Airline name
   * Flight number
   * Source & destination
   * Departure & arrival time
   * Seat capacity
   * Base fare
* Default configurations:

   * Aircraft type (A320)
   * Status (ON_TIME)
   * Baggage allowance

---

### 🔹 8.2 Flight Information Management

* Update flight status:

   * ON_TIME
   * DELAYED
   * CANCELLED
* Modify fare dynamically
* Change aircraft type
* Manage seat availability (via booking/cancellation)
* Handle operational updates like delays

---

### 🔹 8.3 Flight Search and Filtering

* Search flights by airline
* Filter by route (source → destination)
* Filter by flight status
* View occupancy rate (percentage of booked seats)

---

## 🏗️ Class Used

### 📦 `FlightManagementService`

Handles all admin operations:

* `createFlight()` → Create new flight
* `updateStatus()` → Change flight status
* `updateFare()` → Modify pricing
* `searchByAirline()` → Find flights by airline
* `searchByRoute()` → Filter by route
* `filterByStatus()` → Filter flights by status
* `occupancyReport()` → View seat occupancy

---
## 📈 Sample Output

```
Flight Created ✅: AI101 | Air India | Chennai -> Delhi | ₹5000 | Seats: 50 | Status: ON_TIME
Flight Created ✅: 6E202 | IndiGo | Chennai -> Delhi | ₹4500 | Seats: 40 | Status: ON_TIME

Status Updated: AI101 | Air India | Chennai -> Delhi | ₹5000 | Seats: 50 | Status: DELAYED

Fare Updated: 6E202 | IndiGo | Chennai -> Delhi | ₹4800 | Seats: 40 | Status: ON_TIME

Flights by Airline: IndiGo
6E202 | IndiGo | Chennai -> Delhi | ₹4800 | Seats: 40 | Status: ON_TIME

Flight Occupancy Report:
AI101 → 0.0% full
6E202 → 0.0% full
```

---

## 🔗 Integration with Previous Use Cases

| Use Case | Integration                                      |
| -------- | ------------------------------------------------ |
| UC1–UC5  | Uses flight data for booking                     |
| UC6      | Flight modification depends on available flights |
| UC7      | Cancellation updates seat availability           |
| UC8      | Controls all flight data                         |

---

## ✅ Key Highlights

* Clean separation of **Admin vs User operations**
* Dynamic flight updates
* Real-time seat tracking using booking system
* Simple and scalable design

---

## 🚀 Future Enhancements

* Add database (MySQL)
* Add login (Admin/User roles)
* Add dynamic pricing based on demand
* Add real-time notifications for delays
* Convert to Spring Boot microservices

---

## 👨‍💻 Author

Airline Ticket Reservation System – Java Project
(Bridgelabz Training Assignment)
