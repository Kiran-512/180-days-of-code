//ABSTRACT Class Concept 

abstract class HelloWorld {
    int a =100;
    
    public abstract void m2();
    
    public void m3(){
        System.out.println(a);
    };
    
}
class Demo extends HelloWorld{

        public void m2(){
            System.out.println("Hello");
        };
        
    public static void main(String... args){
        
        HelloWorld h = new Demo();
        h.m2();
		h.m3();
        
    }
    
}

/*
C:\CDAC\Github\180-days-of-code\Practice\main>javac Demo.java

C:\CDAC\Github\180-days-of-code\Practice\main>java Demo
Hello
100

C:\CDAC\Github\180-days-of-code\Practice\main>
*/