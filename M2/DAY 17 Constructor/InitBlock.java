/*
We can access the static variables inside the init block, but we can not access the instanc evariabvles inside the static block

*/

class InitBlock {
    int x =10;
    static{

        System.out.println("Static block execute");
    }
    {
        x=20;
        System.out.println("Init block");
    }
}

class InitBlockDemo {
    public static void main(String[] args) {
    
        InitBlock i = new InitBlock();
        System.out.println(i.x);
        InitBlock i2 = new InitBlock();
        InitBlock i3 = new InitBlock();

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);

    }
}

/*
C:\CDAC\Github\180-days-of-code\M2\DAY 17>javac InitBlock.java

C:\CDAC\Github\180-days-of-code\M2\DAY 17>java InitBlockDemo
Static block execute
Init block
20
Init block
Init block
InitBlock@36baf30c
InitBlock@7a81197d
InitBlock@5ca881b5
*/