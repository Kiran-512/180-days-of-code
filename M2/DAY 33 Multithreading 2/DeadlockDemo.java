public class DeadlockDemo {
    
    synchronized void m1(){
        System.out.println(Thread.currentThread().getName() + "entered m1");
        try {Thread.sleep(100);} catch (Exception e) {}
        System.out.println(Thread.currentThread().getName() + "exited m1");

    }
    synchronized void m2(){
        System.out.println(Thread.currentThread().getName() + "entered m2");
        try {Thread.sleep(100);} catch (Exception e) {}
        System.out.println(Thread.currentThread().getName() + "exited m1");

    }

    public static void main(String[] args) {

        DeadlockDemo d1 = new DeadlockDemo();
        DeadlockDemo d2 = new DeadlockDemo();

        Thread t1 = new Thread(){

            public void run(){
                System.out.println(Thread.currentThread().getName() + "got the lock of d1");
                d1.m1();
                try {Thread.sleep(100);} catch (Exception e) {}
                System.out.println(Thread.currentThread().getName() + "waiting for the lock of d2");

                d2.m2();
            }

        };
        Thread t2 = new Thread(){
            public void run(){
                System.out.println(Thread.currentThread().getName() + "got the lock of d2");
                d2.m1();
                try {
                Thread.sleep(100);
                } catch (Exception e) {
                }
                System.out.println(Thread.currentThread().getName() + "waiting for the lock of d1");

                d1.m2();
            }

        };

        t1.start();
        try {Thread.sleep(1000);} catch (Exception e) {}
        t2.start();



    }
}
