package Unit_01;
/*   
 #Operator in java is a symbol that is used to perform operations.
 For examp[le:+,-,*,/ etc.
 ->a+=1; // a=a+1;
 #Types of operators in Java
 -Unary Operator :   {prefix and postfix}{a++,a--,++a,--a,~,!}
 -Arithmetic Operator: {*,/,%,+,-}
 -Shift Operator: {<< >>}
 -Relational Operator: {< > <= >= == !=}
 -Bitwise Operator: {& ^ |} [bitwise AND ,exclusive OR, inclusive OR]
 -Logical Operator: {&& ||}
 -Ternary Operator: {? :}
 -Assignment Operator: {= += -= *= /= %= &= ^= |= <<= >>= >>>=}
 */

public class P3_Task_02_OperatorsInJava {

	public static void main(String[] args) {
		OperatorsInJava obj = new OperatorsInJava();
		obj.UnaryOperator();
		obj.ArithmeticOperator();
		obj.ShiftOperator();
		obj.RelationalOperator();
		obj.BitwiseAndLogicalOperators();
		obj.TernaryOperator();
		obj.AssignmentOperator();
	}
	class OperatorsInJava {
		void UnaryOperator() {
			
			int a=10;
			boolean b = true;
			System.out.println("Inside UnaryOperator");
			System.out.println(a++);
			System.out.println(a--);
			System.out.println(++a);
			System.out.println(--a);
			
			System.out.println(~a);
			System.out.println(!b);
			System.out.println("\n");
		}
		void ArithmeticOperator() {
			System.out.println("Inside ArithmeticOperator ");
			int a =10;
			int b =5;
			System.out.println(a+b);//15
			System.out.println(a-b);//5
			System.out.println(a*b);//50
			System.out.println(a/b);//2
			System.out.println(a%b);//0
			//What is the output of this expression?
			System.out.println(10*10/5+3-1*4/2);
			System.out.println("\n");
			
		}
		void ShiftOperator() {
			System.out.println("Inside ShiftOperator");
			System.out.println(10<<2); // 10*2^2=10*4=40
			System.out.println(10<<3); // 10*2^3=10*8=80
			System.out.println(20<<2); // 20*2^2=20*4=80
			System.out.println(15<<4); // 15*2^4=15*16=240
			
			System.out.println(10>>2);// 10/2^2=10/4=2
			System.out.println(20>>2);// 20/2^2=20/4=5
			System.out.println(20>>3);// 20/2^3=20/8=2
			System.out.println("\n");
		}
		//result is true or false
		void RelationalOperator() {
			System.out.println("Inside RelationalOperator");
			int a =10;
			int b =20;
			System.out.println(a==b);
			System.out.println(a!=b);
			System.out.println(a>b);
			System.out.println(a<b);
			System.out.println(a>=b);
			System.out.println(a<=b);
			
			System.out.println("\n");
		}
		void BitwiseAndLogicalOperators() {
			System.out.println("Inside BitwiseAndLogicalOperators");
			int a=10;
			int b=5;
			int c=20;
			
			//Logical && and Bitwise &
			System.out.println(a<b && a++<c);
			System.out.println(a);
			
			System.out.println(a<b & a++<c);
			System.out.println(a);
			
			//logical || Bitwise |
			System.out.println(a>b || a<c);
			System.out.println(a>b | a<c);
			
			System.out.println(a>b || a++<c);
			System.out.println(a);
			System.out.println(a>b | a++<c);
			System.out.println(a);
			System.out.println("\n");
		
		}
		void TernaryOperator(){
			System.out.println("Inside TernaryOperator");
			
			int a =2;
			int b =5;
			int min =(a<b) ? a:b;
			System.out.println(min);
			System.out.println("\n");
		}
		void AssignmentOperator() {
			System.out.println("Inside AssignmentOperator");
			int a =10;
			int b =20;
			a+=4;
			b-=4;
			System.out.println(a);
			System.out.println(b);
			b>>>=2;
		}
	}
	
	}
