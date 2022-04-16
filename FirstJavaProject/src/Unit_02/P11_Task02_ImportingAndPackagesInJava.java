package Unit_02; //Inside this package we can create many classes!


/*
-A java package is a group of similar types of classes,interface and sub-packages.
-Package in java can be categorized in two form
-built-in package{lang,awt,javax,swing,net,io,util,sql}
-user-defined package

-Package also helps to avoid class name collison
-Package also helps us to maintain access protection in Java
-Package are named in reverse order of domain names
 -unit01.javaproject.com -> "com.javaproject.unit01"
 
 import java.util.vector; //importv the vector class from util package 
 import java.util.*; //import all the classes from util package
 
 static Import:
 -Static import is a feature introduced in Java Programming language {version 5 or above}
 -that allows members {fields and methods }defined in a class as public static ,
 to be used in Java code without specifying the class in which in the field is defined  
 */
import static java.lang.System.*;
import static java.lang.Math.*;

public class P11_Task02_ImportingAndPackagesInJava {

	public static void main(String[] args) {
		out.println("Welcome to package");
		out.println(sqrt(4));
		System.out.println(pow(2,2));
		System.out.println(abs(6.3));
		
		SampleClass1 obj = new SampleClass1();
		System.out.println(obj.a);

	}

}
