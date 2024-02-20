<<<<<<< HEAD
/*You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.

 

Example 1:

Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2              */
class Solution {
public:
    int singleNonDuplicate(vector<int>& nums) {
        int n = nums.size();
        if(n == 1) return nums[0]; // nums has one element
        if(nums[0] != nums[1]) return nums[0]; // edge case for first element
        if(nums[n-1] != nums[n-2]) return nums[n-1]; // edge case for last element
        int low = 0;
        int high = n - 2;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid]; // single element found
            }
            if((mid % 2 == 1 && nums[mid] == nums[mid - 1]) 
            || (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                low = mid + 1; // remove left
            } else {
                high = mid - 1; //remove right
            }
        }
        return -1;
    }
};
=======
/*You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.

 

Example 1:

Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2              */
class Solution {
public:
    int singleNonDuplicate(vector<int>& nums) {
        int n = nums.size();
        if(n == 1) return nums[0]; // nums has one element
        if(nums[0] != nums[1]) return nums[0]; // edge case for first element
        if(nums[n-1] != nums[n-2]) return nums[n-1]; // edge case for last element
        int low = 0;
        int high = n - 2;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid]; // single element found
            }
            if((mid % 2 == 1 && nums[mid] == nums[mid - 1]) 
            || (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                low = mid + 1; // remove left
            } else {
                high = mid - 1; //remove right
            }
        }
        return -1;
    }
};
>>>>>>> d11c51586722c2a4719172f4f00d4b7e7e4c6b0b
