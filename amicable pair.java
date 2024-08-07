/*
Problem statement
You are given two integers ‘X’ and ‘Y’. Your task is to find if the given integers are an amicable pair.

A pair of numbers are called Amicable if the sum of the proper divisor of each number is equal to the other number. Print ‘True’ if the numbers form amicable pair otherwise print ‘False’

Sample Input 1:
2
4 8
220 284
Sample Output 1:
False
True
*/

//code:
import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean amicablePair(int x, int y){
        // Write your code here.
        int sumx=0;
        int sumy=0;
        int nx=x;
        int ny=y;
        for(int i=1;i<=nx/2;i++){
            if(x%i==0){
                sumx+=i;
            }
        }
        for(int i=1;i<=ny/2;i++){
            if(y%i==0){
                sumy+=i;
            }
        }

        if(sumx==y && sumy==x){
            return true;
        }
        else{
            return false;
        }
    }
   
}


    
