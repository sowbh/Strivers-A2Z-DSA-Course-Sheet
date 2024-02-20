/*The frequency of an element is the number of times it occurs in an array.

You are given an integer array nums and an integer k. 
In one operation, you can choose an index of nums and increment the element at that index by 1.

Return the maximum possible frequency of an element after performing at most k operations.

Example:

Input: nums = [1,2,4], k = 5
Output: 3
Explanation: Increment the first element three times and the second element two times to make nums = [4,4,4].
4 has a frequency of 3.  */

class Solution {
public:
    int maxFrequency(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
       

        int i = 0;
        int j = 1;
        int ans = 1;
        while(j<nums.size()){
            long long mid = (j-i)*1LL*(nums[j]-nums[j-1]);
            if( mid <= k){
                k-= mid;
                j++;
            }
            else{
                k+= nums[j-1]-nums[i];
                i++;
            }
            
            ans = max(ans,j-i);
        } 
        return ans;
    }
};