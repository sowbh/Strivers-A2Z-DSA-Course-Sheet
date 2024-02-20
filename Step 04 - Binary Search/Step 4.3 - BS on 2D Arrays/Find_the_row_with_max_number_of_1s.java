/*You are given a 2D matrix 'ARR' (containing either ‘0’ or ‘1’) of size 'N' x 'M', where each row is in sorted order.
Find the 0-based index of the first row with the maximum number of 1's.

Note :
If two rows have the same number of 1’s, return the row with a lower index.
If no row exists where at-least one '1' is present, return -1.

Example:
Input: ‘N’ = 3, 'M' = 3
'ARR' = 
[     [ 1,  1,  1 ],
      [ 0,  0,  1 ],
      [ 0,  0,  0 ]   ]

Output: 0

Explanation: The 0th row of the given matrix has the maximum number of ones. */
import java.util.ArrayList;
public class Solution
{
    public static int maximumOnesRow(ArrayList<ArrayList<Integer>> matrix, int n, int m)
    {
        //	  Write your code here.
        int cnt_max=0, index=-1;
        for(int i=0;i<n;i++){
            int cnt_ones=m-lower_bound(matrix.get(i),m,1);
            if(cnt_ones>cnt_max){
                cnt_max=cnt_ones;
                index=i;
            }
        }
        return index;
    }
    private static int lower_bound(ArrayList<Integer> arr, int n, int x){
        int low=0, high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr.get(mid)>=x){
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