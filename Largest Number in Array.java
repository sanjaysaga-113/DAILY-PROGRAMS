import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int greater=1;
        for(int i=0;i<n;i++){
            if(greater<=arr[i]){
                greater=arr[i];
            }
        }

        return greater;
    }
}
