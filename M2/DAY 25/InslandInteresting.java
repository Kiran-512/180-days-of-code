class Island {
    Island is;
    int x;
    
 public static void main(String[] args) {

    Island i1 =new Island();
    Island i2 =new Island();
    Island i3 =new Island();
    Island i4 =i3;

    i1.is = i3;
    i2.is = i1;
    i3.is = i2;

    i1=i2=i3=null;
    
    System.out.println("Default value of x in i1 is " + i4.is.is.x);

    i4.x=100;
    System.out.println(i4.x);
    i4.is.x=10;
    System.out.println(i4.is.x);
    i4.is.is.x=20;
    System.out.println(i4.is.is.x);
    i4.is.is.is.x=30;
    System.out.println(i4.is.is.is.x);



 }   
}
