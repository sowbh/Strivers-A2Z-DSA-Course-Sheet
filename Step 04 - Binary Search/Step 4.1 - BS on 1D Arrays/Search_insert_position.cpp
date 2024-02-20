<<<<<<< HEAD
/*Given a sorted array of distinct integers and a target value, return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example :

Input: nums = [1,3,5,6], target = 5
Output: 2           */
class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int lb=lower_bound(nums.begin(),nums.end(),target)-nums.begin();  //using c++ STL
        return lb;
    }
=======
/*Given a sorted array of distinct integers and a target value, return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example :

Input: nums = [1,3,5,6], target = 5
Output: 2           */
class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int lb=lower_bound(nums.begin(),nums.end(),target)-nums.begin();  //using c++ STL
        return lb;
    }
>>>>>>> d11c51586722c2a4719172f4f00d4b7e7e4c6b0b
};