 class ArrayBasic{
    
}
public class ArrayBasicDemo {

    public static void main(String[] args) {
        
        int[] arr =new int[5];
        int[][] arr1 =new int[3][4];

        /*This will print the address of the object arr*/
        System.out.println(arr);
        System.out.println(arr1);

        /*This will print the dealut values*/
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr1[0][0]);
        System.out.println(arr1[0][1]);
        System.out.println(arr1[0][2]);
        System.out.println(arr1[0][3]);

        System.out.println(arr1[1][0]);
        System.out.println(arr1[1][1]);
        System.out.println(arr1[1][2]);
        System.out.println(arr1[1][3]);
        
        System.out.println(arr1[2][0]);
        System.out.println(arr1[2][1]);
        System.out.println(arr1[2][2]);
        System.out.println(arr1[2][3]);

        System.out.println(arr1[3][0]);
        System.out.println(arr1[3][1]);
        System.out.println(arr1[3][2]);
        System.out.println(arr1[3][3]);




    }

}
