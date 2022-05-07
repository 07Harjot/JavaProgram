package Assignment_01;

/*Q1- WAP which would contain 6 objects, of a class 
Student. Student [Name, Age, section, percentage]. They all belong to 
Section-A. Your program would be able to find the average percentage of 
students in this section. Use constructors to create these 6 objects and 
input from Scanner class.*/
class Student
{
	String name;
	int age;
	char Section;
	int percentage;
	static int avgper = 0;
	
	Student()
	{
		age = 0;
		percentage = 0;
	}
	Student(String s, int a, char sec, int per) // Parameterized Constructor 
	{
		name = s;
		age = a;
		Section = sec;
		percentage = per;
		avgper += per;
		
		System.out.println("\t");
		System.out.println("Name: "+name);
		System.out.println("Section= "+Section);
		System.out.println("Age= "+age);
		System.out.println("Percentage= "+percentage+"%");
	}
	
	void get_avg()
	{
		int average = avgper/6;
		System.out.println("\t");
		System.out.println("Average Percantage = "+average+"%"); 
	}
}


public class Quest_01 {

	public static void main(String[] args) {
		System.out.println("Question 01");
		System.out.println("Harjot Singh_F_200111196");
		Student obj = new Student("Harjot", 19, 'A', 88);
		Student obj1 = new Student("Ayush", 17, 'A', 78);
		Student obj2 = new Student("Yash", 20, 'A', 98);
		Student obj3 = new Student("Abhishek", 15, 'A', 39);
		Student obj4 = new Student("Arnav", 23, 'A', 88);
		Student obj5 = new Student("Rohan", 19, 'A', 98);
		
		Student result = new Student();
		result.get_avg();

	}

}
