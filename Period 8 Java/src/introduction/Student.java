package introduction;

public class Student {
	//fields
	private String name;
	
	//constructor (initialize fields) - always match the class name
	public Student(String name) {
		this.name = name;
	}
	
	public void talk() {
		System.out.println("Hello, my name is " + name);
		/* or 
		String name;
		System.out.println("Hello my name is " + this.name); 
		*/
	}
}


