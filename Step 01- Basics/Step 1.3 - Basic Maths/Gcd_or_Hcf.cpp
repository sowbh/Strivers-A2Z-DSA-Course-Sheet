/*
Problem Statement: Find the gcd of two numbers.
Example 1:
Input: num1 = 4, num2 = 8
Output: 4
Explanation: Since 4 is the greatest number which divides both num1 and num2. */
int gcd(int a,int b)
{
	//Write your code here
	if (b == 0) {
		return a;
	}
	return gcd(b, a % b);

}