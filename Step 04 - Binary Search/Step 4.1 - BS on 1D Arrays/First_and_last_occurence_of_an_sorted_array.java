<<<<<<< HEAD
/*You have been given a sorted array/list 'arr' consisting of ‘n’ elements. You are also given an integer ‘k’.

Now, your task is to find the first and last occurrence of ‘k’ in 'arr'.

Note :
1. If ‘k’ is not present in the array, then the first and the last occurrence will be -1. 
2. 'arr' may contain duplicate elements.

Example:
Input: 'arr' = [0,1,1,5] , 'k' = 1

Output: 1 2

Explanation:
If 'arr' = [0, 1, 1, 5] and 'k' = 1, then the first and last occurrence of 1 will be 1(0 - indexed) and 2. */
import java.util.ArrayList;

public class Solution {

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int first = -1;
        int last = -1;

        int low = 0;
        int high = n - 1;

        // To find first position
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr.get(mid) == k) {
                first = mid;
                high = mid - 1;
            } else if (arr.get(mid) < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        low = 0;
        high = n - 1;

        // To find last position
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr.get(mid) == k) {
                last = mid;
                low = mid + 1;
            } else if (arr.get(mid) < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return new int[]{first,last};
    }
}
=======
/*You have been given a sorted array/list 'arr' consisting of ‘n’ elements. You are also given an integer ‘k’.

Now, your task is to find the first and last occurrence of ‘k’ in 'arr'.

Note :
1. If ‘k’ is not present in the array, then the first and the last occurrence will be -1. 
2. 'arr' may contain duplicate elements.

Example:
Input: 'arr' = [0,1,1,5] , 'k' = 1

Output: 1 2

Explanation:
If 'arr' = [0, 1, 1, 5] and 'k' = 1, then the first and last occurrence of 1 will be 1(0 - indexed) and 2. */
import java.util.ArrayList;

public class Solution {

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int first = -1;
        int last = -1;

        int low = 0;
        int high = n - 1;

        // To find first position
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr.get(mid) == k) {
                first = mid;
                high = mid - 1;
            } else if (arr.get(mid) < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        low = 0;
        high = n - 1;

        // To find last position
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr.get(mid) == k) {
                last = mid;
                low = mid + 1;
            } else if (arr.get(mid) < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return new int[]{first,last};
    }
}
>>>>>>> d11c51586722c2a4719172f4f00d4b7e7e4c6b0b
