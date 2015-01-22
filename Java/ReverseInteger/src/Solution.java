/**
 * 
 * @author ThiGod
 *Reverse digits of an integer.
 *Example1: x = 123, return 321
 *Example2: x = -123, return -321
 *
 *click to show spoilers.
 *Have you thought about this?
 *Here are some good questions to ask before coding. 
 *Bonus points for you if you have already thought through this!
 *If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.
 *Did you notice that the reversed integer might overflow? 
 *Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. 
 *How should you handle such cases?
 *Throw an exception? Good, but what if throwing an exception is not an option? 
 *You would then have to re-design the function (ie, add an extra parameter).
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 8;
		int B = -2;
		int C = 60;
		int D = 187;
		int E = 900;
		int F = -122;
		System.out.println(reverse(A));
		System.out.println(reverse(B));
		System.out.println(reverse(C));
		System.out.println(reverse(D));
		System.out.println(reverse(E));
		System.out.println(reverse(F));
	}
	
	public static int reverse(int x) {
		if(x/10==0)
			return x;
		else
			return x/10;
	}
}
