/*
Table of any int number with the constructors use and method use
*/

import java.util.Scanner;

public class Table {
    Table(){
        System.out.print("Table of ");
    }

    Table(int n){
        this();
        System.out.println(n);
    }
    static void table(int n){

        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    } 
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        Table t = new Table(n);
        table(n);
    }
}
