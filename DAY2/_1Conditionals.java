package DAY2;

import java.util.Scanner;

/*TOday we are going to learn about how to write conditionals statement
 * those statements are if,if else,if else if else ,switch statement
 * 
 */
public class _1Conditionals {
	 public static void main(String[] args) {
		 //dont worry about scanner class we will learn in next videos
		 //this is used to take input from console
		 Scanner sc = new Scanner(System.in);
		 boolean willRain = sc.nextBoolean();
		 if(willRain == true) {
			 System.out.println("there will be rain today");
		 }else {
			 System.out.println("no prediction made");
		 }
		 
		 //now we aill discuss if else if else
		 int num1 = sc.nextInt();
		 int num2 = sc.nextInt();
		 
		 if(num1 > num2) {
			 System.out.println("num1 is greater");
		 }else if(num2 > num1) {
			 System.out.println("num2 is greater");
		 }else {
			 System.out.println("they are equal");
		 }
		 
		 int day = sc.nextInt();
		 
		 switch (day) {
		case 0: {
			System.out.println("Today is sunday");
			break;
		}
		case 1: {
			System.out.println("Today is Monday");
			break;
		}
		case 2: {
			System.out.println("Today is Tuesday");
			break;
		}
		case 3: {
			System.out.println("Today is wednesday");
			break;
		}
		case 4: {
			System.out.println("Today is thursday");
			break;
		}
		case 5: {
			System.out.println("Today is friday");
			break;
		}
		case 6: {
			System.out.println("Today is saturday");
			break;
		}
		default:
			System.out.println("invalid input");
		}
	 }
}
