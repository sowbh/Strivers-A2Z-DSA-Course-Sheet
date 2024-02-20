/*Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown: 

Example :

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]    */
class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> result;
        
        for (int row = 0; row < numRows; row++) {
            vector<int> currentRow(row + 1, 1);  

            for (int col = 1; col < row; col++) {
                int aboveLeft = result[row - 1][col - 1];
                int above = result[row - 1][col];
                currentRow[col] = aboveLeft + above;
            }

            result.push_back(currentRow);
        }
        
        return result;
    
    }
};