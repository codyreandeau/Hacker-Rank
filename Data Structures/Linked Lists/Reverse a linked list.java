/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {
    Node previous = null;
    Node nextNode = null;
    while(head!=null){
        nextNode=head.next;
        head.next=previous;
        previous=head;
        head=nextNode;
    }
    return previous;
}