class TowOfHanaoi{                			  
											  
static void toh(int n,char s,char inter, char d){
	if(n==1)								  
		System.out.println("Disk moved from "+s+" to "+d);
	else{									  
		toh(n-1,s,d,inter);					  
		System.out.println("Disk moved from "+s+" to "+d);
		toh(n-1,inter,s,d);					  
	}										  
}											  
public static void main(String... args){	  
	int n=3;                                  
	toh(n,'A','B','C');                       
	}                                         
                                              
}
											   