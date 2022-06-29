==================================================================================


==================================================================================
Notes of the day:

Var agrs method:
- (int... arr)


==================================================================================
for-each loop:
- introcuded in 1.5v
- alternative to fori loop
- best to print the values only(i.e. for the iteration) and not for modification
- index can not be used in the for each loop but its possible by introducing the new var counter and making it counter++

==================================================================================
String class:
- 

==================================================================================
package imports 

javac packa\A.java
javap packa\A //here the fully qualified class name is packa.A

Access modifiers:
- defines visibility
- public,private,protected and if we do nto specify anyhing then its bydefault default
- If two classes are in same package then except private entity, rest all is visible to other class
- default can be accessed ONLY within the package
- public can be accessed anywhere 
- only public entity can be access in the class which is in the another package
- protected can be accessed out the package but only thru inheritence
- class can never be private or protected:

Note :
When we call class from another package it must be public and its constructor must be public or else we wont be able to access instance var and methods from that class but we can access the static var and methods!

If we are usiing class entities from another package then import that class  by using

import fully_qualified+className(packageName.className)
==================================================================================

*Assignment ( OOPJ - Day 7)

Given : 10101111100010101000000101

Q1)Count how many times the number of 1 and number of 0 will come.
Q2)How many times 0 will come after 1.
Q3)WAP to find out whether the string is palindrome or not.
Q4)WAP to reverse the string.
Q5)WAP to print words in reverse. 
 
 i/p: ab cd ef gh ij kl

 o/p: kl ij gh ef cd ab
