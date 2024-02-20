/*Given two non-decreasing sorted arrays, ‘A’ and ‘B’, having ‘N’ and ‘M’ elements, respectively.



You must merge these arrays, ‘A’ and ‘B’, into a sorted array without using extra space. Of all the 'N + M' sorted elements, array 'A' should contain the first 'N' elements, and array 'B' should have the last 'M' elements.



Note:
You must perform the merge operation in place and must not allocate any extra space to merge the two arrays.
For example:
When ‘N’ = 4, ‘A’ = {1, 4, 5, 7} and ‘M’ = 3, ‘B’ = {2, 3, 6}. 
We can merge these two arrays into {1, 2, 3, 4, 5, 6, 7} (The elements of ‘A’ are {1, 2, 3, 4} ).
Hence, the answer is {1, 2, 3, 4, 5, 6, 7}.

Sample Input :
3 4
1 8 8
2 3 4 5
Sample Output :
1 2 3 4 5 8 8

Explanation Of Sample Input :
We have ‘A’ = {1, 8, 8} and ‘B’ = {2, 3, 4, 5}. 
Merging the two arrays results in {1, 2, 3, 4, 5, 8, 8}.
Hence the answer is {1, 2, 3, 4, 5, 8, 8}, where ‘A’ contains {1, 2, 3} and ‘B’ contains {4, 5, 8, 8}.   */
#include<bits/stdc++.h>
using namespace std;

void mergeTwoSortedArraysWithoutExtraSpace(vector<long long> &a, vector<long long> &b){
	// Write your code here.

	int m = a.size();
    int n = b.size();

    for (int i = n - 1; i >= 0; i--) {
        int j, last = a[m - 1];

        // Shift all elements in 'a' that are greater than the current element in 'b'
        for (j = m - 2; j >= 0 && a[j] > b[i]; j--) {
            a[j + 1] = a[j];
        }

        // If there was a smaller or equal element in 'a', put 'b[i]' in the right place
        if (j != m - 2 || last > b[i]) {
            a[j + 1] = b[i];
            b[i] = last;
        }
    }
}