package Unit_02;

public class P13_Assignment_Questions_Unit_02 {

	public static void main(String[] args) {
		Assignment_Questions_Unit_02 obj = new Assignment_Questions_Unit_02();
		obj.abstractClassCall();
		obj.overloadingAndOverriding();
		obj.accessProtectionInJava();
		//obj.interfaceImplementation();

	}

}
class Assignment_Questions_Unit_02{
	void abstractClassCall() {
		Sample3 obj = new Sample3();
		obj.run();
	}
	void overloadingAndOverriding() {
		Sample3 obj = new Sample3();
		obj.run();
		obj.run(1);
		obj.run(1,2);
		obj.display();	
	}
	void accessProtectionInJava() {
		Sample3 obj = new Sample3();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		
		obj.showData();
		obj.display();
	}
	
}
abstract class Sample2 {
	int a=10; //default protection!
	public int b =20; //can be accessed outside Unit_02 Package but within same project
	protected int c = 30; // can be only accessed with Unit_02 Package
	private int d =40; // within ParentClass onlu, not even in its sub-class
	
	void showData() {
		System.out.println("Inside Sample2 Parent Class");
		System.out.println("a=" + a);
		System.out.println("a=" + b);
		System.out.println("a=" + c);
		System.out.println("a=" + d);
	}
	public void display() {
		System.out.println("This is a display method inside abstract class Sample2!");
	}
	abstract public void run(); // unimplemented method
}
class Sample3 extends Sample2 implements A3, B3 {
	public void display() {
		System.out.println("Inside Child Class");
		System.out.println("a=" + a);
		System.out.println("a=" + b);
		System.out.println("a=" + c);
		//System.out.println("a=" + d); // private member can't be accessed 
}
	public void display1() {
		System.out.println("This is a display1 method in Child class Sample3 from Interface");
	}
	public void display2() {
		System.out.println("This is a display2 method in Child class Sample3 from Interface");
	}
	public void run() {
		System.out.println("This is a run method from abstract class Sample2!");
	}
	public void run(int x) {
		System.out.println("This is a run overloaded method in Sample3!");
	}
	public void run(int x,int y) {
		System.out.println("This is a run overloaded method in Sample3!");
	}}
	
interface A3{
	public void display1();
}
interface B3{
	public void display2();
}
	
	
