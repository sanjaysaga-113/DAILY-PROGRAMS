/*Problem statement:

You are given a Singly Linked List of integers with a head pointer. Every node of the Linked List has a value written on it.
Now you have been given an integer value, 'K'. Your task is to check whether a node with a value equal to 'K' exists in the given linked list. Return 1 if node exists else return 0.

Sample Input 1:
3 6 2 7 9 -1
2
Sample Output 1:
1
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
    public static int searchInLinkedList(Node head, int k)
    {
        // Write Your Code Here.
        Node current=head;
        while(current != null){
            if(current.data==k){
                return 1;
            }
            current=current.next;
        }

        return 0;

    }
}
