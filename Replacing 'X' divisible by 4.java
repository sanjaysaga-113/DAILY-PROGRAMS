/*
Problem Statement:
       A number N with its last digit masked as X is passed as the input to the program. 
The program must print all the possible numbers which are divisible by 4 by replacing X in N in ascending order as the output. 

    Example Input/Output 1: 
             Input: 
               6447X 
            Output: 
               64472 64476 
      Explanation: Here N = 6447X. The two possible numbers divisible by 4 are 64472 and 64476.
*/

//code:
import java.util.*;

public class DivisibleBy4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();

        ArrayList<Long> answer = new ArrayList<>();
        // Iterate through 0 to 9 to replace 'X'
        for (int i = 0; i <= 9; i++) {
            // Replace 'X' with current digit
            String candi= input.replace('X', (char) (i + '0'));

            // Convert the candidate to a long number
            long number = Long.parseLong(candi);

            // Check if the candidate number is divisible by 4
            if (number % 4 == 0) {
                // Add to the list of valid numbers
                answer.add(number);
            }
        }

        // Sort the valid numbers in ascending order
        Collections.sort(answer);

        // Print the valid numbers
        for (Long number : answer) {
            System.out.println(number);
        }
    }
}
