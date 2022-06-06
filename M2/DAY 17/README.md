flow of execution of program:

1. Class will be loaded
2. static var loaded and initialised
3. static block will get executed
4. main thread executed
5. in main method it will execute the each line of code

Now to access the instace var and method class needs objects, so when object is created,
ref variable gets memory in the stack and the object get memory in the heap and instance 
variables will get memory in the objects and they will be initialised with the default values 
if not assigned any value.

In case of instance block and constructor, first init block will be called and then constructor.

