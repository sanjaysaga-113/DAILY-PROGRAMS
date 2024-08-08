/*
The program must accept an integer N as the input. The program must print a pair of Fibonacci integers whose sum is equal to N.
If two or more such pairs which give the sum N, the program must print the first occurring pair as the output. 
If there is no such pair, the program must print -1 as the output.

Example Input/Output 1: 
Input: 254 
Output: 21 233 
Explanation: The only possible pair of Fibonacci integers whose sum is equal to 254 is (21, 233). 
Hence the output is 21 233
*/

//code:
import java.util.*;
public class Hello {
   
   public static boolean issqu(long x){
       long s=(long)Math.sqrt(x);
       return s*s==x;
   }
   
   public static boolean isfibo(long n){
       return issqu(5*n*n+4)||issqu(5*n*n-4);
   }
    

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> ele=new ArrayList<Integer>();
		for(int i=0;i<=n;i++){
		    if(isfibo(i)){
		        ele.add(i);
		    }
		}
		boolean isfound=false;
		for(int i=0;i<ele.size();i++){
		    for(int j=i;j<ele.size();j++){
		        if((ele.get(i)+ele.get(j))==n){
		            System.out.println(ele.get(i)+" "+ele.get(j));
		            isfound=true;
		            break;
		        }
		    }
		    if(isfound)
		    break;
		}
		if(!isfound)
		System.out.print(-1);
		

	}
}
