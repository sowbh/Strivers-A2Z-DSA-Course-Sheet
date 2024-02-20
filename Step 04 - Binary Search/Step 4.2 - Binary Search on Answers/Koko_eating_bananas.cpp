/*Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.

Example :

Input: piles = [3,6,7,11], h = 8
Output: 4             */
class Solution {
public:
    int minEatingSpeed(vector<int>& piles, int h) {
        int low = 1, high = *max_element(piles.begin(), piles.end());
        while (low < high) {
            int mid = low + (high - low) / 2;
            int totalHrs = totalHours(piles, mid);
            if (totalHrs <= h) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    
private:
    int totalHours(const vector<int>& piles, int hourly) {
        int totalHrs = 0;
        for (int bananas : piles) {
            totalHrs += (bananas + hourly - 1) / hourly;  
        }
        return totalHrs;
    }
};