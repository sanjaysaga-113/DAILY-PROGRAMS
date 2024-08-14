/*
Problem statement
You are given two integers 'n', and 'm'.
Calculate 'gcd(n,m)', without using library functions.
ample Input 1:
9 6
Sample Output 1:
3
Explanation of sample output 1:
gcd(6,9) is 3, as 3 is the largest positive integer that divides both 6 and 9.
*/
//code:
public class Solution {
    public static int calcGCD(int n, int m){
        // Write your code here.
        int rem=0;
        int a=(n>m)?n:m;//a bigger
        int b=(n<m)?n:m;//b small
        rem=b;
        while(a%b!=0){
          rem=a%b;
          a=b;
          b=rem;
        }
        return rem;
    }
}
