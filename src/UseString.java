
public class UseString {

	public static void main(String[] args) {
		
		//Strings
		//string manipulation
		String name = "      Jack      ";
		System.out.println(name.indexOf("c"));
		name = name.replace("J", "W");
		System.out.println(name);
		System.out.println(name.charAt(3));
		name = name.trim();
		System.out.println(name);
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		
		//string concatenation
		String firstName = "Jack";
		String lastName = "Sparrow";
		String space = " ";
		System.out.println(firstName +" "+ lastName);
		System.out.println(firstName.concat(space.concat(lastName)));
	}

}
