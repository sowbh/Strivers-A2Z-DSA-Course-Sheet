/*Problem statement
Given an array 'arr' of size 'n'.
Return an array with all the elements placed in reverse order.

Note:
You don’t need to print anything. Just implement the given function.
Example:
Input: n = 6, arr = [5, 7, 8, 1, 6, 3]

Output: [3, 6, 1, 8, 7, 5]

Explanation: After reversing the array, it looks like this [3, 6, 1, 8, 7, 5].

*/
vector<int> reverseArray(int n, vector<int> &nums)
{
    // Write your code here.
    vector<int> reverseArray(n);
    for(int i=n-1;i>=0;i--){
        reverseArray[n-i-1]=nums[i];

    }
    return reverseArray;

}