NOTES FOR THE DAY
===========================
Exception Handling:

Heirarchy:
Object<Throwable <Error <Exception 
Error has 4 diff types
Exception has 5 diff types
============================
ErrorException:
- error will always be compiler error which mewan that there is some error in syntax
- These are mostly related to the memory 
- Has Few Child Classes are related to the java memory componenets


StackOverflowError: occurs when stack gets full
OutOfMemoryError: occurs once heap memory gets full // this will take alot of time as garbadge collector will 
get active once heap gets full 80% at that time GC will rin 100% by stopping main threat

An overflow error indicates that software attempted to write data beyond the limits of memory. Each program has
a section of memory allocated for a stack. The stack is used to store internal data for the program and is very
fast and keep track of return addressing.

============================
Based on compiler's action Exception are devided in two types:
=> Checked Exception:
- Directly inherited from Exception class and not the part of runtime Exception heirarchy
- Checked by the compiler and compiler will force coder to write handler code

1.FileNotFoundException:
- If certain is written with some static file name, and in case if that file is not there on that palce then    this exception might throw by the compiler! 
- In this compiler will force coder to write the handler when such exception occurs
- If such handler code is not written then such code wont get compiled

2.I/OException
2.1 FileNotFoundException: defined in package java.lang.io.*;
- also included other subtypes too!

3.ClassNotFoundException:
===============================
=> UnChecked Exception:
- Directly inherited from RuntimException class and part of runtime Exception heirarchy
- UnChecked by the compiler
- Compiler wont force to write handler code in this case
- But if such code is not written then program will get terminate
- Included all Exception which included RuntimeException and Errros, excluding the exception which comes direclty under Exception type

1.NumberFormatException
The NumberFormatException occurs when an attempt is made to convert a string with improper format into a numeric value. That means, when it is not possible to convert a string in any numeric type (float, int, etc), this exception is thrown. It is a Runtime Exception (Unchecked Exception) in Java.

2.NullPointerException:
null.method();

3.Arithmetic Exception

4.IndexOutOfboundsException

5.ClassCastExceotion
Occurs whiule assiding the object of parent class to the ref variable of child class in downcasting

============================
try catch finally:
try:
- try is the block which included error prone code
- We can not use two throw line in try block as compiler wont go to the next line after throw
- When any exception occurs in the background it generates the object of the OcuredException Type as => throw new Exception_Type();.

catch():
- catch will alwasy comes after try
- contains the Exceptiontype and ref variable as an argument
 - can be nested with try-catch-finally again
 - If parent type of occured exception is there in arguments of the catch block then upcasting will be there and the argument is acceptable and there the exception will get handled!
 -  If parent type Exception is passed as an an argument to the catch block then we must remove the child of the passed Parent type as that catch block will be unreachable and will not hold any relevance!
- check NumberFormatExceptionDemo.java for ref:

finally:
- finally will get executed every time with exception and without exception to release the resources
- Wont get excuted only in one case when we used System.exit(0); in try block

============================
Assignment:
1.NumberFormatException with try-catch-finally

