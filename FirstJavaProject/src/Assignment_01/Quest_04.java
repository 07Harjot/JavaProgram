package Assignment_01;
class ClassOne{
	ClassOne(int a){
	
		System.out.println("One's Parameterized Constructor");
	}
}
class ClassTwo extends ClassOne{
	
	ClassTwo(){
		super(1);
		System.out.println("Two's Default Constructor");
	}
}
class ClassThree extends ClassTwo{
	ClassThree(){
		System.out.println("Three's Default Constructor");
	}
	ClassThree(int b){
		System.out.println("Three's Parameterized Constructor");
	}
}
public class Quest_04 {
public static void main(String[] args) {
		System.out.println("Quest 04");
		System.out.println("\t");
		System.out.println("Harjot Singh_F_200111196\n");
		ClassThree obj =new ClassThree(1);
		System.out.println("\n");
        ClassThree obj1=new ClassThree();
	}
}
