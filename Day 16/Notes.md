If you mean **comments in Java**, they are used to explain code and make it easier to understand. They are ignored by the Java compiler.

### 1. Single-line Comment

```java
// This is a single-line comment
System.out.println("Hello, World!");
```

### 2. Multi-line Comment

```java
/*
This is a
multi-line comment.
*/
System.out.println("Hello, World!");
```

### 3. Documentation Comment (Javadoc)

```java
/**
 * This program prints a greeting message.
 * @author Vishnu
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Summary

| Comment Type | Syntax       | Purpose                                        |
| ------------ | ------------ | ---------------------------------------------- |
| Single-line  | `//`         | Explain one line of code                       |
| Multi-line   | `/* ... */`  | Explain multiple lines                         |
| Javadoc      | `/** ... */` | Generate documentation for classes and methods |



> Use single-line (`//`), multi-line (`/* */`), and Javadoc (`/** */`) comments to improve code readability and documentation.
