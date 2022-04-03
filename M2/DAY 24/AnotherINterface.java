/*
AC1 has direct class parent as Object class and interface parent as an I1 thru I2

Diamond problem :

*/

interface I1{
    void m1();
}

interface I2 extends I1{
    void m2();
    
}
interface I3 extends I1{
    void m3();
    
}
interface I4{
    void m4();
    
}
class AC5 implements I4,I5{
    public void m4(){
       System.out.println("m4() of AC5"); 
    }
}
abstract class AC1 implements I2{

}
abstract class AC2 implements I2,I4{
}

//as below class implemented all the abstract methods from interafce 1,2 and 4 and no abstratc 
//method left for implementation here so this class is concrete class
class CC1 extends AC2{
    public void m1(){
        System.out.println("CC1:m1()");
    }
    public void m2(){
        System.out.println("CC1:m1()");
    }
    public void m4(){
        System.out.println("CC1:m1()");
    }
}
//below class is concrete as it implements all the abstract methods of I3 and I1 (which I3 inherits) 
class CC2 implements I3{

    public void m3(){
        System.out.println("m3() implemented");
    }
    public void m1(){
        System.out.println("m1() implemented");
    }

} 

class AnotherInheritanceDemo{

    I1 i1 =new CC2();
    I1 i2 =new CC1();

//    I2 i3 = new AC4();// here as AC4 is not inheriting the I2 hence we can not create the object of class AC4 with the ref var of I2
    
    I2 i4 = new CC1();// here as AC3 is inheriting the I2 hence we could create the object of class AC4 with the ref var of I2


}