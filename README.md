# ✈️ Airline Ticket Reservation - Use Case 7 (Booking Cancellation)

## 📌 Features Implemented

### 1. Full Booking Cancellation
- Retrieve booking
- Validate cancellation eligibility (time-based)
- Calculate refund after deduction
- Update booking status to CANCELLED
- Release seat
- Process refund

### 2. Partial Booking Cancellation
- Cancel selected passengers
- Calculate per-passenger refund
- Update remaining passengers
- Process partial refund

### 3. Cancellation Policy
- 80% refund for high fare (>5000)
- 90% refund for normal fare
- No cancellation allowed within 1 hour of departure

---

## 🛠️ Tech Used
- Java
- OOP Concepts
- Service Layer Design

---

## ▶️ How to Run
1. Run `CancellationDemo.java`
2. Observe:
    - Full cancellation flow
    - Partial cancellation flow

---

## 📂 Structure
model/
booking/
service/
payment/

---

## 🚀 Future Improvements
- Dynamic cancellation policy
- Database integration
- Email/SMS notification
- Seat availability update

---

## 👨‍💻 Author
Prabhu