NOTES FOR THE DAY
============================
Exception:

Object<Throwable <Error <Exception 

=> Checked Exception:
- Directly inherited from Exception class and not the part of runtime Exception heirarchy
- Checked by the compiler and compiler will force coder to write handler code
- 

1.FileNotFoundException:
- If certain is written with some static file name, and in case if that file is not there on that palce then this exception might throw by the compiler! 
- In this compiler will force coder to write the handler when such exception occurs
- If such handler code is not written then such code wont get compiled

2.I/OException


=> UnChecked Exception:
- Directly inherited from RuntimException class and part of runtime Exception heirarchy
- UnChecked by the compiler
- Compiler wont force to write handler code in this case
- But if such code is not written then program will get terminate
- 

1.NumberFormatException
The NumberFormatException occurs when an attempt is made to convert a string with improper format into a numeric value. That means, when it is not possible to convert a string in any numeric type (float, int, etc), this exception is thrown. It is a Runtime Exception (Unchecked Exception) in Java.

2.NPE:


3.Arithmatic Exception


try catch finally:
try:
- 
- We can not use tow throw line in try block as compiler wont go to the next line after throw

catch():
-
-

finally:
finally will get executed every time with exception and without exception to release the resources

============================
Error:
- Has Few Child Classes are related to the java memory componenets


============================





============================
Assignment:
1.NumberFormatException with try-catch-finally
2.
