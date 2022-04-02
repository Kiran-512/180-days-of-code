/*
Multiple inheritence IN java 
Using class NO
using interfaces YES

In case of same method in both the parent interaface of any class it woul create the ambigutiy
*/
interface I4{
    void m4();
    
}
interface I5{
    void  m4();
    
}
//In below eg there wont abe any ambiguity and it will execute
abstract class AC5 implements I4,I5{
    
}

/*
interface I4{
    void m4();
    
}
interface I5{
    int m4();
    
}
//In below eg below class create the ambuiguity and throw CE
abstract class AC5 implements I4,I5{
    
}

*/