/*Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

Example :

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.     */
class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int longest=1, cnt=0;
        HashSet<Integer> st = new HashSet<>();
        if(n==0) return 0;
        for (int elt : nums) {
            st.add(elt);
        }

        for (int elt : st) {
            if (!st.contains(elt - 1)) { 
                int currentNum = elt;
                cnt = 1;

                while (st.contains(currentNum + 1)) {
                    currentNum++;
                    cnt++;
                }

                longest = Math.max(longest, cnt);
            }
        }

        return longest;
    }
}