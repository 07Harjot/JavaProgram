package Assignment_01;
import java.util.*;


class Employee
{
	String name;
	int age;
	String Department;
	int salary;
	static int Total_sal = 0;
	
	Employee()
	{
	}
	Employee(String s, int a, String depart, int sal)
	{
		name = s;
		age = a;
		Department = depart;
		if(sal > 30000)
		{
			salary = 25000;
		}
		else
		{
			salary = sal;
		}
		Total_sal += sal;
	}
	
	void Total_salary()
	{
		System.out.println("Total salary is "+Total_sal);
	}
	
}

public class Quest_05 {

	public static void main(String[] args) {
		System.out.println("Harjot Singh_F_200111196");
		Employee arr[] = new Employee[8];
		String s;
		int age;
		String depart;
		int salary;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 4; i++)
		{
			System.out.println("Enter the detail of "+(i+1)+" Employee");
			s = sc.nextLine();
			age = sc.nextInt();
			depart = sc.next();
			salary = sc.nextInt();
			
			arr[i] = new Employee(s, age, depart, salary);
			
		}
		// Total salary
		Employee result = new Employee();
		result.Total_salary();

	}

}
