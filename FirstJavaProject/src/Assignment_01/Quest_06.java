package Assignment_01;

import java.util.*;

class Calculate{

	int  sum(int a,int b) {
		return a+b;
	}
	
	int sub(int c,int d)
	{
		if(c>d)
			return c-d;
		
		else
			return 0;
	}
}

public class Quest_06 {

	public static void main(String[] args) {
		System.out.println("Question 06");
		
		System.out.println("\t");
		System.out.println("Harjot Singh_F_200111196");
		Scanner in =new Scanner(System.in);
		int a,b;
		System.out.println("Enter the numbers on which task is to be performed");
		System.out.print("Enter the value of 'a'=");
		a=in.nextInt();
		System.out.print("Enter the value of 'b'=");
		b=in.nextInt();
		
		Calculate obj=new Calculate();
		int c=(a>b)? obj.sum(a,b) : obj.sub(a,b);
		System.out.println("\t");
		System.out.println("Result="+c);


	}

}
