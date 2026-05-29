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

9. If no constructor is written, Java provides a default constructor automatically. *In .class file we can see the default constructor*

10. Constructors can call another constructor using:

```java
this();
```


11. A parent class constructor can be called using:

```java
super();
```

## Classification
### 1.Implicit Constructor : A constructor automatically created by Java when an object is created is called an implicit constructor.Also called *Default Constructor*.
## Example : 
```
class Demo {

    public static void main(String[] args) {

        Demo d = new Demo();  // implicit constructor is called
    }
}
```
### What Java does internally:

### Java automatically adds this hidden constructor:
### Implicit constructor(Internal Form):
```
Demo() {
    // empty constructor (provided by Java)
}
```

## 2.Explicit Constructor : An explicit constructor is a constructor that is defined (written) by the programmer to initialize objects.**Java does NOT create it automatically**

## Constructor has divided in to two types:
1.Parameterless Constructor : A parameterless constructor is a constructor that does not take any parameters. It is used to initialize objects with default values.
```
class ClassName {
    
    ClassName() {
        // statements
    }
}
```
2.Parameterized Constructor : A parameterized constructor is a constructor that takes parameters (inputs) to initialize object values at the time of object creation.
## Syntax
```
class ClassName {

    ClassName(dataType var1, dataType var2, ...) {
        // initialization code
    }
}
```
