/*
Very important point is :

sleep method will send thread in waiting state but wont release the lock so when it is in the waiting state no other 
thread is able to access any method with the same lock
but if another thread the same method with the diff lock then that method will get executed if the lock is available for that another thread


In case of wait method it will release the lock when thread goes to the waiting state
and other thread at that time if try to access that method with the same lock then it will be able to access that method unlike sleep method();
 

*/

package LAB;

class Synch {

  synchronized void m1() {
    System.out.println(Thread.currentThread().getName() + " started");
    System.out.println(Thread.currentThread().getName() + " slept");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {}
    System.out.println(Thread.currentThread().getName() + "awake");
    System.out.println(Thread.currentThread().getName() + " random code 1");
    System.out.println(Thread.currentThread().getName() + " random code 2");
    System.out.println(Thread.currentThread().getName() + "m1 random code 3");
    System.out.println(Thread.currentThread().getName() + "m1 ended");
  }

  synchronized void m2() {
    System.out.println("m1 started");
    System.out.println("m1 slept");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {}
    System.out.println("m1 awake");
    System.out.println("m1 random code 1");
    System.out.println("m1 random code 2");
    System.out.println("m1 random code 3");
    System.out.println("m1 ended");
  }
}

public class SyncDemo {

  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName() + "Started");
    Synch s = new Synch();

    Thread t1 = new Thread() {
      @Override
      public void run() {
        s.m1();
      }
    };

    Thread t2 = new Thread() {
      @Override
      public void run() {
        s.m1();
      }
    };
    t1.start();
    try {
      Thread.sleep(10);
    } catch (InterruptedException e) {} catch (Exception e) {}
    t2.start();
    System.out.println(Thread.currentThread().getName() + "Ended");
  }
}
