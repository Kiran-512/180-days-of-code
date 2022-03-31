package pack1;

public class A {

    public int a =10;
    private int b =20;
    int c =30;
    protected int d = 40;

    public static int e = 50;

    public void m1(){
        System.out.println("public m1 from A");
    }
    private void m2(){
        System.out.println("private m2 from A");
    }
    void m3(){
        System.out.println("default m3 from A");
    }
    protected void m4(){
        System.out.println("protetced m4 from A");
    }
}
