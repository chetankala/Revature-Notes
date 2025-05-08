# Week 1 Notes

# Memory Management
- Call Stack
    - Keeps track of execution in a program
    - When a method is executed, it is placed on top of the call stack
    - When the method is done executing, it is popped off the call stack
    - All methods that are in the call stack are in the process of execution, with the method at the top of the call stack the one that is actively being executed line by line
    - Each method is a "stack frame"
    - Stack frame contains all of the method scoped / block scope variables currently
- Heap
    - Contains objects
    - References variables (such as method/block scoped variables) in the call stack contain the memory address location of an object in the heap
    - A special location in the heap called the **string pool** is used to store literal objects 
        - A string literal may be used multiple times in an application such as `"hello"`, but only one object will exist in the string pool for that
- Garbage Collection
    - De-allocation of memory that objects occupy is performed by the garbage collector
    - When an object no longer has any references, the garbage collector will destroy the object and free up the memory the object was occupying
    - Garbage collector is a piece of software that runs in the background on a periodic basis
    - The JVM schedules when the garbage collector runs
        - We do not have control over this process
        - It is not possible to force garbage collection to run
    - We can request the JVM to run the garbage collector
        - `System.gc()`
        - `System.runFinalize()`
        - `Runtime.getRuntime().gc()`

# Pillars of OOP
- Inheritence
    - Enables a class to gain the features (fields + methods) of another class and expand upon those if necessary
    - Establishes an IS-A relationship
    - Inheritence helps minimize redundancies in code since related classes can have a parent/super class that contains shared characteristics
    - `extends` keyword is used to indicate the parent class of a class being defined
    - In Java, only a single class can be inherited. However, the parent class can also inherit from a class, creating a hierarchy
    - Terminologies
        - Subclass (child class)
        - Superclass (parent class)
- Polymorphism
    - Means "many forms"
    - Methods can take on different forms via method overloading + overriding
    - Method overriding
        - Where a method in the parent class is redefined in as 