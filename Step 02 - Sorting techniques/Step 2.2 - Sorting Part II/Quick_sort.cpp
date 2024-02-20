/*Problem statement
Given the 'start' and the 'end'' positions of the array 'input'.
Your task is to sort the elements between 'start' and 'end' using quick sort.

Note :
Make changes in the input array itself.
Input:
6 
2 6 8 5 4 3
Output:
2 3 4 5 6 8   */
/*
    Time Complexity : O('N' * log('N'))
    Space Complexity : O(log('N'))
    where 'N' is size of input array
*/

#include <bits/stdc++.h>
using namespace std;

int partition(vector<int> &arr, int start, int end) {
    int pivot = arr[start];
    int i = start;
    int j = end;

    while (i < j) {
        while (arr[i] <= pivot && i <= end) {
            i++;
        }

        while (arr[j] > pivot && j >= start) {
            j--;
        }

        if (i < j) {
            swap(arr[i], arr[j]);
        }
    }

    swap(arr[start], arr[j]);
    return j;
}

void quickSort(vector<int> &arr, int start, int end) {
    if (start < end) {
        int pIndex = partition(arr, start, end);
        quickSort(arr, start, pIndex - 1);
        quickSort(arr, pIndex + 1, end);
    }
}
