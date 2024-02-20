/*Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. 
You may assume that the majority element always exists in the array.

Example :

Input: nums = [3,2,3]
Output: 3     */
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int cnt=0;
        int elt=-1;
        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt=1;
                elt=nums[i];
            }
            else if(nums[i]==elt){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int cnt1=0;
        for(int i=0;i<n;i++){
            if(nums[i]==elt)
                cnt1++;
            }
            if(cnt1>n/2){
                return elt;
            }
        return -1;
    }
}