public class RunExp3.1 extends Thread  
{    
    public void run()  
    {    
        for(int i=1;i<6;i++)  
        {    
            try  
            {  
                Thread.sleep(500);  
            }catch(InterruptedException e){System.out.println(e);}    
        System.out.println(i);    
        }    
    }    
    public static void main(String args[])  
    {    
        RunExp3 t1=new RunExp3();    
        RunExp3 t2=new RunExp3();    
        t1.run();    
        t2.run();    
    }    
}    

/*
In this case t1 and t2 are not treaded as an Thread but ref var poinitng to the object of the class RunExp3
Hence run can not be used explicitly in case of threads or else it will not treat ref var Threads 
*/

/*
1
2
3
4
5
1
2
3
4
5
*/