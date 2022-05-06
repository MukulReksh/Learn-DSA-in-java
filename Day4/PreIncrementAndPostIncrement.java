package Day4;
/*in this chapter we will learn about pre increment and
 * post increment operators
 * 1.++a ==>first increment and then assign
 * 2.a++ ==> first assign and then increment
 */

public class PreIncrementAndPostIncrement {
	public static void main(String[] args) {
		//excercise
		int a = 10;
		int b = 1;
		if(++a > 10) {
			System.out.println(b);
		}else {
			System.out.println(++b);
		}
		
		//in this problem the value of a will be 11 so it
		//will print 1;
		
		a = 1;
		b = 2;
		if(a-- > 0 && ++b > 2) {
			System.out.println("inside if");
		}else {
			System.out.println("inside else");
		}
		
		//in this problem a-- at the time of comparision will be 1
		//and ++b will become 3 so it will print inside if
		
		int num = 3;
		System.out.println(25 * ++num);
		//the value will be 100 as before multiply it will change to 4 
		
		a= 1;
		b= a++;
		int c = ++a;
		System.out.println("b = " + b + " c = " +c);
		//the values will be 1 and 3
		
	}
}
