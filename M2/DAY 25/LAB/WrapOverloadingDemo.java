class Wrap {
    static void m1(){System.out.println("1");}
//===============================================
    static void m1(int a){System.out.println("Widening");}

    static void m1(byte a){System.out.println("Same type");}
//===============================================    
    static void m2(int a){System.out.println("Widening");}

    static void m2(byte... a){System.out.println("Var args");}
//===============================================
	static void m3(int a){System.out.println("Widening first in a sequence");}

    static void m3(long a){System.out.println("Widening second in a sequence");}
//===============================================
	static void m4(int a){System.out.println("Widening");}

    static void m4(Byte a){System.out.println("Boxing");}
//===============================================
	static void m5(byte a){System.out.println("same type");}

    static void m5(Byte a){System.out.println("Boxing");}
//===============================================
	static void m6(byte ...a){System.out.println("var args of same type");}

    static void m6(Byte a){System.out.println("Boxing");}
//===============================================
	static void m7(int ...a){System.out.println("var args with widening");}

    static void m7(Byte a){System.out.println("Boxing");}
//===============================================This will create the ambiguity
	static void m8(int ...a){System.out.println("var args with widening");}

    static void m8(Byte... a){System.out.println("Boxing");}
	
	
    public static void main(String[] args) {
        
        byte b =10;
        m1(b);//2 => same type is always prefered over widening
		m2(b);//5 => Widening is always prefered over var args
		m3(b);//Widening first in a sequence is prefered over next in a sequence
		m4(b);//Widening is prefered over boxing
		m5(b);//same type prefered over boxing
		m6(b);//Boxing is always prefered over var args
		m7(b);//var args widening will be prefered over boxing
		m8(b);/*WrapOverloadingDemo.java:49: error: reference to m8 is ambiguous
                m8(b);
                ^
				both method m8(int...) in Wrap and method m8(Byte...) in Wrap match
				*/
    }
}
