# User Input
## User input means taking data from the user through the keyboard during program execution.
1. Using Scanner Class
   
 2.Using BufferedReader

3. Multiple Inputs in One Line

## Using Scanner Class 
### The Scanner class is used to take input from the user in Java. We create an object of the Scanner class, and it reads input from the input stream System.in. It is present in the java.util package.

## User Input Types

| Type    | Method           |
| ------- | ---------------- |
| String  | nextLine()       |
| int     | nextInt()        |
| float   | nextFloat()      |
| double  | nextDouble()     |
| char    | next().charAt(0) |
| boolean | nextBoolean()    |

## Types
### 🔹 1. String Input : Used for names, words, sentences
```
String name = sc.nextLine();
```

### 🔹 2. Integer Input : Used for whole numbers
```
int age = sc.nextInt();
```

### 🔹 3. Float Input : Used for decimal values (small precision)
```
float marks = sc.nextFloat();
```
### 🔹 4. Double Input : Used for decimal values (high precision)
```
double salary = sc.nextDouble();
```
### 🔹 5. Character Input : Used for single character
```
char ch = sc.next().charAt(0);
```
### 🔹 6. Boolean Input : Used for true/false values
````
boolean flag = sc.nextBoolean();
````
