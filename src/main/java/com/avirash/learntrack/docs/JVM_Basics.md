# Java Fundamentals

## What is JDK, JRE, JVM

- **JDK (Java Development Kit):**  
  A software development kit used to develop Java applications. It includes the JRE, an interpreter/loader (Java), a compiler (javac), an archiver (jar), a documentation generator (javadoc), and other tools needed for Java development.

- **JRE (Java Runtime Environment):**  
  Provides the libraries, Java Virtual Machine (JVM), and other components to run applications written in Java. It does not contain development tools like a compiler or debugger.

- **JVM (Java Virtual Machine):**  
  An abstract machine that enables a computer to run Java programs. It converts bytecode into machine-specific instructions. JVM is platform-dependent, but bytecode is platform-independent.

---

## What is Bytecode

- Bytecode is the intermediate representation of a Java program.  
- When source code (`.java` file) is compiled by the Java compiler (`javac`), it is transformed into bytecode (`.class` file).  
- Bytecode is a set of instructions that can be executed by the JVM, making Java programs portable across different platforms.

---

## What does “Write Once, Run Anywhere” mean

Java’s slogan **“Write Once, Run Anywhere” (WORA)** refers to its portability. A Java program, once written and compiled into bytecode, can run on any device or operating system that has a compatible JVM. This eliminates the need to rewrite or recompile the program for different platforms.

In practice, this means developers can focus on writing code without worrying about hardware or operating system differences. The JVM acts as a bridge, interpreting the bytecode into native instructions for the host machine, ensuring consistent behavior across environments.