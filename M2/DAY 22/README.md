

============================================================================
Notes for the day:

============================================================================
Heirachial inheritence:

When we write 
class B extends A{}

ln this case alass A will load first in the memory as B is dependent on A;
so with this, 
static var of class A will load
static var of B
init of A
Constructor A
init of B
Constructor B

Upcasting is nothing but the 


============================================================================
Polymorphisom:

============================================================================

Overriding:
@override annotation is used to check if the method is getting overriden or not!

- Run time polymorphism
Which method to override is decided at run time

Rules:
- Method name must be same
- Method arguments and its type must be same
- return type must be the same//
- access modifiers(AM) can be same or less retrictive in a seq private/default/protected/public
- AM can not be private

============================================================================
Overloading:
- compile time polymorphisom
- occurs in the same class
- Name is same for the mthod
- just an data type would be different

Which method to overload is decided at compile time

============================================================================
super keyword:


Why Upcasting is done in inheritence:
to achieve the run time polymorphism, we can use super.m(); so that compiler will go the parents method and will execute it and then it will execute the child's method:

============================================================================

javac -c class_Name

chaper no 2:


