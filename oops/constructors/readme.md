# Constructor 
- A constructor is a special method in a class designed to initialize an object when it is created. It ensures that the object is set up with the required attributes and state before it is used.

# Keypoints:
Syntax: A constructor is a method that has the exact same name as the class and does not have a return type (not even void).
A constructor is called when an object is created. This justifies why the above code snippets gives the shown output.
If there is no constructor written for the given class, the language by-default triggers the default constructor.

# Purpose of Constructor
There are three major purposes behind creating a constructor for a class which are as follows:

Object Initialization: Constructor helps in initializing an object at the time of creation by assigning it default or user-defined values to object attributes.
Code Reusability: Everytime an object is created, the same code is reused preventing writing mulitple lines of codes to initialize different objects.
Ensures Default Value: Ensures that the object is always started in a default state with default values when initiated.

# Types of Constructor:
There are three different types of constructos:

- Non-parameterized Constructor
- Parameterized Constructor
- Copy Constructor

# 1. Non-parameterized Constructor:
When a constructor does not take any arguments as the input, it is called a Non-parameterized Constructor. For example, in the given code snippet there are not arguments taken by the constructor.

# 2. Parameterized Constructor:
It is a type of constructor that accepts arguments to initialize attributes with specific values. For example, the following code snippet shows a parameterized constructor initializing the attributes of the object with the arguments provided by the user.

# 3. Copy Constructor:
It enables the programmer to create a new object by copying the attributes of an existing object. Java doesn't have an explicit copy constructor like C++ does. However, a copy constructor can be implemented manually by creating a constructor that takes an object of the same class as a parameter and copies its attributes using Constructor Chaining.

# Constructor Chaining
In Java, a constructor can call another constructor of the same class using the this() keyword. This is known as constructor chaining and is used to reduce code duplication and simplify initialization logic.

# Keypoints:
The this() call must always be the first statement in the constructor.
It allows one constructor to reuse the logic of another constructor in the same class.
The chaining stops when the constructor without a this() call (usually the one with the least number of parameters) is invoked.
There is no limit on the chain length in constructor chaining.
Use-case:
- Constructor chaining is particularly useful in scenarios where a class has multiple constructors with different levels of detail for initializing an object. By chaining constructors, duplicating initialization logic can be avoided while maintaining a single point of truth for setting up the object's state.

# Constructor Overloading
Constructor overloading occurs when a class has more than one constructor, but each constructor has a different parameter list or different parameter type. It allows an object to be initialized in different ways depending on the parameters provided at the time of object creation. Consider the code snippet given below:
