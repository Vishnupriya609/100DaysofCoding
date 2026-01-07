# Day 2:Java-JIT Compiler,Editions,Java Structure
## 🔥 JIT Compiler (Just-In-Time Compiler) – Detailed Explanation
### 1️⃣ What is JIT Compiler?

JIT (Just-In-Time) Compiler is a part of the JVM that improves the performance of Java programs.

👉 It converts bytecode into native machine code at runtime (while the program is running).

### 2️⃣ Why JIT Compiler is Needed?

Initially, Java used only an Interpreter.

❌ Problem with Interpreter

Reads bytecode line by line

Converts it every time

Slow execution

👉 This caused performance issues.

### 3️⃣ How JIT Solves the Problem

JIT improves speed by:

Detecting frequently used code

Compiling it once into machine code

Storing it in memory

Reusing it whenever needed

### 4️⃣ JVM Execution Without JIT
Bytecode
   ↓
Interpreter
   ↓
Machine Code
   ↓
Execution


❌ Slower (repeated conversion)

### 5️⃣ JVM Execution With JIT
Bytecode
   ↓
Interpreter (initially)
   ↓
JIT Compiler (hot code)
   ↓
Native Machine Code
   ↓
Fast Execution


✔ Faster
✔ Optimized
✔ Efficient

### 6️⃣ What is “Hot Code”?

Hot code =
Code that:

Runs many times

Is frequently executed (loops, methods)

👉 JIT targets only hot code, not the entire program.

### 7️⃣ JIT Compiler Features

Runtime compilation

Improves performance

Optimizes code

Reduces execution time

Platform-specific optimization

### 8️⃣ Interpreter vs JIT Compiler (IMPORTANT)
Feature	Interpreter	JIT Compiler
Execution	Line by line	Compiles whole method
Speed	Slow	Fast
Compilation Time	None	Runtime
Optimization	No	Yes
### 9️⃣ Does Java Compile Twice?

✔ YES

1️⃣ First Compilation

.java → javac → .class (bytecode)


2️⃣ Second Compilation (JIT)

Bytecode → Machine Code (at runtime)

