# Design Choices in Java Project

## Why I Used ArrayList Instead of Array
- **Dynamic sizing:** Arrays have a fixed size, while `ArrayList` can grow or shrink dynamically as elements are added or removed.  
- **Built-in methods:** `ArrayList` provides convenient methods like `add()`, `remove()`, `contains()`, and `size()`, which simplify coding compared to manual array management.  
- **Ease of iteration:** Enhanced for-loops and iterators work seamlessly with `ArrayList`.  
- **Flexibility:** It allows storing objects without worrying about resizing or manual shifting of elements.

---

## Where I Used Static Members and Why
- **Utility methods:** Static methods were used in helper classes (e.g., validation methods) because they don’t depend on instance-specific data.  
- **Constants:** Static final variables were used to store constant values (e.g., maximum capacity, default messages) to ensure consistency across the application.  
- **Shared resources:** Static members allowed common data or functionality to be accessed without creating multiple objects, improving efficiency.

---

## Where I Used Inheritance and What I Gained From It
- **Base class for entities:** A parent class (e.g., `Person`) was created with common attributes like `name` and `id`. Subclasses (e.g., `Student`, `Teacher`) inherited these properties.  
- **Code reuse:** Inheritance reduced duplication by allowing shared methods (like `displayInfo()`) to be defined once in the parent class.  
- **Polymorphism:** Enabled handling different objects (students, teachers) through a common interface, making the system more extensible.  
- **Maintainability:** Changes in the parent class automatically propagated to subclasses, simplifying updates and ensuring consistency.