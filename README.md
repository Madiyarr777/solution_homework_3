# Castle Builder & Prototype Demo

Implementation of **Builder** and **Prototype** design patterns in Java for creating game objects.

## 📁 Project Structure
```
src/
├── Chamber.java              # Room (implements cloning)
├── GameCharacter.java        # Character
├── ICastleBuilder.java       # Builder interface
├── CopyableEntity.java       # Copy interface
├── BasicCastleBuilder.java   # Castle builder
├── Castle.java               # Castle class
├── CastleBuilderDemo.java    # Builder demo
├── CastlePrototypeDemo.java  # Prototype demo
└── CastleCombinedDemo.java   # Combination of patterns
```

## ▶️ How to Run

1. **Compile the code:**
   ```bash
   javac src/*.java
   ```

2. **Run the desired demo:**
   
   **Builder:**
   ```bash
   java -cp src CastleBuilderDemo
   ```
   
   **Prototype:**
   ```bash
   java -cp src CastlePrototypeDemo
   ```
   
   **Combined:**
   ```bash
   java -cp src CastleCombinedDemo
   ```

## 📜 Example Output

**CastleBuilderDemo:**
```
Built castle: Camelot
Rooms: 1
Characters: 1
```

**CastlePrototypeDemo:**
```
Original: Archive
Copy: Archive (copy)
```

## ⚙️ Requirements
- Java 11 or later
- Git (for cloning the repository)

## 📄 License
[MIT License](LICENSE)

