class Solutions {

   int num = 7;

  static void incrementNumber(int num) {
    num++;
    System.out.println(num);
  }

  public static void main(String[] args) {
    /*int i = 07;
    i = i+1;
    i++;
    System.out.println(i); */
    // int x = "Kiran"; not allowed
    Solutions s= new Solutions();
    System.out.println(s.num);
    incrementNumber(s.num);
    System.out.println(s.num);
  }
}
