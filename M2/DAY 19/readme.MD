Quote of the day!



==============================================================================================================
Notes for the day!

- Final Variables
        are the local variables

        final int i =10; //Compile time constant(CTC)

        final int j;//Run time constant

 We can not used the CTC in switch cases:   

 We canot not mmodity the value of final var

FinalRef VARIABLES:
- We can not change the binary representation of how to reach the object(path to access the content of the object) which is represented with the final ref variable but we can change the content of the object.
e.g.
- final FinalVar fv =new FinalVar();
  fv = null; // even this is also not allowed  

==============================================================================================================


- Local Variables
  Local variable we ca not use if not initialsed as they are not provided the default values

- final static ref variables
When class is loaded static variables are initialised then only static variables will work:
e.g.
static int i;// will get the default value
final static int a; // will not get the default value
for final static var either we can give values at the time of declaring variable or else in the static block
==============================================================================================================

Final Instance Variable:
We write it at outside of the method but inside the class
We can initialised either on the same line of declaration or in the init block or in the constructor!
e.g.
final int c;
final boolean b;
final int x; 
{
    c=10;
    b = false;
 }

==============================================================================================================

 Immutable object :

 Once we declare var as FRV then we can not change the content of the ref variable which is the bnary representation of how to reach the object yet we can change the content if instance variables inside it.

 But once we make the instance variable final then we can not change the content of instance var which is binary representation of content of variables this is "immutable object"

 We can make both the object and var final then in that case 

e.g.In the code Immutable
content ob is the binary representation of how to reach the object "new Immutable();"
content of a and b is binary representation of 100 and 100.

==============================================================================================================
CRUCIAL TAKEWAY for "final" keyword!

FINAL : WE CAN NOT CHANGE THE BINARY REPRESENTATION 
==============================================================================================================
Arrays:
- It's Object in the java, which is created in the heap
- 


WAP to:
add two matrices
sub tow matrices
tables 1 to 30 in row 1 2...30
to print the transpose on matrix

==============================================================================================================

