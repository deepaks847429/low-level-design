# Class
- In object-oriented programming, a Class is a blueprint or template for creating objects. It is the logical representation that defines a set of attributes (data) and methods (functions) that the objects created from the class will have. A class does not occupy memory on its own. It's essentially a definition or a structure from which individual objects are instantiated.

- Keypoints:
The Employee class acts as a blueprint that has the set of attributes and methods defined in it providing a logical meaning to a real-world entity employee.
The Employee class has a set of attributes (employeeName and salary) and a set of methods (functions like setName, setSalary, getSalary) providing different functionality.

# Objects
- The Employee class acts as a blueprint that has the set of attributes and methods defined in it providing a logical meaning to a real-world entity employee.
The Employee class has a set of attributes (employeeName and salary) and a set of methods (functions like setName, setSalary, getSalary) providing different functionality.


# Attributes & Behaviours

- Attributes:
Attributes (also called properties or fields) are the data or characteristics of an object. They represent the state of the object at any given moment. Attributes are typically defined within a class and can hold different types of information related to the object.
For example, In the Employee class, there are two attributes: employeeName and salary
- Behaviours:
Behaviors (also called methods or functions) are the actions or operations that an object can perform. They define how the object interacts with its environment or other objects. Behaviors are implemented in methods and represent the functionality of the object.
For example, In the Employee class, there are three behaviours/methods: setName(), setSalary() and getSalary().

# Creation of an object
- Creation of an object
In order to create an object of the Employee class in Java, the following statement was used:

// Creating an object of Employee class
Employee obj1 = new Employee();
Keypoints:
Creating a new object:
The keyword new is used to create a new instance of the Employee class. This is where the object is allocated in memory, and the constructor of the Employee class is invoked (if defined, otherwise the default constructor is used).
This object is created in the heap memory, which is used for dynamically allocated memory in Java.
Assigning the reference to the variable:
obj1 is a reference variable of type Employee. When we write:
obj1 = new Employee();
we are assigning a reference to the newly created object in the heap to the obj1 variable.
This reference is stored in stack memory because local variables (such as obj1) are stored in the stack.
The reference is essentially a memory address pointing to the location where the actual object (the instance of Employee) resides in the heap.

# Deletion of an object
In Java, objects are deleted automatically by the Garbage Collector (GC). Java handles memory management and deallocates objects that are no longer in use or referenced, which helps avoid memory leaks.

An object becomes eligible for deletion when there are no active variable or reference pointing to it. The garbage collector periodically scans the heap memory to identify and collect objects that are no longer being used.

# Understanding Stack and Heap Memory Allocation

- 1. Stack Memory
The stack is where primitive variables (such as int, double, boolean) and references to objects (like obj1) are stored.
obj1 will hold the reference (memory address) of the object created by new Employee().
When the main method finishes executing, the stack memory associated with obj1 will be cleared, but the object in the heap will remain as long as there are references pointing to it.
- 2. Heap Memory
The heap is where objects (instances of classes) are stored. The object created by new Employee() is allocated memory in the heap.
The Employee object will have its attributes (e.g., salary, employeeName) stored here.
This memory will remain allocated as long as there are references pointing to it. Once there are no more references to the object (i.e., the reference in the stack becomes null or goes out of scope), the object can be garbage collected.


