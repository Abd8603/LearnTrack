#JDK Version Used

JDK 17 (or whichever version is installed on your system).JDK 17 is a long‑term support (LTS) release, widely used for stable development.

Running a “Hello World” Program

Create a file named HelloWorld.java.

##Write the code:

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

##Compile the program using:

javac HelloWorld.java

This generates a HelloWorld.class file (the bytecode).

Run the program using:

java HelloWorld

##Output:

Hello, World!

#✨ Why This Matters

This simple program verifies that your JDK installation is working correctly.

It demonstrates the Java compilation and execution process: source code → bytecode → JVM execution.

Once this runs successfully, you’re ready to build more complex applications like your console menu system.