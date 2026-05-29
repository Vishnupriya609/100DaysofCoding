# Constructors
## A constructor is a special method in Java that is used to initialize objects.

## Rules of Constructor in Java

1. Constructor name must be the same as the class name.

2. A constructor does not have any return type, not even `void`.

3. A constructor runs automatically when an object is created.

4. Constructors are used to initialize objects.

5. A constructor can have parameters or no parameters.

6. A class can contain multiple constructors. This is called constructor overloading.

7. Constructors can use access modifiers like:

   * `public`
   * `private`
   * `protected`
   * default

8. Constructors cannot be `static`, `final`, or `abstract`.

9. If no constructor is written, Java provides a default constructor automatically.

10. Constructors can call another constructor using:

```java
this();
```

11. A parent class constructor can be called using:

```java
super();
```
