import java.util.Scanner;
class ScannerDemo{
	public static void main(String[] args){
		Scanner sc = null;
		
		try{
			sc = new Scanner(System.in);
			int j = sc.nextInt();
			String s = sc.next();
			
			System.out.println(j+"  "+s);
			
			int[] arr = new int[5];
			for(int i=0;i<arr.length;i++){
				arr[i] = sc.nextInt();
			}
			
			char c = sc.next().charAt(0);
			System.out.println(c);
			//String line = sc.nextLine();
			//System.out.println(line);
		}finally{
			if(sc != null){
				sc.close();
			}
		}
		
	}
}