package Assignment_01;
class A{
	public static int count =0;
	public static int count1 =0;
	void display() {
		count++;
	}
	A(){
		count1++;
	}
}



public class Quest_02 {

	public static void main(String[] args) {
		A obj = new A();
		
		A obj1 = new A();
		
		A obj2 = new A();
		
		A obj3 = new A();
		
		obj.display();
		obj1.display();
		obj2.display();
		obj3.display();
		
		System.out.println("Harjot Singh_F_200111196");
		System.out.println("Total no of calls for display function =" + A.count);
		System.out.println("Total no of calls for constructor =" + A.count1);
	}

}
