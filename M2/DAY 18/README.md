Quote of the day!
Tough time never last but tough people do!
===========================================

Notes for the Day!

- Content of reference variable : binary representation of how to reach that object!

- javap class_Name : command used to check the meta data of the class

- if do not write constructor then compiler will provide the default constructor which have zero args
- Like methods, constructors can have any of the access modifiers: public, protected, private, or none (often 
  called package or friendly, default). Unlike methods, constructors can take only access modifiers. Therefore constructors cannot be abstract , final , native , static , or synchronized.

- When we explicitly write any constructor then at that time compiler wont provide the default compiler
- Constructors with the same datatype argument is not allowed we will compile time error
- We can write n number of constructors in a single class

===========================================
Pass by value and pass by reference

When ever object is created, instance var gets memory, init block and then constructor gets executed

Refer PassByValueDemo.java for better understanding of passbyReference 

===========================================
Static ref variables(SRV):

when class loads in the memory, static variables also loads and initialised with the default values at the same the SRV Also loads in the same location where static variables are present, and if we create the object with the SRV then that SRV will point to the object in the heap,  ut SRV unlike local variables in the  maim memory,SRV will be in the static BOX.

default value of SRV is "null"

static A avar;

here static is keywor
A is class name or Type
avar os variable name

so for object creation object will be ClassName.avar= new A();
here className is the class in which static ref variable A is present:

===========================================

Default value of all reference variable is null





