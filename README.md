# ✈️ Use Case 10: Priority Booking Processing (PriorityQueue - DSA)

## 📌 Overview

This use case implements a **Priority Booking System** using the **PriorityQueue (Data Structure)** concept in Java. It ensures that high-priority bookings (Express) are processed before normal bookings (Regular).

---

## 🎯 Objectives

* Handle booking requests based on priority
* Improve booking processing efficiency
* Implement real-world queue management using DSA

---

## 🚀 Features

### 🔹 1. Priority Levels

* **EXPRESS** → High priority (processed first)
* **REGULAR** → Normal priority

---

### 🔹 2. Queue Management

* Uses Java **PriorityQueue**
* Bookings are added with:

  * Priority level
  * Timestamp (to maintain order)

---

### 🔹 3. Processing Logic

* EXPRESS bookings are processed before REGULAR
* If same priority → processed based on **timestamp (FIFO)**
* Supports:

  * Add booking to queue
  * Process next booking
  * Process all bookings

---

### 🔹 4. Fair Processing

* Ensures REGULAR bookings are not ignored
* Maintains balanced processing

---

## 🧠 DSA Concept Used

* **PriorityQueue**
* **Comparable Interface**
* Custom sorting:

  * Priority → First level sorting
  * Timestamp → Second level sorting

---

## 🏗️ Class Structure

### 📁 model

* `PriorityBooking`

  * Stores booking, priority, timestamp
  * Implements `Comparable`

### 📁 service

* `PriorityBookingService`

  * Manages queue operations
  * Handles processing logic

---

## ⚙️ Workflow

1. Create booking
2. Assign priority (EXPRESS / REGULAR)
3. Add booking to PriorityQueue
4. System sorts automatically
5. Process bookings in priority order

---

## 📊 Example Execution

Order of processing:

1. EXPRESS → User2
2. REGULAR → User1
3. REGULAR → User3

---

## ✅ Advantages

* Faster processing for urgent bookings
* Efficient queue handling
* Real-world airline booking simulation
* Demonstrates strong DSA knowledge

---

## 🔥 Integration

This use case is fully integrated with:

* UC1–UC5 → Booking
* UC6 → Modification
* UC7 → Cancellation
* UC8 → Flight Management
* UC9 → Airport Management

---

## 🎉 Conclusion

Use Case 10 enhances the system by introducing **priority-based booking processing**, making the airline reservation system more efficient, scalable, and realistic.

---
