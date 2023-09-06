
public class Array {

	public static void main(String[] args) {
		
		//arrays
		int i = 9;
		
		//in-line declaration and assignment
		int[] array = {5, 3, 8, 0}; // the [] will allow you to add multiple values
		String[] names = {"Jack","amber","dave","brad"};
		
		System.out.println(array[0]);
		
		int[] array2 = new int[4];
		
		//array assignment
		array2[0] = 5;
		array2[1] = 3;
		array2[2] = 8;
		array2[3] = 0;
		
		//2D array {Multidimensional array)
		//2D array declaration
		int[] [] array3 = new int[2][2];
		//2D array assignment
		array3[0][0] = 5;
		array3[0][1] = 6;
		array3[1][0] = 9;
		array3[1][1] = 0;
		
		System.out.println(array3[0][1]);
		
		//2D array in-line declaration and assignment
		int[][] array4 = {{5,6},{9,0}};
		

	}

}
