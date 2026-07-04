
---

# ✅ Download & Getting Started with Eclipse IDE

## What is Eclipse?

**Eclipse IDE (Integrated Development Environment)** is a free, open-source software used by developers to **write, compile, debug, and run Java programs** in a single application.

It provides many useful features such as:

* ✅ Code Editor
* ✅ Syntax Highlighting
* ✅ Auto Completion
* ✅ Debugging Tools
* ✅ Project Management
* ✅ Built-in Console

---

# Download & Install Eclipse IDE

The official website is:

**Eclipse:** [https://www.eclipse.org/](https://www.eclipse.org/)

## Installation Steps

* Do **not** download Eclipse directly from the homepage.
* Click **Downloads → Eclipse Packages**.
* Choose the package according to your needs.

### Popular Eclipse Packages

* [**Eclipse IDE for Java Developers** (Recommended for Core Java)](https://www.eclipse.org/downloads/packages/release/2026-03/r/eclipse-ide-java-developers)
* [**Eclipse IDE for Enterprise Java and Web Developers**](https://www.eclipse.org/downloads/packages/release/2026-03/r/eclipse-ide-enterprise-java-and-web-developers)
*[**Eclipse IDE for C/C++ Developers**](https://www.eclipse.org/downloads/packages/release/2026-03/r/eclipse-ide-cc-developers)
* [**Eclipse IDE for Eclipse Committers**](https://www.eclipse.org/downloads/packages/release/2026-03/r/eclipse-ide-eclipse-committers)
* [**Eclipse IDE for PHP Developers**](https://www.eclipse.org/downloads/packages/release/2026-03/r/eclipse-ide-php-developers)

> I chose **Eclipse IDE for Java Developers** because I am currently focusing on Core Java.

* Select a download mirror (country/server).
* Download the ZIP file.
* Extract the ZIP file.
* Open the extracted folder and launch **eclipse.exe**.
* Select a workspace location when Eclipse starts.

---

# Getting Started with Eclipse IDE

## What is a Workspace?

A **workspace** is a physical folder on your computer that Eclipse uses to store your projects and settings.

A workspace serves two main purposes:

* Organizes a collection of related projects.
* Stores Eclipse preferences and configuration settings.

> You can create and switch between multiple workspaces whenever needed.

---

# Important Sections in Eclipse IDE

* **Menu Bar** – Contains all Eclipse commands.
* **Toolbar** – Provides quick access to commonly used actions.
* **Package Explorer** – Displays Java projects, packages, and files.
* **Editor (Work Area)** – Area where you write and edit code.
* **Console** – Displays program output and error messages.

### If Any Section Is Closed

Go to:

```text
Window → Show View
```

Then select the required view (such as **Package Explorer** or **Console**).

---

# Writing and Executing Your First Java Program

## What is a Project?

A **project** is a container that stores all the files, folders, libraries, and resources required for a Java application.

---

## How to Create a Java Project

1. Click **File → New → Java Project**.
2. Enter the project name.
3. Select the installed JDK (Execution Environment/JRE).
4. Choose the project layout (default is recommended).
5. Click **Finish**.

Eclipse automatically creates:

* **src** → Stores Java source files.
* **JRE System Library** → Contains Java libraries.
* **bin** → Stores compiled `.class` files.

---

## Creating Packages and Classes

* Right-click the **src** folder.
* Select **New → Package**.
* Enter the package name.
* Right-click the package.
* Select **New → Class**.
* Enter the class name.
* Select **public static void main(String[] args)** if required.
* Click **Finish**.

---

## Running a Java Program

* Write your Java code.
* Click **Run ▶** or right-click the file.
* Select:

```text
Run As → Java Application
```

The output appears in the **Console** window.

---

# Useful Eclipse Shortcuts

| Shortcut                  | Purpose                              |
| ------------------------- | ------------------------------------ |
| `main` + `Ctrl + Space`   | Generates the `main()` method        |
| `sysout` + `Ctrl + Space` | Generates `System.out.println()`     |
| `Ctrl + Shift + F`        | Formats the code                     |
| `Ctrl + Shift + O`        | Organizes imports                    |
| `Ctrl + /`                | Comments or uncomments a line        |
| `Ctrl + Space`            | Displays code completion suggestions |
| `Ctrl + S`                | Saves the current file               |

---

# Eclipse Project Structure

```text
Java Project
│
├── src
│   ├── package
│   │     └── Class.java
│
├── JRE System Library
│
└── bin
      └── Class.class
```







