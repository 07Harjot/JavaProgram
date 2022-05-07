package Assignment_01;
private class rom //Illegal modifier for the class rom; only public, abstract & final are permitted
{
	//
}

class ParentClass{
	int a = 10;//Default protection!
	public int b = 20;//Can be accessed outside Unit02 package within same project
	protected int c = 30;//Can only accessed only within unit02 package
	private int d = 40;//Within Parent class only 
	
	void showData() {
		System.out.println("Inside ParentClass");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}
}

class ChildClass extends ParentClass{
	
	void accessData() {
		System.out.println("Inside ChildClass");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
}

class AnotherClass extends ChildClass{
	
	void Display() {
		ParentClass obj = new ParentClass();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);

}

}
public class Quest_09 {

	public static void main(String[] args) {
		System.out.println("Question 09");
		
		System.out.println("\t");
		System.out.println("Harjot Singh_F_200111196");
		AnotherClass obj = new AnotherClass();
		obj.showData();
		obj.accessData();
	}

}
