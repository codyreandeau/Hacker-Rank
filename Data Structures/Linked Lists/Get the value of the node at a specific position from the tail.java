/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
    Node current = head;
    Node node = head;
    int counter = 0;
    while(current!=null){
        current = current.next;
        if(counter++ > n){
            node = node.next;
        }
    }
  return node.data;
}