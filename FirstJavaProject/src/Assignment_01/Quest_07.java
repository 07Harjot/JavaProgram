package Assignment_01;
class Employe{
	public static int count =0;
	public static int count1 =0;
	void display() {
		count++;
	}
	Employe(){
		count1++;
	}
}

public class Quest_07 {

	public static void main(String[] args) {
		Employe obj = new Employe();
		Employe obj1 = new Employe();
		Employe obj2 = new Employe();
		Employe obj3 = new Employe();
		
		
		obj.display();
		obj1.display();
		obj2.display();
		obj3.display();
		
		System.out.println("Harjot Singh_F_200111196");
		System.out.println("Total no of calls for display function =" + Employe.count);
		System.out.println("Total no of calls for constructor =" + Employe.count1);

	}

}
