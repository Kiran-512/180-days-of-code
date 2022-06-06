import java.util.ArrayList;

class Stock{

    static ArrayList<Integer> list = new ArrayList<>();
    final static int MAX_VALUE=10;
    final static int MIN_VALUE=0;

}
class Producer implements Runnable{

    @Override
    public void run(){
        int num=1;
        while (true) {
            produce(num++);
        }

    }

    void produce(int num){
        synchronized(Stock.list){

        }

    }
}
class Consumer implements Runnable{

    @Override
    public void run(){
        while (true) {
            
        }
    }

    void consume(){
        
    }


}
class PCP{
    public static void main(String[] args) {
        
    }
}