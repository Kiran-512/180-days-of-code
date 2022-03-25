class Instance {

  static int i = 10;
  int j;

  static void m1() {}

  void m2() {}
}

class InstanceDemo {

  public static void main(String[] args) {
    System.out.println(Instance.i);

    Instance i = new Instance();
    System.out.println(i.j);

    new Instance(); //here object is created but no instace variable to access that object

  }
}
/*
When object is created part which is on left side of = is called as reference var and which is on right side is object
reference var will get memory in stack and objects will get memory in heap and we can access instance variable or methods only with the reference variables,which
are in the stack and pointing to the objects which are in the heap

*/