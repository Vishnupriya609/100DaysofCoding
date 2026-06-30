# Variables 
## What is Variable?
### Based on object has properties & behaviours, properties are variables/fields, behaviours are methoods according to programming.

### Variable is a container which holds the value to access while java program is executed 

<h3 align="center">(OR)</h3>

### Variable are store the information or to present like dog properties are color,breed,height,weight etc...

<img width="364" height="138" alt="image" src="https://github.com/user-attachments/assets/82f8c5db-8e50-40af-9f17-950f04c192f1" />

### Example: int number; ---> Define   , int number = 50; ---> Initialization


## Rules

1. Variable names can use letters, numbers, `_`, and `$`.

2. Variable names cannot start with a number.

3. Spaces are not allowed in variable names.

4. Java keywords cannot be used as variable names.

5. Variable names are case-sensitive.

6. Variables should have meaningful names.

7. Java commonly uses camelCase naming style.

8. Every variable must have a data type.

9. Local variables must be initialized before use.


## Types of Variables in Java

1. **Local Variable**

   * Declared inside a method, constructor, or block.
   * Accessible only within that method or block.
   * Must be initialized before use.

2. **Instance Variable**

   * Declared inside a class but outside methods.
   * Belongs to an object.
   * Each object has its own copy.

3. **Static Variable (Class Variable)**

   * Declared with the `static` keyword.
   * Belongs to the class, not to individual objects.
   * Shared by all objects of the class.

4. **Parameter Variable**

   * Declared in a method or constructor parameter list.
   * Receives values (arguments) when the method or constructor is called.
   * Exists only during the execution of that method or constructor.

### Summary Table

| Variable Type      | Declared In                     | Scope                          |
| ------------------ | ------------------------------- | ------------------------------ |
| Local Variable     | Inside a method/block           | Within the method/block        |
| Instance Variable  | Inside a class, outside methods | Per object                     |
| Static Variable    | Inside a class with `static`    | Shared by all objects          |
| Parameter Variable | Method/constructor parameters   | Within that method/constructor |

