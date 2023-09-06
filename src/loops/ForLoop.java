package loops;

public class ForLoop {

	public static void main(String[] args) {
	
		for (int i = 0; i < 10; i++)
		{
			System.out.println(i);
		}
		
		//if the number is 6 then stop the loop
		
		for (int i = 0; i < 10; i++) {
			if (i==6) {
				break;
			}
			System.out.println(i);
		}
		
		//if the number is from 20 to 25 don't print
		for (int i = 0; i <40; i++) {
			if(i > 19 && i < 31) {
				continue;
			}
			System.out.println(i);
		}

	}

}
