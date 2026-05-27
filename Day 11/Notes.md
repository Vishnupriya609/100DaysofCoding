# Operators 
## Operator is a symbol that perform operations on variables & values.
# Different types of Operators
## Arithmetic Operator : An arithmetic operator is a symbol used in mathematics and programming to perform basic calculations.
### Example: Addition(+),Subtraction (-),Multiplication(*),Division(/),Modulus(%)
| Operator    | Meaning             | Example  | Result |
| ----------- | ------------------- | -------- | ------ |
| `+`         | Addition            | `5 + 3`  | `8`    |
| `-`         | Subtraction         | `9 - 4`  | `5`    |
| `*`         | Multiplication      | `6 * 2`  | `12`   |
| `/`         | Division            | `10 / 2` | `5`    |
| `%`         | Modulus (remainder) | `10 % 3` | `1`    |
| `**` or `^` | Exponent (power)    | `2 ** 3` | `8`    |

## Unary Operator : A unary operator is an operator that works with only one operand (value/variable).

| Operator | Meaning     | Example        |
| -------- | ----------- | -------------- |
| `+`      | Unary plus  | `+a`           |
| `-`      | Unary minus | `-a`           |
| `++`     | Increment   | `a++` or `++a` |
| `--`     | Decrement   | `a--` or `--a` |
| `!`      | Logical NOT | `!true`        |

###Types for Increment & Decrement
| Operator  | Pre   | Post  |
| --------- | ----- | ----- |
| Increment | `++a` | `a++` |
| Decrement | `--a` | `a--` |

### Differences
| Type | Working            |
| ---- | ------------------ |
| Pre  | Change value first |
| Post | Use value first    |


## Relational Operator : Relational operators are used to compare two values.
### The result is always a boolean value:

- true
- false
| Operator | Meaning                  | Example  |
| -------- | ------------------------ | -------- |
| `==`     | Equal to                 | `a == b` |
| `!=`     | Not equal to             | `a != b` |
| `>`      | Greater than             | `a > b`  |
| `<`      | Less than                | `a < b`  |
| `>=`     | Greater than or equal to | `a >= b` |
| `<=`     | Less than or equal to    | `a <= b` |

### Important
| Symbol | Meaning             |
| ------ | ------------------- |
| `=`    | Assignment operator |
| `==`   | Comparison operator |

## Logical Operators : Logical operators are used to combine or reverse boolean conditions.
### The result is always:

- true
- false

| Operator | Name        | Meaning                                          |
| -------- | ----------- | ------------------------------------------------ |
| `&&`     | Logical AND | Returns `true` if both conditions are true       |
| `\|\|`   | Logical OR  | Returns `true` if at least one condition is true |
| `!`      | Logical NOT | Reverses the boolean value                       |

### Truth Table


| A       | B       | A && B  | A || B  |
| ------- | ------- | ------- | ------- |
| `true`  | `true`  | `true`  | `true`  |
| `true`  | `false` | `false` | `true`  |
| `false` | `true`  | `false` | `true`  |
| `false` | `false` | `false` | `false` |

### NOT Operator Table

| A       | !A      |
| ------- | ------- |
| `true`  | `false` |
| `false` | `true`  |

## Assignment Operators : Assignment operators are used to assign values to variables.
| Operator | Meaning             | Example  |
| -------- | ------------------- | -------- |
| `=`      | Simple assignment   | `a = 10` |
| `+=`     | Add and assign      | `a += 5` |
| `-=`     | Subtract and assign | `a -= 5` |
| `*=`     | Multiply and assign | `a *= 5` |
| `/=`     | Divide and assign   | `a /= 5` |
| `%=`     | Modulus and assign  | `a %= 5` |

## Conditional Operator : The conditional operator is also called the ternary operator used for short hand of simple if-else statements.It is only operator takes three operands.

### syntax
---
condition ? true_value : false_value;
---

## Bitwise Operators : Bitwise operators work on the binary (0 and 1) representation of numbers. They are used for low-level programming, performance optimization, and memory-efficient operations.
<img width="1440" height="974" alt="image" src="https://github.com/user-attachments/assets/6044cac9-8499-4b1a-8d34-734128dde1ab" />

### Bitwise complement : The bitwise complement operator is also called the NOT operator. It flips every bit of a number.

### Why result becomes negative?
#### Java uses 2’s complement representation for negative numbers.
#### Formula :
```
~n = -(n + 1)
```

### Bitwise operators for negative numbers 
#### In Java, negative numbers are stored using 2’s complement representation, not directly as “minus sign + value”. That’s why bitwise operations behave a bit differently for negatives.
### 1. How negative numbers are stored
#### Example: -5
#### Step 1: Take +5 in binary (8-bit)
```
5  = 0000 0101
```
#### Step 2: 1’s complement (flip bits)
```
1111 1010
```
#### Step 3: Add 1 (2’s complement)
```
1111 1011  → this is -5
```
