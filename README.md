# ✈️ Use Case 12: Notification System

## 📌 Overview

This use case implements a **Notification System** for the airline reservation application.
It ensures that passengers receive **real-time updates and confirmations** via multiple communication channels like Email, SMS, and WhatsApp.

---

## 🎯 Objectives

* Notify users about booking, flight updates, and cancellations
* Improve user experience with timely communication
* Provide multi-channel notification support
* Ensure transparency in booking and payment processes

---

## 🚀 Features

---

## 🔹 1. Booking Notifications

### 📌 Description

Notifications sent immediately after a successful booking.

### ⚙️ Supported Notifications

* Booking confirmation email with **e-ticket**
* SMS confirmation with **PNR number**
* Payment receipt via email
* WhatsApp notification (optional)

### 📄 Includes

* Passenger details
* Flight information
* Seat details
* Travel date & time

---

## 🔹 2. Flight Update Notifications

### 📌 Description

Notifications sent when there are changes in flight status.

### ⚙️ Supported Notifications

* Flight delay alerts
* Gate change notifications
* Flight cancellation alerts
* Check-in reminders (24 hours before departure)
* Boarding reminders (3 hours before departure)

---

## 🔹 3. Modification & Cancellation Notifications

### 📌 Description

Notifications triggered when booking is modified or cancelled.

### ⚙️ Supported Notifications

* Booking modification confirmation with updated e-ticket
* Cancellation confirmation
* Refund initiation notification
* Refund completion notification

---

## 🧠 System Design

### 📁 service (Suggested)

* `NotificationService`

    * Handles all notification logic
* `EmailService`
* `SMSService`
* `WhatsAppService` (optional)

---

## ⚙️ Workflow

### Booking Flow

1. Booking completed
2. Payment successful
3. Trigger notification service
4. Send email + SMS + (optional WhatsApp)

---

### Flight Update Flow

1. Flight status updated
2. System detects change
3. Notify all affected passengers

---

### Cancellation Flow

1. Booking cancelled
2. Refund initiated
3. Notifications sent for both events

---

## 📊 Advantages

✔ Real-time communication
✔ Improved customer satisfaction
✔ Transparency in booking lifecycle
✔ Multi-channel notification support
✔ Easy integration with external APIs

---

## 🔒 Considerations

* Handle notification failures (retry mechanism)
* Avoid duplicate notifications
* Ensure user contact details are valid
* Maintain logs for all notifications

---

## 🔥 Integration

This use case works with:

* UC1–UC5 → Booking (confirmation notifications)
* UC6 → Modification (update notifications)
* UC7 → Cancellation (refund notifications)
* UC8 → Flight Management (status updates)
* UC10 → Priority Booking (high-priority alerts)
* UC11 → Singleton Managers (centralized control)

---

## 🎉 Conclusion

The Notification System enhances the airline application by providing **timely, accurate, and multi-channel communication**, making the system more user-friendly and reliable.

---
