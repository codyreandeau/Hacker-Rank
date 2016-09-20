/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node Reverse(Node head) {
    Node temp = head;
    Node current = head;
    Node prev = null;
    while (temp != null) {
        prev = temp.prev;
        temp.prev = temp.next;
        temp.next = prev;
        current = temp;
        temp = temp.prev;
    }
    return current;
}