/*Given an integer array ‘A’ of size ‘N’ and an integer ‘K'.
Split the array ‘A’ into ‘K’ non-empty subarrays such that the largest sum of any subarray is minimized.

Your task is to return the minimized largest sum of the split.

A subarray is a contiguous part of the array.

Example:
Input: ‘N’ = 5, ‘A’ = [1, 2, 3, 4, 5], ‘K’ = 3

Output: 6

Explanation: There are many ways to split the array ‘A’ into K consecutive subarrays. 
The best way to do this is to split the array ‘A’ into [1, 2, 3], [4], and [5], where the largest sum among the three subarrays is only 6. */
import java.util.*;

public class Solution {
    public static int largestSubarraySumMinimized(int []a, int k) {
        // Write Your Code Here
        int n=a.length;
        return findSub(a,n,k);
    }
    private static int findSub(int []a, int n, int m){
        if(m>n) return -1;
        int low=Arrays.stream(a).max().getAsInt();
        int high=Arrays.stream(a).sum();
        while(low<=high){
            int mid=(low+high)/2;
            int largest=minimize(a, mid);
            if(largest>m){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    private static int minimize(int []a, int Sum){
        int n=a.length;
        int cnt=1, subSum=0;
        for(int i=0;i<n;i++){
            if(subSum+a[i]<=Sum){
                subSum+=a[i];
            }
            else{
                cnt++;
                subSum=a[i];
            }
        }
        return cnt;
    }
}



