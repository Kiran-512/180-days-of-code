class Mixer{
	
}
class Basic{
	static Mixer mvar;	
	
}
class StafRefVar{
	
    int x;
    int y;
    static int z;
	static Basic bvar;

	
    {
        x=10;
        y=10;
    }
    A(int p, int q){
        this.x=p;
        this.y=q;
    }
     void m1(int a, int b){
      this.x = a;  
      this.y = a;  
    }
	
    void m2(A ovar){
        ovar.x=500;
        ovar.y=500;
		this.x=1000;
		this.y=1000;
    }
	
    static void m3(int a, int b){
/* in this block we can not change the values of x and y, thats where the we pass the binary representation of how to reach object 
	OR ELSE
		We can use the concept of static referenece variable
 */
	
	
	
    }
	    static void m4(A ob){
        ob.x=100;
        ob.y=100;
		
    }
}

class StafRefVarDemo{
    public static void main(String[] args) {
        StafRefVar a1 = new StafRefVar(5,5);
		StafRefVar a2 = new StafRefVar(50,50);
		
		StafRefVar.mvar = new Mixer();// here object is created of Mixer class as the staticRefVariables is of the same class
		
		StafRefVar.mvar.m3(200,200);		
		
			
    }


}
/*


*/