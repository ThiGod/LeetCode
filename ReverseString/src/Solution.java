/*
 * 
Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".
 *
 */

public class Solution {

	public static void main(String[] args) {
		String s = "the sky is blue";
		System.out.println("Old string: " + s);
		System.out.println("Revert string: " + ReverseString(s));
	}
	
	public static String ReverseString(String s) {
		if(s==null||s.length()==0) return s;
		String[] ss = s.split(" +");
		StringBuilder ret = new StringBuilder();
		for(int i=ss.length-1; i>=0; i--) {
			if(ss[i].length()>0) {
				ret.append(ss[i]).append(" ");
			}
		}
		return ret.toString().trim();
	}
}
