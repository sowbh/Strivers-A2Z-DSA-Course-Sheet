/*Problem statement
You are given an integer ‘n’.

Your task is to return an array containing integers from 1 to ‘n’ (in increasing order) without using loops.

Example:
Input: ‘n’ = 5

Output: 1 2 3 4 5

Explanation: An array containing integers from ‘1’ to ‘n’ is [1, 2, 3, 4, 5]. */
void recursiveFunction(int x, vector<int>& ans) {
    if(x == 0) {
        return;
    }
    
    recursiveFunction(x - 1, ans);
    ans.push_back(x);
}

vector<int> printNos(int x) {
    vector<int> ans;
    recursiveFunction(x, ans);
    
    return ans;
}