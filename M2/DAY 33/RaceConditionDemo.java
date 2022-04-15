class BankAccount{
	static volatile int balance = 100000;
}

class RaceConditionDemo{
	
	public static void main(String[] args){
		Thread t1 = new Thread(){
			public void run(){
				while(BankAccount.balance > 0){
					System.out.println(Thread.currentThread().getName()+" : Before : "+ BankAccount.balance);
					BankAccount.balance = BankAccount.balance - 10;
					System.out.println(Thread.currentThread().getName()+" : After : "+ BankAccount.balance);
				}
			}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				while(BankAccount.balance > 0){
					System.out.println(Thread.currentThread().getName()+" : Before : "+ BankAccount.balance);
					BankAccount.balance = BankAccount.balance - 10;
					System.out.println(Thread.currentThread().getName()+" : After : "+ BankAccount.balance);
				}
			}
		};
		
		t1.setName("T1");
		t2.setName("T2");
		
		t1.start();
		t2.start();
	}
}