//package: refers to the java folder where your classes are located
public class Hello {
//class: refers to the file
	public static void main(String[] args) {
	//main method: entry point of the application
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		//print statement
	
		
		//print statement - single line comment
		/* this is a very
		  long comment that
		  needs more than 2 lines */
		
		//number
			//whole number
		byte b = 127; //smallest number -128 - +127 1 byte
		short s = 3456; //2 bytes
		int i = 1; // 4 bytes
		long l = 1651615461L; // 8 bytes
		
			//fraction
		float f = 1.25487F; // 4 bytes (6-7 decimals)
		double d = 1.254; // 8 bytes (up to 15 decimals)
		
		//character (characters can only be one single character)
		char ch = 'v'; // (2 bytes)
		
		//String accepts null but character does not accept null
		
		//text 
		String text = "blahblahblah";
		
		//boolean (true or false)
		boolean boo = true; //can only be true or false) (1 byte)
		
		//in-line declaration and assignment of a variable
		int x = 25;
		
		//declare variable
		int age;
		
		//assign variable
		age = 20;
		System.out.println(age + 5);
		
		//variable assignment
		age = 21;
		System.out.println(age + 5);
		
		final String name = "Jack"; 
		//name = "Fred"; // can't be reassigned
		
		//declare multiple variable in a single line
		int num1, num2, num3;
		num1 = 45;
		num2 = 52;
		num3 = 81;
		
		//variable naming
		int numberOfStudent = 20;
		
		/* a name can have letters, numbers, underscore, dollar sign
		 * name can start with letter, $, _
		 * names cannot contain reserved java keyboard
		 * use camel case for naming (thisIsCamelCase)
		 */
		
		//display variables
		System.out.println(name);
	
		//java logic
		System.out.println(10.0 / 15.0);
		
		//assignment symbol: =
		//comparison symbol: ==
		//logical symbols: &&(and), ||(or) , !(not)
		//arithmetic symbols: +, - , *, /, ++(+1), --(-1)
		System.out.println(10 == 10);
	}
	}
