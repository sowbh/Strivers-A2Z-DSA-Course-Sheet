/*Problem statement
Jack and his friend are playing a game of subarrays. 
They have an array ‘NUMS’ of length ‘N’. Jack’s friend gives him an arbitrary integer ‘K’ and 
asks him to find the length of the longest subarray in which the sum of elements is equal to ‘K’.

Jack asks for your help to win this game. 
Find the length of the longest subarray in which the sum of elements is equal to ‘K’.

If there is no subarray whose sum is ‘K’ then you should return 0.

Example:
Input: ‘N’ = 5,  ‘K’ = 4, ‘NUMS’ = [ 1, 2, 1, 0, 1 ]

Output: 4

There are two subarrays with sum = 4, [1, 2, 1] and [2, 1, 0, 1]. 
Hence the length of the longest subarray with sum = 4 is 4.    */
import java.util.* ;

//import sun.tools.tree.ReturnStatement;

import java.io.*; 
public class Solution {
	public static int getLongestSubarray(int []nums, int k) {
		// Write your code here.
		int n=nums.length;
		int sum=0;
		int maxLen=0;
		Map<Integer,Integer> preSMap= new HashMap<>();
		for(int i=0;i<n;i++){
			sum+=nums[i];
			if(sum==k){
				maxLen=Math.max(maxLen, i+1);
			}
			int rem=sum-k;
			if(preSMap.containsKey(rem)){
				int len=i-preSMap.get(rem);
				maxLen=Math.max(maxLen, len);
			}
			if(!preSMap.containsKey(sum)){
				preSMap.put(sum, i);
			}
		} 
		return maxLen;
	}
}