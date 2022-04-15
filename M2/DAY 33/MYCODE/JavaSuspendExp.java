public class JavaSuspendExp extends Thread  
{    
    public void run()  
    {    
        for(int i=1; i<=2; i++)  
        {    				System.out.println( Thread.currentThread().getName()+ " starts");  
            try  
            {  
                // thread to sleep for 5 seconds  
                 sleep(20*1000);  
                 System.out.println("hahahahah "+Thread.currentThread().getName());    
            }catch(InterruptedException e){System.out.println(e);}    
            System.out.println(i+ " " +Thread.currentThread().getName());  
				System.out.println( Thread.currentThread().getName()+ " ends");  			
        }    
    }    
    public static void main(String args[])  
    {    
					System.out.println( Thread.currentThread().getName()+ " starts");  
        // creating three threads   
        JavaSuspendExp t1=new JavaSuspendExp (); //new   
        JavaSuspendExp t2=new JavaSuspendExp ();   //new
         
        // call run() method   
        t1.start(); 
		
        t2.setName("KIran");
		t2.start(); 
		
        // suspend t2 thread   
			t2.suspend();   

      
		System.out.println("Main ends");  
		//t2.resume();
				System.out.println( Thread.currentThread().getName()+ " ends");  
    }    
}  

/*
C:\CDAC\Github\180-days-of-code\M2\DAY 33\MYCODE>javac JavaSuspendExp.java
JavaSuspendExp.java:31: warning: [removal] suspend() in Thread has been deprecated and marked for removal
                        t2.suspend();
                          ^
JavaSuspendExp.java:35: warning: [removal] resume() in Thread has been deprecated and marked for removal
                t2.resume();
                  ^
2 warnings

C:\CDAC\Github\180-days-of-code\M2\DAY 33\MYCODE>java JavaSuspendExp
main starts
Main ends
Thread-0 starts
main ends
KIran starts
hahahahah Thread-0
hahahahah KIran
1 Thread-0
1 KIran
Thread-0 ends
Thread-0 starts
KIran ends
KIran starts
hahahahah Thread-0
hahahahah KIran
2 Thread-0
Thread-0 ends
2 KIran
KIran ends
*/