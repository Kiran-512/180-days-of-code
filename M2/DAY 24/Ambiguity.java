/*
Multiple inheritence IN java 
Using class NO
using interfaces YES

In case of same method with different return type in both the parent interaface of any class it would create the ambigutiy
*/

interface I4{
    void m4();
    
}
interface I5{
    void  m4();
    //int m4();

}
//In below eg there wont abe any ambiguity and it will execute
class CC1 implements I4,I5{
    public void m4(){

    }
    
// In below eg below class create the ambuiguity and throw CE as it is not even overloading and not overriding
    /*
    public void m4(){

    }
    public int  m4(){

    }
    */
}
class Demo{

    CC1 cc = new CC1(); 

    //Below will get executed without any ERROR and botht he time m4 of concrent class will get excuted
    I4 cc1 = new CC1(); 
    cc1.m4();

    I5 cc2 = new CC1(); 
    cc2.m4();

	//Ambiguity is below if any of the interface method has same method signature with diff return type
	
    //
    /*

    I4 cc1 = new CC1(); 

    cc1.m4();

    I5 cc2 = new CC1(); 

    cc2.m4();

    */

}

//In below case there wont be any error becasue in the same class CC1 overloading is happening and methods are diff with the same name
/*

interface I4{
    void m4();
    
}
interface I5{
    int m4(int a);
    
}
class CC1 implements I4,I5{

    public void m4(){

    }
    public int  m4(int a){
        
    }
}
class Demo{


public static void main(String... args){
    CC1 cc = new CC1(); 
    I4 cc1 = new CC1(); 

    cc1.m4();

    I5 cc2 = new CC1(); 

    cc2.m4();

}
}

*/