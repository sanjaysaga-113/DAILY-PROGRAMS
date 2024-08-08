import java.util.*; 
import java.io.*;

public class Solution {
    public static String convertString(String str) {
        // Split the input string into words
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize the first letter and add the rest of the word
                String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
                result.append(capitalizedWord).append(" ");
            }
        }

        // Remove the trailing space
        return result.toString().trim();
       
    }
}
