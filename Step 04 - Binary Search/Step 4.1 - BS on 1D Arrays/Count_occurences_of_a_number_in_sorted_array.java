<<<<<<< HEAD
/*You have been given a sorted array/list of integers 'arr' of size 'n' and an integer 'x'.

Find the total number of occurrences of 'x' in the array/list.

Example:
Input: 'n' = 7, 'x' = 3
'arr' = [1, 1, 1, 2, 2, 3, 3]

Output: 2

Explanation: Total occurrences of '3' in the array 'arr' is 2.     */
public class Solution {
    public static int count(int arr[], int n, int x) {
        
        int first, last;
        first = firstOccurrence(arr, n, x);

        if (first == -1)
            return 0;

        last = lastOccurrence(arr, n, x);
        int count =  last - first + 1;

        return count;
    }

    private static int firstOccurrence(int arr[], int n, int x) {

        int low = 0, high = n - 1;
        int first = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] >= x) {
                if(arr[mid] == x) {
                    first = mid;
                }
                // search on left
                high = mid - 1;
            }
            else {
                // search on right
                low = mid + 1;
            }
        }
        return first;
    }

    private static int lastOccurrence(int arr[], int n, int x) {

        int low = 0, high = n - 1;
        int last = -1;

        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            
            if(arr[mid] > x)
            {
                // search on left
                high = mid - 1;
            }
            else
            {      
               if(arr[mid] == x)
                    last = mid;

                // search on right
                low = mid + 1;
            }
        }
        return last;
    }
=======
/*You have been given a sorted array/list of integers 'arr' of size 'n' and an integer 'x'.

Find the total number of occurrences of 'x' in the array/list.

Example:
Input: 'n' = 7, 'x' = 3
'arr' = [1, 1, 1, 2, 2, 3, 3]

Output: 2

Explanation: Total occurrences of '3' in the array 'arr' is 2.     */
public class Solution {
    public static int count(int arr[], int n, int x) {
        
        int first, last;
        first = firstOccurrence(arr, n, x);

        if (first == -1)
            return 0;

        last = lastOccurrence(arr, n, x);
        int count =  last - first + 1;

        return count;
    }

    private static int firstOccurrence(int arr[], int n, int x) {

        int low = 0, high = n - 1;
        int first = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] >= x) {
                if(arr[mid] == x) {
                    first = mid;
                }
                // search on left
                high = mid - 1;
            }
            else {
                // search on right
                low = mid + 1;
            }
        }
        return first;
    }

    private static int lastOccurrence(int arr[], int n, int x) {

        int low = 0, high = n - 1;
        int last = -1;

        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            
            if(arr[mid] > x)
            {
                // search on left
                high = mid - 1;
            }
            else
            {      
               if(arr[mid] == x)
                    last = mid;

                // search on right
                low = mid + 1;
            }
        }
        return last;
    }
>>>>>>> d11c51586722c2a4719172f4f00d4b7e7e4c6b0b
}