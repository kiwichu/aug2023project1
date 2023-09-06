
public class Operators {

	public static void main(String[] args) {
		
		//operators in java
		//arithmetic operators: +, -, *, /, %
		System.out.println(5 + 10);
		System.out.println(5 - 10);
		System.out.println(5 * 10);
		System.out.println(5 / 10);
		System.out.println(5 % 10);
		int a = 3;
		a++; // a++ equals to a+1
		System.out.println(a);
		int b = 100;
		b--; //b-- equals to b-1
		System.out.println(b);
		
		int c = 200;
		System.out.println(c++);
		System.out.println(c);
		
		int d = 400;
		System.out.println(d--);
		System.out.println(d);
		
		
		//assignment operators: =
		int i =4;
		
		//comparison operators: >, >=, <, <=, ==,!=
		
		System.out.println(10 > 9); //true
		System.out.println(11 >= 9); //true
		System.out.println(9 < 10); //true
		System.out.println(6 <= 7); //true
		System.out.println(5 == 5); //true
		System.out.println(3 != 4); //true
		
		///logical operators: &&, ||, !
		System.out.println((10 > 9) && (8 != 8));//false
		System.out.println((10 > 9) || (8 != 10));//true
		System.out.println(!(10 > 9));//false
		
		//escape characters:
		System.out.println("hello");
		System.out.print("world \n");// \n makes you go to the next line
		System.out.println("hi"); // \t is tab
		
		System.out.println("\"hi my name is jack\""); // " \ " is an escape character
		System.out.println("\'hi my name is jack\'"); 
		System.out.println("\\hi my name is jack\\");
		
		
	}

}
