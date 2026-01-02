## java basics
Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let application developers write once, run anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation.

# sample code 
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

# Understanding the Parts:
- class Main: Everything in Java happens inside a class. We define a class named "Main". Ideally, the file name should also be Main.java.
- public static void main(String[] args): This is the entry point.
- public: Access modifier, means it can be accessed from anywhere.
- static: It can be run without creating an object of the class.
- void: It does not return any value.
- main: The name of the method.
- String[] args: Command line arguments. We can pass inputs to the program when running it from the command line.
- System.out.println: The command to print output to the screen. println means "print line", so it moves to a new line after printing.

# data Types
 Java has 8 primitive data types to store different values.

- byte: 1 byte, small integers (-128 to 127)
- short: 2 bytes, integers
- int: 4 bytes, integers (Most common)
- long: 8 bytes, large integers
- float: 4 bytes, decimals (needs 'f' suffix, e.g., 3.14f)
- double: 8 bytes, decimals (Most common for fractions)
- char: 2 bytes, single character (e.g., 'A')
- boolean: 1 bit, true or false
