class TypeCast{
public static void main(String[] args) {
    
    byte a = 10;
    byte j = 10;
    short b =20;
    short c =30;
    int d = 40;
    long e = 50l;
	long $e = 9223372036854775807l;
    float f = 60.789f;
    double g = 70;
    char h = 100;

	int $c = a;
    System.out.println($c);	

    float $a = e;
    System.out.println($a);
	
//	long $f = f;
//	System.out.println($f);
	
	float $d = $e;
    System.out.println($d);

//   int $b = e;
//   System.out.println($b);

    System.out.println(b+a);
//  byte k = a + j; // here the default data type of the expression is int and can not store int to byte hence CE : incompatible error
    byte o = 10 + 10; // here there wont be CE as 10_10 we are directly assigninfg it to byte and its within the range of byte
    byte p = (byte)(a + j); // here we explicitly typecasted into to byte
//    System.out.println(k);
    System.out.println(o);
    System.out.println(p);

    int i = a + j;
    System.out.println(i);
    
    short l = b;
//  short m = l + b;  // here the default data type of the expression is int hence CE : incompatible error req:int found : short
    
    int u = 'a';
    System.out.println(u); // 97 char implicit typecasted to int
    long v = 10l;
//  int w =v; //CE : Incompatible error as unable to typecast long into int
    int x =(int)v; // explict typecaste
    int fg = (int)(12.34 + 45.56);

    
    float s = 10; //  int typecasted to float
    //  float t = 4.566; // since its double wemust typecast or specify with f/F for floating literals
    float r = 4.567f;
    float n = 60 + 50; // int to float typecast 
    float q = (float)3.245; // explicite typecast from double to float
    float cd = 'c';
    System.out.println(n); // 110.0 
    System.out.println(cd); // 99.0

//  long z = r;// float to long is explicit
    long ab = (long)r;
    long bc = 'c'; // implicit

    float de = b; // implicit
    float ef = a; // implicit

//  int hi = a + d*i/e - f;
    int ij = (int)(a + d*i/e - f); // float to int
    int kl = (int)(a + d*i/e ); // long to int
    float jk = a + d*i/e - f; // 10 + 40*20/50 - 60
    System.out.println(kl);
    System.out.println(ij);
    System.out.println(jk);
}

}