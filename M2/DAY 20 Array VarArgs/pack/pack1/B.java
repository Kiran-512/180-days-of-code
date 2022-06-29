package pack.pack1;

public class B{

    public int x;
    private int y;
    protected int z;
    int w;

    public void m1(){
        System.out.println("public");
    }
    private void m2(){
        System.out.println("private");
    }
    protected void m3(){
        System.out.println("protected");
    }
    void m4(){
        System.out.println("dafault");
    }

}