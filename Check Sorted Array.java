/*
Problem statement
You have been given an array ‘a’ of ‘n’ non-negative integers.You have to check whether the given array is sorted in the non-decreasing order or not.

Your task is to return 1 if the given array is sorted. Else, return 0.

Example :
Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
Output: 1

The given array is sorted in non-decreasing order; hence the answer will be 1.

Sample Input 1 :
4
0 0 0 1
Sample Output 1 :
1
Explanation For Sample Input 1 :
The given array is sorted in non-decreasing order; hence the answer will be 1. 
*/


//code:
public class Solution {
    public static int isSorted(int n, int []a) {
        // Write your code here.
       for(int i=1;i<n;i++){
           if(a[i-1] > a[i]){
               return 0;
           }
       }
       return 1;
    }
}
