/*
Benefit of anonymous class is that anonymous class get destroyed once used
*/

class MultithreadingWithAnonymous {

  public static void main(String[] args) {
    Thread t1 = new Thread() {
      public void run() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
          sum += i;
        }
        System.out.println(sum);
      }
    };

    Thread t2 = new Thread() {
      public void run() {
        int mul = 1;
        for (int i = 1; i <= 10; i++) {
          mul *= i;
        }
        System.out.println(mul);
      }
    };

    t1.start();//We can only start the thread, its JVM who decides when the schedule the thread
    t1.start();
  }
}

