/*Given an array nums, return true if the array was originally sorted in non-decreasing order,
then rotated some number of positions (including zero). Otherwise, return false.

There may be duplicates in the original array.

Note: An array A rotated by x positions results in an array B of the same length such that 
A[i] == B[(i+x) % A.length], where % is the modulo operation.

Example:

Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].  */
class Solution {
    public boolean check(int[] nums) {
        int i = 0, flag = 0, n = nums.length;
        boolean status = true;
        while(i<n-1){
            if(flag == 0){
                if(nums[i] > nums[i+1]){
                    flag = 1;
                }
            }else{
                if(nums[0] < nums[i] || nums[i] > nums[i+1])                 {
                    status = false;
                    break;
                }
            }
            i++;
        }
        if(flag == 1 && nums[0] < nums[i]) status = false;
        return status;
    }
}