# Objects
## An object is a real-world instance of a class.It is used to access variables (data) and methods (behavior) defined in a class.

🔹 Simple Definition:

👉 Object = instance of a class

##  Syntax to Create Object:
```
ClassName objName = new ClassName();
```
⭐ Key Points:
- Object is created using new keyword
- Object occupies memory in heap
- Object can access class members using dot . operator
- One class can have many objects
  
## In programming (important difference)

### In Java and similar languages:

###  Even if two objects have the same values, they are still different objects in memory.

### Example:
```
Student s1 = new Student();
Student s2 = new Student();
```
✔ s1 and s2 are two different objects
✔ They have separate memory locations
