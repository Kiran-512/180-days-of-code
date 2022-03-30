class FinwithStafInstrefvar {
    int a;
    int b;
    static FinwithStafInstrefvar svar;
    FinwithStafInstrefvar ivar;
}
class FinwithStafInstrefvarDemo {

public static void main(String[] args) {
    
    FinwithStafInstrefvar s1 = new FinwithStafInstrefvar();
    final FinwithStafInstrefvar s2 = new FinwithStafInstrefvar();
    FinwithStafInstrefvar.svar = new FinwithStafInstrefvar();
    final FinwithStafInstrefvar.svar = new FinwithStafInstrefvar(); //why is the error?
    s1.ivar=new FinwithStafInstrefvar();
    final s1.ivar=new FinwithStafInstrefvar(); // why is the error?

}
}

