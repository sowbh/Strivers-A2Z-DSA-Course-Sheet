<<<<<<< HEAD
/*You are given a sorted array ‘arr’ containing ‘n’ integers and an integer ‘x’.
Implement the ‘upperBound’ function to find the index of the upper bound of 'x' in the array.

Note:
The upper bound in a sorted array is the index of the first value that is greater than a given value. 
If the greater value does not exist then the answer is 'n', Where 'n' is the size of the array.
We are using 0-based indexing.
Try to write a solution that runs in log(n) time complexity.

Example:

Input : ‘arr’ = {2,4,6,7} and ‘x’ = 5,

Output: 2

Explanation: The upper bound of 5 is 6 in the given array, which is at index 2 (0-indexed).  */
public class Solution {
    public static int upperBound(int []arr, int x, int n){
        // Write your code here.
        int low=0, high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
=======
/*You are given a sorted array ‘arr’ containing ‘n’ integers and an integer ‘x’.
Implement the ‘upperBound’ function to find the index of the upper bound of 'x' in the array.

Note:
The upper bound in a sorted array is the index of the first value that is greater than a given value. 
If the greater value does not exist then the answer is 'n', Where 'n' is the size of the array.
We are using 0-based indexing.
Try to write a solution that runs in log(n) time complexity.

Example:

Input : ‘arr’ = {2,4,6,7} and ‘x’ = 5,

Output: 2

Explanation: The upper bound of 5 is 6 in the given array, which is at index 2 (0-indexed).  */
public class Solution {
    public static int upperBound(int []arr, int x, int n){
        // Write your code here.
        int low=0, high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
>>>>>>> d11c51586722c2a4719172f4f00d4b7e7e4c6b0b
