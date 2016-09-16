package introduction;

public class OOPExample {

	public static void main(String[] args) {
		Student jimmy = new Senior("Jimmy"); //Works because Senior is a subclass of Student
		jimmy.talk();
		// cannot be
		// Senior john = new Student("John");
		Student john = new Junior("John");
		john.talk();
		Sophomore josh = new Sophomore("Josh");
		josh.abc();
	}
}
