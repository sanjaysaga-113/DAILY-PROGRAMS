/*Problem statement:

You’re given a string 'S' of length 'N'. Your task is to find the minimum number of rotations to get the same string 'S'.

The string 'S' only contains lowercase English characters.     

Where 'T' denotes the number of test cases and 'N' denotes the length of string 'S'. 
Sample Input 1 :
1
5
ninja
Sample Output 1 :
5
Explanation of Sample Input 1 :
After five rotations we get the same string i.e “ninja”. 
*/

//code:
import java.util.* ;
import java.io.*; 
public class Solution {

	public static int minimumRotations(int n, String s) {
		int count=0;
		String original=s;
		String ans=s;
		do
		{
           ans=ans.substring(1)+ans.charAt(0);
           count++;
		} while(!ans.equals(original));
		return count;
	}
}
