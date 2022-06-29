package pack1;

public class Parent{

  public int a =10;
  protected int b = 30;
  int c =20;
  private int d = 40;

  public void m1() {
    System.out.println("m1");
  }

  protected void m2() {
    System.out.println("m2");
  }

  void m3() {
    System.out.println("m3");
  }

  private void m4() {
    System.out.println("m4");
  }

  public static void main(String[] args) {
    new Parent().m1(); // m1
  }
}
