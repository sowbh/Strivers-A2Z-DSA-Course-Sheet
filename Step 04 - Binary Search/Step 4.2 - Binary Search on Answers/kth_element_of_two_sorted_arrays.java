/*You're given two sorted arrays 'arr1' and 'arr2' of size 'n' and 'm' respectively and an element 'k'.
Find the element that would be at the 'kth' position of the combined sorted array.

Position 'k' is given according to 1 - based indexing, but arrays 'arr1' and 'arr2' are using 0 - based indexing.

For example :
Input: 'arr1' = [2, 3, 45], 'arr2' = [4, 6, 7, 8] and 'k' = 4
Output: 6
Explanation: The merged array will be [2, 3, 4, 6, 7, 8, 45]. The element at position '4' of this array is 6. Hence we return 6. */
import java.util.ArrayList;

public class Solution {
    public static int kthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m, int k) {
        int index1 = 0;
        int index2 = 0;

        while (index1 < n && index2 < m) {
            if (arr1.get(index1) < arr2.get(index2)) {
                k--;
                if (k == 0) {
                    return arr1.get(index1);
                }
                index1++;
            } else {
                k--;
                if (k == 0) {
                    return arr2.get(index2);
                }
                index2++;
            }
        }

        while (index1 < n) {
            k--;
            if (k == 0) {
                return arr1.get(index1);
            }
            index1++;
        }

        while (index2 < m) {
            k--;
            if (k == 0) {
                return arr2.get(index2);
            }
            index2++;
        }

        return -1; 
    }
}
