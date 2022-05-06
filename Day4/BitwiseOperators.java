package Day4;
/*in this chapter we will use bitwise operators
 * 1. & -And
 * 2. ~ -not
 * 3. | -or
 * 4. ^ -xor
 * 5. << left shift
 * 6. >> right shift
 * these operators works on bit by bit
 * lets see in the example below
 */
public class BitwiseOperators {
	 public static void main(String[] args) {
		 int a = 5;//101 binary representation
		 int b = 4;//100 binary representation
		 int c = a & b;
		 
		 /*
		  *	101
		  *	100
		  *-----
		  *	100 ==> so ans will be 4;
		  *so basically we need to take care if both bit are set 
		  *then result is set bit else 0; 
		  */
		 System.out.println(c);
		 
		 c = a | b;
		 /*
		  * in this if any of bit is set then result is = 1
		  */
		 System.out.println(c);
		 
		 c = ~a;
		 /*internally it will change the bits if its set
		  * it will make it unset and if it is unset it will
		  * make set.
		  * for shorthand whatever  the number is it will 
		  * be - + -1
		  * 
		  */
		 System.out.println(c);
		 
		 c = a ^ b;
		 /*xor operator change if both the bits are set it will change to zero
		  * if any of the bit is set it will behave like or operator
		  * 
		  */
		 System.out.println(c);
		 
		 c = a << 1;
		 /*in left shift we the bit size is smaller it will multiply by 2^num
		  * 
		  */
		 
		 System.out.println(c);
		 
		 c = a >> 1;
		 /*in the right shift operator it will divide by power of 2^num
		  * 
		  */
		 System.out.println(c);
		 
	 }
}
