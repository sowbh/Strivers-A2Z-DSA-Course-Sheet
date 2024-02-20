/*You are given an array 'arr' consisting of 'n' integers which denote the position of a stall.

You are also given an integer 'k' which denotes the number of aggressive cows.

You are given the task of assigning stalls to 'k' cows such that the minimum distance between any two of them is the maximum possible.

Print the maximum possible minimum distance.

Example:
Input: 'n' = 3, 'k' = 2 and 'arr' = {1, 2, 3}

Output: 2

Explanation: The maximum possible minimum distance will be 2 when 2 cows are placed at positions {1, 3}. 
Here distance between cows is 2. */
import java.util.*;

public class Solution {
    public static int aggressiveCows(int []stalls, int k) {
        //    Write your code here.
        int n = stalls.length;
        Arrays.sort(stalls);
        int low = 1, high = stalls[n - 1] - stalls[0];

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canWePlace(stalls, mid, k)==true) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return high;
    }

    private static boolean canWePlace(int[] stalls, int dist, int cows) {
        int cntcows = 1, last = stalls[0];
        int n = stalls.length;
        for (int i = 1; i < n; i++) {
            if (stalls[i] - last >= dist) {
                cntcows++;
                last = stalls[i];
            }
            if (cntcows >= cows) {
                return true;
            }
        }
        return false;
    }
}