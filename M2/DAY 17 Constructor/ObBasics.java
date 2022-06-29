class ObBasics {
    int x;
    int y;

}
class ObBasicsDemo {

    public static void main(String[] args) {
        
        ObBasics b1 = new ObBasics();
        ObBasics b2 = new ObBasics();
        ObBasics b3 = new ObBasics();

        b1.x=10;
        b1.y=10;

        b2.x=20;
        b2.y=20;

        b3.x=30;
        b3.y=30;

        b1=b2;

        b1=b2;
        System.out.println(b1.x);
        System.out.println(b1.y);
        
 /*     b1=b2;
        b2=b3;
        b3=b1;

        System.out.println(b1.x);
        System.out.println(b1.y);

        System.out.println(b2.x);
        System.out.println(b2.y);

        System.out.println(b3.x);
        System.out.println(b3.y);
*/

    }
}
/*
When ref var pf particular objects assigned to another ref var of another object, 
then the first object will be collected by the garbage collector
*/