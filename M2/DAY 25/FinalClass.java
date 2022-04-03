/*
We can not inherit final class in another class

*/
final class A {}

class B extends A {}

class FinalDemo {}

//Final Method:

class C {

  final void m1() {}
}

class D extends C {

  final void m1() {}
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

//We can not use final and abstratct together as final wont allow for override and abstratc forces for override
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