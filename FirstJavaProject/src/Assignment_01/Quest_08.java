package Assignment_01;
import java.util.*;
public class Quest_08 {
public static void main(String[] args) {
		System.out.println("Question 08");
		System.out.println("\t");
		System.out.println("Harjot Singh_F_200111196");
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int n=in.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter the Element of array:");
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		int m;
		System.out.println("Enter the index whose element is to be deleted");
		m=in.nextInt();
		System.out.println("Deleted Element="+arr[m]);
		for(int i=m;i<n-1;i++) {
			arr[i]=arr[i+1];
		}
	}
}
