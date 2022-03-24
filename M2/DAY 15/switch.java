// import java.util.Scanner;

class Switch {
    public static void main(String[] args) {
        int b=10;
        switch(b){
            default:System.out.println("Default");
            case 1:System.out.println(b); break;
            case 10:System.out.println(b);break;
            case 100:System.out.println(b);break;
            case 1000:System.out.println(b);break;
        }
    }
}
/*
class switch1{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String day = sc.next();
    String dayType = switch (day) {
    case 1,2,3,4,5 -> "Working day";
    case 6,7 -> "Weeek OFF";
    default -> "Invalid day";

    };
}

}*/