package Day3;

public class _1Patterns {
	public static void main(String[] args) {
		System.out.println("****************************************************************");
		/*create a pattern if n == 4
		 *  1 2 3 4
		 *  1 2 3 4
		 *  1 2 3 4
		 *  1 2 3 4 
		 */
		
		int n = 4;
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("****************************************************************");
		/*
		 * print a pattern if n = 4
		 * 4 3 2 1
		 * 4 3 2 1
		 * 4 3 2 1
		 * 4 3 2 1
		 */
		
		for(int i = 1;i<=n;i++) {
			for(int j = n;j>=1;j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("****************************************************************");
		/*print a pattern where n = 4
		 * 1 2 3 4
		 * 5 6 7 8
		 * 9 10 11 12
		 * 13 14 15 16
		 */
		int k = 1;
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
		System.out.println("****************************************************************");
		/*print a triangle pattern where n = 4
		 *  *
		 *  * *
		 *  * * *
		 *  * * * *
		 */
		
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		System.out.println("****************************************************************");
		/*print a triangle pattern with number
		 * 1
		 * 2 2
		 * 3 3 3
		 * 4 4 4 4
		 */
		
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("****************************************************************");
		/*print a triangular pattern with numbers
		 * 1
		 * 2 3
		 * 4 5 6
		 * 7 8 9 10
		 */
		
		for(int i =1;i<=n;i++) {
			k = i;
			for(int j= 1;j<=i;j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
		System.out.println("****************************************************************");
		/*print a triangle pattern with reverse numeric
		 * 1
		 * 2 1
		 * 3 2 1
		 * 4 3 2 1
		 * 
		 */
		
		for(int i = 1;i<=n;i++) {
			k = i;
			for(int j = 1;j<=i;j++) {
				System.out.print(k-- + " ");	
			}
			System.out.println();
		}
		System.out.println("****************************************************************");
		/*print a character pattern
		 * a a a a
		 * b b b b
		 * c c c c
		 * d d d d
		 */
		
		char ch = 'a';
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				System.out.print(ch + " ");
			}
			ch++;
			System.out.println();
		}
		System.out.println("****************************************************************");
		/*print a character pattern
		 * a b c d
		 * a b c d
		 * a b c d
		 * a b c d
		 */
		
		for(int i = 1;i<=n;i++) {
			ch = 'a';
			for(int j= 1;j<=n;j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
		System.out.println("****************************************************************");
		/*print a pattern with characters
		 * a b c d
		 * e f g h
		 * i j k l
		 * m n o p
		 */
		ch = 'a';
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
		System.out.println("****************************************************************");
		/*print a char pattern
		 * a b c d
		 * b c d e
		 * c d e f
		 * d e f g
		 */
		
		for(char a = 'a';a < 'a' + n;a++) {
			ch = a;
			for(int j = 1;j<=n;j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
		System.out.println("****************************************************************");
		/*print a traingular pattern with chars
		 * a
		 * b b 
		 * c c c
		 * d d d d
		 */
		ch = 'a';
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(ch + " ");
			}
			ch++;
			System.out.println();
		}
		System.out.println("****************************************************************");
		/*print a traingular pattern with chars
		 * a
		 * b c
		 * d e f
		 * g h i j
		 */
		ch = 'a';
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
		System.out.println("****************************************************************");
		/*print a traingular pattern with chars
		 * a 
		 * b c
		 * c d e
		 * d e f g
		 */
		
		for(char a = 'a';a<'a'+n;a++) {
			ch = a;
			for(char j = 'a';j<=a;j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
		System.out.println("****************************************************************");
		/*print a triangular pattern with chars
		 * d
		 * c d
		 * b c d
		 * a b c d
		 */
		for(char a = (char) ('a' + n - 1);a>= 'a';a--) {
			ch = a;
			for(char j = (char) ('a' + n - 1);j>=a;j--) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
		System.out.println("****************************************************************");
		/*print a star pattern with space
		 *    *
		 *   **
		 *  ***
		 * ****        
		 * 
		 */
		int spaces = n- 1;
		int star = 1;
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j = 1;j<=star;j++) {
				System.out.print("*");
			}
			spaces--;
			star++;
			System.out.println();
		}
		System.out.println("****************************************************************");
		/*print a star pattern
		 * ****
		 *  ***
		 *   **
		 *    *
		 * 
		 */
		spaces = 0;
		star = n;
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j = 1;j<=star;j++) {
				System.out.print("*");
			}
			spaces++;
			star--;
			System.out.println();
		}
		System.out.println("****************************************************************");
		/*print a pattern
		 * 1 1 1 1
		 * 	 2 2 2
		 *     3 3
		 *       4
		 */
		spaces = 0;
		star = n;
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j = 1;j<=star;j++) {
				System.out.print(i);
			}
			spaces++;
			star--;
			System.out.println();
		}
		System.out.println("****************************************************************");
		/*print a pattern
		 * 		1
		 * 	  2 2
		 *  3 3 3
		 * 4 4 4 4
		 * 
		 */
		
		spaces = n - 1;
		star = 1;
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j = 1;j<=star;j++) {
				System.out.print(i);
			}
			spaces--;
			star++;
			System.out.println();
		}
		System.out.println("****************************************************************");
		/*print a pattern
		 * 1 2 3 4
		 *   2 3 4
		 *     3 4
		 *       4
		 */
		
		spaces = 0;
		star = n;
		for(int i = 1;i<=n;i++) {
			k = i;
			for(int j = 1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j = 1;j<=star;j++) {
				System.out.print(k++);
			}
			spaces++;
			star--;
			System.out.println();
		}
		System.out.println("****************************************************************");
		/*print a pattern
		 *   1
		 *  23
		 * 456
		 *78910      
		 */
		spaces = n-1;
		star = 1;
		k = 1;
		for(int i = 1;i<=n;i++) {
			
			for(int j = 1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j = 1;j<=star;j++) {
				System.out.print(k++);
			}
			spaces--;
			star++;
			System.out.println();
		}
		System.out.println("****************************************************************");
		/*print a pattern
		 *   1
		 *  121
		 * 12321
		 *1234321     
		 */
		
		spaces = n-1;
		star = 1;
		for(int i = 1;i<=n;i++) {
			k = 1;
			for(int j = 1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j = 1;j<=star;j++) {
				if(j <= i) {
					System.out.print(k++);
				}else if(j <= i +1) {
					k--;
					System.out.print(--k);
				}else {
					System.out.print(--k);
				}
				
			}
			spaces--;
			star = star + 2;
			System.out.println();
		}
		System.out.println("****************************************************************");
		
		/*print a pattern
		 * 12344321
		 * 123**321
		 * 12****21
		 * 1******1
		 */
		star = 0;
		for(int i = n;i>=1;i--) {
			for(int j =1;j<=i;j++) {
				System.out.print(j);
			}
			
			for(int j = 1;j<=star;j++) {
				System.out.print("*");
			}
			
			k = i;
			for(int j = 1;j<=i;j++) {
				System.out.print(k--);
			}
			star = star + 2;
			System.out.println();
		}
	}
}
