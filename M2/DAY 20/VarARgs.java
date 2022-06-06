class VarArgs{

    static void add(int... arr){
        int res =0;
        for (int i = 0; i < arr.length; i++) {   
            res = res + arr[i];
        }
        System.out.println(res);
    }
  
}
class VarArgsDemo{
    public static void main(String[] args) {

        VarArgs.add();            
        VarArgs.add(1,1);            
        VarArgs.add(1,1,1);            
        VarArgs.add(1,1,1,1);            
        VarArgs.add(1,1,1,1,1);           
    }
    

}

/*
C:\CDAC\Github\180-days-of-code\M2\DAY 20>
C:\CDAC\Github\180-days-of-code\M2\DAY 20>javac VarARgs.java

C:\CDAC\Github\180-days-of-code\M2\DAY 20>java VarArgsDemo
0
2
3
4
5

C:\CDAC\Github\180-days-of-code\M2\DAY 20>
*/