/*
We can not inherit final class in another class

*/
final class A {}

//class B extends A {}//Invalid 

class FinalDemo {}

//Final Method:

class C {

  final void m1() {}

  void m1(int a) {}
}

class D extends C {

  final void m1(int a) {} // child class method can be final

  void m1() {} // since parent method is final we can not override
}

class FinalDemo {}
/*

class C {

  final void m1() {}
}

class D extends C {

   void m1() {}
}

class FinalDemo {}

*/
//Below is valid
/*
class C {

   void m1() {}
}

class D extends C {

  final void m1() {}
}

class FinalDemo {}

*/
//We can not use final and abstract together as final wont allow for override and abstract forces us to override
/*

class C {
    void m1() {}
}

class D extends C {
    
    //not allowed AM
    final abstract void m1() {}
}

class FinalDemo {}

*/
