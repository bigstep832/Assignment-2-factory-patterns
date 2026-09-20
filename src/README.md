# Assignment 2 - Factory Method and Abstract Factory

## Project Purpose

This project demonstrates the Factory Method and Abstract Factory design patterns in a simple Java logistics application.

The application supports:

* Road and sea delivery.
* Windows and macOS UI component families.

The application is console-based. UI components are represented by console messages.

## Technologies

* Java
* JDK 17
* IntelliJ IDEA
* Git and GitHub

## Project Structure

```text
src/
└── main/
    └── java/
        ├── app/
        │   ├── Main.java
        │   └── DeliveryApplication.java
        │
        ├── factorymethod/
        │   ├── Transport.java
        │   ├── Truck.java
        │   ├── Ship.java
        │   ├── Logistics.java
        │   ├── RoadLogistics.java
        │   └── SeaLogistics.java
        │
        └── abstractfactory/
            ├── Button.java
            ├── Checkbox.java
            ├── WindowsButton.java
            ├── WindowsCheckbox.java
            ├── MacOSButton.java
            ├── MacOSCheckbox.java
            ├── GUIFactory.java
            ├── WindowsFactory.java
            └── MacOSFactory.java

uml/
├── FactoryMethod.puml
└── AbstractFactory.puml
```

## Design Patterns

### Factory Method

The Factory Method pattern is used to create transport objects.

`Logistics` defines the `createTransport()` factory method and the shared `planDelivery()` workflow.

`RoadLogistics` creates a `Truck`, while `SeaLogistics` creates a `Ship`.

### Abstract Factory

The Abstract Factory pattern is used to create matching UI components.

`GUIFactory` defines methods for creating a `Button` and a `Checkbox`.

`WindowsFactory` creates Windows components, while `MacOSFactory` creates macOS components.

## Prerequisites

Java JDK 17 or later must be installed.

Check the Java version:

```bash
java -version
```

## How to Run

Open the project in IntelliJ IDEA and run:

```text
src/main/java/app/Main.java
```

The application asks for two inputs:

```text
Delivery mode: ROAD or SEA
UI platform: WINDOWS or MACOS
```

## Supported Input

Delivery modes:

```text
ROAD
SEA
```

UI platforms:

```text
WINDOWS
MACOS
```

Input is case-insensitive.

## Sample Run

```text
Enter delivery mode (ROAD or SEA): ROAD
Enter UI platform (WINDOWS or MACOS): WINDOWS

Rendering Windows button
Rendering Windows checkbox
Truck delivers laboratory equipment to Aktau warehouse
```

## Invalid Input

If an unsupported delivery mode or UI platform is entered, the application displays a validation message and stops without creating invalid objects.

