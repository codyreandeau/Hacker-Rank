/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    if(head == null) {
        return head;
    }
    
    if (position == 0) {
        head = head.next;
        return head;
    }
    
    Node current = head;
    for(int i = 1; i < position; i++) {
        current = current.next;
    }
    Node delete = current.next;
    current.next = delete.next;
    return head;
 }
