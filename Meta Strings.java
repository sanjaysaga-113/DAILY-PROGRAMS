/*
Problem statement
You are given two strings 'STR1' and 'STR2'. You need to tell whether the strings are meta strings or not.
Meta strings are strings that can be made equal by swapping exactly one pair of distinct characters in one of the strings.

Sample Input 1:
2
Coding
Codnig
Ninjas
Niaxns
Sample Output 1:
YES
NO
Explanation for Input 1:
For test case 1: By swapping ‘i’ and ‘n’ in the second string, it becomes equal to the first string.

For test case 2: There is no way we can make both the strings equals by swapping one pair of characters.
*/

//code:
import java.util.* ;
import java.io.*; 
public class Solution{
    public static boolean checkMeta(String str1, String str2) {
        // Write your code here.
       if(str1.length()!=str2.length()){
           return false;
       }

       ArrayList<Integer> miss=new ArrayList<>();
       for(int i=0;i<str1.length();i++){
           if(str1.charAt(i)!=str2.charAt(i)){
               miss.add(i);
           }
       }
         
        

       if(miss.size()==2){
            int i=miss.get(0);
            int j=miss.get(1);
            if(str1.charAt(i)==str2.charAt(j)&&str1.charAt(j)==str2.charAt(i)){
                return true;
            }
       }
            return false;
       
    }
}
