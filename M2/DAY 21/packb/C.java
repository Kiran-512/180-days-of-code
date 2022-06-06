package packb;
public class C{
	public int j;
	private int k;
	protected int l;
	int m;
	
	public void m1(){
		System.out.println("m1 invoked!!!");
	}
	private void m2(){
		System.out.println("m2 invoked!!!");
	}
	protected void m3(){
		System.out.println("m3 invoked!!!");
	}
	void m4(){
		System.out.println("m4 invoked!!!");
	}
	
	C(){
		
	}
	
	public C(int a, int b){
		
	}
	
	public static int n;
	public static void m5(){
		System.out.println("m5 invoked!!!");
		System.out.println(n);
	}
}