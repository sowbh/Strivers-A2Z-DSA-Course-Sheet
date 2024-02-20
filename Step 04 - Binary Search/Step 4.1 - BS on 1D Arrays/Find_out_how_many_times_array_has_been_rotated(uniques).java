<<<<<<< HEAD
/*You are given an array 'arr' having 'n' distinct integers sorted in ascending order. The array is right rotated 'r' times
Find the minimum value of 'r'.

Right rotating an array means shifting the element at 'ith' index to (‘i+1') mod 'n' index, for all 'i' from 0 to ‘n-1'.

Example:
Input: 'n' = 5 , ‘arr’ = [3, 4, 5, 1, 2]

Output: 3 

Explanation:
If we rotate the array [1 ,2, 3, 4, 5] right '3' times then we will get the 'arr'. Thus 'r' = 3.  */
public class Solution {
    public static int findKRotation(int []arr){
        // Write your code here.
        int n=arr.length;
        int low=0, high=n-1;
        int ans=Integer.MAX_VALUE;
        int ind=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[high]){
                if(arr[low]<ans){
                    ind=low;
                    ans=arr[low];
                }
                break;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<ans){
                    ind=low;
                    ans=arr[low];
                }
                low=mid+1;
            }
            else{
                high=mid-1;
                if(arr[mid]<ans){
                    ind=mid;
                    ans=arr[mid];
                }
            }
        }
        return ind;
    }
=======
/*You are given an array 'arr' having 'n' distinct integers sorted in ascending order. The array is right rotated 'r' times
Find the minimum value of 'r'.

Right rotating an array means shifting the element at 'ith' index to (‘i+1') mod 'n' index, for all 'i' from 0 to ‘n-1'.

Example:
Input: 'n' = 5 , ‘arr’ = [3, 4, 5, 1, 2]

Output: 3 

Explanation:
If we rotate the array [1 ,2, 3, 4, 5] right '3' times then we will get the 'arr'. Thus 'r' = 3.  */
public class Solution {
    public static int findKRotation(int []arr){
        // Write your code here.
        int n=arr.length;
        int low=0, high=n-1;
        int ans=Integer.MAX_VALUE;
        int ind=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[high]){
                if(arr[low]<ans){
                    ind=low;
                    ans=arr[low];
                }
                break;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<ans){
                    ind=low;
                    ans=arr[low];
                }
                low=mid+1;
            }
            else{
                high=mid-1;
                if(arr[mid]<ans){
                    ind=mid;
                    ans=arr[mid];
                }
            }
        }
        return ind;
    }
>>>>>>> d11c51586722c2a4719172f4f00d4b7e7e4c6b0b
}