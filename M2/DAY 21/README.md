
Quate of the day: 
“You have the right to work, but for the work's sake only. You have no right to the fruits of work. Desire for the fruits of work must never be your motive in working. Never give way to laziness, either".

==================================================================================
Notes for the day:
==================================================================================
IMPORT SATTEMENTS:

For static variables:

import static packname.B.staticVar;// import static variables

import packname.B; // import class from another package

fullyqualifiedclassName () can be used when import statement is not used
==================================================================================
Encapsulation:
Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.

By providing only a setter or getter method, you can make the class read-only or write-only. In other words, you can skip the getter or setter methods.

It provides you the control over the data. Suppose you want to set the value of id which should be greater than 100 only, you can write the logic inside the setter method. You can write the logic not to store the negative numbers in the setter methods.

It is a way to achieve data hiding in Java because other class will not be able to access the data through the private data members.

The encapsulate class is easy to test. So, it is better for unit testing.

==================================================================================

Inheritence:
Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object.

Inheritance represents the IS-A relationship which is also known as a parent-child relationship.

The extends keyword indicates that you are making a new class that derives from an existing class. The meaning of "extends" is to increase the functionality.

Single
Multilevel
Hierarchical
multiple => To reduce the complexity and simplify the language, multiple inheritance is not supported in java.

Upcasting in inheritence : 
- Compiler will always check the ref variable type(class)
- Instance variable always resolved on reference variable type
- Instance methods always resolved on object type


If we override the same method in child class then in case when we create the object with the ref var of parent type, Method is invoke thru the child class object then method of child class will be invoked!
but if there is no such method in the parent class then will get the CTE:

Parent has no visibility of the child, it will never interfare in the child's activity
==================================================================================
