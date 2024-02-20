/*You have been given a 2-D array 'mat' of size 'M x N' where 'M' and 'N' denote the number of rows and columns, respectively. 
The elements of each row are sorted in non-decreasing order.
Moreover, the first element of a row is greater than the last element of the previous row (if it exists).

You are given an integer ‘target’, and your task is to find if it exists in the given 'mat' or not.

Example:
Input: ‘M’ = 3, 'N' = 4, ‘mat’ = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]], ‘target’ = 8

Output: true

Explanation: The output should be true as '8' exists in the matrix. */
import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        int n=mat.size();
        int m=mat.get(0).size();
        int low=0, high=n*m-1;
        while(low<=high){
            int mid=(low+high)/2;
            int row=mid/m;
            int col=mid%m;
            if(mat.get(row).get(col)==target) return true;
            else if(mat.get(row).get(col)<target) low=mid+1;
            else high=mid-1;
        }
        return false;
    }
}
