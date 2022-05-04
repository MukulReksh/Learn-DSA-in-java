package DAY1;
/*
 * This Section is all about introduction to java
 * Printing first program ("Hello Duniya")
 * Variable different type capacity
 */
public class _1IntroductionToJava {
	public static void main(String[] args) {
		System.out.println("Hello Duniya,Love From Mukul Reksh :-");
		//variables to store data for positive and negative integers
		//1.byte - 1 byte - 8 bits range -> -2^7 to 2^7 -1
		byte age = 30;
		//2.short - 2 byte - 16 bits range -> -2^15 to 2^15 -1
		short year = 1992;
		//3.int = 4 byte - 32 bits ->range -2^31 to -2^31 - 1
		int randomNum = 55555555;
		//4 long = 8 byte -64 bits -> range -2^63 to -2^63 -1
		//the only catch while initilizing we need to end with l
		long phone = 9781700278l;
		
		//variable to store decimal numbers
		//1.float = 4 byte - 16 bits
		//while initliazing we need to end with f
		float weight = 79.8f;
		
		//2. double ==> 8 byte to store precise numbers
		double pi = 22/7f;
		
		
		System.out.println("my age is = " + age);
		System.out.println("My birth year is = " + year);
		System.out.println("just for fun = " +  randomNum);
		System.out.println("My Phone is := " + phone );
		System.out.println("the weight is " + weight);
		System.out.println("The value of " + pi);
		
		//now comes char data type to store a single character
		//7.char == 2 byte 16 bits store all characters as mentioned in unicode table
		char gender = 'm';
		
		//now comes how to store set of chars
		//8.String -> its is a class to store of set of chars
		String name = "Mukul Reksh";
		//9.there is one more data type to store only true or false
		boolean married = true;
		System.out.println("My gender is = : " + gender);
		System.out.println("My name is = : " + name);
		System.out.println("Am I married =: " + married);
	}
}
