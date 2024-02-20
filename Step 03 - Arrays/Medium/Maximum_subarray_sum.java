/*Given an integer array nums, find the subarray with the largest sum, and return its sum.

Example :

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.    */
class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int sum=0, maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum>maxi) maxi=sum;
            if(sum<0) sum=0;
        }
        return maxi;
    }
}        