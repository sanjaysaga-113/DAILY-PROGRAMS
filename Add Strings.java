//You are given two non-negative integers, ‘NUM1’ and ‘NUM2’, in the form of strings. Return the sum of both strings
/*Let ‘NUM1’ be: “5”
Let ‘NUM2’ be: “21”
The sum of both numbers will be: “26”.*/

//code:

import java.util.* ;
import java.io.*; 
import java.math.*;

public class Solution {

	public static String stringConcatenation(String num1, String num2) {
		// Write your code here.
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        
        // Add the numbers
        BigInteger c = a.add(b);
        
        // Convert the result back to a string
        return c.toString();
	}

}

