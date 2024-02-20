/*Problem statement
You have been given an array ‘a’ of ‘n’ unique non-negative integers.
Find the second largest and second smallest element from the array.
Return the two elements (second largest and second smallest) as another array of size 2.

Example :
Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
Output: [4, 2]

The second largest element after 5 is 4, and the second smallest element after 1 is 2.  */
public class Solution {
    static private int secondSmallest(int n, int[] a) {
        if (n < 2) {
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] < small) {
                second_small = small;
                small = a[i];
            } else if (a[i] < second_small && a[i] != small) {
                second_small = a[i];
            }
        }
        return second_small;
    }
    static private int secondLargest(int n, int[] a) {
        if (n < 2) {
            return -1;
        }
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] > large) {
                second_large = large;
                large = a[i];
            } else if (a[i] > second_large && a[i] != large) {
                second_large = a[i];
            }
        }
        return second_large;
    }

    public static int[] getSecondOrderElements(int n, int[] a) {
        int sS = secondSmallest(n, a);
        int sL = secondLargest(n, a);
        
        // Create an array to store the second smallest and second largest elements
        int[] result = {sL, sS};
        
        return result;
    }
}
