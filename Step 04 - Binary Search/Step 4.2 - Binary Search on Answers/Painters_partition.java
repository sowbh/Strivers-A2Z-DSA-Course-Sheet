/*Given an array/list of length ‘n’, where the array/list represents the boards and each element of the given array/list represents the length of each board. 
Some ‘k’ numbers of painters are available to paint these boards. Consider that each unit of a board takes 1 unit of time to paint.

You are supposed to return the area of the minimum time to get this 
job done of painting all the ‘n’ boards under a constraint that any painter will only paint the continuous sections of boards.

Example :
Input: arr = [2, 1, 5, 6, 2, 3], k = 2

Output: 11

Explanation:
First painter can paint boards 1 to 3 in 8 units of time and the second painter can paint boards 4-6 in 11 units of time. 
Thus both painters will paint all the boards in max(8,11) = 11 units of time. It can be shown that all the boards can't be painted in less than 11 units of time. */
import java.util.*;

public class Solution 
{
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        //    Write your code here.
        int n=boards.size();
        return findDist(boards, n, k);
    }
    private static int findDist(ArrayList<Integer> arr, int n, int m){
        if(m>n) return -1;
        int low=Collections.max(arr);
        int high=arr.stream().mapToInt(Integer::intValue).sum();
        while(low<=high){
            int mid=(low+high)/2;
            int largest=Distance(arr, mid);
            if(largest>m) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
    private static int Distance(ArrayList<Integer> arr, int dist){
        int time=1, job=0;
        int n=arr.size();
        for(int i=0;i<n;i++){
            if(job+arr.get(i)<=dist){
                job+=arr.get(i);
            }
            else{
                time++;
                job=arr.get(i);
            }
        }
        return time;
    }
}