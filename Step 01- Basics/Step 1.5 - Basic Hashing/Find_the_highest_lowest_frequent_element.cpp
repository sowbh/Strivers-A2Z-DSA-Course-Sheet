/*Problem Statement: Given an array of size N. Find the highest and lowest frequency element.
Example:
Input: array[] = {10,5,10,15,10,5};
Output: 10 15
Explanation: The frequency of 10 is 3, i.e. 
the highest and the frequency of 15 is 1 i.e. the lowest. */
vector<int> getFrequencies(vector<int>& v) {
    
    int n = v.size();
    
    unordered_map<int, int> freq;

    for (int i = 0; i < n; i++) {
        freq[v[i]]++;
    }

    int maxFreq = 0, minFreq = n;
    int maxElement = 0, minElement = (int)1e9 + 1;
    
    for (auto it : freq) {
        int count = it.second;
        int element = it.first;

        if (count > maxFreq) {
            maxElement = element;
            maxFreq = count;
        }
        else if(count == maxFreq) {          
            maxElement = min(maxElement, element);
        }
        
        if (count < minFreq) {
            minElement = element;
            minFreq = count;
        }
        else if(count == minFreq) {            
            minElement = min(minElement, element);
        }
    }
    
    vector<int> ans = {maxElement, minElement};
    return ans;
}