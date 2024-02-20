/*You are given the head of a linked list ‘list’ of size ‘N’ and an integer ‘newValue’.
Your task is to insert a node with the value ‘newValue’ at the beginning of the ‘list’ and return the new head of the linked list.

You must write an algorithm whose time complexity is O(1) and whose space complexity is O(1).

Note:
In the output, you will see the elements of the linked list made by you.

Example:
Input: ‘N’ = 4, ‘newValue’ = 0
‘list’ = 4 -> 2 -> 5 -> 1

Output: 0 4 2 5 1

Explanation: Linked List after inserting the newValue is 0 -> 4 -> 2 -> 5 -> 1. */
/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

 *****************************************************************/

 public class Solution
 {
    public static Node insertAtFirst(Node list, int newValue) {
         // Write your code here
        Node newNode= new Node(newValue);
        newNode.next=list;
        return newNode;
    }
         
 }