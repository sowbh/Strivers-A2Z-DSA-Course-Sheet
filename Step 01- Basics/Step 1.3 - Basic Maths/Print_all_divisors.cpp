/*
Problem Statement: Given a number, print all the divisors of the number. 
A divisor is a number that gives the remainder as zero when divided.
Example 1:
Input: n = 36
Output: 1 2 3 4 6 9 12 18 36
Explanation: All the divisors of 36 are printed. */
vector<int> printDivisors(int n)
{
    vector<int> ans;

    // Traversing from 1 to sqrt(N).
    for (int i = 1; i * i <= n; i++)
    {
        if (n % i == 0)
        {
            ans.push_back(i);
            if (n / i != i)
            {
                ans.push_back(n / i);
            }
        }
    }

    sort(ans.begin(), ans.end());
    return ans;
}