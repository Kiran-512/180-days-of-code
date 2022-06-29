import java.util.ArrayList;

public class TestCoreJava {

    public static void main(String [] args){

        ArrayList al = new ArrayList();

        for(int i=0;i<15;i++){
            i--;
            al.add("Temp"+i);
            i++;
            System.out.println("Hashcode for "+i+" element "+al.hashCode());
        }
    }
}