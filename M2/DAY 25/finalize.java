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

    System.out.println("line no 27");
    for (;;) {}// infinte for loop used so that we can check if finalize runs or not if not run when we call GC at 23 and 25
  }
}
/*
C:\CDAC\Github\180-days-of-code\M2\DAY 25>java Finalize.java
Note: Finalize.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
Release the resources
Release the resources
Release the resources
line no 27
^C
C:\CDAC\Github\180-days-of-code\M2\DAY 25>java Finalize.java
Note: Finalize.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
line no 27
Release the resources
Release the resources
Release the resources
^C
C:\CDAC\Github\180-days-of-code\M2\DAY 25>java Finalize.java
Note: Finalize.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
Release the resources
Release the resources
Release the resources
line no 27
*/