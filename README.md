# Contract Processing System

An automated financial application designed to process system contracts, generate installments, and calculate interest and fees using strict Object-Oriented Programming (OO) and clean architecture design patterns.

Tech Stack & Concepts
**Language**: Java
**Date & Time API**: Java 8+ `LocalDate` and `DateTimeFormatter`
**Architecture:** Interface-driven design, Dependency Injection (DI), and Inversion of Control (IoC)
**OOP Principles:** Encapsulation, Polymorphism, and Domain-driven Entities

Architecture Design
The core engine (`ContractService`) is completely decoupled from the specific payment provider. It depends strictly on the `OnlinePaymentService` interface, making it fully flexible to switch providers (e.g., from PayPal to Stripe) without changing any business logic.

How to Run: 
1. Clone this repository:
   ```bash
   git clone [https://github.com/LucasPolski/contract-processing-java.git](https://github.com/LucasPolski/contract-processing-java.git)
