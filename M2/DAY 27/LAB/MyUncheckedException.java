
class MyCheckedException extends Exception{
	MyCheckedException(String errorMessage){
		super(errorMessage);
	}

}


class MyUncheckedException extends RuntimeException{
	MyUncheckedException(String errorMessage){
		super(errorMessage);
	}

}


class MyUncheckedExceptionDemo{
	
	static void m1()throws MyCheckedException{
		throw new MyCheckedException("Message !!");
	}
	
	static void m2()throws MyUncheckedException{
		
	}
	
	public static void main(String[] args){
		/*try{
			int i = 1/0;
		}catch(ArithmeticException e){
			throw new MyUncheckedException("Divide by zero is infinity. Please dont do this. As we dont know infinity. Thank you!!");
		}*/
		try{
			m1();
		}catch(MyCheckedException e){
			System.out.println(e.getMessage());
		}
		
		m2();
		
	}
}