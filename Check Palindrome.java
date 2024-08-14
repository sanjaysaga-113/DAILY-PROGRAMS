/*
Problem statement
Determine if a given string ‘S’ is a palindrome using recursion. Return a Boolean value of true if it is a palindrome and false if it is not.

Note: You are not required to print anything, just implement the function. Example:
Input: s = "racecar"
Output: true
Explanation: "racecar" is a palindrome.
*/
//code:
public class Solution {
    public static boolean isPalindrome(String str) {
        // Write your code here.
      if(str==null){
          return false;
      }

      int left=0;
      int right=str.length()-1;

      while(left<right){
          if(str.charAt(left)!=str.charAt(right)){
              return false;
          }
          left++;
          right--;
      }

      return true;
        
    }
}
