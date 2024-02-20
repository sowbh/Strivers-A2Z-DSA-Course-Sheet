<<<<<<< HEAD
/*You're given a sorted array 'a' of 'n' integers and an integer 'x'.

Find the floor and ceiling of 'x' in 'a[0..n-1]'.

Note:
Floor of 'x' is the largest element in the array which is smaller than or equal to 'x'.
Ceiling of 'x' is the smallest element in the array greater than or equal to 'x'.

Example:
Input: 
n=6, x=5, a=[3, 4, 7, 8, 8, 10]   

Output:
4

Explanation:
The floor and ceiling of 'x' = 5 are 4 and 7, respectively.     */
import java.util.* ;
import java.io.*; 

public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      // Wriute your code here.
      int low = 0, high = n - 1;
        int[] result = new int[2];
        Arrays.fill(result, -1); // Initialize result with invalid values

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == x) {
                result[0] = a[mid]; // Assign floor value
                result[1] = a[mid]; // Assign ceil value
                break;
            } else if (a[mid] < x) {
                result[0] = a[mid]; // Update floor value
                low = mid + 1;
            } else {
                result[1] = a[mid]; // Update ceil value
                high = mid - 1;
            }
        }

        return result;
    }

    
=======
/*You're given a sorted array 'a' of 'n' integers and an integer 'x'.

Find the floor and ceiling of 'x' in 'a[0..n-1]'.

Note:
Floor of 'x' is the largest element in the array which is smaller than or equal to 'x'.
Ceiling of 'x' is the smallest element in the array greater than or equal to 'x'.

Example:
Input: 
n=6, x=5, a=[3, 4, 7, 8, 8, 10]   

Output:
4

Explanation:
The floor and ceiling of 'x' = 5 are 4 and 7, respectively.     */
import java.util.* ;
import java.io.*; 

public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      // Wriute your code here.
      int low = 0, high = n - 1;
        int[] result = new int[2];
        Arrays.fill(result, -1); // Initialize result with invalid values

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == x) {
                result[0] = a[mid]; // Assign floor value
                result[1] = a[mid]; // Assign ceil value
                break;
            } else if (a[mid] < x) {
                result[0] = a[mid]; // Update floor value
                low = mid + 1;
            } else {
                result[1] = a[mid]; // Update ceil value
                high = mid - 1;
            }
        }

        return result;
    }

    
>>>>>>> d11c51586722c2a4719172f4f00d4b7e7e4c6b0b
}