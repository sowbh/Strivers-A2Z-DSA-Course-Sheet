/*
Problem Statement: Given a number, check if it is Armstrong Number or Not.
Example 1:
Input:153 
Output: true
Explanation: 1^3 + 5^3 + 3^3 = 153  */

bool checkArmstrong(int n){
	//Write your code here
	int originalno=n;
	int cnt=0;
	int temp=n;
	while(temp!=0){
		cnt++;
		temp=temp/10;
	}
	int sumofpower=0;
	while(n!=0){
		int digit=n%10;
		sumofpower+=pow(digit,cnt);
		n=n/10;
	}
	return (sumofpower==originalno);
}