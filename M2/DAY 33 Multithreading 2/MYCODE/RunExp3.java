public class RunExp3 extends Thread  
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
        RunExp3 r1=new RunExp3();    
        RunExp3 r2=new RunExp3();    
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();    
        t2.start();    
    }   }   
	
	/*
	1
1
2
2
3
3
4
4
5
5
	
	*/