/*Problem Statement: Given an array of N integers, write a program to implement the Insertion sorting algorithm.

Example:
Input: N = 6, array[] = {13,46,24,52,20,9}
Output: 9,13,20,24,46,52
Explanation: 
After sorting the array is: 9,13,20,24,46,52    */
public class Solution {
    static void Insertion_sort(int arr[], int n){
        for(int i=o; i<=n-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
                    
            } 
            
        }
        System.out.println("After Selection Sort");
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

}

