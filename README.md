# SDA-LAB
# Event Management System

This project implements an **Observer design pattern** to create an event management system that allows different components (listeners) to react to specific events in a file editor application. The system includes various listeners that handle file operations, such as opening and saving files.

## Classes Overview

### 1. `EventListener`
- **Interface**: Defines a contract for event listeners.
- **Method**: 
  - `void update(String eventType, File file)`: Invoked when an event occurs.

### 2. `EmailNotificationListener`
- **Purpose**: Sends an email notification when a file operation occurs.
- **Constructor**: Accepts an email address for notifications.
- **Method**:
  - `void update(String eventType, File file)`: Sends an email notification regarding the operation performed on the specified file.

### 3. `LogOpenListener`
- **Purpose**: Logs the "open" operation to a specified log file.
- **Constructor**: Accepts a filename for the log file.
- **Method**:
  - `void update(String eventType, File file)`: Logs the operation to the specified log file.

### 4. `SMSSupportListener`
- **Purpose**: Sends an SMS notification when a file operation occurs.
- **Constructor**: Accepts a phone number for sending SMS.
- **Method**:
  - `void update(String eventType, File file)`: Creates a message about the file operation and sends an SMS if the message length is valid.
  - `private void sendSMS(String phoneNumber, String message)`: Simulates sending an SMS by printing to the console.

### 5. `EventManager`
- **Purpose**: Manages event subscriptions and notifications.
- **Fields**: 
  - `Map<String, List<EventListener>> listeners`: Associates event types with their listeners.
- **Methods**:
  - `void subscribe(String eventType, EventListener listener)`: Adds a listener for a specified event type.
  - `void unsubscribe(String eventType, EventListener listener)`: Removes a listener for a specified event type.
  - `void notify(String eventType, File file)`: Notifies all subscribed listeners of an event and provides the associated file.

### 6. `Editor`
- **Purpose**: Represents a file editor that can open and save files.
- **Fields**:
  - `EventManager events`: Manages event subscriptions.
  - `File file`: Represents the currently opened file.
- **Methods**:
  - `void openFile(String filePath)`: Opens a file and notifies listeners about the "open" event.
  - `void saveFile()`: Saves the file and notifies listeners about the "save" event.

### 7. `Demo`
- **Purpose**: Contains the `main` method to demonstrate the functionality of the event management system.
- **Functionality**:
  - Creates an instance of `Editor`.
  - Subscribes listeners (`LogOpenListener`, `EmailNotificationListener`, `SMSSupportListener`) to events.
  - Performs file operations and observes the resulting notifications.

## Usage

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/EventManagementSystem.git
