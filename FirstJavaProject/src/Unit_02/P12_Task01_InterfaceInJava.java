package Unit_02;
/*
 An interface is a complete(100%) "abstract class",
 -that is used to group related methods with empty bodies
 
 -Need of interface?
 -multiple interface can be implemented at the same  time in one class?
 
 -Can an interface extends another interface?
 
 */
//Interface (100% abstract class)
interface Animal {
	public void animalSound(); //interface method (does not have body)
	public void run(); //interface method (does not have body)
}
//interface
interface Human {
	public void humanSound(); //interface method (does not have body)
	public void run1(); //interface method (does not have body)
}

public class P12_Task01_InterfaceInJava {

	public static void main(String[] args) {
		C1 obj = new C1();
		obj.funcA();
		obj.funcB();
		
	}
public void animalSound() {
	
}
public void run() {
	
}
}
//Multiple interface can be implemented at the same time!
class Species implements Animal, Human{
	@Override
	public void animalSound() {
		System.out.println("We are inside animalSound method");
	}
	@Override
	public void run() {
		System.out.println("We are inside run method");
	}
	@Override
	public void humanSound() {
		System.out.println("We are inside humanSound method");
	}
	@Override
	public void run1() {
		System.out.println("We are inside run method");
	}	
}
interface A1 {
	void funcA();
}
interface B1 extends A1 {
	void funcB();
}
class C1 implements B1 {
	public void funcA() {
		System.out.println("This is functA from A1");
	}
	public void funcB() {
		System.out.println("This is functB from A2");
	}
}
