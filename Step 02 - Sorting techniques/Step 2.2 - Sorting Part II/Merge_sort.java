/*Problem statement
You are given the starting 'l' and the ending 'r' positions of the array 'ARR'.

You must sort the elements between 'l' and 'r'.

Note:
Change in the input array itself. So no need to return or print anything.

Example:

Input: ‘N’ = 7,
'ARR' = [2, 13, 4, 1, 3, 6, 28]
Output: [1 2 3 4 6 13 28]
Explanation: After applying 'merge sort' on the input array, the output is [1 2 3 4 6 13 28].   */
import java.util.ArrayList;

public class Solution {
    private static void merge(int[] arr, int l, int mid, int r){
        ArrayList<Integer> temp = new ArrayList<>();
        int left=l;
        int right=mid+1;
        
        while(left<=mid && right<=r){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=r){
            temp.add(arr[right]);
            right++;
        }
        for(int i=l;i<=r;i++){
            arr[i]=temp.get(i-l);
        }
    }
    public static void mergeSort(int[] arr, int l, int r){
        // Write your code here
        if(l>=r) return;
        int mid=(l + r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr,l,mid,r);
        

    }
}

