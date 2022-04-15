/*
While we use wait and notify methods, objects must aquire lock or else we wont be able to use these methods:
for using sleep method object donot need to aquire the lock!

threads go to the waiting state with wait method but releases the lock hence here when producer goes to the waiting state then lock gets
free and sonsumer gets the lock

Producer Consumer problem:
Lets say the producer produces 10 units and when it completes the production of 10th unit at that time it must gp to the wait state
And consumer will consumer each unit produced when when there are 0 units or no units left then consumer will go in wait state
but it should not happen that both will go in waitstate and dealock migh occur
So the code here written is to make sure ther ewont be deadlock and both of them will work in sync
*/
import java.util.ArrayList;

class Stock {

  static ArrayList<Integer> list = new ArrayList<>();
  static final int MAX_SIZE = 10;
  static final int MIN_SIZE = 0;
}

class Producer implements Runnable {

  @Override
  public void run() {
    int num = 1;
    while (true) {
      produce(num++);
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {}
    }
  }

  void produce(int value) {
    synchronized (Stock.list) {
      if (Stock.list.size() == Stock.MAX_SIZE) {
        System.out.println("Producer waiting... " + Stock.list.size());
        try {
          Stock.list.wait();
        } catch (InterruptedException e) {}// Thread will enter wait state but after releasing lock on Stock.list
      }

      System.out.println("Producing... " + value);
      Stock.list.add(value);
      Stock.list.notify();
    }
  }
}

class Consumer implements Runnable {

  @Override
  public void run() {
    while (true) {
      consume();
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {}
    }
  }

  void consume() {
    synchronized (Stock.list) {
      if (Stock.list.size() == Stock.MIN_SIZE) {
        System.out.println("Consumer waiting... " + Stock.list.size());
        try {
          Stock.list.wait();
        } catch (InterruptedException e) {} // Thread will enter wait state but after releasing lock on Stock.list
      }
      int value = Stock.list.get(0);
      Stock.list.remove(0);
      System.out.println("Consuming... " + value);
      Stock.list.notify();
    }
  }

  void checkCondition(int num){

  }

  void sum(int num){}

  void mul(int num){}

  void dev(int num){}

  void displayNumber(){

  }
}

class PCDemo {

  public static void main(String[] args) throws InterruptedException {
    Producer p = new Producer();
    Consumer c = new Consumer();

    Thread pro = new Thread(p, "Producer");
    Thread con = new Thread(c, "Consumer");

    pro.start();
    Thread.sleep(10000);
    con.start();
  }
}
