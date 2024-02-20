/*You are given a positive integer ‘n’.
Your task is to find and return its square root. If ‘n’ is not a perfect square, then return the floor value of sqrt(n).

Example:
Input: ‘n’ = 7

Output: 2

Explanation:
The square root of the number 7 lies between 2 and 3, so the floor value is 2.   */
import java.util.* ;
import java.io.*; 

public class Solution {

	public static int sqrtN(long N) {
		/*
		 * Write your code here
		 */
		int low=1, high=(int)N;  //type casting from long to int
		while(low<=high){
			long mid=(low+high)/2;
			long val=(mid*mid);
			if(val<=N){
				low=(int)mid+1;
			}
			else{
				high=(int)mid-1;
			}
		}
		return high;
	}
}
