package Unit_01;

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {
	

	void palindromeOrNot(String s) {
		int j =s.length()-1;
		int counter =0;
		
		for(int i =0;i<s.length()/2;i++,j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				counter++;
				break;
			}
		}
		if(counter==0) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not Palindrome");
		}
		// Write Logic Here!

	}

	void reverseOfAString(String s) {
		String New="";
		char ch;
		for(int i =0 ;i<s.length();i++) {
			ch =s.charAt(i);
			New=ch +New;
		}
		System.out.println(New);
		// Write Logic Here!

	}
	
	void stringEqualOrNot(String s1,String s2) {
		if(s1!=s2) {
			System.out.println("Strings are not equal");
		}
		else {
			System.out.println("Strings are equal");
		}
		// Write Logic Here!
		
	}
}
