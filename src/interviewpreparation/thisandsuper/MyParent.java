package interviewpreparation.thisandsuper;

public class MyParent {
	private Integer id;
	private String name;
	private double salary;

	public void add(String name) {
		System.out.println("I am belongs to the add method in MyParent class");
	}

	public static Integer sub() {
		System.out.println("I am belongs to the sub method in the MyParent class");
		return null;
	}

	public MyParent() {
		System.out.println("I am using the zero param constructor");
	}

	public MyParent(String myname, Double salary) {
		this();
		System.out.println(myname);//AshokIt
		System.out.println(this.salary);//0.0
		System.out.println(salary);//23423.342
		System.out.println("I am using the params constructr in  MyParent class");
	}

	public static void main(String[] args) {
		MyParent myParent = new MyParent("AshokIt", 23423.342);
	}
}


