/*
Any service Requirement Specification

Servlet API Application programme interfaces:

tomcat
Jetty
Resin
Weblogic

Set of methods or set of services Any set of contracts betwen client and service provider is called as an interface

Interface never talks about implementations

Every method is bydefault public abstract, hence its purely abstract class
but from 1.8 version : default and static
from 1.9 onwards : private methods also allowed 

ABSTRACT CLASS : Partially implemented class

*/
interface Client {
  private void m1() {}

  default void m2() {}

  void m3();

  static void m4() {}
}

class ServiceProvider implements Client {

  public void m3() {System.out.println("M1 executed from ServiceProvider");}
}
