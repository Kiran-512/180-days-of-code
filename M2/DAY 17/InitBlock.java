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

*/
/*even if we use like this op will be same as init block will get executed first and then it will go in the main thread*/
