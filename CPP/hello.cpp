/*
C - 1971
C is POP - procedure Oriented language!
Simula 67 : First ever OOP but not fully OOP, has classes and objetcs features!
- It was created for making simulation programs, in which what came to be called objects were the most important information representation.

Simula was very slow and hence need for cpp is arised!

In OOP excution always starts from the main method i.e controlled execution but in procedural lang execution always starts from the first line to the last line in a sequence!

Originally, C++ was called “C with classes,” as it had all the properties of the C language with the addition of user-defined data types called “classes.” It was renamed C++ in 1983. C++ is considered an intermediate-level language, as it includes both high and low-level language features.

- C++ - 1979 - extension of C lang
- fast programs and we get more control over system resources!
- memory management with the help fo pointers!
- High perofrmance!
- Major Updates => 2011 CPP11, 2014 CPP14, 2017 CPP17

==================================

=> CPP ignores the blank lines!

Low level : close to hardware
High level : Abstraction level is low

CPP is a superset of C lang
CPP can implement POP and OOP


==================================

Variable and data types :

Variables :
-- variables length : from 1 to 255
-- can start with letter and undesrscore and not a number
-- variable name is case sensitive
-- keywords can not be used for variable names
-- No space or special characters are allowed


Data types :
4 basic types :
int                 eg. int a,b=5;
char                eg. char a ='a';
float               eg. float f =3.45;
double              eg. double d;
void


There are 4 types of data types in C++ language.

Basic Data Type : int, char, float, double, boolean!
Derived Data Type : array, pointer, etc
Enumeration Data Type : enum
User Defined Data Type : structure

It size is given according to 32 bit OS.

char	1 byte	-128 to 127
signed char	1 byte	-128 to 127
unsigned char	1 byte	0 to 127
short	2 byte	-32,768 to 32,767
signed short	2 byte	-32,768 to 32,767
unsigned short	2 byte	0 to 32,767
int	2 byte	-32,768 to 32,767
signed int	2 byte	-32,768 to 32,767
unsigned int	2 byte	0 to 32,767
short int	2 byte	-32,768 to 32,767
signed short int	2 byte	-32,768 to 32,767
unsigned short int	2 byte	0 to 32,767
long int	4 byte
signed long int	4 byte
unsigned long int	4 byte
float	4 byte
double	8 byte
long double	10 byte


for 64 bit system :
int 4 bytes
long int 4 bytes
long long int 8 bytes
float 4 bytes
double 8 bytes
long double 12 bytes
wchar_t 2 or 4 bytes // 1 wide character
==================================
Constants :
Primary :
- Integer
- Real
- Character - anything that comes within eg. 'x' => NOTE : only one symbol inside ''

Secondary :
Array
String
Pointer
Union
Structure
Enumerator


=> A single program has two major parts data and instructions!
=> In a 64 bit system, our programs gets 64 bits of space!

==================================

Comments :

// single line comment

 Multiline
comment


==================================
Global and local scope :
global variables takes default value!
local variables takes garbage value!

==================================
Compilation Porcess :  Software development process!

=> file.cpp (includes header files)
=> preprocessor s/w - read from header file and creates another file name file.i
=> Compiler s/w - compiles the file.i file and converts that into file.obj
=> Linker s/w - converts the file.obj into file.exe by using library files!

==================================
=> cout << // insertion

cout is predefined object and not a function as function comes with the ()

cout<<a<<b<<c<<"\n" // printing vaue of a b c and d

=> cin >> // Extraction
cin>>a>>b // accepting values for a and b


Each predefined function is defined and implemented in headerfile unlike c where its not compulsory and implementation will be in library files in C lang!


"\n" => endl

#include<conio.h>
clrscr();
getch();

==================================

Types os Variables in CPP :
int x  =5;

int *p;
p = &x; // stores the address of the x

=> reference variable
- rv is internally a pointer!
- reference means address
- must be initialised during the declaration
- it can be initialized with already declared variables only!
- reference variables can not be updated, wherein pointer can be updated!
i.e. when we increment reference variable, value of variable to which this ref variable is pointing is increment!

int &y = x; --> Here, y is the reference of x!
y++ is internally basically x++


==================================
Header file :
Two types of header files :

System header files :
#include<iostream>

User defined header files :
- must be present in the current directory!

#include "this.h"

==================================
*/

#include <iostream>  // header file => instream is already present so include that in our program!/ helps in input and output (cout << )
using namespace std; // when we use name sapce no need to mention it below before cout

int main1()
{
    std::cout << "Hello world!";
    return 0;
}

//================================

int global;
int same = 10;
int main2()
{
    int local;
    int same = 100;

    int a = 120;
    char b = 'c';
    float c = 123.45;
    double d = 231.32;
    bool isAllowed = true;
    std::cout << "The value of a is " << a << ".\nThe value of b is " << b;

    int num1 = 20, num2 = 100;
    cout << "\nThe sum of the two numbers is " << (num1 + num2);

    cout << "The default value of global var is " << global << "\n";
    cout << "The default value of local var is " << local;

    cout << "\nVariable with the same for at global and local level takes local var value : " << same << "\n";

    return 0;
}
int sum(int num)
{

    return num + 100;
}

//================================
#include <math.h>

int main3()
{
    int num1 = 0;
    int num2 = 0;

    /* code */
    cout << "Enter the value of num1\n"; // << insertion operator
    cin >> num1;                         // >> Extraction operator

    cout << "Enter num2\n";
    cin >> num2;

    cout << "\n The sum of th two nos is " << num1 + num2;
    return 0;
}
//================================ Operators in CPP

int main4()
{
    int a = 10;
    int b = 20;

    cout << "The value fo a+b is " << a + b << endl;
    cout << "The value fo a-b is " << a - b << endl;
    cout << "The value fo a*b is " << a * b << endl;
    cout << "The value fo a/b is " << a / b << endl;
    cout << "The value fo a%b is " << a % b << endl;
    cout << "The value fo a++ is " << a++ << endl;
    cout << "The value fo ++a is " << ++a << endl;
    cout << "The value fo a-- is " << a-- << endl;
    cout << "The value fo --a is " << --a << endl;
    return 0;
}
//============================== Comparision Operators

int main5()
{
    int a = 10;
    int b = 20;

    cout << "The value fo a==b is " << (a == b) << endl;
    cout << "The value fo a!=b is " << (a != b) << endl;
    cout << "The value fo a>=b is " << (a >= b) << endl;
    cout << "The value fo a<=b is " << (a <= b) << endl;
    cout << "The value fo a>b is " << (a > b) << endl;
    cout << "The value fo a<b is " << (a < b) << endl;

    return 0;
}
// ========================== Logical Operators :

int main6()
{
    int a = 10;
    int b = 20;

    cout << "The value of (a==b) && (a<b) is " << ((a==b) && (a<b)) << endl;
    cout << "The value of (a==b) || (a<b) is " << ((a==b) || (a<b)) << endl;
    cout << "The value of !(a==b) is " << (!(a==b)) << endl; 
    return 0;
}
// ========================== sizeof() and Typecasting
//Scope resolution Operator ::
// used to access the global variables

//=> bydefault real constants are double literals to make it float we must use use f at the end of literal like 4.56f or 5.67F :)


int res = 100;

int main7(){
    int a,b,res=0;

    cout<<"Enter the num1"<<endl;
    cin>>a;

    cout<<"Enter the num1"<<endl;
    cin>>b;

    res = a+b;

    cout<<"The sume is "<<res<<endl;

    cout<<"The sume is "<<::res;

    float f =45.65;
    float fa =45.66f;
    float faa =45.66F;

    double d = 45.65;
//  double d = 45.65d; Error

    long double ld = 45.65;
    long double ldd = 45.65l;
    long double lddd = 45.65L;

// sizeof() operator

    cout << "\nThe size of 3.44 is "<<sizeof(3.44)<<endl;
    cout << "The size of 3.44f is "<<sizeof(3.44f)<<endl;
    cout << "The size of 3.44F is "<<sizeof(3.44F)<<endl;
    cout << "The size of 3.44l is "<<sizeof(3.44l)<<endl;
    cout << "The size of 3.44L is "<<sizeof(3.44L)<<endl;
    cout << "The size of 3.44L is "<<sizeof(::res)<<endl;

    return 0;
}

//================== Reference variables
int main8(){
    int x = 10;
    int &y = x; // must be initiased

    cout<<"The value of x is "<<x<<endl;//10
    cout<<"The value of x is "<<y<<endl;//10
    cout<<"The value of x is "<<&y<<endl;//0x61ff08

    y++;

    cout<<"The value of x is "<<y<<endl;//11
    cout<<"The value of x is "<<&y<<endl;//0x61ff08
    return 0;
}

// =============== Typecasting :]

int main9(){

    int a =100;
    float f =123.456;

    cout<<"Int value of a is "<<a<<"  "<<sizeof(a)<<endl;//100 4
    cout<<"Typecasted float value of a is "<< (float)a<<"  "<<sizeof(a)<<endl;//100 4
    cout<<"Typecasted float value of a is "<< float(a)<<endl;//100

    float c = float(a); //OR float c =(float)a;

    cout<<"The typecasted int value of f is "<<(int)f<<endl;//123

    int i = int(f);

    cout<<i;//123

    return 0;
}
//========================  Constants in C++!
int main10(){

    const int a =100;
    //a = 200;//Error --expression must be a modifiable lvalueC/C++(137)

    return 0;
}

// ======================  Manipulators
//=> setw(n) -- n is the width - int value

#include<iomanip>
int main11(){
    int a =2;
    int b = 23,c=12342222;

    cout<<"The value of a is "<<a<<endl;
    cout<<"The value of b is "<<b<<endl;
    cout<<"The value of c is "<<c<<endl;


    cout<<"The value of a is "<<setw(4)<<a<<endl;
    cout<<"The value of b is "<<setw(4)<<b<<endl;
    cout<<"The value of c is "<<setw(4)<<c<<endl;
    return 0;
}
/*
[Running] cd "c:\CDAC\Github\180-days-of-code\CPP\" && g++ hello.cpp -o hello && "c:\CDAC\Github\180-days-of-code\CPP\"hello
The value of a is 2
The value of b is 23
The value of c is 12342222
The value of a is    2
The value of b is   23
The value of c is 12342222
*/

// ======================  Precedence and Associativity!

// ======================  Constrol Structure If else and switch case in CPP

//Sequence structure 
//Selection Structure
//if-else and switch case

int main12(){
int age;
cout << "Enter your age"<<endl;
cin>>age;

if(age>=18)
    cout<<"You are welcomed to the party"<<endl;
else 
    cout<<"Join us when you become 18+"<<endl;

    return 0;
}

//Switch case
int main13(){
int marks;
cout << "Enter your marks bar"<<endl;
cin>>marks;

switch (marks)
{
case 85:
    cout<<"Your grade is A+"<<endl;
    break;
case 75:
    cout<<"Your grade is A"<<endl;
    break;
case 70:
    cout<<"Your grade is B+"<<endl;
    break;
case 60:
    cout<<"Your grade is B+"<<endl;
    break;            
default:
    cout<<"Enter any of the numbers as => 85,75,70,60"<<endl;
    break;
}
    cout<<"End of the switch case!"<<endl;
    return 0;
}

// ======================  Loops in CPP and use of break and continue keywords inside loop!
int main14(){
    int i =0;
        cout<<"For-Loop"<<endl;
    for(i = 0; i <50; i++)
    {
        cout<<i<<endl;
    }
    cout<<"While Loop"<<endl;
    while (i < 100)
    {
        cout<<i<<endl;;
        i++;
    }
    cout<<"DO-While Loop"<<endl;
    do
    {
        cout<<i<<endl;
        i++;
    } while (i<50);
    
// o and 1 in place of conditions is allowed unlike java

    for(i = 0; 1; i++)
    {
        cout<<i<<endl;
    }
    cout<<"While Loop"<<endl;
    while (0)
    {
        cout<<i<<endl;;
        i++;
    }
    cout<<"DO-While Loop"<<endl;
    do
    {
        cout<<i<<endl;
        i++;
    } while (0);
    

    return 0;
}

// ======================  
/*
Pointers =>
- data types used to hold the address of other data types
- 
& -- address of operator
* -- value of operator
-

*/
int main15(){

    int a =10; // Address pof operator denoted by &variable_name
    int* p = &a; // dereferencing operator

    cout<<p<<endl;//0x61ff08
    cout<<*p<<endl;//10

//Pointer to pointer

    int** c = &p;
    cout<<c<<endl;;//0x61ff04
    cout<<*c<<endl;;//0x61ff08
    cout<<**c<<endl;;//10

}

// ======================  Arrays and Pointers Arithmatics
int main16(){
int marks[4] ={33,34,32,43};
cout<<marks[0]<<endl;
cout<<marks[1]<<endl;
cout<<marks[2]<<endl;
cout<<marks[3]<<endl;


int mathMarks[4];
mathMarks[0] = 100;
mathMarks[2] = 90;
mathMarks[3] = 50;

cout<<mathMarks[0]<<endl;
cout<<mathMarks[1]<<endl;// garbadge value -- 1299790228 
cout<<mathMarks[2]<<endl;
cout<<mathMarks[3]<<endl;

int* p = marks;
cout<<*p<<endl;//33
cout<<*p++<<endl;//33
cout<<*p++<<endl;//34
cout<<*p++<<endl;//32
cout<<*p++<<endl;//43
cout<<*p++<<endl;//6422288
cout<<*p++<<endl;//4206192
}
// ======================  Structures and Unions
/*
Structure => 
- user defined data structures
- 
*/

struct employee
{
    int eId;
    char favChar;
    float salary;
} ;

typedef struct employe
{
    int eId;
    char favChar;
    float salary;
} ep;
// struct employeee
// {
//     int eId;
//     char favChar;
//     float salary;
// } ep; => Error

//Unions - union  of data typethe latest assigned value will be picked always!
// one from union is choosen when we access union value!
union money{

    int rice;
    char car;
    float pounds;

};

int main17(){

    struct employee harry;
    harry.eId=1;
    harry.favChar='C';
    harry.salary= 120000;
    cout<<harry.salary<<endl; //120000

    ep shubham;
    shubham.eId = 2;
    shubham.favChar = 'K';
    shubham.salary = 120000;

    cout<<shubham.eId<<endl;//2

    union money m1; // from this union only one value of the last decalred data type is choosen!
    m1.car = 'c';
    m1.rice = 100;
    cout<<m1.car<<endl;//d
    cout<<m1.rice<<endl;//100


//Enum

    enum Meal{breakfast, lunch, dinner};

    cout<<breakfast<<endl; // 0
    cout<<lunch<<endl;//1
    cout<<dinner<<endl;//2

    enum Meals{breakfas=66, lunchh, dinnerr, something=4, someotherthing};
    
    cout<<breakfas<<endl; // 66
    cout<<lunchh<<endl;//67
    cout<<dinnerr<<endl;//68
    cout<<something<<endl;//4
    cout<<someotherthing<<endl;//5

// Meals m1 = lunchh    ;

//Fix the bugs on the below lines!
/*
    cout<<(m1);//67
    cout<<(m1==67);
*/
}
// ======================  Functions and Function Prototypes
//Function Prototype -- present in C++ Only and not in C!!
int sum(int a,int b); //-- Acceptable
int sum(int,int);//-- Acceptable
int sum(int a,int);//-- Acceptable
//int sum(a,b);//error

void g(); //If prototype is not declared and function is defined below main method then error comes :=> 'g' was not declared in this scope

//void g(void); -- Acceptable

int main18(){
    int num1,num2;//actual params
    cout<<"Enter the num1"<<endl;    
    cin>>num1;//11
    cout<<"Enter the num1"<<endl;    
    cin>>num2;//22
    
    cout<<"The sum of the two nos is "<<sum(num1,num2)<<endl;//The sum of the two nos is 33

    g();

    return 0;
}

//Function
int sum(int a,int b){// former params
    return a+b;
}

void g(){cout<<"Hello, Good afternoon"<<endl;} // 'g' was not declared in this scope

//Former params and actual params

// ======================  Call by Value and call by ref
void swap(int a,int b){
    
    int temp = a;
    a=b;
    b=a;
}

void SwapPointers(int* a,int* b){
    
    int temp = *a;
    *a = *b;
    *b = temp;
}

void swapRefVar(int &a, int &b){
    int temp = a;
    a=b;
    b=temp;
} 

int & swapRef(int &a, int &b){
    int temp = a;
    a=b;
    b=temp;
    return a;
} 

int main19(){
    int a = 20,b=50;
//Call by Value
    cout<<"The value of a and b is "<<a<<"  " <<b<<endl;//The value of a and b is 20  50
    swap(a,b);
    cout<<"The value of a and b is "<<a<<"  " <<b<<endl;//The value of a and b is 20  50

//Call by reference 
    cout<<"The value of a and b is "<<a<<"  " <<b<<endl;//The value of a and b is 20  50
    SwapPointers(&a,&b);
    cout<<"The value of a and b is "<<a<<"  " <<b<<endl;//The value of a and b is 50  20

    cout<<"The value of a and b is "<<a<<"  " <<b<<endl;//The value of a and b is 50  20
    swapRefVar(a,b);
    cout<<"The value of a and b is "<<a<<"  " <<b<<endl;//The value of a and b is 20  50

    swapRef(a,b)=700;
    cout<<"The updated value of a is "<<a<<endl;//The updated value of a is 700

    return 0;
}
// ======================  Inline Functions  AND   Default Arguments & Constant Arguments
//inline fucntion save overhead of finding, calling and then executing function!
// function which are samll msut be made inline and not the large one
// 

 inline int product(int a,int b){
    return a*b;
 }

inline int productStatic(int a,int b){
    static int c =0;//this executes onyl once
    c=c+1; // each time the value of c will be incremented and retained!
    return a*b + c;
 }

float moneyReceived(int currentMoney, float factor = 1.5){
    return currentMoney*factor;
}

int main20(){
    int a =10,b=20;
    cout<<"The product of a and b is "<<product(a,b)<<endl; // The product of a and b is 200
    

    cout<<"The product of a and b is "<<productStatic(a,b)<<endl; // The product of a and b is 201
    cout<<"The product of a and b is "<<productStatic(a,b)<<endl; // The product of a and b is 202
    cout<<"The product of a and b is "<<productStatic(a,b)<<endl; // The product of a and b is 203

     cout<<moneyReceived(22000,2)<<endl;//44000
     cout<<moneyReceived(22000)<<endl;//33000

    return 0;
}

//Note :const is used to make var constant .. mostly ref variable and pointer variable are made constant!

// ====================== Recursions & Recursive Functions
int factorial(int n){
    if(n==1 || n==0)
    return 1;
    return n*factorial(n-1);
}
int fibonacci(int n){
    if(n==0||n==1) return n;
    return fibonacci(n-2)+fibonacci(n-1);
}

int main21(){
    cout<<factorial(5)<<endl;
    cout<<fibonacci(3)<<endl;
    return 0;
}
// ======================  Function Overloading!

int addition(int a,int b){return a+b;}
int addition(int a,int b,int c){return a+b+c;}

int main22(){
    cout<<addition(3,4)<<endl;//7
    cout<<addition(3,4,5)<<endl;//12
    return 0;
}

// ======================  OOP in C++
/*
Need of OOPS in C :
- As the size of the program increases readability, maintainability and bug free nature of program decreases!
- This was the major problem of the c lang taht it relied on function and procedure!
- data was almost neglect in POPL procedural oriented programming langauges!
- data security was easily compromised without oops
- Using classes this problem is solved!

What is POPL ?
- Consist of set of instructions
- main focus is on functions and not on flow of data
- Functions can either use local or global data
- Data moves openly from function to function!

What is OOPS?
- Works on the concept of the cl;asses and objects
- a class is a template to create the objects
- Treats the data as a critical element
- Decomponses teh problem in objects and builds data and functions around the objects!

Benefits of OOPS :
Four major pillars :
- Encapsulation, Inheritence, Polymorphism and Abstraction! 
- Better code resuability using objects and inheritence
- Principle of data hiding helps build secure system
- Multiple objects can co-exists without any interference!
- Software complexity can be easily managed!

*/
// ======================  classes in CPP
class Employee {

    public :
        int a,b,c;
        void setData(int a, int b,int c);//Declaration of method 
        int setData1(int a){ // declaration and implementation together
            return a*2;
        }
        void getData(){
        cout<< "The value of a is "<<a<<endl;
        cout<< "The value of b is "<<b<<endl;
        cout<< "The value of c is "<<c<<endl;
        cout<< "The value of d is "<<d<<endl;
        cout<< "The value of e is "<<e<<endl;
        };
    private :
    int d,e;
    //int c;//redeclaration of 'int Employee::c'
};
void Employee :: setData(int a1,int b1, int c1){
    d=a1;

}

class Student{

//class = struct + more
//properties and methods 
//structures in c++ are typedefed
// can have private or public members!
// bydefault every member and function is private in classes in c++

}kiran, rahul, pranit;

#include<string>
class binary{

    string s;// private bedefault

public :
    void read(void);
    void chk_bin(void);
    void one_compliment(void);
    void display();

};

void binary :: read(void){
    cout<<"Enter a binary number"<<endl;
    cin>>s;

}
void binary :: chk_bin(void){
for (int i = 0; i < s.length(); i++)
{
    if(s.at(i)!='0' && s.at(i)!='1')
    {
        cout<<"Incorrect binary fomrat"<<endl;
        exit(0);
    }
}
        cout<<"Number is in Correct binary fomrat"<<endl;
}

int main23(){

    Employee kiran;
    kiran.a = 100;
    kiran.b=200;
    kiran.setData(1,2,3);
    kiran.getData();
    kiran.c = kiran.setData1(10);
    cout<<"The value of c is "<<kiran.c<<endl;//The value of c is 20

//   kiran.c=500;// inaccessible as its private
//   kiran.e=300;// inaccessible as its private 

//binary class

    binary b;
    b.read();
    b.chk_bin();

}
/*

PS C:\CDAC\Github\180-days-of-code\CPP> g++ ./hello.cpp
PS C:\CDAC\Github\180-days-of-code\CPP> .\a.exe
The value of a is 100
The value of b is 200
The value of c is 4209136
The value of d is 1
The value of e is 4209227
The value of c is 20
Enter a binary number
1111
Number is in Correct binary fomrat

*/

// ======================  object memory allocation and using array in classes 

class Shop{

    //int itemId[];//incomplete type is not allowedC/C++(70)
    int itemId[100];
    int itemPrice[100];
    int counter;
    public:
    void inittCounter(){counter=1;}
    void getItem(void);
    void setPrice();
};

void Shop::setPrice(){
    cout<<"Enter the ID of your Item no"<<counter<<endl;
    cin>>itemId[counter];
    cout<<"Enter the Price of Item"<<endl;
    cin>>itemPrice[counter];
    counter++;
}

void Shop::getItem(){
    for (int i = 1; i < counter; i++)
    {
        cout<<"For item no "<<itemId[i] <<" price is "<<itemPrice[i]<<endl;
        /* code */
    }
    
}
//void main(){}//'::main' must return 'int'
int main24(){
    Shop shop;
    shop.inittCounter();

    shop.setPrice();
    shop.setPrice();
    shop.setPrice();

    shop.getItem();
    //return 0; Its okay even if 0 is not returned system will return 0 implicitely!!
 }
/*
PS C:\CDAC\Github\180-days-of-code\CPP> g++ ./hello.cpp
PS C:\CDAC\Github\180-days-of-code\CPP> .\a.exe        
Enter the ID of your Item no1
1
Enter the Price of Item
11
Enter the ID of your Item no2
2
Enter the Price of Item
22
Enter the ID of your Item no3
3
Enter the Price of Item
33
For item no 1 price is 11
For item no 2 price is 22
For item no 3 price is 33
PS C:\CDAC\Github\180-days-of-code\CPP> 
*/
// ======================  Static variable

#include<string>
class Emploiyee{
    int id;
    string name;
    static int count;// initialisation of static variable is not allowed here, we can initialise it outside of the class
    public :
    void setData();
    void getDetails();
    int countTotal(){return count;} 
    static int getCount(){return count;}
};
int Emploiyee::count;// static variables must be redeclared outside of the class 
//default value fo static int is 0


void Emploiyee::getDetails(){
    cout<<"id of the employee is "<<id<<endl;
    cout<<"Name of the employee is "<<name<<endl;
}

void Emploiyee::setData(){
    cout<<"Enter the ID and name of the employee"<<endl;
    cin>>id>>name;
    count++;
}

int main25(){
    Emploiyee emp1;
    Emploiyee emp2;
    Emploiyee emp3;

    emp1.setData();
    emp2.setData();
    emp3.setData();

    emp1.getDetails();

    cout<<emp1.countTotal()<<endl;
    cout<<"Total no fo employee is "<<Emploiyee::getCount()<<endl;

    return 0;
}
/*
PS C:\CDAC\Github\180-days-of-code\CPP> g++ ./hello.cpp
PS C:\CDAC\Github\180-days-of-code\CPP> .\a.exe        
Enter the ID and name of the employee
1 kiran
Enter the ID and name of the employee
2 rahul
Enter the ID and name of the employee
3
kishore
id of the employee is 1
Name of the employee is kiran
3
Total no fo employee is 3
PS C:\CDAC\Github\180-days-of-code\CPP>
*/
// ======================  Array of Objects & Passing Objects as Function Arguments
class EmployeeTest{
    int id;
    string name;
    float salary;
    public :
    void setData(){
        salary=122;
        cout<<"Enter the ID "<<endl;
        cin>>id;
        cout<<"Enter the name "<<endl;
        cin>>name;
    }
    void showData(){
        cout<<"ID : "<<id<<endl;
        cout<<"Name : "<<name<<endl;
    }

};
int main(){
    EmployeeTest emp1;

    return 0;
}
// ======================  
// ======================  
// ======================  
// ======================  

/*

Compilation on terminal :

g++ ./hello.cpp
.\a.exe 


*/