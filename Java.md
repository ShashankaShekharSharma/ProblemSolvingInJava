# Introduction
    Just as we need language to communicate, Programming languages are needed to communicate computational instructions
    
    Traditionally programming languages are very close to the computer architecture (Eg. Assembly) This makes the programming languages tedious and error prone
    
    In order to cope up with these problems, new languages used some level of abstraction which includes:
        - Assigning values to named variables
        - Conditional execution
        - Iteration
        - Functions/procedures
        - Aggregate data structures like arrays, list

    This results in programming languages to become more human readable and difficult for machines to understand the instructions. In order to tackle these issues, compiler and interpreter comes into place. Use of compiler and interpreter is a trade off as there is less control over how code is mapped to the architecture but there are fewer errors due to mismatch between intent and implementation 

# Compiler VS Interpreter

| **Aspect**              | **Compiler**                                              | **Interpreter**                                         |
|-------------------------|----------------------------------------------------------|-------------------------------------------------------|
| **Definition**           | Translates the entire source code into machine code before execution. | Translates and executes source code line by line.      |
| **Execution Speed**      | Faster, as the entire program is translated at once before running. | Slower, as it translates and executes code line by line. |
| **Output**               | Generates an independent executable file (e.g., `.exe`). | Does not produce a separate executable; runs the program directly. |
| **Error Detection**      | Detects and shows all syntax errors after compilation.   | Stops at the first error during execution.             |
| **Examples of Use**      | Used in languages like C, C++, Java (compilation phase). | Used in languages like Python, JavaScript.            |
| **Compilation vs. Execution** | Separate phases for compilation and execution.       | No separate phase; interpretation happens during execution. |
| **Platform Dependency**  | Once compiled, the executable is platform-specific.      | Requires the interpreter to be present on the platform. |

# Styles of Programming

| **Aspect**                | **Imperative**                                       | **Declarative**                                      |
|---------------------------|-----------------------------------------------------|----------------------------------------------------|
| **Definition**             | Focuses on *how* to perform tasks by specifying each step explicitly. | Focuses on *what* needs to be done, without explicitly specifying how. |
| **Style**                 | Procedural, step-by-step instructions.              | Describes desired outcomes using high-level abstractions. |
| **Control Flow**           | Explicitly controls the flow (loops, conditionals). | Implicit control flow handled by libraries or frameworks. |
| **Examples of Use**        | Low-level programming, like C, Java (traditional usage). | High-level programming, SQL, functional Java streams. |
| **Code Readability**       | Can become verbose and harder to understand for complex logic. | Generally concise and easier to read. |

## Sum of Even Numbers in an Array
### Imperative Way
```java
import java.util.Arrays;

public class ImperativeExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int sum = 0;

        // Explicitly specifying how to calculate the sum
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }

        System.out.println("Sum of even numbers: " + sum);
    }
}
```
## Declarative Way
```java
import java.util.Arrays;

public class DeclarativeExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};

        // Declaring what needs to be done
        int sum = Arrays.stream(numbers)
                        .filter(number -> number % 2 == 0)
                        .sum();

        System.out.println("Sum of even numbers: " + sum);
    }
}
```
# Static VS Dynamic Typing
| **Aspect**             | **Static Typing**                                      | **Dynamic Typing**                                    |
|------------------------|-------------------------------------------------------|-----------------------------------------------------|
| **Type Checking**       | Done at compile-time.                                | Done at runtime.                                    |
| **Error Detection**     | Type errors are caught during compilation.            | Type errors are caught during program execution.    |
| **Explicit Typing**     | Variables must be explicitly declared with a type.    | Variables can hold any type and can change types dynamically. |
| **Performance**         | Faster execution because type checking is done beforehand. | Slower execution due to runtime type checking.      |
| **Flexibility**         | Less flexible; type constraints must be adhered to.   | More flexible; allows variables to change types.    |
| **Examples of Languages** | Java, C, C++, Kotlin.                               | Python, JavaScript, Ruby.                          |
| **Readability and Maintenance** | Easier to read and maintain due to explicit types. | Can become harder to debug in large codebases.      |

    Dynamic typing makes it difficult to find errors whereas in static typing error identification is easy saving time and effort
    In static analysis, compilers can perform optimisations like reordering statements to optimise reads and writes; store previously computed expressions to re-use it later.

# Variables
    Variables store intermediate values during computations
    Varibles can be:
        - Local to a function
        - Global: can be referred outside the function
        - Dynamically created data
`Scope`: whether the variable is available in the program

`Lifetime`: whether the storage is still located
## Memory Stack 
    -> Each function needs storage for local variables. An activation record is created when a function is called. 
    -> Activation records are stacked:
        - Popped when function exists
        - Control link points to start of previous record 
        - Return value link tells where to store result
    -> Parameters are a part of activation record of a function and the values are populated on function cal
    
## Initialising Parameters
    1. Call by value - copy the value {updatingt the value inside the function has no side effect}
    2. Call by reference - parameters point to the same value as argument {can have side effects}

## Activation Records
    - maintained as a stack
    - control link points to the previous activation record
    - return value link tells where to store result
## Heap
    - store dynamically allocated data
    - Outlives activation record of function that created the storage
    - Need to be careful about dellocating heap storage

![alt text](image.png)

# Code Refinement
    Breaking down of code into simpler steps keeping the data structures intact for making it more readable and understandable

# Modularity
    - Use of refinement to divide solution into components
    - Build a prototype of each component to validate design
    - Components are described in terms of
      - Interfaces: viable to other components (function calls)
      - Specification: behaviour of the component (visible through interface)
    - Eg. Function: Interface (function header, arguments and return tyoe) and Specification (intended input output behavior)

# Abstraction in Programming Language
    - Functions and procedures
    - Encapsulate a block of code and reuse it in different contexts
    - Data Abstraction involves abstract data types which has a set of values and along with certain operations permitted on them
    - Internal representation should not be accessible and interaction should be restricted to private interface only
# Object Oriented Programming
    -> Object Oriented Programming was first introduced in a simulation language called Simula in 1960

    -> It involves organising Abstract Data Strucures in a hierarchy and implicit reuse of implementations using subtyping and inheritence

    -> OOP is a data centric view of programming focusing on what data we need to maintain and manipulate

    -> An object is like an abstract dataype - a hidden data with a set of public operations and all interactions are through operations: messages, methods and member function

    -> A class is a template describing the instance variables and methods for an abstract datatype

    -> An object is an instance of a class

    -> We should separate the public interface and the private implementation

## Distinguishing features of Object Oriented Programming:
    - Abstraction: public interface, private implementation
    - Subtyping: hierarchy of types, compatibility of interfaces
    - Dynamic Lookup: choices of method implementation is determined at runtime
    - Inheritance: reuse of implementations 

# Introduction to Java
   - All codes in Java lives within a class
   - Function defined inside the classes are attatched to objects
   - `System` is a public class
   - `out` is a stream object defined in System
   - The `static` modifer signifies that the function can exist independent of dynamic creaition of objects
   - In `system.out.println`, the out is a stram object
   - `println()` is a method associated with streams
   - A Java Program is a collection of classes with each class defined in a separate file with the same name and extension as java
   - Java programs are usually interpreted on Java Virutal Machine which provides an uniform execution environment across OS.
   - Semantics of Java is defined in terms of JVM and is OS independent   
## Compiling and running Java Code    
- `javac` compiles into JVM bytecode
- javac requires the file extension .java
- java should not be provided file extension .class
- javac automatically follows dependencies and compiles all classes required
- In OOP language like Java, all data should be encapsulated as objects
- Java has 8 primitive scalar data types (these are not objects)
    1. int, long, short, byte
    2. float, double
    3. char
    4. boolean
- The size of each type is fixed by JVM
- Java does automatic garbage collection
- Arrays and Strings are also objects
- All classes defined in same directory form part of the same package
- `this` keyword is a reference to current object
# Constructors
- `Constructors` are special functions called when an object is created and its name is same as that of the class
- Java also allows function overloading (same name, different signatures)
- If no construtor is defined, Java provides a default constructor with empty arguments

- Constructor is called implicitly to set up an object
  - Multiple constructors: overloading
  - Resue: one constructor can call another
  - Default constructor: if none defined
  - copy constructor: making a copy of an existing object


## Copy Constructors
    - Create new object from existing ones
    - takes an object of same type as argument
        Copies ther instance variables; use object name to distinguish which instance variable is being talked about
    - private instance variables of argument are visible

# Subclass
    - extends a parent class
    - inherits instance variables and methods
    - can add more instance variables and methods
    - cannot see private components of a parent class
    - use super to access constructor of parent class
    - can also override methods
    - Dynamic distatch ensures that the most appropiate method is called based on run time identity of the object

> Polymorphism is also called runtime or inheritance polymorphism. It is different from overloading

> Signature of a function is its name and list of argument types

> `Overloading`: multiple methods with different signatures, choice is static

> `Overriding`: multiple methods with same signature, choice is static

> `Dynamic Dispatch`: multiple methods with same signature, choice made at runtime

> Use type casting to overcome static type restrictions

# Hierarchy in Java
    - Java does not allow multiple inheritence 
    - A java class hierarchy forms a tree
    - The root of the hierarchy is a built in class called object which defines default functions like equals() and toString(). These are implicitly inherited by the class when we write
    - When we override functions we should be check the signatures
    - Class Hierarchy provides both subtyping and inheritence
    - Capabilities of a subtype are a superset of the main type. If B is a subtype of A wherever we require an object of type A we can use an object of type B
    - Inheritence is a subtype that can reuse code of the main type. B inherits from A if some fucntions for B are written in terms of functions A

# Modifiers in Java
    - Java uses many modifers in declarations to cover features of OOP
    - public and private to support encapsulation of data
    - static for entities defined inside class that exist without creating objects of the class
    - final for values that cannot be changed. It is usually used for constants.
    - These modifers can be applied to classes, instance variables and methods
    - Typically instance variables are private. Method to carry (accessor) and update (mutator) the state are public
    - Public methods to query and update private instance variables 
    - use private static instance variables to maintain bookkeeping information across objects
# Abstract Class
    - Abstract class forces subclasses to provide a concrete implementation. 
    - We cannot create objects from a class that has abstract functions. 
    - Class containing abstract methods have to be abstract.
# Interface
    An interface is a purely abstract class with no concrete components. Abstrating is possible only from one class but multiple interfaces can be implemented

    Interfaces are expressed in terms of methods that must be present and it cannot specify the intented behaviour of these function

## Static Function
    Cannot access instance variable and can be invoked directly or using interface
## Default Function
    Provide a default implementation for some functions. Class can override these functions
    
> Callbacks are useful when we spawn a class in parallel. Spawned object notifies the owner when it is done

> Polymorphism is an effect of dynamic dispatch

> Polymorphic data structures hold values of an arbitrary type, is homogeneous and should not have to cast return values

> Generics introduce structural polymorphism into Java through type variables

> Classes and functions can have type parameters 

# Reflective Programming
    Refective Programming or Reflection is the ability of a process to examine, introspect and modify its own structure and behavior

    It involves two components
    1. Introspection: A program can observe and therefore reason about its own state
    2. Intercession: A program can modify its execution state or alter its own interpretation or meaning

# The collection interface
# The list interface
# The set interface
# The Queue interface

# Errors in code
    - User Input
    - Device Errors
    - Resource Limitations
    - Code Errors
  All exceptions decends from the class throwable which has two branches
  1. Errors - not programmer's fault
  2. Exception - two sub-branches
     1. RunTimeException
        Programming errors that should have been caught by code
     2. Checked exceptions
        Typically user-defined; when code assumptions violated

> Exception Handling: gracefully recover from errors that occur when running code

> Throw an exception: generate an object encapsulating information about error

> Catch an exception: decode the nature of error and take corrective action

# Try Catch
    Enclose code that may benerate exception in a try block and exception handler in catch block. If try encounters an exception, rest of the code in the block is skipped. If exception matches the type in catch, handler code executes. Otherwise uncaught exception is passed back to the code that called the code.

    There can be more than one type of exception. Catch blocks are tried in sequence.

    Exceptions are classes in the Java class hierarchy

# Assertion
    - It is supposed to flag fatal unrecoverable errors
    - if you need to flag the error and take corrective action, use exceptions instead
    - enabled or disabled at runtime

# Diagnostic Messages
    - typical to generate messages within code for diagnosis
    - Logs are arranged in hierarchy
    - can be displayed in different formats
    - logs can be processed by processed by other code (handlers)
    - logging is controlled by configuration file
# Logging Levels
    There are seven logging levels: SEVERE, WARNING, INFO, CONFIG, FINE, FINER, FINEST

# Deep Copy vs Shallow Copy
    Bitwise copy is a shallow copy where nested mutable references are copied verbatim

    Deep copy recursively clones nested objects

    To implement clone() clonable interface needs to be called

    clone() is protected by default and it can be overridden to public if needed

# Type Inference
    - only for local variables
    - not for instance variable of a class
    - use of generic var to declare variables 
    - must be initialised when declared
    - type is inferred from the initialised value
    - automatic type inference can avoid redundancy in declarations
# Functional Interfaces
    Interfaces that define a single function are called functional interfaces
# Lambda Expressions
    Denote anonymous functions

    These are based on Lambda calculus (Alonzo Church) which is a foundational model for computing, parallel to Alan Turing's machines.

    It forms the basis for functional programming languaguages like Lisp, Scheme

    If the lamda expression consists of a single function call, we can pass that function by name --> Method Reference

> Many Languages support higher order functions (passing a function as an argument to another function). In Object Oriented Programming, this is achieved using Interfaces which encapsulate the function to be passed as an object. Java allows functions to be passed directly in place of functional interfaces (interfaces consisting of a single function)

# Stream
    - Stream Processing is declarative
    - Processing can be parallelized
    - Lazy Evaluation is possible
    - Stream does not store its elements
    - Stream operations are non destructive
`Stream.generate` generates a stream from a function. Provides a function that produces values on demand with no argument
`Stream.iterate()` a stream of dependent values - initial value, function to generate the next value from the previous one and terminate using a predicate