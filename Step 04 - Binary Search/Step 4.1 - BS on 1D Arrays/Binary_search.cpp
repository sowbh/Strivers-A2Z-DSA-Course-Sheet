<<<<<<< HEAD
/*Given an array of integers nums which is sorted in ascending order, and an integer target, 
write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4      */
class Solution {
public:
    int search(vector<int>& nums, int target) {
        int n=nums.size();
        return binary_search(nums,0,n-1,target);
    }
private:
    int binary_search(vector<int> &arr, int low, int high, int target){
        if(low>high) return -1;
        int mid=(low+high)/2;
        if(arr[mid]==target) return mid;
        else if(target > arr[mid])
            return binary_search(arr,mid+1,high,target);
        else
            return binary_search(arr,low,mid-1,target);
    }
=======
/*Given an array of integers nums which is sorted in ascending order, and an integer target, 
write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4      */
class Solution {
public:
    int search(vector<int>& nums, int target) {
        int n=nums.size();
        return binary_search(nums,0,n-1,target);
    }
private:
    int binary_search(vector<int> &arr, int low, int high, int target){
        if(low>high) return -1;
        int mid=(low+high)/2;
        if(arr[mid]==target) return mid;
        else if(target > arr[mid])
            return binary_search(arr,mid+1,high,target);
        else
            return binary_search(arr,low,mid-1,target);
    }
>>>>>>> d11c51586722c2a4719172f4f00d4b7e7e4c6b0b
};