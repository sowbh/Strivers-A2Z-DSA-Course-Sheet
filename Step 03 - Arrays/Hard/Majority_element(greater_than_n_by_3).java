/*Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

Example :

Input: nums = [3,2,3]
Output: [3]       */
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;

        int elt1 = 0, elt2 = 0;
        int count1 = 0, count2 = 0;

        
        for (int num : nums) {
            if (num == elt1) {
                count1++;
            } else if (num == elt2) {
                count2++;
            } else if (count1 == 0) {
                elt1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                elt2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

    
        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == elt1) {
                count1++;
            } else if (num == elt2) {
                count2++;
            }
        }

        List<Integer> ls = new ArrayList<>();
        if (count1 > n / 3) {
            ls.add(elt1);
        }
        if (count2 > n / 3) {
            ls.add(elt2);
        }

        return ls;
    }
}