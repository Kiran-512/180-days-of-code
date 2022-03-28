class Fizz {
    int x =5;
    public static void main(String[] args) {
        Fizz f1 = new Fizz();
        Fizz f2 = new Fizz();
        Fizz f3 = FizzSwitch(f1,f2);//here the static method of the same class is called which retruns the binary representation of how to reach object
        System.out.println((f1==f3)+" "+" "+(f1.x==f3.x));
    }
    static Fizz FizzSwitch(Fizz x, Fizz y){
            Fizz z=x;
            z.x =6;
            return z;
    }   
}
/*
true true
*/