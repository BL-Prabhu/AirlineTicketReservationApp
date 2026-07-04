# ✈️ Use Case 14: Check-In System

## 📌 Overview

This use case implements the **Online Check-In System** for the airline reservation application.
It allows passengers to check in before their flight, select or confirm seats, and receive their boarding pass.

---

## 🎯 Objectives

* Enable online check-in for passengers
* Reduce airport waiting time
* Ensure passenger and document validation
* Provide digital and printable boarding passes

---

## 🚀 Features

---

## 🔹 1. Online Check-In

### 📌 Description

Passengers can check in online within a specific time window before departure.

### ⚙️ Supported Features

* Retrieve booking 24 hours before departure
* Verify passenger details
* Confirm or change seat selection
* Generate mobile boarding pass
* Download printable boarding pass
* Update check-in status in booking
* Send boarding pass via email

---

## 🔹 2. Check-In Validation

### 📌 Description

Ensures all conditions are met before allowing check-in.

### ⚙️ Validation Rules

* Check-in allowed only between **24 hours to 3 hours before departure**
* Verify passenger identity and details
* Validate required documents (ID / Passport)
* Check baggage allowance limits
* Confirm special assistance requests
* Passport validation for international flights

---

## 🧠 System Design

### 📁 service (Suggested)

* `CheckInService`

  * Handles check-in process
* `ValidationService`

  * Performs all validations

### 📁 model (Suggested)

* `BoardingPass`

  * Contains passenger and flight details

---

## ⚙️ Workflow

### Online Check-In Flow

1. Passenger retrieves booking
2. System verifies check-in window
3. Passenger confirms or selects seat
4. System generates boarding pass
5. Booking status updated to "CHECKED-IN"
6. Boarding pass sent via email

---

### Validation Flow

1. Check time window
2. Verify passenger details
3. Validate documents
4. Check baggage rules
5. Approve or reject check-in

---

## 📄 Boarding Pass Includes

* Passenger name
* Flight number
* Seat number
* Boarding time
* Gate details
* QR code / barcode (optional)

---

## 📊 Advantages

✔ Faster airport process
✔ Improved passenger experience
✔ Reduced manual check-in workload
✔ Digital boarding pass convenience
✔ Better validation and security

---

## 🔒 Considerations

* Ensure accurate time validation
* Handle invalid or expired documents
* Prevent duplicate check-ins
* Maintain secure passenger data

---

## 🔥 Integration

This use case integrates with:

* UC1–UC5 → Booking (retrieve booking details)
* UC6 → Modification (updated seat details)
* UC7 → Cancellation (prevent check-in if cancelled)
* UC8 → Flight Management (flight schedule validation)
* UC9 → Airport Management (terminal/gate info)
* UC12 → Notifications (boarding pass email)
* UC13 → Analytics (check-in trends)

---

## 🎉 Conclusion

The Check-In System improves efficiency by enabling **online validation, seat confirmation, and digital boarding passes**, making the airline system more user-friendly and operationally efficient.

---
