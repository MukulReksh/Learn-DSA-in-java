package DAY2;

import java.util.Scanner;

/*
 * Conditional operators are && || !
 * there are used for multiple conditions inside if and else if
 * lets see by a program called find leap year or not
 * A leap year is defined either its fully divided by 4 and not divided by 100
 * or its fully divided by 400
 */
public class _2ConditionalOperators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0) {
			System.out.println("the current given year is a leap year");
		}else {
			System.out.println("not a leap year");
		}
	}
}
