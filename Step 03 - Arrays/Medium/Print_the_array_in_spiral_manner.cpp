/*Given an m x n matrix, return all elements of the matrix in spiral order.

Example :

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]                 */
class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> ans;
        if (matrix.empty() || matrix[0].empty()) {
            return ans; // Handle empty matrix
        }

        int n = matrix.size(); // rows
        int m = matrix[0].size(); // columns
        int top = 0, bot = n - 1; // for row
        int left = 0, right = m - 1; // for column

        while (top <= bot && left <= right) {
            for (int i = left; i <= right; i++) {
                ans.push_back(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bot; i++) {
                ans.push_back(matrix[i][right]);
            }
            right--;
            if (top <= bot) {
                for (int i = right; i >= left; i--) {
                    ans.push_back(matrix[bot][i]);
                }
                bot--;
            }
            if (left <= right) {
                for (int i = bot; i >= top; i--) {
                    ans.push_back(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
};