/*Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

Example :

Input: nums = [1,1,1], k = 2
Output: 2                      */
class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int n=nums.size();
        int preSum=0, cnt=0;
        map<int,int> mpp;
        mpp[0]=1;
        for(int i=0;i<n;i++){
            preSum+=nums[i];
            int remove=preSum-k;
            cnt+=mpp[remove];
            mpp[preSum]+=1;
        }
        return cnt;
    }
};