class Island {

  Island is;
  int x;

  //with javap java.lang.Object can check about this method which in the Object class
  @Override
  protected void finalize() {
    System.out.println("Release the resources");
  }

  public static void main(String[] args) {
    Island i1 = new Island();
    Island i2 = new Island();
    Island i3 = new Island();

    i1.is = i3;
    i2.is = i1;
    i3.is = i2;

    i1 = i2 = i3 = null;

    System.gc();
    Runtime rt = Runtime.getRuntime();
    rt.gc();

    System.out.println("line no 26");

    for (;;) {}
  }
}
