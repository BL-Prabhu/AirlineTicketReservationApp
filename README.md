# ✈️ Airline Ticket Reservation System

## 📌 Use Case 9: Airport Management

---

## 📖 Overview

Use Case 9 introduces **Airport Management**, which handles all airport-related data used across the system.

This module integrates with:

* ✈️ Flight Management (UC8)
* 🎟️ Booking System (UC1–UC5)
* 🔄 Modification (UC6)
* ❌ Cancellation (UC7)

It ensures that all flights and bookings reference **valid and well-managed airport data**.

---

## 🎯 Features

### 🔹 9.1 Airport Information Management

Admin can manage airport details:

* Add new airport with:

  * Airport Code (IATA/ICAO)
  * Airport Name
  * City
  * Country
* Update airport details
* Set timezone for each airport
* Define terminal information
* Mark airport as:

  * ✅ Active
  * ❌ Inactive
* Store airport facilities:

  * Lounge
  * Wi-Fi
  * Parking
* Add contact details

---

### 🔹 9.2 Airport Search and Retrieval

System supports:

* 🔍 Search airport by:

  * Code (e.g., MAA, DEL)
  * City name
  * Airport name
* 🌍 List airports by country
* ⚡ Auto-suggest airports during flight booking
* 📄 Display airport details to passengers

---

## 🏗️ Classes Involved

### 📦 `Airport`

Represents airport entity:

* code
* name
* city
* country
* timezone
* status (ACTIVE / INACTIVE)
* facilities
* contact details

---

### 📦 `AirportManagementService`

Handles all operations:

* `addAirport()` → Add new airport
* `updateAirport()` → Modify details
* `searchByCode()` → Find by airport code
* `searchByCity()` → Find airports in a city
* `searchByName()` → Find by airport name
* `listByCountry()` → List airports by country
* `autoSuggest()` → Suggest airports while typing

---

## 📊 Example Flow

```java id="jv8s3o"

```

---

## 📈 Sample Output
AirportManagementService airportService = new AirportManagementService();

// Add Airports
airportService.addAirport("MAA", "Chennai International Airport", "Chennai", "India");
airportService.addAirport("DEL", "Indira Gandhi International Airport", "Delhi", "India");

// Search
airportService.searchByCode("MAA");
airportService.searchByCity("Chennai");

// List
airportService.listByCountry("India");

// Auto Suggest
airportService.autoSuggest("Ch");
```id="p1j4ci"
Airport Added ✅: MAA | Chennai | India
Airport Added ✅: DEL | Delhi | India

Search by Code: MAA
MAA | Chennai International Airport | Chennai | India

Airports in Chennai:
MAA | Chennai International Airport | Chennai | India

Airports in India:
MAA | Chennai International Airport
DEL | Indira Gandhi International Airport

Suggestions for 'Ch':
Chennai International Airport
```

---

## 🔗 Integration with Previous Use Cases

| Use Case | Integration                                    |
| -------- | ---------------------------------------------- |
| UC1–UC5  | Booking uses airport codes for routes          |
| UC6      | Flight modification depends on airport routes  |
| UC7      | Cancellation unaffected but linked via flights |
| UC8      | Flights are created using airport data         |
| UC9      | Central source of airport information          |

---

## ✅ Key Highlights

* Centralized airport data management
* Improves flight search accuracy
* Supports auto-suggestion (real-world feature)
* Clean separation of concerns
* Scalable for global airport data

---

## ⚠️ Design Notes

* Flights should reference **airport codes instead of plain city names**
* Only **ACTIVE airports** should be used in booking/search
* Airport service should be initialized **before flight creation**

---

## 🚀 Future Enhancements

* 🌐 Integrate real airport database (IATA API)
* 🗺️ Add map-based airport selection
* ⏰ Timezone-based flight time conversion
* 📡 Live airport status updates
* 🔔 Passenger notifications based on airport changes

---

## 👨‍💻 Author

Airline Ticket Reservation System – Java Project
(Bridgelabz Training Assignment)
