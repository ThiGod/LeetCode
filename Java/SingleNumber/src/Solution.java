import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author ThiGod
 *Given an array of integers, every element appears twice except for one. Find that single one.
 *Note:
 *Your algorithm should have a linear runtime complexity. 
 *Could you implement it without using extra memory?
 */

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {-1,0,-1,1,2,3,4,5,2,3,4,5,1,8,8};
		int[] B = {-1};
		System.out.println(singleNumber(A));
		System.out.println(singleNumberFail(B));
	}
	
	public static int singleNumber(int[] A) {
		int s = 0;
		for(int a : A){
			s = s ^ a;
		}
		return s;
	}
	
	public static int singleNumberFail(int[] A) {
        List<Integer> ss = new ArrayList<Integer>();
        List<Integer> ss2 = new ArrayList<Integer>();
        for(int a : A){
        	if (!ss.contains(a)){
        		ss.add(a);
        	} else {
        		ss2.add(a);
        	}
        }
        ss.removeAll(ss2);
        return ss.get(0);
    }
}
