/*
Problem Statement: 
Given an integer n, write a program to count the number of digits in n.
Example:
Input: n = 1401
Output: 4
Explanation: n has 4 digits   */


int countDigits(int n){
	// Write your code here.
	int cnt=0;
	while(n>0){
		cnt++;
		n=n/10;
	}	
	return cnt;
}
