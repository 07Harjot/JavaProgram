package Assignment_01;
import java.util.*;
interface In1
{
 void display(int p);
}
class testClass implements In1{
	public void display(int p)
	{
		int counter=0;
		for(int i=1;i<=p;i++) {
			if(p%i==0)
			counter=counter+1;
		}
		if(counter==2)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");
	}
}
public class Quest_03 {
	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
		System.out.println("Question 03");
		System.out.println("Harjot Singh_F_200111196");
		System.out.println("\t");
		System.out.println("Enter the number to be checked");
		int n=sc.nextInt();
		testClass obj=new testClass();
		obj.display(n);
	}
}
