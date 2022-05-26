package Day4;

public class Problems {
	public static void main(String[] args) {
		fibb(10);
		System.out.println(isPrime(10));
		valueOfi(15);
		System.out.println();
		System.out.println(mulMinusAddition(234));
		System.out.println(countBits(101));
		System.out.println(reverseANumber(5252525));
		System.out.println(binaryToDecimal(111));
		System.out.println(decimalToBinary(10));
		System.out.println(squareRoot(36));
		System.out.println(power(5,4));
		int[] arr = {3,7,11};
		update(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void update(int[] arr) {
		arr[1] = 100;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void fibb(int n) {
		int a = 0;
		int b = 1;
		if(n == 0) {
			System.out.println(a);
		}else {
			for(int i = 1;i<=n;i++) {
				int c = a + b;
				
				a = b;
				System.out.print(a + " ");
				b = c;
			}
			
			System.out.println("the nth fibb is = " + a);
		}
	}
	
	
	public static boolean isPrime(int num) {
			if(num <= 1) {
				return false;
			}
			for(int i = 2;i * i <= num;i++) {
				if(num % i == 0) {
					return false;
				}
			}
		return true;
	}
	
	public static void valueOfi(int num) {
		int i = 1;
		for(;i<=num;i++) {
			System.out.print(i + " ");
		}
		
	}
	//subtract the product and sum of digits of a number
	//leetcode 1281
	public static int mulMinusAddition(int num) {
		
		int ans = 0;
		int mul = 1;
		int add = 0;
		
		while(num > 0) {
			int last = num % 10;
			mul*=last;
			add+=last;
			num /=10;
		}
		return mul - add;
	}
	
	//count number of 1 bits
	//leetcode 191
	public static int countBits(int num) {
		int count = 0;
		while(num > 0) {
			if((num & 1) == 1) {
				count++;
			}
			num = num / 10;
		}
		
		return count;
	}
	//reverse a number
	public static int reverseANumber(int num) {
		int ans = 0;
		while(num > 0) {
			int last = num % 10;
			ans = ans * 10 + last;
			num/=10;
		}
		
		return ans;
	}
	
	//binary to decimal
	public static int binaryToDecimal(int bin) {
		int ans = 0;
		int pow = 0;
		while(bin > 0) {
			int last = bin % 10;
			ans = ans + (last * (int)(Math.pow(2,pow)));
			pow++;
			bin/=10;
		}
		
		return ans;
	}
	//decimal to binary
	public static int decimalToBinary(int num) {
		String temp = "";
		while(num > 0) {
			int last = num % 2;
			temp+=last;
			num = num/2;
		}
		int j = temp.length() - 1;
		String ans = "";
		while(j >= 0) {
			ans+=temp.charAt(j);
			j--;
		}
		
		return Integer.parseInt(ans);
	
	}
	//integral squareroot of num
	public static int squareRoot(int n) {
		int i ;
		for( i = 1;i * i<=n;i++) {
			
		}
		return i - 1;
	}
	
	//power of number
	public static int power(int num,int power) {
		int ans = 1;
		int pow = 0;
		while(pow < power) {
			ans = ans * num;
			pow++;
		}
		
		return ans;
	}
}
