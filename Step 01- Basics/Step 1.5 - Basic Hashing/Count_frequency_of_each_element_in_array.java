/*Problem statement: Given an array, we have found the number of occurrences of each element in the array.

Example:
Input: arr[] = {10,5,10,15,10,5};
Output: 10  3
	 5  2
        15  1
Explanation: 10 occurs 3 times in the array
	      5 occurs 2 times in the array
              15 occurs 1 time in the array  */

public class Solution {
    public static int[] countFrequency(int n, int x, int []nums){

        int []ans = new int[n];
            
        for (int num : nums)
            {
                if (num <= n)
                {
                    ans[num - 1]++;
                }
            
            }
        return ans;
     }
}