import java.io.*;
class Person implements Serializable{
	String name;
	String gender;
	
	transient int age;
	Person(){
		System.out.println("Constructor invoked!!!");
	}
}


class SerializationDemo{
	public static void main(String[] args) throws IOException,ClassNotFoundException{
		/*
		Person p = new Person();
		p.name = "B";
		p.gender = "Female";
		p.age = 33;
		
		
		File fout = new File("person.ser");
		FileOutputStream fos = new FileOutputStream(fout);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(p);
		*/
		
		//Deserialize
		File fin = new File("person.ser");
		FileInputStream fis = new FileInputStream(fin);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person p = (Person)ois.readObject();
		System.out.println(p.name);
		System.out.println(p.gender);
		System.out.println(p.age);
		
		
	}
}