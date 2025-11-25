
public class AppleTester {
	
	public static void main(String[] args) {
		System.out.println("Welcome to the apple tester");
		System.out.println("Creating a default apple");
		
		Apple apple = new Apple();
		
		System.out.println(apple.toString());
		
		System.out.println();
		
		System.out.println("Creating another apple");
		Apple apple2 = new Apple("Granny Smith", 2.0, 4.0);
		System.out.println("Setting the new apple's values to the following values");
		System.out.println(apple2.getType() + " " + apple2.getWeight() + " " + apple2.getPrice());
		System.out.println(apple2.toString());
	
		System.out.println();
		System.out.println("Creating another apple");
		System.out.println("Then setting this apple to the following values");
		Apple apple3 = new Apple("WRONG!", 4000.0, -700);
		System.out.println(apple3.getType() + " " + apple3.getWeight() + " " + apple3.getPrice());
		
		
		System.out.println(apple3.toString());
		
		System.out.println();
		System.out.println("Checking if the first and last apple have the same values.");
		System.out.println(apple.equals(apple3));
	
	
	}
}
