package DAY1;

/*
 * This is simple lecture reagarding type-casting where we learn
 * 2 major concepts one is "Narrowing" and 2nd is "Widening"
 * Narrowing - when you want to assign a big data type value to 
 * lower datatype that is narrowing.you have to done this explicitly
 * Widening - when you want to assign a lower data value to higher data type
 * this conversion is implicit we need not to anything.
 * lets see by example
 */
public class _2TypeCasting {
	public static void main(String[] args) {
		System.out.println("**************Narrowing***********");
		int num = (int)8585l;
		System.out.println("example of narrowing = " + num);
		System.out.println("**************Widening************");
		double num1= 8585.45f;
		System.out.println("example of widening = " + num1);
	}
}
