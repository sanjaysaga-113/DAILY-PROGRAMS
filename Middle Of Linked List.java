/*Problem statement:

Given a singly linked list of 'N' nodes. The objective is to determine the middle node of a singly linked list. 
However, if the list has an even number of nodes, we return the second middle node.

Sample Input 1 :
5
1 2 3 4 5
Sample Output 1 :
3 4 5
*/

//code:

/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class Solution
{
    public static Node findMiddle(Node head)
    {
        // Write your code here.
        Node current=head;
        int counter=1;
        while(current!=null){
            counter++;
            current=current.next;
        }

       int middle=(counter+1)/2;

       current=head;

       for(int i=1;i<middle;i++){
           current=current.next;
       }

       return current;
    }
}
