/*You are given an array of ‘N’ integers where each integer value is between ‘1’ and ‘N’.

Each integer appears exactly once except for ‘P’, which appears exactly twice, and ‘Q’, which is missing.

Your task is to find ‘P’ and ‘Q’ and return them respectively.

Example:
Input: ‘N’ = 4
‘A’ = [1, 2, 3, 2]

Output: {2, 4}        */
vector<int> findMissingRepeatingNumbers(vector < int > a) {
    // Write your code here
    int n = a.size(); // Size of array 'a'
    
    vector<int> count(n + 1, 0); // 'count' array
    for(int i = 0; i < n; ++i) {
        // Incrementing the frequency of current element
        ++count[a[i]];
    }
    int missing, repeating;
    for (int i = 1; i <= n; ++i) {
        if (count[i] == 0)
          missing = i;
        else if (count[i] == 2)
          repeating = i;
    }
    vector<int> ans;
    ans.push_back(repeating);
    ans.push_back(missing);
    return ans;
}