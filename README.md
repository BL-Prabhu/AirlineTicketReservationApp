# ✈️ Use Case 16: Business Rules and Validation

## 📌 Overview

This use case defines the **core business rules and validation logic** for the airline reservation system.
It ensures that all bookings, fares, and passenger details follow **real-world airline policies and constraints**.

---

## 🎯 Objectives

* Enforce booking eligibility rules
* Validate passenger and travel information
* Apply correct fare calculations
* Ensure compliance with airline policies

---

## 🚀 Features

---

## 🔹 1. Booking Business Rules

### 📌 Description

Validates booking requests before confirmation.

### ⚙️ Rules Implemented

* Booking allowed only **minimum 2 hours before departure**
* Maximum **6 passengers per booking**
* Infant must be accompanied by an adult
* Validate passenger age categories:

  * Infant (0–2 years)
  * Child (2–12 years)
  * Adult (12+ years)
* Validate travel document expiry
* Validate passport and visa for international flights

---

## 🔹 2. Fare Rules and Calculation

### 📌 Description

Handles complete fare calculation based on multiple factors.

### ⚙️ Fare Components

* Base fare (flight price)
* Dynamic pricing based on demand
* GST (for domestic flights)
* Airport charges
* Fuel surcharge
* Baggage charges (for excess weight)
* Seat selection charges
* Meal upgrade charges
* Promotional discounts / coupons

---

## 🧠 System Design

### 📁 service (Suggested)

* `ValidationService`

  * Handles all booking validations
* `FareService`

  * Calculates total fare

### 📁 model (Suggested)

* `Passenger`

  * Stores age and category
* `FareDetails`

  * Stores fare breakdown

---

## ⚙️ Workflow

### Booking Validation Flow

1. User enters booking details
2. System validates time (≥ 2 hours before departure)
3. Check passenger count (≤ 6)
4. Validate age categories
5. Verify documents (passport, ID)
6. Approve or reject booking

---

### Fare Calculation Flow

1. Retrieve base fare
2. Apply dynamic pricing
3. Add taxes and surcharges
4. Add optional services (seat, meal, baggage)
5. Apply discounts/coupons
6. Calculate final payable amount

---

## 📊 Example Fare Breakdown

* Base Fare: ₹5000
* GST (5%): ₹250
* Airport Charges: ₹300
* Fuel Surcharge: ₹400
* Seat Selection: ₹200
* Meal Upgrade: ₹150
* Discount: -₹300

**Total Fare: ₹6000**

---

## 📊 Advantages

✔ Ensures valid and secure bookings
✔ Accurate fare calculation
✔ Real-world airline policy simulation
✔ Prevents invalid or fraudulent bookings
✔ Improves system reliability

---

## 🔒 Considerations

* Keep business rules configurable
* Update tax and pricing rules regularly
* Handle edge cases (infants, international travel)
* Ensure accurate document validation

---

## 🔥 Integration

This use case integrates with:

* UC1–UC5 → Booking validation and pricing
* UC6 → Modification (recalculate fare)
* UC7 → Cancellation (refund rules)
* UC8 → Flight Management (dynamic pricing)
* UC12 → Notifications (fare breakdown alerts)
* UC13 → Analytics (revenue insights)
* UC15 → Search Optimization (price trends)

---

## 🎉 Conclusion

Business Rules and Validation ensure that the airline system operates with **accuracy, compliance, and real-world constraints**, making it robust, reliable, and production-ready.

---
