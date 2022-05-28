//instance ref variable

class A{
	int x;
	int y;
}

class InstanceRefVariable{
	int i;
	int j;
	InstanceRefVariable inrefvar;
	A a;
}
class InstanceRefVariableDemo{
	public static void main(String... args){
		InstanceRefVariable irv = new InstanceRefVariable();
		irv.i = 100;
		irv.j = 200;
		irv.a = new A();
		
		irv.a.x = 300;
		irv.a.y = 400;
		
		System.out.println(irv.i); //100
		System.out.println(irv.j); //200

		System.out.println(irv.a.x); //300
		System.out.println(irv.a.y); //400
		
	}
}

/*
When the object is created for clas InstanceRefVariable, at that time i,j,and a will get memory in the onject and initialised with the default values
-- here default value of a will be 'null'

*/