/*Problem Statement: Given an array of N integers, write a program to implement the Selection sorting algorithm.

Example:
Input: N = 6, array[] = {13,46,24,52,20,9}
Output: 9,13,20,24,46,52
Explanation: After sorting the array is: 9, 13, 20, 24, 46, 52  */


public class Solution {
    static void Selection_sort(int arr[], int n){
        for(int i=o; i<=n-2;i++){
            int min=j;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println("After Selection Sort");
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

}

