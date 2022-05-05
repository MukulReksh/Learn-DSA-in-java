package DAY2;

import java.util.Scanner;

/*Lets discuss looping statements
 * there are different loops we have we generally use
 * for loop and while loop
 * lets see example
 */
public class _3LoopingStatement {
	public static void main(String[] args) {
		//write a program to print num from 1 to n using while loop
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i <= n) {
			System.out.println(i);
			i++;//this is post increment operator means = i =i+1
		}
		
		//using for loop
		for(i = 1;i<=n;i++) {
			System.out.println(i);
		}
		
		//calculate the sum from 1 to n using loops
		int sum = 0;
		for(i=1;i<=n;i++) {
			sum += i;
		}
		System.out.println("the sum is :" + sum);
		
		//calcute the sum of all even numbers from i to n
		sum = 0;
		for(i = 0;i<=n;i= i + 2) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("the sum of all even " + sum);
		//calculate the prime number
		i = 2;
		boolean isPrime = true;
		while(i < n) {
			if(n % i == 0) {
				isPrime = false;
				break;// is used to break the loop
			}
			i++;
		}
		System.out.println("the num is prime = " + isPrime);
	}
}
