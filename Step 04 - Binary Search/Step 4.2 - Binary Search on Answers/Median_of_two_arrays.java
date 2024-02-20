/*Given two sorted arrays 'a' and 'b' of size 'n' and 'm' respectively.
Find the median of the two sorted arrays.

Median is defined as the middle value of a sorted list of numbers. 
In case the length of list is even, median is the average of the two middle elements.
The expected time complexity is O(min(logn, logm)), where 'n' and 'm' are the sizes of arrays 'a' and 'b', respectively, and the expected space complexity is O(1).

Example:
Input: 'a' = [2, 4, 6] and 'b' = [1, 3, 5]

Output: 3.5

Explanation: The array after merging 'a' and 'b' will be { 1, 2, 3, 4, 5, 6 }. Here two medians are 3 and 4. So the median will be the average of 3 and 4, which is 3.5. */
public class Solution {
    public static double median(int[] a, int[] b) {
        int m = a.length;
        int n = b.length;
        
        if ((m + n) % 2 != 0) {
            return findKthElement(a, b, (m + n) / 2 + 1);
        } else {
            double left = findKthElement(a, b, (m + n) / 2);
            double right = findKthElement(a, b, (m + n) / 2 + 1);
            return (left + right) / 2.0;
        }
    }
    
    private static double findKthElement(int[] a, int[] b, int k) {
        int m = a.length;
        int n = b.length;
        int i = 0;
        int j = 0;
        
        while (true) {
            if (i == m) {
                return b[j + k - 1];
            }
            if (j == n) {
                return a[i + k - 1];
            }
            if (k == 1) {
                return Math.min(a[i], b[j]);
            }
            
            int halfK = k / 2;
            int newI = Math.min(i + halfK, m) - 1;
            int newJ = Math.min(j + halfK, n) - 1;
            
            if (a[newI] <= b[newJ]) {
                k -= (newI - i + 1);
                i = newI + 1;
            } else {
                k -= (newJ - j + 1);
                j = newJ + 1;
            }
        }
    }
}
