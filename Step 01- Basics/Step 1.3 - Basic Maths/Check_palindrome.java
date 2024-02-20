/*
Problem Statement:  Given a number check if it is a palindrome.
An integer is considered a palindrome when it reads the same backward as forward.
Example:
Input: n =  121 
Output: Palindrome Number
Explanation: 121 read backwards as 121.Since these are two same numbers 121 is a palindrome. */
class Solution {
    public boolean isPalindrome(int x) {
        int dup=x;
        int rev=0;
        int ld;
        if(x<0) return false;
        while(x!=0){
            ld=x%10;
            rev=rev*10+ld;
            x=x/10;
        }
        if(dup==rev) return true;
        else return false;
    }
}