package DAY2;

public class _4Pattern {
	public static void main(String[] args) {
		//print a pattern
		/*	****
		 * 	****
		 * 	****
		 * 	****
		 */
		
		int n = 4;
		for(int i =1;i<=n;i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*build a pattern
		 *  111
		 *  222
		 *  333
		 */
		
		 n = 3;
		 for(int i = 1;i<=n;i++) {
			 for(int j = 1;j<=n;j++) {
				 System.out.print(i);
			 }
			 System.out.println();
		 }
	}
	
}
