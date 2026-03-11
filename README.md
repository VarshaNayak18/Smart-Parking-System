# Smart Parking Management System 🚗

![Java](https://img.shields.io/badge/Language-Java-blue)
![OOP](https://img.shields.io/badge/Concept-OOP-orange)
![Console App](https://img.shields.io/badge/Application-Console--Based-green)

A console-based Smart Parking Management System developed using Core Java and Object-Oriented Programming principles.

The system simulates a real-world parking lot where users can park vehicles, remove them, track parking duration, calculate fees, and monitor parking revenue.

## ✨ Features

* Park vehicles in the nearest available slot
* Remove vehicles and calculate parking fees automatically
* Vehicle search using vehicle number
* Display detailed parking slot status
* Vehicle type pricing (Car / Bike)
* Total revenue tracking
* Formatted entry timestamps (Indian Standard Time)
* Menu-driven console interface

## 🛠 Tech Stack

* Java
* Object-Oriented Programming
* ArrayList (Java Collections)
* Java Time API
* Scanner (User Input Handling)

## 📂 Project Structure

The core application logic is implemented inside the `src` directory using modular Java classes.

```
Smart-Parking-System
│
├── src
│   ├── Main.java
│   ├── Vehicle.java
│   ├── ParkingSlot.java
│   ├── ParkingLot.java
│   └── VehicleType.java
│
├── README.md
└── .gitignore
```

## ⚙️ How It Works

1. The user enters the total number of parking slots.
2. Vehicles can be parked by entering vehicle number and type.
3. The system automatically assigns the first available slot.
4. When a vehicle leaves:

   * Parking duration is calculated
   * Parking fee is generated
5. Users can search for parked vehicles.
6. The system maintains total parking revenue.

## 🧠 System Design

This project follows Object-Oriented Design:

````
Vehicle
   │
   │ parked in
   ▼
ParkingSlot
   │
   │ managed by
   ▼
ParkingLot
   │
   │ controlled by
   ▼
Main (Menu System)
````

## ▶️ How to Run the Project

### Prerequisites

- Java JDK 17 or later
- VS Code / IntelliJ / Eclipse (any Java IDE)

### Steps

1. Clone the repository

```bash
git clone https://github.com/VarshaNayak18/smart-parking-management-system.git
```

2. Navigate to the project folder

```bash
cd smart-parking-management-system
```

3. Open the project in your preferred Java IDE.

4. Run the program

Run the **Main.java** file.

5. Follow the console menu to interact with the parking system.

```
----- PARKING MENU -----

1. Park Vehicle
2. Remove Vehicle
3. Show Parking Status
4. Find Vehicle
5. Show Total Revenue
6. Exit
```

## 🚀 Future Improvements

- Add GUI interface using JavaFX
- Store parking data using MySQL database
- Build REST API backend with Spring Boot
- Integrate IoT-based parking sensors






