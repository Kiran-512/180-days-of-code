class AddRunnable implements Runnable {

  public void run() {
    System.out.println(Thread.currentThread().getName() + " started!!");
    int sum = 0;

    for (int i = 0; i < 20; i++) {
      sum = sum + i;
    }

    System.out.println(
      "sum : " + sum + "   " + Thread.currentThread().getName() + " ended!!"
    );
  }
}

class MulRunnable implements Runnable {

  public void run() {
    System.out.println(Thread.currentThread().getName() + " started!!");
    int res = 1;

    for (int i = 1; i <= 10; i++) {
      res *= i;
    }

    System.out.println(
      "res : " + res + "   " + Thread.currentThread().getName() + " ended!!"
    );
  }
}

class RunnableDemo2 {

  public static void main(String[] args) {
    AddRunnable ar = new AddRunnable();
    MulRunnable mr = new MulRunnable();

    Thread t1 = new Thread(ar, "Add-Thread"); // new state
    Thread t2 = new Thread(mr, "Mul-Thread"); // new state

    t1.start();
    t2.start();

    Runnable evenAdd = new Runnable() {
      public void run() {
        System.out.println(Thread.currentThread().getName() + " started!!");
        int res = 0;
        for (int i = 1; i <= 20; i++) {
          if (i % 2 == 0) {
            res += i;
          }
        }
        System.out.println(
          res + " " + Thread.currentThread().getName() + " ended!!"
        );
      }
    };
    Thread t3 = new Thread(evenAdd, "Even-Add"); // new state
    t3.start();

    Runnable oddAdd = () -> {
      System.out.println(Thread.currentThread().getName() + " started!!");
      int res = 0;
      for (int i = 1; i <= 20; i++) {
        if (i % 2 != 0) {
          res += i;
        }
      }
      System.out.println(
        res + " " + Thread.currentThread().getName() + " ended!!"
      );
    };
    Thread t4 = new Thread(oddAdd, "Odd-Add-Thread"); // new state
    t4.start();
  }
}
