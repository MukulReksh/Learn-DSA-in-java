package DAY1;

/*
 * The question in my mind How Negative numbers are stored 
 * in binary.what is the hack behind that?
 * its very simple its done through 2's compliment
 * in that first we inverse all bits and add 1.
 * lets see by example.
 */

public class _3NegativeNumbers {
	public static void main(String[] args) {
		int num = 5;
		//to inverse all bits we use not operator if you dont
		//know please dont worry we will cover in bit manipulation
		//chapter.
		num = ~num + 1;
		System.out.println("the new number is = : " +num);
	}
}
