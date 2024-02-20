/*Given an array ‘A’ consisting of ‘N’ integers and an integer ‘B’, 
find the number of subarrays of array ‘A’ whose bitwise XOR( ⊕ ) of all elements is equal to ‘B’.

A subarray of an array is obtained by removing some(zero or more) elements from the front and back of the array.

Example:
Input: ‘N’ = 4 ‘B’ = 2
‘A’ = [1, 2, 3, 2]

Output: 3

Explanation: Subarrays have bitwise xor equal to ‘2’ are: [1, 2, 3, 2], [2], [2].

Sample Input 1:
4 2
1 2 3 2
Sample Output 1 :
3
Explanation Of Sample Input 1:
Input: ‘N’ = 4 ‘B’ = 2
‘A’ = [1, 2, 3, 2]

Output: 3

Explanation: Subarrays have bitwise xor equal to ‘2’ are: [1, 2, 3, 2], [2], [2].   */
import java.util.*;
public class Solution {
    public static int subarraysWithSumK(int []a, int b) {
        // Write your code here
        int n=a.length;
        int XR=0;
        int cnt=0;
        Map<Integer,Integer> mpp= new HashMap<>();
        mpp.put(0,1);
        for(int i=0;i<n;i++){
            XR=XR^a[i];
            int x=XR^b;
            cnt += mpp.getOrDefault(x, 0); 
            mpp.put(XR, mpp.getOrDefault(XR, 0) + 1);

        }
        return cnt;
    }
}