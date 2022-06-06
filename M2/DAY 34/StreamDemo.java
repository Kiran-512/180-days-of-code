import java.io.*;

class StreamDemo{

	public static void main(String[] args) throws FileNotFoundException, IOException{
		File f1 = new File("1.jpg");
		File f2 = new File("test");
		
		System.out.println(f1.isFile());
		System.out.println(f2.isFile());
		System.out.println(f2.isDirectory());
		
		System.out.println(f1.exists());
		
		File[] list = f2.listFiles();
		for(File f : list){
			if(f.isDirectory()){
				File[] tempList = f.listFiles();
				for(File temp : tempList){
					System.out.println(f.getName()+" ---->>>> "+temp.getName());
				}
			}
			System.out.println(f.getName());
		}
		
		File fout = new File("ABC.jpg");
		FileInputStream fis = new FileInputStream(f1);
		BufferedInputStream bis = new BufferedInputStream(fis,4096);
		
		FileOutputStream fos = new FileOutputStream(fout);
		BufferedOutputStream bos = new BufferedOutputStream(fos,8192);
		System.out.println(new java.util.Date());
		int b = 0;
		
		/*while( (b = fis.read()) != -1 ){
			fos.write(b);
		}
		*/
		
		/*
		int noOfBytesRead = 0;
		byte[] buffer = new byte[4096];
		while( (noOfBytesRead = fis.read(buffer)) >0 ){
			fos.write(buffer,0,noOfBytesRead);
		}
		*/
		
		int noOfBytesRead = 0;
		byte[] buffer = new byte[4096];
		while( (noOfBytesRead = bis.read(buffer)) >0 ){
			bos.write(buffer,0,noOfBytesRead);
		}
		bos.flush();// forcefully write remaining data to file
		
		System.out.println(new java.util.Date());
	}
}