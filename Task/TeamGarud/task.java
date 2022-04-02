/*
String reverse using for loops

*/

class Task{

    public static void main(String[] args) {

        String name = "jayant";

        for (int i = 1; i < name.length()+1; i++) {
            for (int j = 5; j >=name.length()-i; j--) {
                char ch = name.charAt(j);
                System.out.print(ch + " ");
            }
            System.out.println();
        }

    }
}