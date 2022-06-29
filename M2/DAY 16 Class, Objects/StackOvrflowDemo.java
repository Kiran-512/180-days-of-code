class StackOvrflow{

    static void m1(){
        System.out.println("sm1");
        m2();
    }
    static void m2(){
        System.out.println("sm2");
        m1();
    }

}

class StackOvrflowDemo{
    public static void main(String[] args) {
        StackOvrflow.m1();
    }
    
}

/*

sm2
sm1
sm2
sm1
sm2
Exception in thread "main" java.lang.StackOverflowError
        at java.base/java.nio.CharBuffer.wrap(CharBuffer.java:408)
        at java.base/sun.nio.cs.StreamEncoder.implWrite(StreamEncoder.java:281)
        at java.base/sun.nio.cs.StreamEncoder.write(StreamEncoder.java:132)
        at java.base/java.io.OutputStreamWriter.write(OutputStreamWriter.java:205)
        at java.base/java.io.BufferedWriter.flushBuffer(BufferedWriter.java:120)
        at java.base/java.io.PrintStream.writeln(PrintStream.java:722)
        at java.base/java.io.PrintStream.println(PrintStream.java:1028)
        at StackOvrflow.m1(StackOvrflow.java:4)
        at StackOvrflow.m2(StackOvrflow.java:9)
        at StackOvrflow.m1(StackOvrflow.java:5)
        at StackOvrflow.m2(StackOvrflow.java:9)
        at StackOvrflow.m1(StackOvrflow.java:5)
        at StackOvrflow.m2(StackOvrflow.java:9)
        at StackOvrflow.m1(StackOvrflow.java:5)

*/