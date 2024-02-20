/*Given a binary array nums, return the maximum number of consecutive 1's in the array.

Example :

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
The maximum number of consecutive 1s is 3.  */
class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int maxi=0, cnt=0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]==1){
                cnt++;
                maxi=max(maxi,cnt);
            }
            else{
                cnt=0;
            }
        }
        return maxi;
    }
};
