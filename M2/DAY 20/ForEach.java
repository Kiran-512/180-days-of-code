class ForEach {
    
}
class ForEachDemo {
    public static void main(String[] args) {
        int[] arr =new int[10];

        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i]);
        }

        //foreach
        for (int i : arr) {
            System.out.println(i);
          //  System.out.println(arr[i]);
        }

    }
}

