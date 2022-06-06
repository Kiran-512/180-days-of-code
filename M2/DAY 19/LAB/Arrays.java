class Arrays{

}
class ArraysDemo{
    public static void main(String[] args){

        int[] a;// this is local var so we can declare only but to use we will have to create the object of array
//        System.out.println(a);//error: variable a might not have been initialized

        int[] ar;
        ar = new int[3];
        System.out.println(ar);
        System.out.println(ar[0]);
        System.out.println(ar[1]);
        System.out.println(ar[2]);


        int[][] arr = new int[3][];
        System.out.println(arr);

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //NPE as the lenght is not defined 
/*        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);

        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);
*/
        int[][] arra = new int[3][3];
        System.out.println(arra);

        System.out.println(arra[0]);
        System.out.println(arra[1]);
        System.out.println(arra[2]);

        System.out.println(arra[0][0]);
        System.out.println(arra[0][1]);
        System.out.println(arra[0][2]);

        System.out.println(arra[1][0]);
        System.out.println(arra[1][1]);
        System.out.println(arra[1][2]);

        System.out.println(arra[2][0]);
        System.out.println(arra[2][1]);
        System.out.println(arra[2][2]);

    }

}