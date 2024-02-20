/*You are given an array ‘Arr’ of size ‘N’ consisting of positive integers.
Make a linked list from the array and return the head of the linked list.

The head of the linked list is the first element of the array, and the tail of the linked list is the last element.

Note:
In the output, you will see the elements of the linked list made by you.

Example:
Input: ‘Arr’ = [4, 2, 5, 1]

Output: 4 2 5 1

Explanation: Linked List for the array ‘Arr’ = [4, 2, 5, 1] is 4 -> 2 -> 5 -> 1. */
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
 };

 *****************************************************************/

 public class Solution {
    public static Node constructLL(int []arr) {
        // Write your code here
        if (arr == null || arr.length == 0) {
            return null;
        }

        Node head = new Node(arr[0]);
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            current.next = newNode;
            current = newNode;
        }

        return head;
    }
}