# Spending Tracker - GUI Application  

## Overview  
A Java-based **GUI application** for tracking personal spending habits. Users can log purchases, manage a list of products, and visualize their spending data. The app uses **binary file storage** for persistence and a **singly-linked list (SList)** for efficient in-memory operations.  

---

## Features  
### **GUI Functionality**  
- **Add/Remove Purchases**  
  - Add new items with name, price, and category.  
  - Remove or edit existing entries.  
- **Data Visualization**  
  - Charts/graphs to display spending trends (e.g., weekly/monthly).  
- **Search & Filter**  
  - Find items by name, price range, or category.  

### **Backend Operations**  
- **File I/O**  
  - `writeProductItemToFile`: Saves new purchases to a binary file.  
  - `readProductItemsFromFile`: Loads saved data into the app on startup.  
- **Linked List Management** (`SList`)  
  - `addAfter`/`addBefore`: Insert items at specific positions.  
  - `remove`: Delete entries and return removed data.  
  - `search`: Quick lookup for specific purchases.  
  - `toString`: Serializes data for display in the GUI.  

---

## Technical Implementation  
### **Tech Stack**  
- **Frontend**: JavaFX for responsive UI.  
- **Backend**: Pure Java with serialization for binary storage.  

### **Data Structures**  
- **Singly-Linked List (`SList`)**  
  - Efficient insertion/deletion (`O(1)` for head/tail, `O(n)` for search).  
  - Supports dynamic updates during runtime.  

### **Storage**  
- Binary files (`.bin`) for compact, secure data persistence.  

---

## Screenshots (Concept)  
1. **Dashboard**: Overview of recent purchases and spending summary.  
2. **Add Purchase Form**: Fields for item details.  
3. **Search Panel**: Filterable table of logged items.  

---

## Project Structure
```
src/  
├── gui/  
│   ├── MainUI.java       # Primary GUI
├── Main.java
```  

---

## Requirements
- **Java 11+** (for JavaFX support)
- **Build Tool**: Maven/Gradle (optional).

---

## Notes
- Designed for **user-friendly budgeting** with minimal setup.
- Extensible for future features (e.g., multi-user support, cloud sync).

---
